package com.caicai.joke.restcontroller;

import com.caicai.joke.domain.Joke;
import com.caicai.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caic
 * @description
 * @see
 * @since
 */
@RestController
@RequestMapping("/joke")
public class JokeController {
    @Autowired
    JokeService jokeService;

    @GetMapping("/getJoke")
    public Joke getJoke(String type){
        return jokeService.getJoke(type);
    }
}
