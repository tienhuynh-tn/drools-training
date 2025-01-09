# Drools course training materials
[![Java CI with Maven](https://github.com/tienhuynh-tn/drools-training/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/tienhuynh-tn/drools-training/actions/workflows/maven.yml)

This project is part of Drools video course 
[Master Drools Programming—Learn How to Write Drools Rules](https://www.udemy.com/course/master-drools/?referralCode=ED7C311E09498C940742 "Click to go to Udemy course")

The instructions for how to run this code are given in the course.

## Drools Stateless Sessions - Common Use Cases
- Validation
    - Is this passport valid?
    - Is this person eligible for a visa?
- Calculation
    Compute price of travel insurance
- Routing and Filtering
    - Decide who in company has to approve particular expense
    - Filter incoming email into folders

## Sample Data - Passports to be validated
Current date: 09 January 2025

| Name          | Passport Number | Unused Visa Pages | Passport Expires |     Comments     |
|---------------|-----------------|:-----------------:|:----------------:|:----------------:|
| Sarah Murphy  | CA-SARAH-1      |         1         | 17 December 2017 |     expired      |
| Simon Murphy  | CA-SIMON-2      |         0         |   11 May 2045    | no room for visa |
| Emily Brown   | AU-EMILY-3      |        20         | 25 November 2047 |        OK        |
| James Brown   | AU-JAMES-4      |        10         |  10 April 2045   |        OK        |

## Stateless vs Stateful Session
- Stateless in Drools means that you:
    - set the state (gather the data)
    - run the rule on this data
    - get the output
    - and then you are done
- With stateful sessions:
    - you can run rules multiple times without re-entering the data into the session
    - for example, you let the rules run every 5 minutes
