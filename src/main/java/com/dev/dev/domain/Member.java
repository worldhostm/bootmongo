package com.dev.dev.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "member")
public class Member {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
}

