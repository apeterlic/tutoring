SELECT DISTINCT CONCAT('https://stackoverflow.com/questions', '/', Posts.Id) as Link,
                Posts.Title,
                CASE
                    WHEN (2023 - YEAR(Posts.CreationDate) > 0)
                        THEN (Posts.ViewCount / (2023 - YEAR(Posts.CreationDate)))
                    ELSE (Posts.ViewCount / 1)
                    END                                                      as Traffic,
                Posts.CreationDate,
                Posts.ViewCount,
                Posts.Tags,
                Posts.AcceptedAnswerId,
                Posts.Score,
                Posts.AnswerCount,
                Posts.ClosedDate

FROM Posts
-- only includes posts that have tags
         INNER JOIN PostTags ON PostTags.PostId = posts.Id
         INNER JOIN Tags ON Tags.Id = PostTags.TagId

WHERE Posts.ViewCount > 3000
  AND Posts.CreationDate IS NOT NULL
-- define a range
-- AND Posts.CreationDate > '2013-01-01'
-- AND Posts.CreationDate < '2019-01-01'
-- include specific tags
  AND TagName IN ('java', 'spring', 'jpa', 'hibernate', 'kafka', 'docker', 'spring-data', 'generics', 'maven', 'gradle',
                  'spring-cloud', 'spring-boot', 'concurrency')
-- include only questions
  AND Posts.PostTypeId = 1
  AND Posts.CommentCount >= 1
  AND Posts.AnswerCount >= 1
-- only include questions with accepted answer
-- AND Posts.AcceptedAnswerId IS NOT NULL
  AND Posts.Score >= 1
-- include only ones with traffic > 3000
  AND (
            YEAR(Posts.CreationDate) = 2023
        OR
            (Posts.ViewCount / (2023 - YEAR(Posts.CreationDate)) > 3000)
    )
ORDER BY Posts.CreationDate DESC, Posts.ViewCount DESC
-- GROUP BY Posts.ViewCount

