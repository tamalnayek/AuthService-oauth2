package com.mykbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mykbox.model.Person;
import org.springframework.web.client.RestOperations;

@RestController
public class PersonInfoController {


    @GetMapping("/person")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public @ResponseBody Person personInfo() {
        return new Person("sayan", "bangalore", "India", 32, "Male");
    }

//    @GetMapping("/personremote")
//     public String  personremote() {
//        String personResourceUrl = "http://localhost:9001/person";
//        System.out.println(restOperations.getForObject(personResourceUrl, String.class));
//        return "sdfsfd";
//     }
}
