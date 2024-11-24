package com.app.login.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class UserModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String name;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;

    public long getId() {
        return id;
    }

    public @NotEmpty String getName() {
        return name;
    }
    public void setName(@NotEmpty String name) {
        this.name = name;
    }

    public @NotEmpty String getEmail() {
        return email;
    }
    public void setEmail(@NotEmpty String email) {
        this.email = email;
    }

    public @NotEmpty String getPassword() {
        return password;
    }
    public void setPassword(@NotEmpty String password) {
        this.password = password;
    }
}
