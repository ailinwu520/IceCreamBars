# Ice Creams

A simple Java program to calculate the **maximum number of ice cream bars** you can buy given a limited amount of money.


## Description

The `IceCreams` class provides a method `maxIceCreams` that:

- Takes an array of integers representing the **costs of different ice cream bars** (unsorted).
- Takes an integer representing the **total dollars available**.
- Returns the **maximum number of ice cream bars** you can buy without exceeding the budget.

The algorithm works by **sorting the array of costs using selection sort** and then buying ice creams starting from the cheapest until the budget is exhausted.

