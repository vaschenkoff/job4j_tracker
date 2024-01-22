package ru.job4j.bank;

import java.util.Objects;

/**
 * Данный класс описывает пользователя
 * И операции с объектами данного класса
 */
public class User {
    /**
     * В данном поле мы описываем номер паспорта
     */
    private String passport;
    /**
     * В данном поле описываем имя пользователя
     */
    private String username;

    /**
     * Конструктор для инициализации полей при создании объекта
     * @param passport иницилизирует номер паспорта
     * @param username иницилизирует имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер для получения информации о паспорте
     * @return возвращает номер паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер для присваивания номера паспорта
     * @param passport указываем номер паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Геттер для получения информации об имени пользователя
     * @return возвращает имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер для присваивания имени пользователя
     * @param username указываем имя пользователя
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода equals для сравнения объектов класса User по номеру паспорта
     * @param o указываем класс для сравнения
     * @return возвращает результат сравнения
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
