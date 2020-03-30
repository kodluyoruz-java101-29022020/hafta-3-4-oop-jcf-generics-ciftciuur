package org.kodluyoruz.quesitonOne.manager;

import org.kodluyoruz.quesitonOne.account.Account;
import org.kodluyoruz.quesitonOne.exceptions.InvalidAuthenticationException;

import java.util.TreeSet;

public class AccountManager {

    private TreeSet<Account> accountTreeSet;


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
