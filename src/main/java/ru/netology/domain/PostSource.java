package ru.netology.domain;

public class PostSource {
    private String[] type = {"vk","widget","api","rss","sms"};
    private String[] platform = {"android","iphone","wphone"};
    private String url;

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public String[] getPlatform() {
        return platform;
    }

    public void setPlatform(String[] platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}