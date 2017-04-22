package com.napstablook.controllers;

import com.google.gson.Gson;
import com.napstablook.MainObject;
import com.napstablook.properties.Properties;
import com.napstablook.service.HttpService;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

/**
 * Created by Ramandeep on 22-04-2017.
 */
@Controller
public class MainController {

    @Autowired
    HttpService httpService;
    @Autowired
    Properties properties;

    @RequestMapping(value = "getResponse")
    @ResponseBody
    public String getResponse(@RequestParam(value = "bnetId") String bNetId, Model model) {
        System.out.println(bNetId);
        String apiUrl = properties.getApiUrl();
        bNetId = bNetId.replace('#', '-');
        String response = httpService.request(String.format(apiUrl,bNetId));
        return response;
    }
}
