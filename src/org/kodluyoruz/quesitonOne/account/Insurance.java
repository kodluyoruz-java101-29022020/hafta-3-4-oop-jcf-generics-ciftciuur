package org.kodluyoruz.quesitonOne.account;

import org.kodluyoruz.quesitonOne.enums.AuthenticationStatus;

import java.util.Date;

public abstract class Insurance {
    protected String insuranceName;
    protected double insurancePrice;
    protected Date insuranceStartDate;
    protected Date insuranceFinishDate;

    public Insurance() {
    }

    public Insurance(String insuranceName, double insurancePrice, Date insuranceStartDate, Date insuranceFinishDate) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceStartDate = insuranceStartDate;
        this.insuranceFinishDate = insuranceFinishDate;
    }

    protected abstract double calculateInsurance();

}
