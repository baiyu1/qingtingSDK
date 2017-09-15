package qingtingSDK.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import qingtingSDK.bean.Channel;
import qingtingSDK.bean.live.LiveProgram;
import qingtingSDK.client.LocalHttpClient;

/**
 * 直播api
 */
public class LiveAPI {
    private Channel getLice(String access_token,int channel_id){
        HttpUriRequest request = RequestBuilder.get()
                .setUri("v6/media/channellives/"+channel_id)
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,Channel.class);
    }

    /**
     * 获取直播节目单
     * @param access_token
     * @param channel_id
     * @param day_of_week
     * @return
     */
    public LiveProgram getLiveProgram(String access_token,int channel_id,String day_of_week){
        HttpUriRequest request = RequestBuilder.get()
                .setUri("v6/media/channellives/"+channel_id+"/programs/day/"+day_of_week)
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,LiveProgram.class);

    }

}
