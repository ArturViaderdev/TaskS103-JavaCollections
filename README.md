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

# Java Collections Exercises

In this task, we will work with the fundamental concepts of **collections in Java**, paying special attention to the most common classes in the `java.util` library, such as `ArrayList`, `HashSet`, `HashMap`, and `ListIterator`.  
The goal is to strengthen your understanding of how these data structures are **created, modified, and traversed**, and to observe their behavior regarding duplicates, object comparison, and element ordering.

You will also practice **file reading and writing** and **user interaction**, which will help you build small programs that combine several collections in a practical, clear, and well-structured way.

## General Recommendations

- Use **IntelliJ IDEA** for all exercises.
- Follow the best practices described in **Sprint 0** to ensure code and delivery quality.
- You may use simple Java projects, **Maven**, or **Gradle**.
- Write all code in **English**.

Besides practicing with collections, this task is an opportunity to improve your **code organization**: separate responsibilities into methods and classes, avoid putting all logic in `main`, and think about the design before implementing.

---

## Level 1

### Exercise 1 — Duplicates

In this exercise, you will use two of the most common Java collections: `ArrayList` and `HashSet`.  
You will practice how to add and modify elements and observe how these collections behave when duplicates are present.

**Statement**

- Create a class named `Month` with one attribute `name` that stores the name of the month.
- Add 11 `Month` objects to an `ArrayList`, leaving out `"August"`.
- Insert `"August"` in the correct position and check that the order of the months is correct.
- Convert the `ArrayList` into a `HashSet` and verify that duplicates are not allowed.
- Finally, iterate over the collection using a `for` loop and an `Iterator`.

**Answer**
In this exercise, I tested the use of `ArrayList` and `HashSet`.

`ArrayList`allows duplicates, while `HashSet` does not.

`ArrayList` maintains a position (index) for each element; `HashSet` does not, as it is unordered.

I implemented `equals()` in the `Month` class (the data stored in the collections) because `HashSet` uses it to prevent duplicate months based on the name field.​

Without a proper `equals()` override, duplicates could occur since different instances with the same name would be considered distinct by default (reference equality).​

I also explored iterating over the `HashSet` using both an enhanced for loop and an `Iterator`.

### Exercise 2 — ListIterator

This exercise allows you to practice list manipulation and the use of `ListIterator`.

**Statement**

- Create and populate a `List<Integer>`.
- Create a second list and insert the same elements but in reverse order.
- Use a `ListIterator` to read the elements from the first list and add them to the second one.

**Answer**

I created two `List<Integer>` instances and filled them with numbers.

Later, I used a `ListIterator` to read from the first list and add its contents to the second list in reverse order.

The List allows duplicate numbers and maintains insertion order.

### Exercise 3 — Capital Game

In this exercise, you will practice reading files, using collections like `HashMap`, and interacting with the user via a small quiz game.

Using the file `countries.txt`, which contains pairs of country and capital separated by commas, the program must:

- Read all the data and store it in a `HashMap<String, String>`, where the key is the country name and the value is its capital.
- Ask the user for their name and start the game.
- Ask 10 questions by randomly selecting 10 different countries from the `HashMap`.
- For each round, show a country name and ask the user to type its capital.
- If the answer is correct (considering case sensitivity if necessary), add one point to the score.
- After 10 questions, display the total score obtained.
- Save the user’s name and score to a file named `classificacio.txt`.

**Answer**

This is a game that asks the user for the capitals of randomly selected countries.

The information is read from a text file and stored in a `HashMap<String, String>` (country → capital).

The user's score is saved to another file called `classificacio.txt`.

---

## Level 2

In this level, you will work with collections such as `HashSet` and with sorting objects using `Comparable` and `Comparator`.  
The objective is to understand how Java compares and organizes objects according to rules that you define. You will also deepen your understanding of overriding `equals()` and `hashCode()` to control duplicates, as well as sorting custom objects.

### Exercise 1 — HashSet Without Exact Duplicates

Create a class named `Restaurant` with two attributes:

- `name` (`String`)
- `score` (`int`)

Implement the necessary methods (`equals()` and `hashCode()`) so that `Restaurant` objects with the same name and the same score cannot be added to a `HashSet`.

**Important**

- There may be restaurants with the same name if the score is different.
- There must not be exact duplicates (same name and same score).

**Answer**
I created a `HashSet` that stores restaurants, and I confirmed that the `HashSet` does not allow inserting duplicate elements.

### Exercise 2 — Multiple Sorting

Using the `Restaurant` class from the previous exercise, implement the required functionality so that objects can be sorted:

1. Alphabetically by `name`.
2. If the name is the same, by `score` in **descending** order.

You can implement this by:

- Implementing the `Comparable` interface, or
- Using a `Comparator`,

whichever you consider more appropriate.

**Example order:**

```text
name: Restaurant A, score: 9
name: Restaurant A, score: 7
name: Restaurant B, score: 8
```

***Answer***
I used `Comparable` to sort objects in an `ArrayList`.

I did not use `HashSet` because it does not maintain a defined order.

## Level 3

In this level, you will implement a small application to manage and display people read from a file.

You will practice reading CSV files, creating interactive menus, and dynamically sorting objects according to different criteria (name, surname, and ID).

The objective is to understand how to structure a modular application that can read, display, and sort data in a flexible way.

### Exercise 1 — Person Manager with Sorting

Create an application capable of reading a CSV file.

This file has 3 fields per record:

    name

    surname

    ID

Your task is to sort the people read from the file by name, surname, or ID.

You can use whichever list implementation you find most suitable.
```java
Class Person

java
class Person {
private String name;
private String surname;
private String id;

    // constructors, getters, setters, toString(), etc.
}
```

**Main Menu**

```text
1. Add person
2. Show people sorted by name (A-Z)
3. Show people sorted by name (Z-A)
4. Show people sorted by surname (A-Z)
5. Show people sorted by surname (Z-A)
6. Show people sorted by ID (1-9)
7. Show people sorted by ID (9-1)
0. Exit
```
***Example Output***

```text
___Name___       ____Surnames______    ___ID___
Andreu          Ballestero Llenas     34835767J
Miquel          Bayona Font           48743957B
Guillem         Capdevila Riu         33957834J
Albert          Carbonell Ferrer      77364986R
Ferran          Casas Coderch         23047848P
Maria           Casellas Fuste        47102244S
Genis           Ciutat Vendrell       39718459N
```

***Answer***

I developed a program that reads and manages people from a CSV file.

The people can be sorted by name, surname, or ID (DNI).