package com.byteperceptions.tutorials.designpatterns.strategy.loanrate.controller;

import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.service.LoanRateServiceWithStrategy;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.service.LoanRateServiceWithoutStrategy;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanRate;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.LoanRateCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanRateController {

    @Autowired
    LoanRateServiceWithoutStrategy loanRateServiceWithoutStrategy;

    @Autowired
    LoanRateServiceWithStrategy loanRateServiceWithStrategy;

    @RequestMapping(value = "/calculateLoanRateWithoutStategy", method = RequestMethod.POST)
    public LoanRate calculateLoanRateWithoutStategy(@RequestBody LoanRateCriteria loanRateCriteria){
       return loanRateServiceWithoutStrategy.calculateLoanRate(loanRateCriteria);
    }

    @RequestMapping(value = "/calculateLoanRateWithStategy", method = RequestMethod.POST)
    public LoanRate calculateLoanRateWithStategy(@RequestBody LoanRateCriteria loanRateCriteria){
        return loanRateServiceWithStrategy.calculateLoanRate(loanRateCriteria);
    }
}
