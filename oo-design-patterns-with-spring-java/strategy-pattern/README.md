# Strategy Pattern Example in Spring Boot

A sample example to demonstrate how to refactor an 
ugly service into a much cleaner design leveraging the strategy pattern

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
**http://localhost:8080/calculateLoanRateWithoutStategy** or **http://localhost:8080/calculateLoanRateWithStategy** in a browser.

## Request body of POST for Single Customer
 ```
{
   "loanTerm" : "FIFTEEN_YEAR",
   "loanType" : "REFINANCE",
   "propertyType" : "COMMERCIAL"
}
```

 