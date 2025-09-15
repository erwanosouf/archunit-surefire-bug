# How to reproduce

## Description

This repository contains a Test Case to exhibit a behavior that appeared in Surefire 3.5.3.

A Junit5 Test Class `ArchUnitSurefireBugTest` contains 3 tests
- `thisTestUsingArchTestFieldShouldRun` : A Test using @ArchTest on a field
- `thisTestUsingArchTestMethodShouldRun` : A Test using @ArchTest on a method
- `thisStandardTestShouldRun` : a standard JUnit Test using no ArchUnit syntactic sugar.

## Expected

Run `mvn test -Dsurefire.version=3.5.2 -f pom.xml`

All tests run

## Actual

`mvn test -Dsurefire.version=3.5.3 -f pom.xml`

thisTestUsingArchTestFieldShouldRun does not run.

## [Update 2025-09-15] Fixed in 3.5.4

`mvn test -Dsurefire.version=3.5.4 -f pom.xml`

All tests run
Confirmed fixed.