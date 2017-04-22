package com.napstablook.controllers;

import com.google.gson.Gson;
import com.napstablook.MainObject;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;

/**
 * Created by Ramandeep on 22-04-2017.
 */
public class TestMain {
    private final String USER_AGENT = "Mozilla/5.0";
/*    @RequestMapping(value = "fetch")
    public @ResponseBody*/

    public static void main(String[] args) throws Exception {

        TestMain http = new TestMain();

        System.out.println("Testing 1 - Send Http GET request");
        System.setProperty("http.agent", "Chrome");
        http.testIt();


    }

    private void testIt() {

        String https_url = "https://owapi.net/api/v3/u/Alienkarma-11124/blob";
        URL url;
        try {

            url = new URL(https_url);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            //dumpl all cert info
            print_https_cert(con);

            //dump all the content
            print_content(con);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void print_https_cert(HttpsURLConnection con) {

        if (con != null) {

            try {

                System.out.println("Response Code : " + con.getResponseCode());
                System.out.println("Cipher Suite : " + con.getCipherSuite());
                System.out.println("\n");

                Certificate[] certs = con.getServerCertificates();
                for (Certificate cert : certs) {
                    System.out.println("Cert Type : " + cert.getType());
                    System.out.println("Cert Hash Code : " + cert.hashCode());
                    System.out.println("Cert Public Key Algorithm : "
                            + cert.getPublicKey().getAlgorithm());
                    System.out.println("Cert Public Key Format : "
                            + cert.getPublicKey().getFormat());
                    System.out.println("\n");
                }

            } catch (SSLPeerUnverifiedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private void print_content(HttpsURLConnection con) {
        if (con != null) {

            try {

                System.out.println("****** Content of the URL ********");
                BufferedReader br =
                        new BufferedReader(
                                new InputStreamReader(con.getInputStream()));

                String input;
                StringBuffer response = new StringBuffer();
                while ((input = br.readLine()) != null) {
                    System.out.println(input);
                    response.append(input);
                }
                br.close();
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
                        false);
                MainObject object = objectMapper.readValue(response.toString(), MainObject.class);
                System.out.println(new Gson().toJson(object));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
