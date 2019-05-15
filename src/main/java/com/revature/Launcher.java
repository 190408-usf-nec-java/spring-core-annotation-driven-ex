package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.beans.Movie;

public class Launcher {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext("com.revature.beans");
		
		Movie movie = context.getBean(Movie.class);
		System.out.println(movie);
	}
}
