package qingtingSDK.api;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import qingtingSDK.bean.category.CategoryData;
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

}
