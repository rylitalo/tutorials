package com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model;

import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanTerm;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanType;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.PropertyType;

public class LoanRateCriteria {

    LoanTerm loanTerm; //15YEAR, 30YEAR
    LoanType loanType; //PURCHASE, REFINANCE
   PropertyType propertyType; //PRIMARY_RESIDENCE, SECONDARY_RESIDENCE, COMMERCIAL

    public LoanRateCriteria(){}

    public LoanRateCriteria( LoanTerm loanTerm, LoanType loanType, PropertyType propertyType) {
        this.loanTerm = loanTerm;
        this.loanType = loanType;
        this.propertyType = propertyType;
    }

    public LoanTerm getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(LoanTerm loanTerm) {
        this.loanTerm = loanTerm;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public String toString(){
        return "\n\n{LoanType : " + loanType + ", LoanTerm : " + loanTerm + ", PropertyType : " + propertyType + "}\n\n";
    }
}
