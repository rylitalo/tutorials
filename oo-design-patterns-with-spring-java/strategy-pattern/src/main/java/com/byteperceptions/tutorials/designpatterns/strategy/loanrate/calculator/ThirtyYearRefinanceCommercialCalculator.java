package com.byteperceptions.tutorials.designpatterns.strategy.loanrate.calculator;

import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanRate;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanTerm;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanType;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.PropertyType;
import org.springframework.stereotype.Component;

@Component
public class ThirtyYearRefinanceCommercialCalculator implements LoanRateCalculator{
    public LoanRate calculateLoanRate(){
        //Do some logic that requires hundreds of lines of code
        return new LoanRate(16.75);
    };
    public LoanTerm getLoanTerm(){
        return LoanTerm.THIRTY_YEAR;
    };
    public LoanType getLoanType(){
        return LoanType.REFINANCE;
    };
    public PropertyType getPropertyType(){
        return PropertyType.COMMERCIAL;
    };

}
