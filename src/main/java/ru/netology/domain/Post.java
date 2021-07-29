package ru.netology.domain;

import ru.netology.domain.donut.Donut;
import ru.netology.domain.geo.Geo;

public class Post {

    private int id;
    private int ownerID;
    private int author; // == from_id в документации VK
    private int createdBy;
    private String logoOwnerUrl;
    private int postDateAndTime; // == date
    private String postMessage; // == text
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostType postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean inFavorite;
    private Donut donut;
    private int postponed_id;

    private String backgroundImageUrl;
    private String textOnImaje;
    private String clickTextOnImajeUrl;
}