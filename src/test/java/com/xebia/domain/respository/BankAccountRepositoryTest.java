package com.xebia.domain.respository;

import static org.fest.assertions.Assertions.assertThat;
import com.xebia.domain.entity.BankAccount;
import com.xebia.domain.repository.BankAccountRepository;
import org.junit.Before;
import org.junit.Test;

public class BankAccountRepositoryTest {

    private BankAccountRepository bankAccountRepository;

    @Before
    public void setUp() {
        bankAccountRepository = new BankAccountRepository();
    }

    @Test
    public void should_GetBankAccount_With_Operations() {
        BankAccount bankAccount = bankAccountRepository.getBankAccount(1);
        assertThat(bankAccount.getOperations()).hasSize(4);
    }

    @Test
    public void should_GetBankAccount_With_Solde() {
        BankAccount bankAccount = bankAccountRepository.getBankAccount(1);
        assertThat(bankAccount.getLastSolde()).isEqualTo(943.25);
    }
}
