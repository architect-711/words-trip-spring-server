package com.server.drege.model.word_service;

import com.server.drege.Logger;
import com.server.drege.entity.Response;
import com.server.drege.entity.Word;
import com.server.drege.view.WordView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Service
public class WordService {
    @Autowired
    private WordRepository repository;

    public Response<List<Word>> getAll() {
        List<Word> words = repository.findAll();

        return WordView.getDataRepresentationOfList(words);
    }

    public Response<?> saveAll(List<Word> words) {
        if (words.isEmpty()) {
            return new Response<>(null, 404);
        }

        HashSet<Word> uniqueWords = new HashSet<>(words.size());

        for (Word word : words) {
            String currentName = word.getName().toLowerCase();

            if (!repository.existsByName(currentName)) {
                word.setName(currentName);

                uniqueWords.add(word);
            }
        }

        if (uniqueWords.isEmpty()) {
            return new Response<>(null, 404);
        }

        repository.saveAll(uniqueWords);

        return new Response<>(null, 200);
    }

    public Response<Word> getById(Long id) {
        Optional<Word> word = repository.findById(id);

        return WordView.getDataRepresentation(word);
    }

    public Response<?> deleteById(Long id) {
        if (!repository.existsById(id)) {
            return new Response<>(null, 404);
        }
        repository.deleteById(id);

        return new Response<>(null, 200);
    }
}
