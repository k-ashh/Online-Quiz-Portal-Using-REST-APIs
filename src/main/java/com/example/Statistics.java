package com.example;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Statistics {
	
	private int users;
	private int quiz;
	private int questions;
	
}
