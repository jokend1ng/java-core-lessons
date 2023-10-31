package com.company.project.lesson12;

import java.time.LocalDateTime;

public record Record(long id, String text, LocalDateTime createdAt) {
    public Record {
        if (id < 0 || text.trim().length() < 5 || createdAt == null)
            throw new IllegalArgumentException("переданыв невалидные свойства");
    }

    public Record(long id, String text) {
        this(id,text,LocalDateTime.now());

    }

    public Record(String text) {
        this(0, text);
    }

}
