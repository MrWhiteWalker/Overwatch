package com.napstablook.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Ramandeep on 22-04-2017.
 */
@Component
public class Properties {
    @Value("${api.url}")
    private String apiUrl;

    public String getApiUrl() {
        return apiUrl;
    }


}
