package com.example.telephonebook.service.impl;

import com.example.telephonebook.entity.TelephoneContact;
import com.example.telephonebook.service.FilterService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ContactFilter implements FilterService {
    @Override
    public List<TelephoneContact> filterContactsByLastName(List<TelephoneContact> telephoneContacts, String lastName) {
        return null;
    }

    @Override
    public List<TelephoneContact> filterContactsByFirstName(List<TelephoneContact> telephoneContacts, String firstName) {
        return null;
    }

    @Override
    public List<TelephoneContact> filterContactsByPatronymic(List<TelephoneContact> telephoneContacts, String patronymic) {
        return null;
    }

    @Override
    public List<TelephoneContact> filterContactsByDateBirthday(List<TelephoneContact> telephoneContacts, Date birthday) {
        return null;
    }
}
