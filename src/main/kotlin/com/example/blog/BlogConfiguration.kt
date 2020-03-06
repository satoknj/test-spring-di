package com.example.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import com.example.blog.domain.Blog
import com.example.blog.domain.BlogRepository

@Configuration
class BlogConfiguration {
    @Bean
    fun databaseInitializer(blogRepository: BlogRepository) = ApplicationRunner {

        blogRepository.save(Blog(
                title = "today",
                content = "getting started!"
        ))
        blogRepository.save(Blog(
                title = "yesterday",
                content = "preparing..."
        ))
        blogRepository.save(Blog(
                title = "a week ago",
                content = "decided!"
        ))
    }
}
