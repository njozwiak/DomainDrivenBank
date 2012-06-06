package com.xebia.domain.repository;

import com.xebia.domain.ValueObject.Operation;
import com.xebia.domain.entity.BankAccount;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class IBankAccountRepository {

    private IClientRepository clientRepository;
    
    public BankAccount getBankAccountById(Integer accountId);
}
