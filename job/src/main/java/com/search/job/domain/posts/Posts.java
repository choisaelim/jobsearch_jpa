package com.search.job.domain.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Posts {

    @Id
    @GeneratedValue
    @Column(name = "POST_ID")
    private Long id;

    @Column(length = 500)
    private String title;

}
