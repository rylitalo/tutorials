package com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.calculatorStrategy;

import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.LoanContext;
import org.springframework.stereotype.Component;

@Component
public class FirstTimeHomeBuyerLoanProcessor extends LoanApplicationProcessor {
    @Override
    public boolean determineLoanEligibility(LoanContext loanContext) {
        //80% Loan to Value Ratio required...
        if(loanContext.getLoanAmount() > (loanContext.getPropertyValue() * .8)) {
            return false;
        }
        return true;
    }
}
