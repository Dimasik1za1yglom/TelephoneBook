package com.example.telephonebook.service;

import com.example.telephonebook.entity.TelephoneContact;

import java.util.List;

public interface SortService {

    /**
     * sorting contacts by last name
     *
     * @param telephoneContacts list of contacts
     * @return contact list sorted by last name
     */
    List<TelephoneContact> sortContactsByLastName(List<TelephoneContact> telephoneContacts);

    /**
     * sorting contacts by first name
     *
     * @param telephoneContacts list of contacts
     * @return contact list sorted by first name
     */
    List<TelephoneContact> sortContactsByFirstName(List<TelephoneContact> telephoneContacts);

    /**
     * sorting contacts by patronymic
     *
     * @param telephoneContacts list of contacts
     * @return contact list sorted by patronymic
     */
    List<TelephoneContact> sortContactsByPatronymic(List<TelephoneContact> telephoneContacts);

    /**
     * sorting contacts by Date Birthday
     *
     * @param telephoneContacts list of contacts
     * @return contact list sorted by Date Birthday
     */
    List<TelephoneContact> sortContactsByDateBirthday(List<TelephoneContact> telephoneContacts);
}
