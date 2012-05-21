package com.xebia.domain.service;

import com.xebia.domain.ValueObject.Operation;
import com.xebia.domain.entity.BankAccount;
import com.xebia.domain.specification.TransferMoneySpecification;

import java.util.Date;

public class TransfertService {

    public void debitCreditAccount(BankAccount debitAccount, BankAccount creditAccount, Double money) {
        TransferMoneySpecification moneySpecification = new TransferMoneySpecification();

        if (moneySpecification.isSatisfiedBy(debitAccount, money)) {
            debitAccount.addOperation(new Operation(new Date(), "Transfert", money, 0.0));
            creditAccount.addOperation(new Operation(new Date(), "Transfert", 0.0, money));
        }
    }
}
