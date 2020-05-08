package com.axis.thanos.application.controllers

import com.axis.thanos.library.domain.Customer
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/app")
    fun app(): Customer {
        return  Customer("test-name",34)
    }
}