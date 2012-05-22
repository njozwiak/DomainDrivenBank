package com.xebia.domain.respository;

import com.xebia.domain.entity.Client;
import com.xebia.domain.repository.ClientRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class ClientRepositoryTest {

    ClientRepository clientRepository;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Before
    public void setUp() {
        clientRepository = new ClientRepository();
    }

    @Test
    public void should_GetClientById() {
        Client client = clientRepository.getClientById(1);

        assertThat(client.getIdClient()).isEqualTo(1);
    }
    
    @Test
    public void should_GetClientById_Null() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("id client cannot be null");

    	clientRepository.getClientById(null);
    }

    @Test
    public void should_getClients() {
    	List<Client> clients = clientRepository.getClients();
    	assertThat(clients).isNotEmpty();
    }
}
