package com.autenticacao.controller;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.autenticacao.dto.User;
import com.autenticacao.service.UserService;

@RestController()
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Boolean> validation(@RequestBody User sender, @RequestParam BigDecimal value) {
        return ResponseEntity.ok(userService.validation(sender, value));
    }

    @GetMapping("/hello")
    public String online(){
        return "hello world";
    }
}
