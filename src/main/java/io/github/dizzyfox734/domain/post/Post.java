package io.github.dizzyfox734.domain.post;

import javax.persistence.*;

@Entity
public class Post extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    private Post(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
    }
    public static class Builder {

    }
}
