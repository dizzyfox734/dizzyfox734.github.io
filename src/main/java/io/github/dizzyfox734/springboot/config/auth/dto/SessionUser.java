package io.github.dizzyfox734.springboot.config.auth.dto;

import io.github.dizzyfox734.springboot.domain.user.User;

import java.io.Serializable;

public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    // @Getter
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPicture() {
        return picture;
    }

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
