# TipCalculator Software Release Notes

## Release 1.0.0
Last Revised Sep 13th, 2016

## Target Environments

an emulator/android device using API level 19 (Kitkat) or above

## Introduction
This is simple android app helps to calculate tips. It has only one activity. A demo is shown in figure 1. The user can simply click next to the corresponding tabs and enter the amount of check and the number people splitting the check. After clicking on the Computer button, the app calculates the value of tips and totals for a 15%, 20% or 25% tip. The results are rounded to the closet integers.

## Requirements
Check amount: the total amount on the check, decimal numbers larger than or equal to 0
Party size: number of people in the party, integers larger than 0

## Handling exceptions
If the user fails to input properly, such as invalid or empty values, an error message will show using a Toast.

![Figure1 Demo](https://github.com/lixu0818/TipCalculator/blob/master/demo.jpg) 



