package com.bezkoder.spring.login;

import com.bezkoder.spring.login.models.user1;
import com.bezkoder.spring.login.repository.userRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLoginExampleApplication implements CommandLineRunner{
	@Autowired userRepo ob;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginExampleApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception
    {
        // Inserting the data in the mysql table.
        user1 first = new user1();
        // ob.save() method
        ob.save(first);
    }
}


