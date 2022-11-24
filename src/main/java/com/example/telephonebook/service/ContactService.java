package com.example.telephonebook.service;

import com.example.telephonebook.entity.TelephoneContact;

import java.util.Date;
import java.util.List;

public interface ContactService {

    /**
     * Creating a contact of the Telephone Contacts class.
     * Phone numbers are stored in the Telephone class and linked to the created contact.
     * The created objects are saved to the database.
     *
     * @param lastName   transmitted contact's last name
     * @param firstName  transmitted contact name
     * @param patronymic transmitted patronymic of the contact
     * @param birthday   the transmitted date of birth of the contact in the format of the Date class
     * @param telephone  transmitted contact phone number
     * @return true if the data is successfully saved in the database. False - if failed
     */
    boolean createContact(String lastName, String firstName, String patronymic, Date birthday, String... telephone);

    /**
     * change the contact's last name
     *
     * @param idContact id contact
     * @param lastName  new last name contact
     * @return true - if successfully managed to change last name contact. False - if failed
     */
    boolean changeLastNameContact(Long idContact, String lastName);

    /**
     * change the contact's first name
     *
     * @param idContact id contact
     * @param firstName new first name contact
     * @return true - if successfully managed to change first name contact. False - if failed
     */
    boolean changeFirstNameContact(Long idContact, String firstName);

    /**
     * change the contact's patronymic
     *
     * @param idContact  id contact
     * @param patronymic new patronymic contact
     * @return true - if successfully managed to change patronymic contact. False - if failed
     */
    boolean changePatronymicContact(Long idContact, String patronymic);

    /**
     * change the contact's date birthday
     *
     * @param idContact id contact
     * @param birthday  new date birthday contact
     * @return true - if successfully managed to change date birthday contact. False - if failed
     */
    boolean changeDataBirthdayContact(Long idContact, Date birthday);

    /**
     * change the contact's number telephone
     *
     * @param idContact    id contact
     * @param oldTelephone old phone number
     * @param newTelephone new phone number
     * @return true - if successfully managed to change number telephone contact. False - if failed
     */
    boolean changeTelephoneContact(Long idContact, String oldTelephone, String newTelephone);

    /**
     * add a new phone number to a contact
     *
     * @param idContact    id contact
     * @param newTelephone new phone number
     * @return true - if successfully managed to add a new phone number contact. False - if failed
     */
    boolean addTelephoneContact(Long idContact, String newTelephone);

    /**
     * delete a contact's phone number
     *
     * @param idContact id contact
     * @param telephone the phone number to delete
     * @return true - if successfully managed to delete phone number contact. False - if failed
     */
    boolean deleteTelephoneContact(Long idContact, String telephone);

    /**
     * delete a contact
     *
     * @param idContact id contact
     * @return true - if successfully managed to delete contact. False - if failed
     */
    boolean deleteContact(Long idContact);

    /**
     * Getting a contact and all his phone numbers
     *
     * @param idContact id contact
     * @return class object TelephoneContact
     */
    TelephoneContact getContact(Long idContact);

    /**
     * Search for a contact based on the received data
     *
     * @param telephoneContacts list of contacts
     * @param contact           the resulting class TelephoneContact object
     * @return an object of the class TelephoneContact if there is one
     */
    TelephoneContact searchContact(List<TelephoneContact> telephoneContacts, TelephoneContact contact);
}
