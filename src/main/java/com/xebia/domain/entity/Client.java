package com.xebia.domain.entity;

public class Client {

    private Integer idClient;
    private String firstName;
    private String lastName;
    
    
	public Client(Integer idClient, String firstName, String lastName) {
		this.idClient = idClient;
		this.firstName = firstName;
        this.lastName = lastName;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public String getFirstName() {
		return firstName;
	}

    public String getLastName() {
        return lastName;
    }
}
