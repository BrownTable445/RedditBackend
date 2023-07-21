package com.example.reddit;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<RedditPost, Integer> {
}
