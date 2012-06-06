package com.xebia.domain.entity;

public class BankAccount {

    private Integer accountId;
    private Client client;
    private Double solde;

    public BankAccount(Integer accountNumber, Client client, Double solde) {
        this.accountId = accountNumber;
        this.client = client;
        this.solde = solde;
    }

    public Double getSolde() {
        return this.solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }
}
