package com.xebia.rest.resource;

import com.sun.jersey.api.JResponse;
import com.xebia.domain.service.ClientService;
import com.xebia.rest.entity.ClientEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/clients")
@Produces({MediaType.APPLICATION_JSON})
public class ClientsResource {

    @GET
    public JResponse<List<ClientEntity>> getClients() {
        ClientService clientService = new ClientService();
        List<ClientEntity> clientEntity = clientService.getClients();

        return JResponse.ok(clientEntity).build();
    }

}
