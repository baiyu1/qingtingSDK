package qingtingSDK.api;

import com.google.gson.JsonObject;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import qingtingSDK.bean.token.Token;
import qingtingSDK.client.LocalHttpClient;

/**
 * 获取通行证
 */
public class TokenAPI {
    /**
     * 获取token
     * @param client_id
     * @param client_secret
     * @return
     */
    public Token getToken(String client_id,String client_secret){
        JsonObject object=new JsonObject();
        object.addProperty("client_id",client_id);
        object.addProperty("client_secret",client_secret);
        StringEntity entity =new StringEntity(object.getAsString(),"utf-8");
        HttpUriRequest request= RequestBuilder.post()
                .setUri("http://api.open.qingting.fm/access?&grant_type=client_credentials")
                .setEntity(entity)
                .build();
        return LocalHttpClient.executeJsonResponse(request,Token.class);
    }
}
