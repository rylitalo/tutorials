package com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.calculatorStrategy;

import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.*;

public abstract class LoanApplicationProcessor {

    protected abstract boolean determineLoanEligibility(LoanContext loanContext);

    public LoanStatus processLoanApplication(LoanContext loanContext) {
        collectIncomeInformation(loanContext);
        collectPropertyInformation(loanContext);
        collectCreditInformation(loanContext);
        boolean isEligible = determineLoanEligibility(loanContext);
        if (isEligible) {
            submitApplication(loanContext);
            return LoanStatus.APPROVED;
        }else{
            return LoanStatus.DENIED;
        }
    }

    private void collectIncomeInformation(LoanContext loanContext) {
        //Collect income information from loan applicant/borrower
    }

    private void collectPropertyInformation(LoanContext loanContext) {
        //Collection information about the subject property for the loan
    }

    private void collectCreditInformation(LoanContext loanContext) {
        //Collect the credit information about the borrower
    }

    private void submitApplication(LoanContext loanContext) {
        //Send application wherever it needs to go for processing
    }
}
