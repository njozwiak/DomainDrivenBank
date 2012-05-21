package com.xebia.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.xebia.domain.entity.Client;

public class ClientRepository {

    public Client getClientById(Integer idClient) {
    	if (idClient == null) {
    		throw new IllegalArgumentException("id client cannot be null");
    	}
    	return new Client(idClient, "Dragon", "Jo");
    }
    
    public List<Client> getClients() {
    	List<Client> clients = new ArrayList<Client>();

        clients.add(new Client(1, "Dragon", "Jo"));
        clients.add(new Client(1, "Yugo", "Elia"));
        clients.add(new Client(1, "Ruel", "Strud"));
        clients.add(new Client(1, "Pinpin", "Le"));

        return clients;
    }
}
