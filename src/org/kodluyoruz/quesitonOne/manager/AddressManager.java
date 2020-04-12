package org.kodluyoruz.quesitonOne.manager;

import org.kodluyoruz.quesitonOne.address.Address;
import org.kodluyoruz.quesitonOne.user.User;

import java.util.ArrayList;
import java.util.List;

public class AddressManager {

    public static void addUserAddress(User user, Address address) {
        if (user != null) {
            if (user.getUserAddress().size() == 0) {
                List<Address> addressArrayList = new ArrayList<>();
                addressArrayList.add(address);
                user.setUserAddress(addressArrayList);
            } else {
                user.getUserAddress().add(address);
            }
        }
    }

    public static void deleteUserAddress(User user, Address address) {
        if (user != null) {
            if (user.getUserAddress().size() > 0) {
                user.getUserAddress().remove(address);
            }
        }
    }
}
