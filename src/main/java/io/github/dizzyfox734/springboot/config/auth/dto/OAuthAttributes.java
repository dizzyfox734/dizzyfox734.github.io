package io.github.dizzyfox734.springboot.config.auth.dto;

import java.util.Map;

public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttributeKey;
    private String name;
    private String email;
    private String picture;

    // @Getter
    public Map<String, Object> getAttributes() {
        return attributes;
    }
    public String getNameAttributeKey() {
        return nameAttributeKey;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPicture() {
        return picture;
    }

    // @Builder
    public static class Builder {
        private Map<String, Object> attributes;
        private String nameAttributeKey;
        private String name;
        private String email;
        private String picture;

        public Builder attributes(Map<String, Object> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder nameAttributeKey(String nameAttributeKey) {
            this.nameAttributeKey = nameAttributeKey;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder picture(String picture) {
            this.picture = picture;
            return this;
        }

        public OAuthAttributes build() {
            return new OAuthAttributes(this);
        }
    }

    private OAuthAttributes(Builder builder) {
        this.attributes = builder.attributes;
        this.nameAttributeKey = builder.nameAttributeKey;
        this.name = builder.name;
        this.email = builder.email;
        this.picture = builder.picture;
    }
}
