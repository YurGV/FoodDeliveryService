package com.delivery.util;


import com.delivery.domain.Client;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverterClient {

    private final static String baseClientFile = "client.json";

    public static void toJSON(Client client) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseClientFile), client);
        System.out.println("json created!");
    }

    public static Client toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseClientFile), Client.class);
    }

}
