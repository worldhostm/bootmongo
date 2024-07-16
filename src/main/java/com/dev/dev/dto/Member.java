package com.dev.dev.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(collection = "member")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member{
  @Id
  private String id;
  private String name;
  private String email;
  private String gender;
  private int age;
}
