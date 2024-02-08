package ru.job4j.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenNothingFound() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "123456", "Bryansk")
        );
        var persons = phones.find("Andrey");
        Assertions.assertTrue(persons.isEmpty());
    }
}