package com.delivery.dao;

import com.delivery.api.dao.ClientDao;
import com.delivery.domain.Client;

import java.util.ArrayList;

public class ClientDaoImpl extends AbstractDao<Client> implements ClientDao {


     private final ArrayList<Client> repo = new ArrayList<>();

    @Override
    public Client getById(Long id) {
        
        return repo.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
