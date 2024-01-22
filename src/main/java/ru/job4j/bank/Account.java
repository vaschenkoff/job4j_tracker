package ru.job4j.bank;

import java.util.Objects;

/**
 * Данный класс описывает банковский счет
 * И операции с объектами данного класса
 */
public class Account {
    /**
     * В данном поле мы описывает реквизиты счета
     */
    private String requisite;
    /**
     * В данном поле мы указываем баланс счета
     */
    private double balance;

    /**
     * Конструктор, который при создании объекта присваивает ему значения реквизита и баланса
     * @param requisite
     * @param balance
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Геттер для получения информации о реквизитах
     * @return возвращает реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер для присваивания реквизитов счету
     * @param requisite указываем реквизиты
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттер для получения информации о балансе ссчета
     * @return возвращает баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер для присваивания баланса счету
     * @param balance указываем баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределенный метод equals для сравнения реквизитов счета
     * @param o на вход получает объект для сравнения
     * @return возвращает результат сравнения типа boolean(true или false)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Переопределенный метод hashCode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
