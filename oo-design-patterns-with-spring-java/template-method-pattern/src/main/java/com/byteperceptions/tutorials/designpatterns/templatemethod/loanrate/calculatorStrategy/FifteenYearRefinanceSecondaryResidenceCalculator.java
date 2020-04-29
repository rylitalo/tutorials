package com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.calculatorStrategy;

import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.LoanRate;
import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.LoanTerm;
import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.LoanType;
import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.PropertyType;
import org.springframework.stereotype.Component;

@Component
public class FifteenYearRefinanceSecondaryResidenceCalculator implements LoanRateCalculator{
    public LoanRate calculateLoanRate(){
        //Do some logic that requires hundreds of lines of code
        return new LoanRate(14.25);
    };
    public LoanTerm getLoanTerm(){
        return LoanTerm.FIFTEEN_YEAR;
    };
    public LoanType getLoanType(){
        return LoanType.REFINANCE;
    };
    public PropertyType getPropertyType(){
        return PropertyType.SECONDARY_RESIDENCE;
    };

}