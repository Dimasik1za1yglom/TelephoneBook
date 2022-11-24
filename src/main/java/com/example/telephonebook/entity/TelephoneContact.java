package com.example.telephonebook.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "telephone_contact")
public class TelephoneContact {

    public static final Comparator<TelephoneContact> BY_LAST_NAME = new ByLastName();
    public static final Comparator<TelephoneContact> BY_FIRST_NAME = new ByLastName();
    public static final Comparator<TelephoneContact> BY_PATRONYMIC = new ByLastName();
    public static final Comparator<TelephoneContact> BY_DATA_BIRTHDAY = new ByLastName();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lastName;

    private String firstName;

    private String patronymic;

    private Date birthday;

    @OneToMany(mappedBy="contact", fetch=FetchType.EAGER)
    private List<Telephone> telephones;

    private static class ByLastName implements Comparator<TelephoneContact> {

        @Override
        public int compare(TelephoneContact o1, TelephoneContact o2) {
            return o1.lastName.compareToIgnoreCase(o2.lastName);
        }
    }

    private static class ByFirstName implements Comparator<TelephoneContact> {

        @Override
        public int compare(TelephoneContact o1, TelephoneContact o2) {
            return o1.firstName.compareToIgnoreCase(o2.firstName);
        }
    }

    private static class ByPatronymic implements Comparator<TelephoneContact> {

        @Override
        public int compare(TelephoneContact o1, TelephoneContact o2) {
            return o1.patronymic.compareToIgnoreCase(o2.patronymic);
        }
    }

    private static class ByDataBirthday implements Comparator<TelephoneContact> {

        @Override
        public int compare(TelephoneContact o1, TelephoneContact o2) {
            return o1.birthday.compareTo(o2.birthday);
        }
    }
}
