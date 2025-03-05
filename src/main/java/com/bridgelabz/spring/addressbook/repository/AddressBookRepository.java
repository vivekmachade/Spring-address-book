package com.bridgelabz.spring.addressbook.repository;


import com.bridgelabz.spring.addressbook.model.AddressBookEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookEntry, Long> {

}
