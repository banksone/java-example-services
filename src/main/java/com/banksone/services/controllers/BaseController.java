package com.banksone.services.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class BaseController {

    @GetMapping("/moviesapi/recommendations")
    HashMap<String, String> getRecommendations() {
        HashMap jsonMap = new HashMap<String, String>();
        jsonMap.put("text", "yes Im alive");
        return jsonMap;
    }

    @GetMapping("/moviesapi/preferences")
    HashMap<String, String> getPreferences() {
        HashMap jsonMap = new HashMap<String, String>();
        jsonMap.put("text", "prefs");
        return jsonMap;
    }

    @GetMapping("/moviesapi/details/{id}")
    HashMap<String, String> getDetails(@PathVariable long id) {
        HashMap jsonMap = new HashMap<String, String>();
        jsonMap.put("text", "prefs");
        return jsonMap;
    }

    @PostMapping("/moviesapi/like")
    HashMap<String, String> giveLike(HashMap<String, String> like) {
        HashMap jsonMap = new HashMap<String, String>();
        jsonMap.put("text", "prefs");
        return jsonMap;
    }
}
