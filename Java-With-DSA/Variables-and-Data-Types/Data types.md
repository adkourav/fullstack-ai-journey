![alt text](<Screenshot 2026-08-31 161848.png>)

## Data Type in Java ##

## What is the Data type in java ## 

A data type in Java tells the program what type of value a variable can store.

Simple interview definition:

A data type defines the type of data that a variable can store.

Example:


int age = 22;
String name = "Adarsh";
double salary = 25000.50;
boolean isStudent = true;

int age = 22;
String name = "Adarsh";
double salary = 25000.50;
boolean isStudent = true;

Here:

int → stores whole numbers
String → stores text
double → stores decimal numbers
boolean → stores true or false

👉 In simple words: A data type tells Java what kind of data you are storing in a variable.


## In Java, data types are mainly divided into 2 types:##

# 1. Primitive Data Types##

Java has 8 primitive data types:

| Data Type | Used For              | Example                      |
| --------- | --------------------- | ---------------------------- |
| `byte`    | Small whole numbers   | `byte age = 20;`             |
| `short`   | Whole numbers         | `short num = 1000;`          |
| `int`     | Whole numbers         | `int age = 22;`              |
| `long`    | Large whole numbers   | `long population = 100000L;` |
| `float`   | Decimal numbers       | `float price = 10.5f;`       |
| `double`  | More precise decimals | `double salary = 25000.50;`  |
| `char`    | Single character      | `char grade = 'A';`          |
| `boolean` | True or false         | `boolean pass = true;`       |


## 2. Non-Primitive (Reference) Data Types ##

These are used to store references to objects.

Examples:

String
Arrays
Classes
Objects
Interfaces
## ⭐ Easy way to remember ##

Java Data Types → 2 Types

Data Types
├── Primitive → 8 types
│   ├── byte
│   ├── short
│   ├── int
│   ├── long
│   ├── float
│   ├── double
│   ├── char
│   └── boolean
│
└── Non-Primitive / Reference
    ├── String
    ├── Array
    ├── Class
    └── Interface



Java has two main types of data types: Primitive and Non-Primitive (Reference) data types. There are 8 primitive data types in Java.


## Size of Data Types in Java

Java has 8 primitive data types. Their sizes are:-


| Data Type |                                Size | Example             |
| --------- | ----------------------------------: | ------------------- |
| `byte`    |                 **1 byte (8 bits)** | `byte a = 10;`      |
| `short`   |               **2 bytes (16 bits)** | `short a = 1000;`   |
| `int`     |               **4 bytes (32 bits)** | `int a = 10000;`    |
| `long`    |               **8 bytes (64 bits)** | `long a = 100000L;` |
| `float`   |               **4 bytes (32 bits)** | `float a = 10.5f;`  |
| `double`  |               **8 bytes (64 bits)** | `double a = 10.5;`  |
| `char`    |               **2 bytes (16 bits)** | `char a = 'A';`     |
| `boolean` | **Not fixed by Java specification** | `boolean a = true;` |
