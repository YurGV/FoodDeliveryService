package com.delivery.api.service;

import com.delivery.domain.Client;

import java.util.List;

public interface ClientService {

    Client addClient();
    Client getClient(Long id);
    List<Client> getAllClients();
    Client updateClient(Client editClient);
    void deleteClient(Long id);

}
