package com.dengmin.news.model.daily;

/**
 * 这是storybean
 */
public class StoryBean {
    private String title;
    private String[] images;
    private int id;
    private String body;
    private String largepic;
    private boolean isCollected;

    //get and set

    public String getBody() {
        return body;
    }

    public int getId() {
        return id;
    }

    public String[] getImages() {
        return images;
    }

    public boolean isCollected() {
        return isCollected;
    }

    public String getLargepic() {
        return largepic;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public void setCollected(boolean collected) {
        isCollected = collected;
    }

    public void setLargepic(String largepic) {
        this.largepic = largepic;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
