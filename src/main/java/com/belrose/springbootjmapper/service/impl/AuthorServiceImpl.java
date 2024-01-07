package com.belrose.springbootjmapper.service.impl;

import com.belrose.springbootjmapper.dto.AuthorDto;
import com.belrose.springbootjmapper.jmapper.JMapperObject;
import com.belrose.springbootjmapper.model.Author;
import com.belrose.springbootjmapper.model.Book;
import com.belrose.springbootjmapper.repository.AuthorRepository;
import com.belrose.springbootjmapper.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private JMapperObject JMapperObject;

    public AuthorServiceImpl(AuthorRepository authorRepository, JMapperObject JMapperObject) {
        this.authorRepository = authorRepository;
        this.JMapperObject = new JMapperObject();
    }

    @Override
    public String saveAuthor(AuthorDto authorDto) {

        //Map AuthorDto to Author and Book
        Author author = JMapperObject.mapAuthorDtoToAuthor(authorDto);
        Book book = JMapperObject.mapAuthorDtoToBook(authorDto);

        log.info("author mapped from authorDto {}",authorDto);
        log.info("Book mapped from authorDto {}",book);

        var authorSave= authorRepository.save(author).block();
        log.info("author Save in mongodb {}",authorSave);

        return String.format("Author name: %s and Book title: %s",author.getName(),book.getTitle());

    }
}
