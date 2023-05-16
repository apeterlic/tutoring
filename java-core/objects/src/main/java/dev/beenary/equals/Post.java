package dev.beenary.equals;

import java.util.Objects;

public class Post
{
    String title;

    public Post(String title)
    {
        this.title = title;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o instanceof Post post) return Objects.equals(title, post.title);
        return false;
    }

    @Override
    public int hashCode()
    {
        return title != null ? title.hashCode() : 0;
    }
}
