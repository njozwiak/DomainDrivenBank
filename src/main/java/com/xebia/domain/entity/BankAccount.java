package com.xebia.domain.entity;

import com.xebia.domain.ValueObject.Operation;

import java.util.List;

public class BankAccount {

    private Integer accountNumber;
    private Client client;
    private List<Operation> operations;
    private Double solde;
    private Double authorizedOverdraft;

    public BankAccount(Integer accountNumber, Client client, List<Operation> operations, Double solde, Double authorizedOverdraft) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.operations = operations;
        this.solde = solde;
        this.authorizedOverdraft = authorizedOverdraft;
    }

    public Double getLastSolde() {
        Double solde = 0.0;
        for (Operation operation : operations) {
            solde = solde + (operation.getCredit() - operation.getDebit());
        }
        return this.solde + solde;
    }

    public Double getAuthorizedOverdraft() {
        return authorizedOverdraft;
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public List<Operation> getOperations() {
        return operations;
    }
}
