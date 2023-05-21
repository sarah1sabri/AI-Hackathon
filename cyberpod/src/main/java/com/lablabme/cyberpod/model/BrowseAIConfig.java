package com.lablabme.cyberpod.model;

import org.springframework.beans.factory.annotation.Value;

public class BrowseAIConfig {

    @Value("${browseai.apikey")
    private  String apiKey;

    public String getApiKey() {
        return apiKey;
    }

//    @Override
//    public String toString() {
//        return "Query:" + query;
//    }
}
