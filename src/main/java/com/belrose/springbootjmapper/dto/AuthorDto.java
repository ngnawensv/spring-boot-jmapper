package com.belrose.springbootjmapper.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serializable;

@Data
public class AuthorDto implements Serializable {
    @NotBlank(message = "Author Name is mandatory field")
    private String authorName;
    private Integer authorAge;
    private String title;
}
