package com.example.blog.controller

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.domain.Blog;

@RestController
@RequestMapping("/api/blog")
class BlogController {
    @GetMapping("/")
    fun getBlogs(): List<Blog> {
        return listOf(
            Blog("yesterday", "preparing..."),
            Blog("today", "Getting started!")
        )
    }

    @GetMapping("/one")
    fun getBlog(): Blog {
        return Blog("today", "Getting started!")
    }

    @GetMapping("/test")
    fun getTest(): Map<String, Int> {
        return mapOf("one" to 1, "two" to 2, "three" to 3)
    }
}