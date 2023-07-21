package com.example.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "Reddit")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestBody RedditPost redditPost
    ) {
        userRepository.save(redditPost);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<RedditPost> getAllPosts() {
        return userRepository.findAll();
    }
}
