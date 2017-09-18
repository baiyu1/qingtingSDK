package qingtingSDK.bean.Program;

import qingtingSDK.bean.BaseResult;

/**
 * 直播节目
 */
public class LiveProgramData extends BaseResult {
    private LiveProgram data;
    public LiveProgram getData() {
        return data;
    }
    public void setData(LiveProgram data) {
        this.data = data;
    }


}
