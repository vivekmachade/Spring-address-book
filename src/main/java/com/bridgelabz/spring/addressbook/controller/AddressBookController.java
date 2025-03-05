package com.bridgelabz.spring.addressbook.controller;

import com.bridgelabz.spring.addressbook.model.AddressBookEntry;
import com.bridgelabz.spring.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    private AddressBookService service;

    @GetMapping
    public ResponseEntity<List<AddressBookEntry>> getAllEntries() {
        return ResponseEntity.ok(service.getAllEntries());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<AddressBookEntry>> getEntryById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getEntryById(id));
    }

    @PostMapping
    public ResponseEntity<AddressBookEntry> addEntry(@RequestBody AddressBookEntry entry) {
        return ResponseEntity.ok(service.addEntry(entry));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressBookEntry> updateEntry(@PathVariable Long id, @RequestBody AddressBookEntry updatedEntry) {
        return ResponseEntity.ok(service.updateEntry(id, updatedEntry));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEntry(@PathVariable Long id) {
        service.deleteEntry(id);
        return ResponseEntity.ok("Entry deleted successfully");
    }
}
