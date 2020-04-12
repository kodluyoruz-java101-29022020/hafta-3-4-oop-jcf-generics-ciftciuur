package org.kodluyoruz.quesitonOne.insurance;

import org.kodluyoruz.quesitonOne.account.Insurance;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TravelInsurance extends Insurance {
    public TravelInsurance(String insuranceName, double insurancePrice, Date insuranceStartDate, Date insuranceFinishDate) {
        super(insuranceName, insurancePrice, insuranceStartDate, insuranceFinishDate);
    }

    @Override
    protected double calculateInsurance() {
        long diff = super.insuranceStartDate.getTime() - super.insuranceFinishDate.getTime();
        long diffCalculate = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        double calculatePrice = (super.insurancePrice * diffCalculate) * 0.10;
        return super.insurancePrice + calculatePrice;
    }
}
