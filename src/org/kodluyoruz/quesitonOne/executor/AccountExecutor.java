package org.kodluyoruz.quesitonOne.executor;

import org.kodluyoruz.quesitonOne.account.Account;
import org.kodluyoruz.quesitonOne.account.Insurance;
import org.kodluyoruz.quesitonOne.address.BusinessAddress;
import org.kodluyoruz.quesitonOne.address.HomeAddress;
import org.kodluyoruz.quesitonOne.impl.IAddress;
import org.kodluyoruz.quesitonOne.insurance.CarInsurance;
import org.kodluyoruz.quesitonOne.insurance.TravelInsurance;
import org.kodluyoruz.quesitonOne.user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class AccountExecutor {

    public TreeSet<Account> fillAccountTreeSet() {
        /*
        TODO burada bir kaç ornek account tanımlanıcak login fonksiyonuda bu dolu liste içindeki user bilgisine bakarak oturum açtırıcak
         */

        TreeSet<Account> resultAccountSet = new TreeSet<Account>();


        User tempUser = new User("testUser", "testSurname", "test@gmail.com", "123456", "engineer", 22, createSimpleAddress(), new Date());

        return null;
    }

    private List<IAddress> createSimpleAddress() {
        List<IAddress> addressList = new ArrayList<>();
        addressList.add(new HomeAddress("İstanbul", "Maltepe", "Esenkent", "Ev adresi", "34275"));
        addressList.add(new BusinessAddress("İstanbul", "Kartal", "Soğanlık", "İş adresi", "34000"));
        return addressList;
    }


    private List<Insurance> createSimpleInsurance() {
        List<Insurance> insuranceList = new ArrayList<>();
        insuranceList.add(new CarInsurance());
        insuranceList.add(new TravelInsurance());

        return insuranceList;
    }
}
