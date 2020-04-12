package org.kodluyoruz.quesitonOne;

import org.kodluyoruz.quesitonOne.account.Account;
import org.kodluyoruz.quesitonOne.manager.AccountManager;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        byte menuRequest;

        System.out.println("Sigorta Uygulamasına hoş geldiniz");
        System.out.println("1 - Oturum Aç");
        System.out.print("İşleminiz :");
        menuRequest = scanner.nextByte();
        switch (menuRequest) {
            case 1:
                login();
                break;
            default:
                System.out.println("Geçersiz istek , menüde bulunan kısayol tuslarından bırını tercih ediniz");
                menu();

        }

    }

    private static void login() {
        //login user
    }
}
