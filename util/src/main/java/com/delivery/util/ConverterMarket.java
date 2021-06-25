package com.delivery.util;


import com.delivery.domain.Market;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConverterMarket {

    private final static String baseMarketFile = "market.json";

    public static void toJSON(Market market) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseMarketFile), market);
        System.out.println("json created!");
    }

    public static Market toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseMarketFile), Market.class);
    }

}
