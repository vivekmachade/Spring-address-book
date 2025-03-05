package com.bridgelabz.spring.addressbook.model;

import com.bridgelabz.spring.addressbook.dto.AddressBookDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "address_book")
public class AddressBookEntry {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  private String phoneNumber;


  // Constructor to create an entity from DTO
  public AddressBookEntry(AddressBookDto dto) {
    this.name = dto.getName();
    this.phoneNumber = dto.getPhoneNumber();
  }

  // Update method to modify entity from DTO
  public void updateFromDTO(AddressBookDto dto) {
    this.name = dto.getName();
    this.phoneNumber = dto.getPhoneNumber();
  }

}
