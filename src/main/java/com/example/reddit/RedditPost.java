package com.example.reddit;

import jakarta.persistence.*;

@Entity
public class RedditPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String postName;

    @Column(length = 4095)
    public String description;

    public String iconURL;

    public String subRedditName;

    public String imageUrl;

    public Integer netVoteCount;
}
