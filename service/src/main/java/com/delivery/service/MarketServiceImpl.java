package com.delivery.service;

import com.delivery.api.dao.MarketDao;
import com.delivery.api.service.MarketService;
import com.delivery.domain.Market;

import java.util.List;

public class MarketServiceImpl implements MarketService {

    private final MarketDao marketDao;

    public MarketServiceImpl(MarketDao marketDao) {
        this.marketDao = marketDao;
    }

    public Market addMarket() {
        Market market = new Market();
        marketDao.save(market);
        return market;
    }

    public Market getMarket(Long id) {
        return marketDao.getById(id);
    }

    public List<Market> getAllMarkets() {
        return marketDao.getAll();
    }

    public Market updateMarket(Market editMarket) {

        Market upMarket = marketDao.getById(editMarket.getId());
        upMarket.setName(editMarket.getName());
        upMarket.setEmail(editMarket.getAddress());
        upMarket.setAddress(editMarket.getAddress());
        upMarket.setSize(editMarket.getSize());
        upMarket.setOrders(editMarket.getOrders());
        upMarket.setProducts(editMarket.getProducts());

        marketDao.save(upMarket);
        return upMarket;
    }

    public Market findBy() {
        return null;
    }

    public void deleteMarket(Long id) {
        marketDao.delete(getMarket(id));
    }
}
