package com.belrose.springbootjmapper.controller;

import com.belrose.springbootjmapper.dto.AuthorDto;
import com.belrose.springbootjmapper.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @PostMapping("/author")
    public ResponseEntity<String> saveAuthor(@RequestBody @Valid AuthorDto authorDto){
        var response = authorService.saveAuthor(authorDto);
        return  ResponseEntity.ok(response);
    }
}
