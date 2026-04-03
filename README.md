# SafeLog Password Validator (Java)

This project is a simple Java-based password validation tool created as part of a cybersecurity use case. It simulates a system where employees must create strong passwords based on specific rules.

## Overview

In many systems, weak passwords can lead to security risks. This program ensures that users create passwords that meet basic corporate security standards and also provides clear feedback if the password does not meet the requirements.

## Features

* Checks if the password is at least 8 characters long
* Ensures at least one uppercase letter is present
* Ensures at least one digit is included
* Provides specific feedback for each failed condition
* Continues asking the user until a valid password is entered

## Technologies Used

* Java
* Scanner class for user input
* Loops and conditional statements for validation

## How It Works

The program uses separate methods to check each condition of the password. A loop is used to repeatedly ask the user for input until all conditions are satisfied. Instead of just saying "invalid", the program tells exactly what is missing.

## How to Run

1. Make sure Java is installed

2. Compile the program:
   javac PasswordValidator.java

3. Run the program:
   java PasswordValidator

## Sample Output

Enter password: abc
Too short
Missing an uppercase letter
Missing a digit
Try again

Enter password: Password
Missing a digit
Try again

Enter password: Password1
Password is valid

## Learning Outcome

This project helped in understanding:

* String manipulation in Java
* Use of loops (for and while)
* Breaking down problems into smaller methods
* Writing user-friendly validation systems

## Future Improvements

* Add special character validation
* Set maximum password length
* Store password securely (hashing)
* Convert into a GUI-based application
