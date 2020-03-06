package com.example.blog.interactors

import org.springframework.stereotype.Service;
import com.example.blog.domain.Blog;

interface BlogService {
    fun getAll(): List<Blog>;

}

@Service
class BlogServiceImpl : BlogService {
    var calledCount = 1

    init {
        println("BlogServiceImpl init")
    }

    override fun getAll(): List<Blog> {
        println("BlogServiceImpl.getAll(), ${calledCount}")
        calledCount += 1

        return listOf(
            Blog("yesterday", "preparing..."),
            Blog("today", "Getting started!")
        )
    }
}
