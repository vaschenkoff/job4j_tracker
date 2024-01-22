package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для работы со структурой данных типа HashMap, в котором хранится информация о клиенте и его счете
 */
public class BankService {
    /**
     * Структура данных, в которой храним информацию и клиенте и его счете
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод, добавляющий объект типа User в список, если такого пользователя еще нет
     * @param user входящий параметр объект типа User
     */
    public void addUser(User user) {
        List<Account> list = new ArrayList<Account>();
        users.putIfAbsent(user, list);
    }

    /**
     * Метод, позволяющий удалить пользователя из HashMap по номеру паспорта
     * @param passport входящий параметр для удаления пользователя
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод для добавления счета пользователю
     * @param passport входящий параметр используется для поиска пользователя, которому необходимо добавить счет
     * @param account Входящий параметр счета, который мы хотим добавить пользователю
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> acc = users.get(user);
            if (!acc.contains(account)) {
                acc.add(account);
            }
        }
    }

    /**
     * Метод для поиска пользователя по паспорту
     * @param passport вводим номер паспорта, для которого хотим найти пользователя
     * @return возвращает пользователя с введенным номером паспорта
     */
    public User findByPassport(String passport) {
        for (User passports : users.keySet()) {
            if (passport.equals(passports.getPassport())) {
                return passports;
            }
        }
        return null;
    }

    /**
     * Метод для поиска счета по номеру реквизитов и номеру паспорта пользователя
     * @param passport Вводим номер паспорта и по нему находим пользователя
     * @param requisite Вводим номер реквизитов счета и по нему находим счет
     * @return возвращает номер счета
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account acc : users.get(user)) {
                if (requisite.equals(acc.getRequisite())) {
                    return acc;
                }
            }
        }
        return null;
    }

    /**
     * Метод для перевода средств
     * @param srcPassport Вводим паспорт для пользователя, который хочет отправить деньги
     * @param srcRequisite Вводим номер счета пользователя, который хочет отправить деньги
     * @param destPassport Вводим паспорт пользователя, для которого предназначен перевод
     * @param destRequisite Вводим номер счета, куда перевод планируется
     * @param amount Вводим сумму перевода
     * @return Возвращаем true, если перевод прошел успешно, в противном случае возвращаем false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account account1 = findByRequisite(srcPassport, srcRequisite);
        Account account2 = findByRequisite(destPassport, destRequisite);
        if (account1 != null && account2 != null && account1.getBalance() >= amount) {
            account1.setBalance(account1.getBalance() - amount);
            account2.setBalance(account2.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Геттер для вывода счета пользователя
     * @param user Вводим объект типа User
     * @return Возвращаем информацию о пользователе
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
