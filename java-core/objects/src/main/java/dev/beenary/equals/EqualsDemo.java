package dev.beenary.equals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EqualsDemo
{
    private static final Logger logger = LoggerFactory.getLogger(EqualsDemo.class);

    public static void main(String[] args)
    {
        Post post1 = new Post("Exceptions in Java");
        Post post2 = new Post("Exceptions in Java");

        logger.info("The result of the == operator is {}", post1 == post2);
        logger.info("The result of the equals() method is - {}", post1.equals(post2));

        JavaPost javaPost = new JavaPost("Exceptions in Java");

        logger.info("The result of the equals() method is - {}", post1.equals(javaPost));
        logger.info("The result of the equals() method is - {}", javaPost.equals(post1));
    }
}
