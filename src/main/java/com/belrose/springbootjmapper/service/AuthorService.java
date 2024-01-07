package com.belrose.springbootjmapper.service;

import com.belrose.springbootjmapper.dto.AuthorDto;
import com.belrose.springbootjmapper.model.Author;

public interface AuthorService {
    String saveAuthor(AuthorDto authorDto);
}
