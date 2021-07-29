package ru.netology.domain;

public class RepostsInfo {
    private int count;
    private boolean userReposted;

    private String forwardLogoUrl;
    private String forwardUrl;
    private int forwardCount;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
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
}
