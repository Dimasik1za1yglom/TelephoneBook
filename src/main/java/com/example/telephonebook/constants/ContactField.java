package com.example.telephonebook.constants;

public enum ContactField {
    LAST_NAME(1L),
    FIRST_NAME(2L),
    PATRONYMIC(3L),
    DATA_BIRTHDAY(4L);

    private final Long value;

    ContactField(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }
}
