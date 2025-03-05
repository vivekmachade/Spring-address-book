package com.bridgelabz.spring.addressbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookEntry {
  private String name;
  private String phoneNumber;
}
