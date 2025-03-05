package com.bridgelabz.spring.addressbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDto {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;

}
