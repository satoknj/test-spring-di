package com.example.blog.domain

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
class Blog(
    var title: String,
    var content: String,
    @Id @GeneratedValue var id: Long? = null
)