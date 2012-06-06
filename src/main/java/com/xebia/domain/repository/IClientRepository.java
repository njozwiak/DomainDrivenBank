package com.xebia.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.xebia.domain.entity.Client;

public interface IClientRepository {

    Client getClientById(Integer idClient);
    
    List<Client> getClients();
}
