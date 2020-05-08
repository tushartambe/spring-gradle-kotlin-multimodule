package com.axis.thanos.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.axis.thanos"])
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
