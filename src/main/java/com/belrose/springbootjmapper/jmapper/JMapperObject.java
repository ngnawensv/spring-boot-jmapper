package com.belrose.springbootjmapper.jmapper;

import com.belrose.springbootjmapper.dto.AuthorDto;
import com.belrose.springbootjmapper.model.Author;
import com.belrose.springbootjmapper.model.Book;
import com.googlecode.jmapper.JMapper;
import org.springframework.stereotype.Component;

@Component
public class JMapperObject {
    //Instantiate JMapper<Destination,source>
    JMapper<Author, AuthorDto> authorMapper = new JMapper<>(Author.class,AuthorDto.class);
    JMapper<Book,AuthorDto> bookMapper = new JMapper<>(Book.class,AuthorDto.class);

    public Author mapAuthorDtoToAuthor(AuthorDto authorDto){
        return authorMapper.getDestination(authorDto);
    }

    public Book mapAuthorDtoToBook(AuthorDto authorDto){
        return bookMapper.getDestination(authorDto);
    }
}
