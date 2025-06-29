package com.springmongodb.main.config;

import com.springmongodb.main.domain.User;
import com.springmongodb.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User paulo = new User(null, "Paulo Vilela", "paulo@gmail.com");
        User saulo = new User(null, "Saulo Vilela", "saulovf@gmail.com");
        User jader = new User(null, "Jader Vilela", "jaderfv@gmail.com");

        userRepository.saveAll(Arrays.asList(paulo, saulo, jader));

    }
}
