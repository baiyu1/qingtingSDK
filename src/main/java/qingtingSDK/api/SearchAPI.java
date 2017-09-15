package qingtingSDK.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import qingtingSDK.bean.seach.Result;
import qingtingSDK.client.LocalHttpClient;

public class SearchAPI {
    /**
     * 搜索相关内容
     * @param access_token
     * @param keyword
     * @param type
     * @return
     */
    public Result search(String access_token, String keyword, String type){
        HttpUriRequest request= RequestBuilder.get()
                .setUri("")
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,Result.class);
    }
}
