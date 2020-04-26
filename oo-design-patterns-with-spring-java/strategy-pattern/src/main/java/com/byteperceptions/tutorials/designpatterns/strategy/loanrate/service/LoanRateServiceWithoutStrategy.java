package com.byteperceptions.tutorials.designpatterns.strategy.loanrate.service;

import com.byteperceptions.tutorials.designpatterns.strategy.loanrate.model.*;
import org.springframework.stereotype.Service;

@Service
public class LoanRateServiceWithoutStrategy {
    public LoanRate calculateLoanRate(LoanRateCriteria loanRateCriteria) {

      if(LoanTerm.FIFTEEN_YEAR.equals(loanRateCriteria.getLoanTerm())){
          if(LoanType.PURCHASE.equals(loanRateCriteria.getLoanType())){
              if(PropertyType.PRIMARY_RESIDENCE.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(3.25);
              } else  if(PropertyType.SECONDARY_RESIDENCE.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(3.5);
              } else if(PropertyType.COMMERCIAL.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(3.75);
              }
          }else if(LoanType.REFINANCE.equals(loanRateCriteria.getLoanType())){
              if(PropertyType.PRIMARY_RESIDENCE.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(4.25);
              } else  if(PropertyType.SECONDARY_RESIDENCE.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(4.5);
              } else if(PropertyType.COMMERCIAL.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(4.75);
              }
          }
      }
      else if(LoanTerm.THIRTY_YEAR.equals(loanRateCriteria.getLoanTerm())){
          if(LoanType.PURCHASE.equals(loanRateCriteria.getLoanType())){
              if(PropertyType.PRIMARY_RESIDENCE.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(5.25);
              } else  if(PropertyType.SECONDARY_RESIDENCE.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(5.5);
              } else if(PropertyType.COMMERCIAL.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(5.75);
              }
          }else if(LoanType.REFINANCE.equals(loanRateCriteria.getLoanType())){
              if(PropertyType.PRIMARY_RESIDENCE.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(6.25);
              } else  if(PropertyType.SECONDARY_RESIDENCE.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(6.5);
              } else if(PropertyType.COMMERCIAL.equals(loanRateCriteria.getPropertyType()))
              {
                  //Do some logic that requires hundreds of lines of code
                  return new LoanRate(6.75);
              }
          }
      }
      throw new RuntimeException("Unable to calculate a loan rate");
    }
}
