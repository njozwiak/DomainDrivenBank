package com.xebia.domain.specification;

import com.xebia.domain.ValueObject.Operation;
import com.xebia.domain.entity.BankAccount;
import com.xebia.domain.entity.Client;
import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

public class TransferMoneySpecificationTest {

    @Mock
    private Client mockClient;

    private TransferMoneySpecification specification;

    @Before
    public void setUp() {
        specification = new TransferMoneySpecification();
    }

    @Test
    public void test_isSatisfied() {
        BankAccount account = new BankAccount(1, mockClient, new ArrayList<Operation>(), 150.6, 1000.0);

        Assertions.assertThat(specification.isSatisfiedBy(account, 50.2)).isTrue();
    }

    @Test
    public void test_isNotSatisfied() {
        BankAccount account = new BankAccount(1, mockClient, new ArrayList<Operation>(), 150.6, 1000.0);

        Assertions.assertThat(specification.isSatisfiedBy(account, 1500.2)).isFalse();
    }
}
