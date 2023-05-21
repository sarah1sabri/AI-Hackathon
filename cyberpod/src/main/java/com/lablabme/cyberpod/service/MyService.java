package com.lablabme.cyberpod.service;

import com.lablabme.cyberpod.model.BrowseAIConfig;
import org.springframework.stereotype.Service;
import java.net.http.HttpResponse;

@Service
public class MyService {
    private final BrowseAIConfig browseAIConfig;

    public MyService(BrowseAIConfig browseAIConfig) {
        this.browseAIConfig = browseAIConfig;
    }
    public  void findQuery() {
        String apikey =
                browseAIConfig.getApiKey();
    }
}
