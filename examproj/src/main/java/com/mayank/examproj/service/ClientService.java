package com.mayank.examproj.service;

import java.util.List;

import com.mayank.examproj.dto.ClientDto;
import com.mayank.examproj.exception.NoResourceException;

public interface ClientService {
    public List<ClientDto> getAllClients();
    public ClientDto createClient(ClientDto clientDto);
    public ClientDto updateClient(Long id, ClientDto clientDto) throws NoResourceException;
    public void deleteCliente(Long id) throws NoResourceException;

}
