package com.xebia.domain.service;

import static org.fest.assertions.Assertions.assertThat;
import com.xebia.domain.ValueObject.Operation;
import com.xebia.domain.entity.BankAccount;
import com.xebia.domain.entity.Client;
import org.fest.assertions.Assertions;
import org.fest.assertions.Delta;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransfertServiceTest {

    @Test
    public void test_debitCreditAccount() {
        Operation operationCredit1 = new Operation(new Date(), "credit1", 0.0, 100.4);
        Operation operationCredit2 = new Operation(new Date(), "credit2", 0.0, 1450.6);

        Operation operationDebit = new Operation(new Date(), "debit1", 250.1, 0.0);
        Client client = new Client(1, "test", "test");

        List<Operation> operations = new ArrayList<Operation>();
        operations.add(operationCredit1);
        operations.add(operationCredit2);
        operations.add(operationDebit);

        BankAccount debitAccount = new BankAccount(1, client, operations, 300.2, 1000.0);
        BankAccount creditAccount = new BankAccount(2, client, new ArrayList<Operation>(), 150.6, 1000.0);

        TransfertService service = new TransfertService();
        service.debitCreditAccount(debitAccount, creditAccount, 250.2);

        assertThat(debitAccount.getLastSolde()).isEqualTo(1350.9, Delta.delta(0.1));
        assertThat(creditAccount.getLastSolde()).isEqualTo(400.8, Delta.delta(0.1));
    }
}
