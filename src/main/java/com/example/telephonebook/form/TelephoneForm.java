package com.example.telephonebook.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class TelephoneForm {

    @NotBlank()
    @Size(min = 9, max = 20, message = "Неверно введено поле номера телефона.")
    private String number;
}
