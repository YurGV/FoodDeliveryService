package com.delivery.api.service;

import com.delivery.domain.Client;
import com.delivery.dto.ClientDto;

import java.util.List;

public interface ClientService {

    Client addClient();
    Client getClient(Long id);
    List<Client> getAllClients();
    Client updateClient(Client editClient);
    Client findBy();
    void deleteClient(Long id);

}
