package kr.ayukawa.vaadin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EntryPoint {
	public static void main(String[] args) {
		SpringApplication.run(EntryPoint.class, args);
	}
}
