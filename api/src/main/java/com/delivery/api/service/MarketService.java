package com.delivery.api.service;


import com.delivery.domain.Market;

import java.util.List;

public interface MarketService {

    Market addMarket();
    Market getMarket(Long id);
    List<Market> getAllMarkets();
    Market updateMarket(Market editMarket);
    void deleteMarket(Long id);
}
