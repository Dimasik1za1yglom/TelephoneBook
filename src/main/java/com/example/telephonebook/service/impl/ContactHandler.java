package com.example.telephonebook.service.impl;

import com.example.telephonebook.dao.TelephoneContactRepository;
import com.example.telephonebook.dao.TelephoneRepository;
import com.example.telephonebook.entity.Telephone;
import com.example.telephonebook.entity.TelephoneContact;
import com.example.telephonebook.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ContactHandler implements ContactService {

    private final TelephoneContactRepository telephoneContactRepository;
    private final TelephoneRepository telephoneRepository;

    @Override
    public boolean createContact(String lastName, String firstName, String patronymic, Date birthday, String telephone) {
        var contact = TelephoneContact.builder()
                .lastName(lastName)
                .firstName(firstName)
                .patronymic(patronymic)
                .birthday(birthday)
                .build();
        try {
            telephoneContactRepository.save(contact);
        } catch (Exception e) {
            return false;
        }
        var numberTelephone = Telephone.builder()
                .number(telephone)
                .contact(contact)
                .build();
        try {
            telephoneRepository.save(numberTelephone);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean changeLastNameContact(Long idContact, String lastName) {
        try {
            telephoneContactRepository.setLastNameById(lastName, idContact);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean changeFirstNameContact(Long idContact, String firstName) {
        try {
            telephoneContactRepository.setFirstNameById(firstName, idContact);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean changePatronymicContact(Long idContact, String patronymic) {
        try {
            telephoneContactRepository.setPatronymicById(patronymic, idContact);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean changeDataBirthdayContact(Long idContact, Date birthday) {
        try {
            telephoneContactRepository.setDateBirthdayById(birthday, idContact);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean changeTelephoneContact(Long idContact, String oldTelephone, String newTelephone) {
        try {
            var idNumberTelephone = telephoneContactRepository.findById(idContact)
                    .orElseThrow()
                    .getTelephones().stream()
                    .filter(x -> x.getNumber().equals(oldTelephone))
                    .findFirst()
                    .orElseThrow()
                    .getId();
            telephoneRepository.setNumberById(newTelephone, idNumberTelephone);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean addTelephoneContact(Long idContact, String newTelephone) {
        try {
            telephoneRepository.save(
                    Telephone.builder()
                            .contact(
                                    telephoneContactRepository.findById(idContact)
                                            .orElseThrow())
                            .number(newTelephone)
                            .build()
            );
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteTelephoneContact(Long idContact, String telephone) {
        return false;
    }

    @Override
    public boolean deleteContact(Long idContact) {
        return false;
    }

    @Override
    public TelephoneContact getContact(Long idContact) {
        return null;
    }

    @Override
    public TelephoneContact searchContact(List<TelephoneContact> telephoneContacts, TelephoneContact contact) {
        return null;
    }
}
