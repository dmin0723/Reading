package com.dengmin.news.model.daily;

/**
 * 知乎日报
 */
public class DailyBean {
    private String date;
    private StoryBean[] stories;
    private TopStory[] top_stories;

    //get and set

    public String getDate() {
        return date;
    }

    public StoryBean[] getStories() {
        return stories;
    }

    public TopStory[] getTop_stories() {
        return top_stories;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStories(StoryBean[] stories) {
        this.stories = stories;
    }

    public void setTop_stories(TopStory[] top_stories) {
        this.top_stories = top_stories;
    }
}
