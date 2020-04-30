package com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.service;

import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.calculatorStrategy.FirstTimeHomeBuyerLoanProcessor;
import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.calculatorStrategy.JumboMortgageLoanProcessor;
import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.calculatorStrategy.LoanApplicationProcessor;
import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanApplicationService {

    @Autowired
    FirstTimeHomeBuyerLoanProcessor firstTimeHomeBuyerLoanProcessor;

    @Autowired
    JumboMortgageLoanProcessor jumboMortgageLoanProcessor;

    public LoanStatus apply(LoanContext loanContext){
        LoanApplicationProcessor loanApplicationType = getLoanApplicationProcessor(loanContext);
        return loanApplicationType.processLoanApplication(loanContext);
    }

    private LoanApplicationProcessor getLoanApplicationProcessor(LoanContext loanContext) {
        if(LoanType.FIRST_TIME_HOMEBUYER.equals(loanContext.getLoanType())){
            return firstTimeHomeBuyerLoanProcessor;
        }else  if(LoanType.JUMBO_MORTGAGE.equals(loanContext.getLoanType())){
            return jumboMortgageLoanProcessor;
        }
        throw new RuntimeException("Unknown Loan Type");
    }
}
