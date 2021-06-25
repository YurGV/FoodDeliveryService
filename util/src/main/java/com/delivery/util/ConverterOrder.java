package com.delivery.util;


import com.delivery.domain.Order;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverterOrder {

    private final static String baseOrderFile = "order.json";

    public static void toJSON(Order order) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseOrderFile), order);
        System.out.println("json created!");
    }

    public static Order toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseOrderFile), Order.class);
    }

}
