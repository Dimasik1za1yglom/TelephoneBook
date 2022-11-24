package com.example.telephonebook.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class TelephoneContactForm {

    @NotBlank()
    @Size(min = 8, max = 100, message = "Неверно введено поле Фамилия.")
    private String lastName;

    @NotBlank()
    @Size(min = 8, max = 100, message = "Неверно введено поле Имя.")
    private String firstName;

    @NotBlank()
    @Size(min = 8, max = 100, message = "Неверно введено поле Отчество.")
    private String patronymic;

    @NotNull
    private Date birthday;
}
