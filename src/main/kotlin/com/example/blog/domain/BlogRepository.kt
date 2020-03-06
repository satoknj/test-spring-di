package com.example.blog.domain

import org.springframework.data.repository.CrudRepository

interface BlogRepository : CrudRepository<Blog, Long?> {
}