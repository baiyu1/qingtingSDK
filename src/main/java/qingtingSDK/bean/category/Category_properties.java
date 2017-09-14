package qingtingSDK.bean.category;

import qingtingSDK.bean.BaseResult;

import java.util.List;

public class Category_properties extends BaseResult{
    private Category_properties_id data;

    public Category_properties_id getData() {
        return data;
    }

    public void setData(Category_properties_id data) {
        this.data = data;
    }

    static class Category_properties_id{
        private int id;
        private String name;
        private List<Value> values;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Value> getValues() {
            return values;
        }

        public void setValues(List<Value> values) {
            this.values = values;
        }
    }
    static class Value{
        private int id;
        private String name;
        private int sequence;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }
    }
}
