package uan.edu.co.ospinacamilo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uan.edu.co.ospinacamilo.property.manager.PropertyApplication;

@SpringBootApplication
public class App 
{
	public static void main(String[] args) {
        SpringApplication.run(PropertyApplication.class, args);
    }
}
