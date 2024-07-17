package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Contact_table;

public interface ContactRepository extends JpaRepository<Contact_table, Long> {

}
