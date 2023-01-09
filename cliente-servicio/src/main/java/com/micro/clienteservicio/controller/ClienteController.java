package com.micro.clienteservicio.controller;

import com.micro.clienteservicio.domain.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ClienteController {
    private static Map<Integer,Cliente> clientes =  new HashMap<>();

    @PostMapping("/cliente")
    public String addCliente(@RequestBody Cliente cliente)
    {
        clientes.put(cliente.getId(),cliente);
        return "";
    }

    @GetMapping("/cliente")
    public List<Cliente> getClientes()
    {
        return new ArrayList<Cliente>(clientes.values());
    }
}
