package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager<search> {
    public Post[] posts;

    public Post[] search(int ownderID, String domain, String query, boolean ownersOnly, int count, int offset) {
        return null;
    }

    public void delete(int ownerID, int postId) {
    }
}