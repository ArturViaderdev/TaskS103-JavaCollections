# Task S103 - Java Collections

## Description
This project was created for academic purposes as part of the IT Academy Java & Spring specialization.
The goal is to test the Java Collections.

The project is structured in three levels of increasing complexity.

## 🛠 Technologies
- Java

##    Project Structure
````bash
├── pom.xml
├── README.md
└── src
    └── main
        └── java
            ├── level1Exercise1
            │   ├── Main.java
            │   ├── Methods.java
            │   └── Month.java
            ├── level1Exercise2
            │   ├── Main.java
            │   └── Methods.java
            ├── level1Exercise3
            │   ├── ConsoleUI.java
            │   ├── FilesInteraction.java
            │   ├── Main.java
            │   └── Program.java
            ├── level2Exercise1
            │   ├── Main.java
            │   └── Restaurant.java
            ├── level2Exercise2
            │   ├── Main.java
            │   └── Restaurant.java
            └── level3Exercise1
                ├── comparators
                │   ├── ComparatorDNIAsc.java
                │   ├── ComparatorNameAsc.java
                │   └── ComparatorSurnamesAsc.java
                ├── ConsoleUI.java
                ├── exceptions
                │   ├── CommaFieldException.java
                │   ├── EmptyException.java
                │   ├── IncorrectCSVFormatException.java
                │   ├── IncorrectOptionException.java
                │   └── MaxLengthException.java
                ├── FilesAccess.java
                ├── Main.java
                ├── Person.java
                └── Program.java
````

## 🚀 Instal.lation and Execution
1. Clone the repository:
````bash
git clone https://github.com/ArturViaderdev/TaskS103-JavaCollections
````
You can do cd into the project folder you want to execute:
Examples:
````
cd src/main/java/level1Exercise1
cd src/main/java/level1Exercide2
````

And run the program:
````
java Main.java
````

## Level 1

### Exercise 1

In this exercise I tested the use of ArrayList and HashSet.
ArrayList allows duplicates, hashset not allows duplicates.
ArrayList has a position for each element, hashset not haves a position for the elements.

I implemented equals in the class of data stored because it makes the name of the month cannot be repeated.
If not it could be repeated because the repeated month is another instance of the class.

I explored the hashset with for each and with iterator.

### Exercise 2

I create two integer lists and fill it with numbers. Later I add the contents from the first list to the second list using a listiterator.
The List allows to have repeated numbers, and it maintains the order.

### Exercise 3

This is a game that asks the user for countries and its capitals.
The information is read from a text file and stored in a hashmap.
The score is saved in another file.

## Level 2

### Exercise 1
I created a hashset that stores restaurants and I checked that hashset is not allowing to insert duplicates.

### Exercise 2
I used comparable to order objects of an arraylist.
I am not used hashset because it not has a defined order.

## Level 3

### Exercise 1

I developed a program that stores persons in a csv file.
The persons can be ordered by name, surnames and dni.
