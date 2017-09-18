package qingtingSDK.bean.channnel;

import qingtingSDK.bean.BaseResult;

import java.util.List;

public class ChannelList extends BaseResult{
    private List<Channel> data;
    private int total;

    public List<Channel> getData() {
        return data;
    }

    public void setData(List<Channel> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
