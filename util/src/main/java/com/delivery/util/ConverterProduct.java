package com.delivery.util;


import com.delivery.domain.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverterProduct {

    private final static String baseProdFile = "product.json";

    public static void toJSON(Product product) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseProdFile), product);
        System.out.println("json created!");
    }

    public static Product toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseProdFile), Product.class);
    }

}
