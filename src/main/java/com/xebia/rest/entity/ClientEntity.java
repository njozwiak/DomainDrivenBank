package com.xebia.rest.entity;

import com.xebia.domain.entity.Client;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Client")
public class ClientEntity {

    private Integer idClient;

    private String name;

    public ClientEntity() {
    }

    public ClientEntity(Integer idClient, String name) {
        this.idClient = idClient;
        this.name = name;
    }

    public ClientEntity (Client client) {
        this.idClient = client.getIdClient();
        this.name = client.getFirstName();
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
