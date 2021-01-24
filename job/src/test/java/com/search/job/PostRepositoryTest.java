package com.search.job;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.search.job.domain.posts.Posts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest
@Transactional
@Commit
public class PostRepositoryTest {
    @Autowired
    EntityManager em;

    @Test
    public void PostTest() {
        Posts post = new Posts();
        post.setTitle("Test");

        em.persist(post);

    }
}
