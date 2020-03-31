package org.kodluyoruz.quesitonOne.manager;

import org.kodluyoruz.quesitonOne.Interface.IAddress;
import org.kodluyoruz.quesitonOne.account.Account;
import org.kodluyoruz.quesitonOne.address.HomeAddress;
import org.kodluyoruz.quesitonOne.exceptions.InvalidAuthenticationException;
import org.kodluyoruz.quesitonOne.user.User;

import java.time.LocalDate;
import java.util.Date;
import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accountTreeSet = new TreeSet<>();


    public Account loginControl(String email, String password) {
        for (Account account : accountTreeSet) {
            if (account != null) {
                try {
                    account.loginUser(email, password);
                } catch (InvalidAuthenticationException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
        return null;
    }

    public TreeSet<Account> getAccountTreeSet() {
        return accountTreeSet;
    }

    public void setAccountTreeSet(TreeSet<Account> accountTreeSet) {
        this.accountTreeSet = accountTreeSet;
    }


    public User createSimpleUser() {
        return new User("Ahmet", "Coskun", "ahmet@gmail.com", "123456", "Bilgisayar müh.", 40, new HomeAddress("istanbul", "maltepe", "kozyatagı", "d:5 b blok", "34200"), new Date());
    }
}
