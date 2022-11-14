package io.github.dizzyfox734.springboot.web.dto;

public class PostsUpdateRequestDto {
    private String title;
    private String content;

    // @NoArgsConstructor
    public PostsUpdateRequestDto() {
        super();
    }

    // @Builder
    public static class Builder {
        private String title;
        private String content;

        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public PostsUpdateRequestDto build() {
            return new PostsUpdateRequestDto(this);
        }
    }
    private PostsUpdateRequestDto(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
    }

    // @Getter
    public String getTitle() { return title; }
    public String getContent() { return content; }

}
