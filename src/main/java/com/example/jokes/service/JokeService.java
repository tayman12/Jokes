package com.example.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
