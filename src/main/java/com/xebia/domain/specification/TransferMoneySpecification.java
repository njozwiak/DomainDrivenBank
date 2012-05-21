package com.xebia.domain.specification;

import com.xebia.domain.entity.BankAccount;

public class TransferMoneySpecification implements ISpecification<BankAccount> {

    @Override
    public Boolean isSatisfiedBy(BankAccount account, Double money) {
        return account.getLastSolde() - money >= -account.getAuthorizedOverdraft();
    }
}
