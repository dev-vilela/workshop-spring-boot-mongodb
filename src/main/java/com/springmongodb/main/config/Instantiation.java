package com.springmongodb.main.config;

import com.springmongodb.main.domain.Post;
import com.springmongodb.main.domain.User;
import com.springmongodb.main.repository.PostRepository;
import com.springmongodb.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User paulo = new User(null, "Paulo Vilela", "paulo@gmail.com");
        User saulo = new User(null, "Saulo Vilela", "saulovf@gmail.com");
        User jader = new User(null, "Jader Vilela", "jaderfv@gmail.com");

        Post post1 = new Post(null, sdf.parse("25-05-2025"), "Contrato de Captain", "Valor do contrato Captain ficou por R$ 5690.25", paulo);
        Post post2 = new Post(null, sdf.parse("03-07-2025"), "Develop de Captain", "Valor do contrato  ficou por R$ 5680.25", paulo);

        userRepository.saveAll(Arrays.asList(paulo, saulo, jader));
        postRepository.saveAll(Arrays.asList(post1, post2));

    }
}
