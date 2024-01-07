package com.belrose.springbootjmapper.repository;

import com.belrose.springbootjmapper.model.Author;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AuthorRepository extends ReactiveMongoRepository<Author,Integer> {
}
