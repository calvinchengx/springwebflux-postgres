package com.example.demo.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("users") // User is actually a reserved keyword that Spring JPA doesn't "escape" as-is, so we specify "users"
public class User {

  @Id
  private Long id;

  @Column
  private String username;

  @Column
  private String password;

  @Column
  private Instant created;
  
}