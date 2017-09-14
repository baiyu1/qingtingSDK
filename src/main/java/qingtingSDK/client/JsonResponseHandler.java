package qingtingSDK.client;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * 返回数据的json处理策略
 */
public class JsonResponseHandler {
    private static Logger logger = LoggerFactory.getLogger(JsonResponseHandler.class);
    public static <T> ResponseHandler<T> createResponseHandler(final Class<T> clazz){
        return new JsonResponseHandlerImpl<T>(clazz);
    }
    public static class JsonResponseHandlerImpl<T>  implements ResponseHandler<T> {
        private Class<T> clazz;

        public JsonResponseHandlerImpl( Class<T> clazz) {
            this.clazz = clazz;
        }

        public T handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
            StatusLine statusLine = httpResponse.getStatusLine();
            HttpEntity entity = httpResponse.getEntity();
            int status = httpResponse.getStatusLine().getStatusCode();
            if (status >= 300) {
                throw new HttpResponseException(
                        status, statusLine.getReasonPhrase()
                );
            }
            if (entity == null) {
                throw new ClientProtocolException("Response contains no context");
            }
            if (status >= 200 && status < 300) {
                Gson gson = new Gson();
                String jsonString = EntityUtils.toString(entity);
                return gson.fromJson(jsonString, clazz);
            }
            return null;
        }
    }
}
