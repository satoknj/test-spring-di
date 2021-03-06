package com.example.blog.controller

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.LoggerFactory

import com.example.blog.domain.Blog;
import com.example.blog.interactors.BlogService;

@RestController
@RequestMapping("/api/blog")
class BlogController(private val blogService: BlogService) {
    val logger = LoggerFactory.getLogger(BlogController::class.java)

    init {
        println("BlogController init")
    }

    @GetMapping("/")
    fun getAll(): Iterable<Blog> {
        logger.info("BlogController.getAll()")

        return blogService.getAll()
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