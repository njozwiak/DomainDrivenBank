package com.xebia.domain.repository;

import com.xebia.domain.ValueObject.Operation;
import com.xebia.domain.entity.BankAccount;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BankAccountRepository {

    private ClientRepository clientRepository;
    
    public BankAccount getBankAccount(Integer accountId) {
        List<Operation> operations = new ArrayList<Operation>();

        operations.add(new Operation(getDate(2012, 02, 10), "achat ordinateur", 450.25, 0.0));
        operations.add(new Operation(getDate(2012, 04, 10), "prelevement electricite", 45.0, 0.0));
        operations.add(new Operation(getDate(2012, 04, 12), "cinema", 6.50, 0.0));
        operations.add(new Operation(getDate(2012, 05, 21), "kebab", 5.0, 0.0));

        clientRepository = new ClientRepository();

        return new BankAccount(12, clientRepository.getClientById(1), operations, 1450.0, 1000.0);
    }
    
    private Date getDate(Integer day, Integer month, Integer year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(day, month, year);
        return calendar.getTime();
    }
}
