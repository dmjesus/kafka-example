package com.kafka.application.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController {

    @PostMapping("/buy")
    fun buyStock(@RequestParam stock: String, @RequestParam qtd: Int): ResponseEntity<Unit> {
        return ResponseEntity.ok().build()
    }

    @PutMapping("/sell")
    fun sellStock(@RequestParam stock: String, @RequestParam qtd: Int): ResponseEntity<Unit> {
        return ResponseEntity.ok().build()
    }
}