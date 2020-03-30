package org.kodluyoruz.quesitonOne.Interface;

import org.kodluyoruz.quesitonOne.user.User;

import java.util.List;

public interface IAddress {
    public List<IAddress> createUserAddress(User user);

    public List<IAddress> removeUserAddress(User user);


}
