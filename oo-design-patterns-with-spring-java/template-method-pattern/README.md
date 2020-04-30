# Template Method Pattern Example in Spring Boot

A sample example to demonstrate how to refactor an 
ugly service into a much cleaner design leveraging the template method pattern

## Build Sample Application
```bash
gradlew build
```

## Run Sample Application
```bash
gradlew bootRun
```


## Access via Postman
After starting the application, use postman to POST a request to the following url
**http://localhost:8080/loan/apply* in a browser.

## Request body of POST for Approved Jumbo Loan
 ```
{
  "loanType" : "JUMBO_MORTGAGE",
  "borrowName" : "Jane Doe",
  "creditScore" : 850,
  "propertyValue" : 1000000,
  "loanAmount" : 750000
}
```

 ## Request body of POST for Denied Jumbo Loan
  ```
 {
   "loanType" : "JUMBO_MORTGAGE",
   "borrowName" : "Jane Doe",
   "creditScore" : 650,
   "propertyValue" : 1000000,
   "loanAmount" : 750000
 }
 ```

## Request body of POST for Approved First Time Homebuyer Loan
 ```
{
  "loanType" : "FIRST_TIME_HOMEBUYER",
  "borrowName" : "Jane Doe",
  "creditScore" : 600,
  "propertyValue" : 200000,
  "loanAmount" : 160000
}
```

## Request body of POST for Denied First Time Homebuyer Loan
 ```
{
  "loanType" : "FIRST_TIME_HOMEBUYER",
  "borrowName" : "Jane Doe",
  "creditScore" : 600,
  "propertyValue" : 200000,
  "loanAmount" : 175000
}
```