package io.github.dizzyfox734.springboot.web.dto;

import io.github.dizzyfox734.springboot.domain.posts.Posts;

public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;

    // @Getter
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
    }
}
