package com.example.telephonebook.service;

import com.example.telephonebook.entity.TelephoneContact;

import java.util.Date;
import java.util.List;

public interface FilterService {

    /**
     * filtering the contact list by last name
     *
     * @param telephoneContacts list of contacts
     * @param lastName          last name by which contacts will be searched
     * @return filtered list by last name
     */
    List<TelephoneContact> filterContactsByLastName(List<TelephoneContact> telephoneContacts, String lastName);

    /**
     * filtering the contact list by last name
     *
     * @param telephoneContacts list of contacts
     * @param firstName         first name by which contacts will be searched
     * @return filtered list by first name
     */
    List<TelephoneContact> filterContactsByFirstName(List<TelephoneContact> telephoneContacts, String firstName);

    /**
     * filtering the contact list by patronymic
     *
     * @param telephoneContacts list of contacts
     * @param patronymic        patronymic by which contacts will be searched
     * @return filtered list by patronymic
     */
    List<TelephoneContact> filterContactsByPatronymic(List<TelephoneContact> telephoneContacts, String patronymic);

    /**
     * filtering the contact list by Date birthday
     *
     * @param telephoneContacts list of contacts
     * @param birthday          Date birthday by which contacts will be searched
     * @return filtered list by Date birthday
     */
    List<TelephoneContact> filterContactsByDateBirthday(List<TelephoneContact> telephoneContacts, Date birthday);
}
