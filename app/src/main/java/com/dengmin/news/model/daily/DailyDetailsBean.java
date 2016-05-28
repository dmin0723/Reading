package com.dengmin.news.model.daily;

/**
 * DailyDetailBean
 */
public class DailyDetailsBean {
    private String body;
    private String image;
    private String title;
    private String[] css;

    //get and set

    public String getBody() {
        return body;
    }

    public String[] getCss() {
        return css;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCss(String[] css) {
        this.css = css;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
