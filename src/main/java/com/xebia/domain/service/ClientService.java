package com.xebia.domain.service;

import com.xebia.domain.entity.Client;
import com.xebia.rest.entity.ClientEntity;
import com.xebia.domain.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private ClientRepository clientRepository;

    public ClientEntity getClientById(Integer idClient) {
        clientRepository = new ClientRepository();
        Client client = clientRepository.getClientById(idClient);

        return new ClientEntity(client);
    }

    public List<ClientEntity> getClients() {
        clientRepository = new ClientRepository();
        List<Client> clients = clientRepository.getClients();

        List<ClientEntity> clientEntities = new ArrayList<ClientEntity>();

        for (Client client : clients) {
            clientEntities.add(new ClientEntity(client));
        }

        return clientEntities;
    }
}
