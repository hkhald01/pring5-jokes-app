package guru.springframework.joke.controller;

import guru.springframework.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JokeController {

    private JokeService jokeService;
    @Autowired
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }

}
