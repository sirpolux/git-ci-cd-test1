package com.cteck.githubcicdactions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("Connected to Home page",HttpStatus.OK);
    }

//
//    echo "# git-ci-cd-test1" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/sirpolux/git-ci-cd-test1.git
//    git push -u origin main
}
