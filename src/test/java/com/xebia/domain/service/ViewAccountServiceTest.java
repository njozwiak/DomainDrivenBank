package com.xebia.domain.service;

import static org.fest.assertions.Assertions.assertThat;
import com.xebia.domain.ValueObject.Operation;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ViewAccountServiceTest {

    @Test
    public void should_GetOperationsBetweenPeriod_May() {
        ViewAccount viewAccount = new ViewAccount();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2012, 05, 01);
        Date dateBegin = calendar.getTime();

        calendar.set(2012, 05, 31);
        Date dateEnd = calendar.getTime();

        List<Operation> operationsBetweenPeriod = viewAccount.getOperationsBetweenPeriod(1, dateBegin, dateEnd);

        assertThat(operationsBetweenPeriod).hasSize(1);
    }
}
