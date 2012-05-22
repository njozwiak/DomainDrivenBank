package com.xebia.domain.service;

import com.xebia.domain.ValueObject.Operation;
import com.xebia.domain.entity.BankAccount;
import com.xebia.domain.repository.BankAccountRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewAccount {

    private BankAccountRepository bankAccountRepository;

    public List<Operation> getOperationsBetweenPeriod (Integer accountId, Date begin, Date end) {
        bankAccountRepository = new BankAccountRepository();
        BankAccount bankAccount = bankAccountRepository.getBankAccount(accountId);
        
        List<Operation> operationsBetweenPeriod = new ArrayList<Operation>();

        for (Operation operation : bankAccount.getOperations()) {
            if (operation.getDate().after(begin) && operation.getDate().before(end)) {
                operationsBetweenPeriod.add(operation);
            }
        }
        return operationsBetweenPeriod;
    }
}
