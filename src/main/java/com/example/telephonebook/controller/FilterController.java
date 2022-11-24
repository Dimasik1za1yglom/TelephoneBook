package com.example.telephonebook.controller;

import com.example.telephonebook.form.TelephoneContactForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

public interface FilterController {

    /**
     * request to filter the contact list by one or more Contact fields
     * @param model to send a confirmation or message
     * @param bindingResult to intercept errors (incorrectly filled fields, null fields)
     * @return addresses for the next request
     */
    String filterContacts(Model model, @Valid TelephoneContactForm form, BindingResult bindingResult);
}
