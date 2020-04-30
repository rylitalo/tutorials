package com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.controller;

import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.LoanContext;
import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.model.LoanStatus;
import com.byteperceptions.tutorials.designpatterns.templatemethod.loanrate.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanApplicationController {

    @Autowired
    LoanApplicationService loanApplicationService;

    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    public LoanStatus calculateLoanRateWithoutStategy(@RequestBody LoanContext loanContext) {
        return loanApplicationService.apply(loanContext);
    }

}
