package com.example.telephonebook.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "telephone_contact")
public class TelephoneContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lastName;

    private String firstName;

    private String patronymic;

    private Date birthday;

    @OneToMany(mappedBy="contact", fetch=FetchType.EAGER)
    private List<Telephone> telephones;
}
