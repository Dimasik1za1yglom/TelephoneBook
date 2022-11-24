package com.example.telephonebook.dao;

import com.example.telephonebook.entity.TelephoneContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephoneContactRepository extends JpaRepository<TelephoneContact, Long> {
}
