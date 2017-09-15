package qingtingSDK.bean.live;

import qingtingSDK.bean.Author_Podcaster;
import qingtingSDK.bean.BaseResult;
import qingtingSDK.bean.MediaInfo;
import qingtingSDK.bean.Thumbs;

import java.util.List;

/**
 * 直播节目
 */
public class LiveProgram extends BaseResult{
    private LiveProgramData data;

    public LiveProgramData getData() {
        return data;
    }

    public void setData(LiveProgramData data) {
        this.data = data;
    }

    static class LiveProgramData {
        private int id;
        private String start_time;
        private String end_time;
        private String title;
        private float duration;
        private String type;
        private String chatgroup_id;
        private MediaInfo mediainfo;
        private List<Author_Podcaster> detail;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public float getDuration() {
            return duration;
        }

        public void setDuration(float duration) {
            this.duration = duration;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getChatgroup_id() {
            return chatgroup_id;
        }

        public void setChatgroup_id(String chatgroup_id) {
            this.chatgroup_id = chatgroup_id;
        }

        public MediaInfo getMediainfo() {
            return mediainfo;
        }

        public void setMediainfo(MediaInfo mediainfo) {
            this.mediainfo = mediainfo;
        }

        public List<Author_Podcaster> getDetail() {
            return detail;
        }

        public void setDetail(List<Author_Podcaster> detail) {
            this.detail = detail;
        }
    }
}
