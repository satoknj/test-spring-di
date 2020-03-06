package com.example.blog.controller

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/blog")
class BlogController {
    @GetMapping("/")
    fun getContent(): Map<String, Int> {
        return mapOf("one" to 1, "two" to 2, "three" to 3)
    }
}