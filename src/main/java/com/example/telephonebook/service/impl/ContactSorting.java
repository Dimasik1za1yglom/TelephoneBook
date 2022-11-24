package com.example.telephonebook.service.impl;

import com.example.telephonebook.entity.TelephoneContact;
import com.example.telephonebook.service.SortService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactSorting implements SortService {
    @Override
    public List<TelephoneContact> sortContactsByLastName(List<TelephoneContact> telephoneContacts) {
        return null;
    }

    @Override
    public List<TelephoneContact> sortContactsByFirstName(List<TelephoneContact> telephoneContacts) {
        return null;
    }

    @Override
    public List<TelephoneContact> sortContactsByPatronymic(List<TelephoneContact> telephoneContacts) {
        return null;
    }

    @Override
    public List<TelephoneContact> sortContactsByDateBirthday(List<TelephoneContact> telephoneContacts) {
        return null;
    }
}
