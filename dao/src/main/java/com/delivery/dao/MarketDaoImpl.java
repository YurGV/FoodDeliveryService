package com.delivery.dao;

import com.delivery.api.dao.MarketDao;
import com.delivery.domain.Market;

import java.util.ArrayList;

public class MarketDaoImpl extends AbstractDao<Market> implements MarketDao {


    private final ArrayList<Market> repo = new ArrayList<>();

    @Override
    public Market getById(Long id) {

        return repo.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
