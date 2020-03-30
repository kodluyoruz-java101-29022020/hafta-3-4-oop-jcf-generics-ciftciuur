package org.kodluyoruz.quesitonOne.address;

import org.kodluyoruz.quesitonOne.Interface.IAddress;
import org.kodluyoruz.quesitonOne.user.User;

import java.util.List;

public class HomeAddress implements IAddress {
    //şehir
    private String city;
    //ilçe
    private String district;
    //mahalle
    private String neighborhood;
    //daire - kapı no vs
    private String addressDetail;
    //posta kodu
    private String postCode;

    public HomeAddress(String city, String district, String neighborhood, String addressDetail, String postCode) {
        this.city = city;
        this.district = district;
        this.neighborhood = neighborhood;
        this.addressDetail = addressDetail;
        this.postCode = postCode;
    }

    public HomeAddress() {
    }


    @Override
    public List<IAddress> createUserAddress(User user) {
        return null;
    }

    @Override
    public List<IAddress> removeUserAddress(User user) {
        return null;
    }
}
