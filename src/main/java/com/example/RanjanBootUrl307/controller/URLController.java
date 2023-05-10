package com.example.RanjanBootUrl307.controller;

import com.example.RanjanBootUrl307.models.UrlApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLController {

    @GetMapping
    public ResponseEntity<UrlApiResponse> getShortUrlFromOriginal(@RequestParam @NonNull String originalUrl) {
        UrlApiResponse shortUrlResult = new UrlApiResponse();

        return new ResponseEntity<UrlApiResponse>(shortUrlResult,HttpStatusCode.valueOf(shortUrlResult.getStatusCode()));
    }
}
