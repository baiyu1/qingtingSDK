package qingtingSDK.bean.category;

import qingtingSDK.bean.Author_Podcaster;
import qingtingSDK.bean.MediaInfo;
import qingtingSDK.bean.Thumbs;

/**
 * 电台
 */
public class Channel {
    private int id;
    private String title;
    private String description;
    private String update_time;
    private Thumbs thumbs;
    private String chatgroup_id;
    private String freq;
    private int audience_count;
    private MediaInfo mediaInfo;
    private int category_id;
    private String auto_paly;
    private String record_enabled;
    private String latest_program;
    private Author_Podcaster detail;

    public String getChatgroup_id() {
        return chatgroup_id;
    }

    public void setChatgroup_id(String chatgroup_id) {
        this.chatgroup_id = chatgroup_id;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public int getAudience_count() {
        return audience_count;
    }

    public void setAudience_count(int audience_count) {
        this.audience_count = audience_count;
    }

    public MediaInfo getMediaInfo() {
        return mediaInfo;
    }

    public void setMediaInfo(MediaInfo mediaInfo) {
        this.mediaInfo = mediaInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Thumbs getThumbs() {
        return thumbs;
    }

    public void setThumbs(Thumbs thumbs) {
        this.thumbs = thumbs;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getAuto_paly() {
        return auto_paly;
    }

    public void setAuto_paly(String auto_paly) {
        this.auto_paly = auto_paly;
    }

    public String getRecord_enabled() {
        return record_enabled;
    }

    public void setRecord_enabled(String record_enabled) {
        this.record_enabled = record_enabled;
    }

    public String getLatest_program() {
        return latest_program;
    }

    public void setLatest_program(String latest_program) {
        this.latest_program = latest_program;
    }

    public Author_Podcaster getDetail() {
        return detail;
    }

    public void setDetail(Author_Podcaster detail) {
        this.detail = detail;
    }
}
