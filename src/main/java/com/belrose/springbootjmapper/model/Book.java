package com.belrose.springbootjmapper.model;

import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "books")
public class Book implements Serializable {
    private String id;
    @JMap              //Source property should have the same name
    private String title;
}
