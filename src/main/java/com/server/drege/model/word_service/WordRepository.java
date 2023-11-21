package com.server.drege.model.word_service;

import com.server.drege.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
    public boolean existsByName(String name);
}
