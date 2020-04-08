package org.kodluyoruz.quesitonOne.manager;

import org.kodluyoruz.quesitonOne.impl.IAddress;
import org.kodluyoruz.quesitonOne.user.User;

import java.util.ArrayList;

public class AddressManager {

    public static void addUserAddress(User user, IAddress address) {
        if (user != null) {
            if (user.getUserAddress().size() == 0) {
                ArrayList<IAddress> addressArrayList = new ArrayList<>();
                addressArrayList.add(address);
                user.setUserAddress(addressArrayList);
            } else {
                user.getUserAddress().add(address);
            }
        }
    }

    public static void deleteUserAddress(User user, IAddress addressType) {
        if (user != null) {
            if (user.getUserAddress().size() > 0) {
                user.getUserAddress().remove(addressType);
            }
        }
    }
}
