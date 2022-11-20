package io.github.dizzyfox734.springboot.domain.user;

import io.github.dizzyfox734.springboot.domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    // @NoArgsConstructor
    public User() {
    }

    // @Getter
    public Long getId() {
        return id;
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
    public Role getRole() {
        return role;
    }

    // @Builder
    public static class Builder {
        private Long id;
        private String name;
        private String email;
        private String picture;
        private Role role;

        // not nullable field
        public Builder(String name, String email, Role role) {
            this.name = name;
            this.email = email;
            this.role = role;
        }

        public Builder picture(String picture) {
            this.picture = picture;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.picture = builder.picture;
        this.role = builder.role;
    }

    public User update(String name, String picture) {
        this.name = name;
        this.picture = picture;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}
