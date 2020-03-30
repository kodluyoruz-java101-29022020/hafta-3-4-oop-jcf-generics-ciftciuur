package org.kodluyoruz.quesitonOne.account;

import org.kodluyoruz.quesitonOne.enums.AuthenticationStatus;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insurancePrice;
    private Date insuranceStartDate;
    private Date insuranceFinishDate;


    protected abstract void calculateInsurance();

}
