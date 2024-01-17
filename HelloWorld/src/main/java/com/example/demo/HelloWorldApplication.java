package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
	
	static {
		System.out.println("Static Block-1"+Thread.currentThread().getName());
	}
	
	{
		System.out.println("Non-Static Block"+Thread.currentThread().getName());
	}

	public HelloWorldApplication() {
		//super();
		
		System.out.println("This is a Constructor."+Thread.currentThread().getName());
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("Before run method");
		
		SpringApplication.run(HelloWorldApplication.class, args);
		
		System.out.println("After run method"+Thread.currentThread().getName());
		
		System.out.println("Hello World!!"+Thread.currentThread().getName());
		
	}
	
	static {
		System.out.println("Static Block-2"+Thread.currentThread().getName());}

}

//KEY POINTS
// 1. first the simple JVM will execute all the static blocs from top to bottom.
// 2. Secondly the sys statements before the run method will be executed. The run method contains the banner logic and IoC container logic.
// 3. The Ioc container does has the object of the class so the constructor method and the non- static block of the Super class will be executed.
// 4. Lastly the blocks after the main method will get executed.