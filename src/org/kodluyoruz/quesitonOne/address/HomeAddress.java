package org.kodluyoruz.quesitonOne.address;

public class HomeAddress implements Address {
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
    public String toString() {
        return "HomeAddress{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    @Override
    public void showAddressDetail() {
        toString();
    }
}
