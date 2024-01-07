package com.belrose.springbootjmapper.model;

import com.googlecode.jmapper.annotations.JMap;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document( collection = "authors")
public class Author implements Serializable {
    @Id
    private String id; // Can't be mapped since there is no annotation
    @JMap("authorName") //Name of the source property
    private String name;
    @JMap("authorAge") //Name of the source property
    private Integer age;
    private String title;
}
