package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    private String commentLogoUrl;
    private String commentClickUrl;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public String getCommentLogoUrl() {
        return commentLogoUrl;
    }

    public void setCommentLogoUrl(String commentLogoUrl) {
        this.commentLogoUrl = commentLogoUrl;
    }

    public String getCommentClickUrl() {
        return commentClickUrl;
    }

    public void setCommentClickUrl(String commentClickUrl) {
        this.commentClickUrl = commentClickUrl;
    }
}
