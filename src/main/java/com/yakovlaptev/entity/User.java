package com.yakovlaptev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends ModelBase{

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "avatar", length = 50)
    private String avatar;

    @Column(name = "about", length = 50)
    private String about;

    public User() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
