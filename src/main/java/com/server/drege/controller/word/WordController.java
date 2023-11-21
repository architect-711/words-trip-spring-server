package com.server.drege.controller.word;

import com.server.drege.entity.Response;
import com.server.drege.entity.Word;
import com.server.drege.model.word_service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/words-management")
public class WordController {
    private final WordService service;

    @Autowired
    public WordController(WordService service) {
        this.service = service;
    }

    @GetMapping("/words")
    public Response<List<Word>> getAll() {
        return service.getAll();
    }

    @PostMapping("/words")
    public Response<?> saveAll(@RequestBody List<Word> words) {
        return service.saveAll(words);
    }

    @GetMapping("/words/{id}")
    public Response<Word> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/words/{id}")
    public Response<?> deleteById(@PathVariable Long id) {
        return service.deleteById(id);
    }

}
