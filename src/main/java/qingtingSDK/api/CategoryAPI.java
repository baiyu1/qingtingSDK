package qingtingSDK.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import qingtingSDK.bean.category.CategoryData;
import qingtingSDK.bean.category.Category_properties;
import qingtingSDK.bean.category.Channel;
import qingtingSDK.client.LocalHttpClient;

public class CategoryAPI {
    /**
     * 获取点播内容的所有分类列表
     * @param access_token
     * @return
     */
    public CategoryData getCategories(String access_token){
        HttpUriRequest request= RequestBuilder.get()
                .setUri("http://api.open.qingting.fm/v6/media/categories")
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,CategoryData.class);
    }

    /**
     * 获取指定分类的属性列表
     * @param access_token
     * @param id 属性的列表id
     * @return
     */
    public Category_properties getProperties(String access_token,int id){
        HttpUriRequest request=RequestBuilder.get()
                .setUri("http://api.open.qingting.fm/v6/media/categories/"+id)
                .addParameter("access_token",access_token)
                .build();
        return  LocalHttpClient.executeJsonResponse(request,Category_properties.class);
    }

    /**
     *直播分类及获取直播属性 设置id为5
     * @param access_token
     * @return
     */
    public Category_properties getProperties(String access_token){
        HttpUriRequest request=RequestBuilder.get()
                .setUri("http://api.open.qingting.fm/v6/media/categories/5")
                .addParameter("access_token",access_token)
                .build();
        return LocalHttpClient.executeJsonResponse(request,Category_properties.class);
    }
    public Channel getChannel(String access_token,int category_id,int curpage){
        HttpUriRequest request=RequestBuilder.get()
                .setUri(BaseAPI.BaseURL+"v6/media/categories/"+category_id+"/channels/order/0/"+curpage+"/pagesize/30")
                .addParameter("access_token",access_token)
                .build();
        return null;
    }

}
