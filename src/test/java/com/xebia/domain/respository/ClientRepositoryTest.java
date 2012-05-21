package com.xebia.domain.respository;

import com.xebia.domain.entity.Client;
import com.xebia.domain.repository.ClientRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class ClientRepositoryTest {

    ClientRepository clientRepository;

    @Before
    public void setUp() {
        clientRepository = new ClientRepository();
    }

    @Test
    public void test_GetClientById() {
        Client client = clientRepository.getClientById(1);

        assertThat(client.getIdClient()).isEqualTo(1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void test_GetClientById_Null() {
    	clientRepository.getClientById(null);
    }

    @Test
    public void test_getClients() {
    	List<Client> clients = clientRepository.getClients();
    	
    	assertThat(clients).isNotEmpty();
    }
}
