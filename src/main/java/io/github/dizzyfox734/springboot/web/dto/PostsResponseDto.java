package io.github.dizzyfox734.springboot.web.dto;

import io.github.dizzyfox734.springboot.domain.posts.Posts;

public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    // @Getter
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getAuthor() { return author; }

    public PostsResponseDto (Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
