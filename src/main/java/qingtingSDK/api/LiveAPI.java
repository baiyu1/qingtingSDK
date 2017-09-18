package qingtingSDK.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import qingtingSDK.bean.Program.LiveProgramData;
import qingtingSDK.bean.channnel.ChannelList;
import qingtingSDK.client.LocalHttpClient;

/**
 * 直播api
 */
public class LiveAPI {
    private ChannelList getLice(String access_token, int channel_id){
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BaseAPI.BaseURL+"wapi/channels/"+channel_id)
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,ChannelList.class);
    }

    /**
     * 获取直播节目单
     * @param access_token
     * @param channel_id
     * @param day_of_week
     * @return
     */
    public LiveProgramData getLiveProgram(String access_token, int channel_id, String day_of_week){
        HttpUriRequest request = RequestBuilder.get()
                .setUri(BaseAPI.MediaURL+"channellives/"+channel_id+"/programs/day/"+day_of_week)
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,LiveProgramData.class);

    }

}
