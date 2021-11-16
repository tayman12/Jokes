package com.example.jokes.service;

import org.springframework.stereotype.Service;

@Service
public class JokeService {

    public String getJoke() {
        return "joke";
    }
}
