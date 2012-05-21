package com.xebia.domain.entity;

import com.xebia.domain.ValueObject.Operation;
import org.fest.assertions.Assertions;
import org.fest.assertions.Delta;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccountTest {

    BankAccount account;

    @Before
    public void setUp() {
        Operation operationCredit1 = new Operation(new Date(), "credit1", 0.0, 100.4);
        Operation operationCredit2 = new Operation(new Date(), "credit2", 0.0, 1450.6);

        Operation operationDebit = new Operation(new Date(), "debit1", 250.1, 0.0);
        Client client = new Client(1, "test", "test");

        List<Operation> operations = new ArrayList<Operation>();
        operations.add(operationCredit1);
        operations.add(operationCredit2);
        operations.add(operationDebit);

        account = new BankAccount(1, client, operations, 300.2, 1000.0);
    }

    @Test
    public void test_getLastSolde() {
        Assertions.assertThat(account.getLastSolde()).isEqualTo(1601.1, Delta.delta(0.1));
    }

    @Test
    public void test_addOperation() {
        account.addOperation(new Operation(new Date(), "credit3", 0.0, 255.6));
        Assertions.assertThat(account.getLastSolde()).isEqualTo(1856.7, Delta.delta(0.1));
    }
}
