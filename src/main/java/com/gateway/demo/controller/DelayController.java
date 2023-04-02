package com.gateway.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DelayController {

    @GetMapping("/example")
    public ResponseEntity<String> myEndpoint() {
        System.out.println( "Got the request....:"+LocalDateTime.now());
        try {
            Thread.sleep(3600000); // add a delay of 40 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sending response...."+ LocalDateTime.now());
        return ResponseEntity.ok("***Request processed successfully***.");
    }
}
