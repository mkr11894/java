package com.mayank.examproj.controller;

import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.examproj.dto.ClientDto;
import com.mayank.examproj.exception.NoResourceException;
import com.mayank.examproj.service.ClientService;

@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    @Produces("application/json")
    public ResponseEntity<List> getAllCelula() {
        return new ResponseEntity<List>(clientService.getAllClients(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity save(@RequestBody ClientDto clientDto) {
        return new ResponseEntity(clientService.createClient(clientDto), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Produces("application/json")
    public ResponseEntity update(@PathVariable(value = "id") Long personId, @RequestBody ClientDto clientDto) {
        try {
            return new ResponseEntity(clientService.updateClient(personId, clientDto), HttpStatus.OK);
        } catch (NoResourceException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity deleteOrder(@PathVariable(value = "orderId") Long orderId) {
        try {
            clientService.deleteCliente(orderId);
            return new ResponseEntity("Se elimino la entidad",HttpStatus.OK);
        } catch (NoResourceException e) {
            return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
