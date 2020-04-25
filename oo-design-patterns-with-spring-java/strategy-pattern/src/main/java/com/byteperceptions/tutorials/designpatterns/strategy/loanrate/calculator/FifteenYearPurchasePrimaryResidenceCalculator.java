package com.byteperceptions.tutorials.designpatterns.strategy.loanrate.calculator;

import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanRate;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanTerm;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanType;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.PropertyType;
import org.springframework.stereotype.Component;

@Component
public class FifteenYearPurchasePrimaryResidenceCalculator implements LoanRateCalculator{
    public LoanRate calculateLoanRate(){
        //Do some logic that requires hundreds of lines of code
        return new LoanRate(13.25);
    };
    public LoanTerm getLoanTerm(){
        return LoanTerm.FIFTEEN_YEAR;
    };
    public LoanType getLoanType(){
        return LoanType.PURCHASE;
    };
    public PropertyType getPropertyType(){
        return PropertyType.PRIMARY_RESIDENCE;
    };

}