package com.spring.exercise_1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/response-entity")
public class ResponseEntityDemo {

    @GetMapping("/success")
    public ResponseEntity<String> success() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Success-Header", "This is custom header is the success endpoint");
        return ResponseEntity.status(HttpStatus.OK).headers(headers).body("The request was successful");

    }

    @GetMapping("/not-found")
    public ResponseEntity<Map<String, String>> notFound() {

        Map<String, String> errorDetails = new HashMap<>();
        errorDetails.put("error", "Resource not found");

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDetails);
    }


    @GetMapping("/create")
    public ResponseEntity<String> create() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/response-entity/create");
        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body("The resource was created successfully");
    }

}
