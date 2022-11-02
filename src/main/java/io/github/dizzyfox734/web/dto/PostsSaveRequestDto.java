package io.github.dizzyfox734.web.dto;

import io.github.dizzyfox734.domain.posts.Posts;

public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    private PostsSaveRequestDto(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
    }

    public static class Builder {
        private String title;
        private String content;
        private String author;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public PostsSaveRequestDto build() {return new PostsSaveRequestDto(this);}
    }

    public PostsSaveRequestDto() {
        super();
    }

    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getAuthor() { return author; }

    public Posts toEntity() {
        return new Posts.Builder(title, content)
                        .author(author)
                        .build();
    }
}
