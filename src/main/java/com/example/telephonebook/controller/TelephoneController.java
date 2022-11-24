package com.example.telephonebook.controller;

import com.example.telephonebook.form.TelephoneContactForm;
import com.example.telephonebook.form.TelephoneForm;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

public interface TelephoneController {

    /**
     * request to change a specific contact number to another one
     *
     * @param redirectAttributes to send flash attributes
     * @param contact            The received data for search the contact
     * @param telephone          that contains new number telephone data
     * @param bindingResult      to intercept errors (incorrectly filled fields, null fields)
     * @return addresses for the next request
     */
    String changeTelephoneContact(RedirectAttributes redirectAttributes,
                                  @Valid TelephoneContactForm contact,
                                  @Valid TelephoneForm telephone,
                                  BindingResult bindingResult);


    /**
     * request to add a new phone number to a specific contact
     *
     * @param redirectAttributes to send flash attributes
     * @param contact            The received data for search the contact
     * @param telephone          that contains new number telephone data
     * @param bindingResult      to intercept errors (incorrectly filled fields, null fields)
     * @return addresses for the next request
     */
    String addTelephone(RedirectAttributes redirectAttributes,
                        @Valid TelephoneContactForm contact,
                        @Valid TelephoneForm telephone,
                        BindingResult bindingResult);

    /**
     * request to delete a phone number from a specific contact
     *
     * @param redirectAttributes to send flash attributes
     * @param contact            The received data for search the contact
     * @param telephone          that contains new number telephone data
     * @param bindingResult      to intercept errors (incorrectly filled fields, null fields)
     * @return addresses for the next request
     */
    String deleteTelephone(RedirectAttributes redirectAttributes,
                           @Valid TelephoneContactForm contact,
                           @Valid TelephoneForm telephone,
                           BindingResult bindingResult);
}
