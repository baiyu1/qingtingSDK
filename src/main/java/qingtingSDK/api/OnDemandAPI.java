package qingtingSDK.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import qingtingSDK.bean.Channel;
import qingtingSDK.bean.onDemand.OnDemandProgram;
import qingtingSDK.client.LocalHttpClient;

/**
 * 点播类api
 */
public class OnDemandAPI {
    /**
     *获取点播电台
     * @param access_token
     * @param channel_id
     * @return
     */
    public Channel getOnDemand(String access_token,String channel_id){
        HttpUriRequest request= RequestBuilder.get()
                .setUri("http://api.open.qingting.fm/v6/media/channelondemands/"+channel_id )
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,Channel.class);
    }

    /**
     * 获取点播电台的节目列表
     * @param access_token
     * @param channel_id
     * @param curpage_id
     * @return
     */
    public OnDemandProgram getProgramList(String access_token,String channel_id,int curpage_id){
        HttpUriRequest request= RequestBuilder.get()
                .setUri("v6/media/channelondemands/"+channel_id+"/programs/curpage/ "
                        +curpage_id+"/pagesize/30" )
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,OnDemandProgram.class);

    }

    /**
     * 获取点播节目的具体信息
     * @param access_token
     * @param program_id
     * @return
     */
    public OnDemandProgram getProgram(String access_token,int program_id){
        HttpUriRequest request= RequestBuilder.get()
                .setUri(BaseAPI.BaseURL+"/v6/media/programs/"+program_id)
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,OnDemandProgram.class);
    }


}
