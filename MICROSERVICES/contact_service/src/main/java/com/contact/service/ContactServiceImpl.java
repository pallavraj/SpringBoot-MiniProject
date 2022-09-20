package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake contact list

    List<Contact> list = List.of(

            new Contact(1L,"pallav@pallav.com","Pallav",123L),
            new Contact(2L,"raj@pallav.com","raj",12444L),
            new Contact(3L,"vicky@pallav.com","vicky",9000L)

    );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
