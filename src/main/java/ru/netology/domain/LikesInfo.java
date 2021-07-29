package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean user_likes;
    private boolean can_like;
    private boolean can_publish;

    private String likeLogoUrl;
    private String likedLogoUrl;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUser_likes() {
        return user_likes;
    }

    public void setUser_likes(boolean user_likes) {
        this.user_likes = user_likes;
    }

    public boolean isCan_like() {
        return can_like;
    }

    public void setCan_like(boolean can_like) {
        this.can_like = can_like;
    }

    public boolean isCan_publish() {
        return can_publish;
    }

    public void setCan_publish(boolean can_publish) {
        this.can_publish = can_publish;
    }

    public String getLikeLogoUrl() {
        return likeLogoUrl;
    }

    public void setLikeLogoUrl(String likeLogoUrl) {
        this.likeLogoUrl = likeLogoUrl;
    }

    public String getLikedLogoUrl() {
        return likedLogoUrl;
    }

    public void setLikedLogoUrl(String likedLogoUrl) {
        this.likedLogoUrl = likedLogoUrl;
    }
}