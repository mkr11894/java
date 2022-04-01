package com.mayank.examproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayank.examproj.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
