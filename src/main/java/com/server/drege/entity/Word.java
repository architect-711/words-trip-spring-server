package com.server.drege.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Long userId;

    private Word() {}

    public Word(Long id, String name, Long userId) {
        this.id = id;
        this.name = name;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
