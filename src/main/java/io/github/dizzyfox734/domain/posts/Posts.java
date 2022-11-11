package io.github.dizzyfox734.domain.posts;

import io.github.dizzyfox734.domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
public class Posts extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 500, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    private String author;

    // @NoArgsConstructor
    public Posts() {
        super();
    }

    // @Builder
    public static class Builder {
        private Long id;
        private String title;
        private String content;
        private String author;

        // Not nullable field
        public Builder(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Posts build() {
            return new Posts(this);
        }
    }
    private Posts(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
    }

    // @getter
    public Long getId() { return id; }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getAuthor() { return author; }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
