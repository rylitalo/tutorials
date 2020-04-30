package com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.calculatorStrategy;

import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.LoanContext;
import org.springframework.stereotype.Component;

@Component
public class JumboMortgageLoanProcessor extends LoanApplicationProcessor {
    @Override
    public boolean determineLoanEligibility(LoanContext loanContext) {
        //80% Loan to Value Ratio required...
        if(loanContext.getLoanAmount() < 650000) {
            return false;
        }else if(loanContext.getCreditScore() < 750){
            return false;
        }

        return true;
    }
}
