package com.hjyoon.repo;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@ToString
public class TestUtils {

    private String client;
    private String publicKey;


    public TestUtils() {
        System.out.println("client: " + client);
        System.out.println("publicKey: " + publicKey);
    }

    TestUtils(String client, String publicKey) {
        this.client = client;
        this.publicKey = publicKey;
    }

    public String getParams() {
        return "client: " + client + ", publicKey: " + publicKey;
    }
}
