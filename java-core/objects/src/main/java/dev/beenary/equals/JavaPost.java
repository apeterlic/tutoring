package dev.beenary.equals;

import java.util.Objects;

public class JavaPost extends Post
{
    String category;

    public JavaPost(String title)
    {
        super(title);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JavaPost javaPost = (JavaPost) o;
        return Objects.equals(category, javaPost.category);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), category);
    }

}
