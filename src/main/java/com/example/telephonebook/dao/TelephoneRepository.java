package com.example.telephonebook.dao;

import com.example.telephonebook.entity.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface TelephoneRepository extends JpaRepository<Telephone, Long> {

    @Transactional
    @Modifying
    @Query(nativeQuery = true,
            value = "update telephone set number = :newNumber where id = :numberId")
    void setNumberById(String newNumber, Long numberId);
}
