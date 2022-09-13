package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Admin {
@Id
private int id;
private String adminname;
private String password;
}
