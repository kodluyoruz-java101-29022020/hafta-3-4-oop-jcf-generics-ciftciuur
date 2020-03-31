package org.kodluyoruz.quesitonOne;

import org.kodluyoruz.quesitonOne.account.Account;
import org.kodluyoruz.quesitonOne.manager.AccountManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("e-posta girin");
        String email = keyboardScanner.next();
        System.out.println("parola girin");
        String password = keyboardScanner.next();
        Account account = accountManager.loginControl(email, password);
    }
}
