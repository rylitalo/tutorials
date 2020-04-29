package com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model;

public class LoanRate {

    public double interestRate;

    public LoanRate(){ }

    public LoanRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
