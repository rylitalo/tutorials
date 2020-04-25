package com.byteperceptions.tutorials.designpatterns.strategy.loanrate.service;

import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.calculator.*;
import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Service
public class LoanRateServiceWithStrategy {

    //A much simplified calculation method in which the actual calculation logic has moved to classes that represent
    //the different Loan Rate Scenarios
    public LoanRate calculateLoanRate(LoanRateCriteria loanRateCriteria) {
        System.out.println(loanRateCriteria.toString());
        LoanRateCalculator loanRateCalculator = findLoanRateCalculator(loanRateCriteria);
        if(loanRateCalculator != null){
            return loanRateCalculator.calculateLoanRate();
        }
        throw new RuntimeException("Unable to calculate a loan rate");
    }

    private LoanRateCalculator findLoanRateCalculator(LoanRateCriteria loanRateCriteria) {
        String key = generateKey(loanRateCriteria);
        System.out.println("Searching for Key : " + key);
        System.out.println(loanRateCalculatorHashMap);
        return loanRateCalculatorHashMap.get(key);
    }

    private String generateKey(LoanRateCriteria loanRateCriteria){
        return loanRateCriteria.getLoanType() + ":" + loanRateCriteria.getLoanTerm() + ":" + loanRateCriteria.getPropertyType();
    }

    private String generateKey(LoanRateCalculator loanRateCalculator){
        return loanRateCalculator.getLoanType() + ":" + loanRateCalculator.getLoanTerm() + ":" + loanRateCalculator.getPropertyType();
    }

    //Initialization
    private HashMap<String, LoanRateCalculator> loanRateCalculatorHashMap;

    @Autowired
    FifteenYearPurchaseCommercialCalculator fifteenYearPurchaseCommercialCalculator;

    @Autowired
    FifteenYearPurchasePrimaryResidenceCalculator fifteenYearPurchasePrimaryResidenceCalculator;

    @Autowired
    FifteenYearPurchaseSecondaryResidenceCalculator fifteenYearPurchaseSecondaryResidenceCalculator;

    @Autowired
    FifteenYearRefinanceCommercialCalculator fifteenYearRefinanceCommercialCalculator;

    @Autowired
    FifteenYearRefinancePrimaryResidenceCalculator fifteenYearRefinancePrimaryResidenceCalculator;

    @Autowired
    FifteenYearRefinanceSecondaryResidenceCalculator fifteenYearRefinanceSecondaryResidenceCalculator;

    @Autowired
    ThirtyYearPurchaseCommercialCalculator thirtyYearPurchaseCommercialCalculator;

    @Autowired
    ThirtyYearPurchasePrimaryResidenceCalculator thirtyYearPurchasePrimaryResidenceCalculator;

    @Autowired
    ThirtyYearPurchaseSecondaryResidenceCalculator thirtyYearPurchaseSecondaryResidenceCalculator;

    @Autowired
    ThirtyYearRefinanceCommercialCalculator thirtyYearRefinanceCommercialCalculator;

    @Autowired
    ThirtyYearRefinancePrimaryResidenceCalculator thirtyYearRefinancePrimaryResidenceCalculator;

    @Autowired
    ThirtyYearRefinanceSecondaryResidenceCalculator thirtyYearRefinanceSecondaryResidenceCalculator;

    @PostConstruct
    public void init() {
        loanRateCalculatorHashMap = new HashMap<>();
        loanRateCalculatorHashMap.put(generateKey(fifteenYearPurchasePrimaryResidenceCalculator), fifteenYearPurchasePrimaryResidenceCalculator);
        loanRateCalculatorHashMap.put(generateKey(fifteenYearPurchaseCommercialCalculator), fifteenYearPurchaseCommercialCalculator);
        loanRateCalculatorHashMap.put(generateKey(fifteenYearPurchaseSecondaryResidenceCalculator),fifteenYearPurchaseSecondaryResidenceCalculator );
        loanRateCalculatorHashMap.put(generateKey(fifteenYearRefinanceCommercialCalculator), fifteenYearRefinanceCommercialCalculator);
        loanRateCalculatorHashMap.put(generateKey(fifteenYearRefinancePrimaryResidenceCalculator), fifteenYearRefinancePrimaryResidenceCalculator);
        loanRateCalculatorHashMap.put(generateKey(fifteenYearRefinanceSecondaryResidenceCalculator),fifteenYearRefinanceSecondaryResidenceCalculator );
        loanRateCalculatorHashMap.put(generateKey(thirtyYearPurchaseCommercialCalculator), thirtyYearPurchaseCommercialCalculator);
        loanRateCalculatorHashMap.put(generateKey(thirtyYearPurchasePrimaryResidenceCalculator), thirtyYearPurchasePrimaryResidenceCalculator);
        loanRateCalculatorHashMap.put(generateKey(thirtyYearPurchaseSecondaryResidenceCalculator), thirtyYearPurchaseSecondaryResidenceCalculator);
        loanRateCalculatorHashMap.put(generateKey(thirtyYearRefinanceCommercialCalculator), thirtyYearRefinanceCommercialCalculator);
        loanRateCalculatorHashMap.put(generateKey(thirtyYearRefinancePrimaryResidenceCalculator), thirtyYearRefinancePrimaryResidenceCalculator);
        loanRateCalculatorHashMap.put(generateKey(thirtyYearRefinanceSecondaryResidenceCalculator), thirtyYearRefinanceSecondaryResidenceCalculator);
    }

}
