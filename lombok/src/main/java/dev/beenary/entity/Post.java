package dev.beenary.entity;

import lombok.*;


@Value
public class Post
{
    String title;
    String author;

    public Post(@NonNull String title, String author)
    {
        this.title = title;
        this.author = author;
    }
}
