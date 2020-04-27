package org.kodluyoruz.quesitonOne.manager;

import org.kodluyoruz.quesitonOne.account.Account;
import org.kodluyoruz.quesitonOne.address.HomeAddress;
import org.kodluyoruz.quesitonOne.exceptions.InvalidAuthenticationException;
import org.kodluyoruz.quesitonOne.user.User;

import java.util.Date;
import java.util.TreeSet;

public class AccountManager {
    public static int accountStatus = 0;
    private TreeSet<Account> accountTreeSet;

    public AccountManager(TreeSet<Account> accountTreeSet) {
        this.accountTreeSet = accountTreeSet;
    }

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
}
