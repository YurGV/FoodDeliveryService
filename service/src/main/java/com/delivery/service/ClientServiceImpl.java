package com.delivery.service;

import com.delivery.api.dao.ClientDao;
import com.delivery.api.service.ClientService;
import com.delivery.domain.Client;

import java.util.List;


public class ClientServiceImpl implements ClientService {

    private final ClientDao clientDao;

    public ClientServiceImpl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public Client addClient() {
      Client client = new Client();
      clientDao.save(client);
      return client;
    }

    public Client getClient(Long id) {
        return clientDao.getById(id);
    }

    public List<Client> getAllClients() {
        return clientDao.getAll();
    }

    public Client updateClient(Client editClient) {

        Client upClient = clientDao.getById(editClient.getId());
        upClient.setFirstName(editClient.getFirstName());
        upClient.setLastName(editClient.getLastName());
        upClient.setEmail(editClient.getEmail());
        upClient.setAddress(editClient.getAddress());
        upClient.setPhone(editClient.getPhone());
        upClient.setOrders(editClient.getOrders());
        clientDao.save(upClient);

        return upClient;
    }

    public Client findBy() {
        return null;
    }



    public void deleteClient(Long id) {
        clientDao.delete(clientDao.getById(id));

    }
}
