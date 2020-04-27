package org.kodluyoruz.quesitonOne;

import org.kodluyoruz.quesitonOne.account.Account;
import org.kodluyoruz.quesitonOne.account.Insurance;
import org.kodluyoruz.quesitonOne.address.Address;
import org.kodluyoruz.quesitonOne.address.BusinessAddress;
import org.kodluyoruz.quesitonOne.address.HomeAddress;
import org.kodluyoruz.quesitonOne.enums.AuthenticationStatus;
import org.kodluyoruz.quesitonOne.insurance.CarInsurance;
import org.kodluyoruz.quesitonOne.manager.AccountManager;
import org.kodluyoruz.quesitonOne.policy.Enterprise;
import org.kodluyoruz.quesitonOne.policy.Individual;
import org.kodluyoruz.quesitonOne.user.User;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Sigorta Uygulamasına hoş geldiniz");
        System.out.println("İşlem menüsü");
        menu();

    }

    private static void menu() {
        byte menuRequest;


        if (AccountManager.accountStatus == 0) {
            System.out.println(" !! Sistemi kullanabilmek için lütfen oturum açın !! ");
            login();
        } else if (AccountManager.accountStatus == 1) {
            System.out.println("2 - Oturum açmış kullanıcı detayını görüntüle");
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
    }

    private static List<Insurance> createInsurances(String type) {
        List<Insurance> insuranceList = new ArrayList<>();
        if (type.equals("kurumsal")) {
            insuranceList.add(new CarInsurance("araç sigortası", 20000, new Date(), new Date()));
            insuranceList.add(new CarInsurance("konut sigortası", 2000000, new Date(), new Date()));
        } else if (type.equals("bireysel")) {
            insuranceList.add(new CarInsurance("gezi sigortası", 1000, new Date(), new Date()));
            insuranceList.add(new CarInsurance("sağlık sigortası", 15000, new Date(), new Date()));
        }
        return insuranceList;
    }

    private static List<Address> createAddress(String type) {
        List<Address> addresses = new ArrayList<>();
        if (type.equals("kurumsal")) {
            addresses.add(new HomeAddress("istanbul", "maltepe", "esenkent mah", "ev adresi", "34200"));

        } else if (type.equals("bireysel")) {
            addresses.add(new BusinessAddress("istanbul", "maltepe", "esenkent mah", "iş adresi", "34200"));
            addresses.add(new HomeAddress("istanbul", "maltepe", "esenkent mah", "ev adresi", "34200"));

        }
        return addresses;
    }

    private static User createUser(String type) {
        User currentUser = new User();
        if (type.equals("kurumsal")) {
            currentUser.setName("kurumsal kullanıcı");
            currentUser.setSurName("kurumsal kullanıcı soyad");
            currentUser.setUserAddress(createAddress(type));
            currentUser.setAge(41);
            currentUser.setEmail("kurumsal@gmail.com");
            currentUser.setJob("manager");
            currentUser.setPassword("kurumsal");

        } else if (type.equals("bireysel")) {
            currentUser.setName("bireysel kullanıcı");
            currentUser.setSurName("bireysel kullanıcı soyad");
            currentUser.setUserAddress(createAddress(type));
            currentUser.setUserAddress(createAddress(type));
            currentUser.setAge(25);
            currentUser.setEmail("bireysel@gmail.com");
            currentUser.setJob("personal");
            currentUser.setPassword("bireysel");
        }
        return currentUser;
    }

    public static TreeSet<Account> fillAccount() {
        TreeSet<Account> accounts = new TreeSet<>();


        Account enterpriseAccount = new Enterprise();
        enterpriseAccount.setAuthenticationStatus(AuthenticationStatus.FAIL);
        enterpriseAccount.setInsuranceList(createInsurances("kurumsal"));
        enterpriseAccount.setUser(createUser("kurumsal"));

        Account individualAccount = new Individual();
        individualAccount.setAuthenticationStatus(AuthenticationStatus.FAIL);
        individualAccount.setInsuranceList(createInsurances("bireysel"));
        individualAccount.setUser(createUser("bireysel"));

        /*
            TODO baslangıc ıcın 2 adet kullanıcı olusturuldu login olma durumu bu ıkı kullanıcı uzerınden devam edicek
         */
        accounts.add(enterpriseAccount);
        accounts.add(individualAccount);
        return accounts;
    }


    private static void login() {
        AccountManager accountManager = new AccountManager(fillAccount());

        System.out.println("e-posta :");
        String email = scanner.next();
        scanner.nextLine();
        System.out.println("şifre :");
        String password = scanner.nextLine();

        accountManager.loginControl(email, password);

        menu();

    }
}
