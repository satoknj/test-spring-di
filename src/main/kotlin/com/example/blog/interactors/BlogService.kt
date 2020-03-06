package com.example.blog.interactors

import org.springframework.stereotype.Service;
import com.example.blog.domain.Blog;
import com.example.blog.domain.BlogRepository;

interface BlogService {
    fun getAll(): Iterable<Blog>;

}

@Service
class BlogServiceImpl(private val blogRepository : BlogRepository) : BlogService {
    var calledCount = 1

    init {
        println("BlogServiceImpl init")
    }

    override fun getAll(): Iterable<Blog> {
        println("BlogServiceImpl.getAll(), ${calledCount}")
        calledCount += 1

        // return listOf(
        //     Blog("yesterday", "preparing..."),
        //     Blog("today", "Getting started!")
        // )
        return blogRepository.findAll()
    }
}
