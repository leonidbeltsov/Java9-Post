package ru.netology.domain;

public class Post {
    private String author;
    private String logoAuthorUrl;
    private String postDateAndTime;

    private String postMessage;

    private String backgroundImageUrl;
    private String textOnImaje;
    private String clickTextOnImajeUrl;

    private String likeLogoUrl;
    private boolean liked;
    private String likedLogoUrl;
    private int likeCounter;

    private String commentLogoUrl;
    private String commentUrl;

    private String forwardLogoUrl;
    private String forwardUrl;
    private int forwardCount;

    private String viewLogo;
    private double viewCount;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLogoAuthorUrl() {
        return logoAuthorUrl;
    }

    public void setLogoAuthorUrl(String logoAuthorUrl) {
        this.logoAuthorUrl = logoAuthorUrl;
    }

    public String getPostDateAndTime() {
        return postDateAndTime;
    }

    public void setPostDateAndTime(String postDateAndTime) {
        this.postDateAndTime = postDateAndTime;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public void setPostMessage(String postMessage) {
        this.postMessage = postMessage;
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
    }

    public void setBackgroundImageUrl(String backgroundImageUrl) {
        this.backgroundImageUrl = backgroundImageUrl;
    }

    public String getTextOnImaje() {
        return textOnImaje;
    }

    public void setTextOnImaje(String textOnImaje) {
        this.textOnImaje = textOnImaje;
    }

    public String getClickTextOnImajeUrl() {
        return clickTextOnImajeUrl;
    }

    public void setClickTextOnImajeUrl(String clickTextOnImajeUrl) {
        this.clickTextOnImajeUrl = clickTextOnImajeUrl;
    }

    public String getLikeLogoUrl() {
        return likeLogoUrl;
    }

    public void setLikeLogoUrl(String likeLogoUrl) {
        this.likeLogoUrl = likeLogoUrl;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public String getLikedLogoUrl() {
        return likedLogoUrl;
    }

    public void setLikedLogoUrl(String likedLogoUrl) {
        this.likedLogoUrl = likedLogoUrl;
    }

    public int getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(int likeCounter) {
        this.likeCounter = likeCounter;
    }

    public String getCommentLogoUrl() {
        return commentLogoUrl;
    }

    public void setCommentLogoUrl(String commentLogoUrl) {
        this.commentLogoUrl = commentLogoUrl;
    }

    public String getCommentUrl() {
        return commentUrl;
    }

    public void setCommentUrl(String commentUrl) {
        this.commentUrl = commentUrl;
    }

    public String getForwardLogoUrl() {
        return forwardLogoUrl;
    }

    public void setForwardLogoUrl(String forwardLogoUrl) {
        this.forwardLogoUrl = forwardLogoUrl;
    }

    public String getForwardUrl() {
        return forwardUrl;
    }

    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(int forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getViewLogo() {
        return viewLogo;
    }

    public void setViewLogo(String viewLogo) {
        this.viewLogo = viewLogo;
    }

    public double getViewCount() {
        return viewCount;
    }

    public void setViewCount(double viewCount) {
        this.viewCount = viewCount;
    }


}
