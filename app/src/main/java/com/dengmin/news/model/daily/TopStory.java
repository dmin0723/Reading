package com.dengmin.news.model.daily;

/**
 * TopStory
 */
public class TopStory {
    private String title;
    private String image;
    private int id;
    private String body;
    private String largepic;

    //get and set


    public String getTitle() {
        return title;
    }

    public String getLargepic() {
        return largepic;
    }

    public String getImage() {
        return image;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLargepic(String largepic) {
        this.largepic = largepic;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
