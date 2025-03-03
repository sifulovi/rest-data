package com.sio.restdata;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.util.List;

@Path("/todos")
public class HelloResource {

    @Inject private TodoRepository todoRepository;

    @GET
    @Produces("text/plain")
    public List<Todo> hello() {
        return todoRepository.findAll().toList();
    }
}