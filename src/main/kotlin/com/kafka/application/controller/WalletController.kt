package com.kafka.application.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WalletController {

    @GetMapping
    fun consolidatedPosition(): ResponseEntity<String> {
        return ResponseEntity.ok("A lot of money")
    }
}