package com.bridgelabz.spring.addressbook.service;

import com.bridgelabz.spring.addressbook.dto.AddressBookDto;
import com.bridgelabz.spring.addressbook.model.AddressBookEntry;
import com.bridgelabz.spring.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AddressBookService {

    @Autowired
    private AddressBookRepository repository;

    public List<AddressBookEntry> getAllEntries() {
        return repository.findAll();
    }

    public Optional<AddressBookEntry> getEntryById(Long id) {
        return repository.findById(id);
    }

    public AddressBookEntry addEntry(AddressBookDto dto) {
        AddressBookEntry entry = new AddressBookEntry(dto);
        return repository.save(entry);
    }

    public Optional<AddressBookEntry> updateEntry(Long id, AddressBookDto dto) {
        return repository.findById(id).map(entry -> {
            entry.setName(dto.getName());
            entry.setPhoneNumber(dto.getPhoneNumber());
            return repository.save(entry);
        });
    }

    public void deleteEntry(Long id) {
        repository.deleteById(id);
    }
}