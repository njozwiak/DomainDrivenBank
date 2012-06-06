package com.xebia.domain.repository;

import com.xebia.domain.entity.BankAccount;

public interface IBankAccountRepository {

    BankAccount getBankAccountById(Integer accountId);
}
