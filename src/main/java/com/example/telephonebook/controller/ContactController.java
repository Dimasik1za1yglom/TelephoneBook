package com.example.telephonebook.controller;

import com.example.telephonebook.form.TelephoneContactForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

public interface ContactController {

    /**
     * Receiving a request for sent data in the format of a Class A object to add an object to the database.
     *
     * @param redirectAttributes to send flash attributes
     * @param form               The received data for saving the contact
     * @param bindingResult      to intercept errors (incorrectly filled fields, null fields)
     * @return addresses for the next request
     */
    String addContact(RedirectAttributes redirectAttributes,
                      @Valid TelephoneContactForm form,
                      BindingResult bindingResult);

    /**
     * request deleting a contact and all its numbers
     *
     * @param model     to send a confirmation or message
     * @param idContact contact id in the database to delete
     * @return addresses for the next request
     */
    String deleteContact(Model model, @PathVariable Long idContact);

    /**
     * Request for full contact details.
     * The form contains the data of the contact to be returned or, if not, send an error message.
     *
     * @param redirectAttributes to send flash attributes
     * @param form               The received data for search the contact
     * @param bindingResult      to intercept errors (incorrectly filled fields, null fields)
     * @return addresses for the next request
     */
    String getContact(RedirectAttributes redirectAttributes,
                      @Valid TelephoneContactForm form,
                      BindingResult bindingResult);

    /**
     * Request to change user data. The new data received will replace the previous ones in the database
     *
     * @param redirectAttributes to send flash attributes
     * @param form               that contains new user data
     * @param bindingResult      to intercept errors (incorrectly filled fields, null fields)
     * @return addresses for the next request
     */
    String changeDataContact(RedirectAttributes redirectAttributes,
                             @Valid TelephoneContactForm form,
                             BindingResult bindingResult);
}
