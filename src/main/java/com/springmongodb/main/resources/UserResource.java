package com.springmongodb.main.resources;


import com.springmongodb.main.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){

        User paulo = new User("1", "Paulo Vilela", "paulo@gmail.com");
        User saulo = new User("2", "Saulo Vilela", "saulo@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(paulo, saulo));

        return ResponseEntity.ok().body(list);
    }

}
