package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Messager {
	@Bean
	public String GetMessage() 
	{
		return "Hell-o world";
	}

}
