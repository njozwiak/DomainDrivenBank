package com.xebia.rest.resource;

import com.xebia.domain.service.ClientService;
import com.xebia.rest.entity.ClientEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/client")
@Produces({MediaType.APPLICATION_JSON})
public class ClientResource {

    @GET
    @Path("/{idClient}")
    public Response getClientById(@PathParam("idClient") Integer idClient) {
        ClientService clientService = new ClientService();
        ClientEntity clientEntity = clientService.getClientById(idClient);

        return Response.ok(clientEntity).build();
    }
}
