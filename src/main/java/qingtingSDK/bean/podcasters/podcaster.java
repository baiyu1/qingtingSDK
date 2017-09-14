package qingtingSDK.bean.podcasters;

import qingtingSDK.bean.BaseResult;

public class podcaster extends BaseResult {
    private Data data;
    static class Data {
        private int id;
        private String user_system_id;
        private String nickname;
        private String avatar;
        private int sex;
        private String signature;
        private String weibo_name;
        private String weibo_id;
        private String description;
        private int fan_num;
        private String sns_open;
        private String location;
        private String birthday;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUser_system_id() {
            return user_system_id;
        }

        public void setUser_system_id(String user_system_id) {
            this.user_system_id = user_system_id;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public String getWeibo_name() {
            return weibo_name;
        }

        public void setWeibo_name(String weibo_name) {
            this.weibo_name = weibo_name;
        }

        public String getWeibo_id() {
            return weibo_id;
        }

        public void setWeibo_id(String weibo_id) {
            this.weibo_id = weibo_id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getFan_num() {
            return fan_num;
        }

        public void setFan_num(int fan_num) {
            this.fan_num = fan_num;
        }

        public String getSns_open() {
            return sns_open;
        }

        public void setSns_open(String sns_open) {
            this.sns_open = sns_open;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
