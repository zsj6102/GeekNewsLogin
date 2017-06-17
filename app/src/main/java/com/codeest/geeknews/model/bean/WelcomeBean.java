package com.codeest.geeknews.model.bean;

/**
 * Created by codeest on 16/8/15.
 */

public class WelcomeBean {

    /**
     * text : © Fido Dido
     * img : http://p2.zhimg.com/10/7b/107bb4894b46d75a892da6fa80ef504a.jpg
     */

//    private String text;
//    private String img;
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public String getImg() {
//        return img;
//    }
//
//    public void setImg(String img) {
//        this.img = img;
//    }
    private Status status;
    private Data data;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Status{
        private String succeed;

        public String getSucceed() {
            return succeed;
        }

        public void setSucceed(String succeed) {
            this.succeed = succeed;
        }
    }
    public static class Data{
        private String user_id;
        private String news_id;

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getNews_id() {
            return news_id;
        }

        public void setNews_id(String news_id) {
            this.news_id = news_id;
        }
    }
}
