package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class RunController @Autowired constructor(
) {
    @GetMapping("")
    fun getDashboardLafs(): String {
        return "Welcome to Hanapp"
    }
}