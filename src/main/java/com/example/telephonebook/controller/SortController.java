package com.example.telephonebook.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

public interface SortController {

    /**
     * запрос на сортировку списка контактов по определенному полю
     *
     * @param model        to send a confirmation or message
     * @param categorySort the field by which the list should be sorted
     * @return addresses for the next request
     */
    String mealsCategory(Model model, @PathVariable Long categorySort);
}
