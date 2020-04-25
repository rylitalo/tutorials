package com.byteperceptions.tutorials.designpatterns.strategy.loanrate.calculator;

import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanRate;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanTerm;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanType;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.PropertyType;

public interface LoanRateCalculator {
    public LoanRate calculateLoanRate();
    public LoanTerm getLoanTerm();
    public LoanType getLoanType();
    public PropertyType getPropertyType();

}
