package com.example.telephonebook.dao;

import com.example.telephonebook.entity.TelephoneContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Date;

public interface TelephoneContactRepository extends JpaRepository<TelephoneContact, Long> {

    @Transactional
    @Modifying
    @Query(nativeQuery = true,
            value = "update telephone_contact set last_name = :lastName where id = :contactId")
    void setLastNameById(String lastName, Long contactId);

    @Transactional
    @Modifying
    @Query(nativeQuery = true,
            value = "update telephone_contact set first_name = :firstName where id = :contactId")
    void setFirstNameById(String firstName, Long contactId);

    @Transactional
    @Modifying
    @Query(nativeQuery = true,
            value = "update telephone_contact set patronymic = :patronymic where id = :contactId")
    void setPatronymicById(String patronymic, Long contactId);

    @Transactional
    @Modifying
    @Query(nativeQuery = true,
            value = "update telephone_contact set birthday = :birthday where id = :contactId")
    void setDateBirthdayById(Date birthday, Long contactId);


}
