package io.github.dizzyfox734.springboot.domain.user;

import org.springframework.beans.factory.annotation.Autowired;

public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private String key;
    private String title;

    // @Getter
    public String getKey() {
        return key;
    }
    public String getTitle() {
        return title;
    }

    // @RequiredArgsConstructor
    @Autowired
    Role(String key, String title) {
        this.key = key;
        this.title = title;
    }
}
