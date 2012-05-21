package com.xebia.domain.service;

import com.xebia.domain.entity.Client;
import com.xebia.rest.entity.ClientEntity;
import com.xebia.domain.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    
    public ClientEntity getClientById(Integer idClient) {
        ClientRepository clientRepository = new ClientRepository();
        Client client = clientRepository.getClientById(idClient);

        return new ClientEntity(client);
    }

    public List<ClientEntity> getClients() {
        ClientRepository clientRepository = new ClientRepository();
        List<Client> clients = clientRepository.getClients();

        List<ClientEntity> clientEntities = new ArrayList<ClientEntity>();

        for (Client client : clients) {
            clientEntities.add(new ClientEntity(client));
        }

        return clientEntities;
    }
}
