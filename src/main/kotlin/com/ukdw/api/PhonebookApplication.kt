package com.ukdw.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PhonebookApplication

fun main(args: Array<String>) {
    SpringApplication.run(PhonebookApplication::class.java, *args)
}