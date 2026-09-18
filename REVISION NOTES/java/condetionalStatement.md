# Conditional Statements in Java - Quick Revision Notes

## 1. Short and Simple Definition
A conditional statement is a decision-making statement that checks a condition and runs code only when the condition is true.

## 2. Types and Their Definitions

### 1) if statement
An `if` statement runs code only when the condition is true.

Use case: Check whether a person is eligible to vote.

Syntax:
```java
int age = 20;

if (age >= 18) {
    System.out.println("You can vote.");
}
```

### 2) if-else statement
An `if-else` statement chooses between two actions: one for true and one for false.

Use case: Check if a number is even or odd.

Syntax:
```java
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

### 3) else-if ladder
An `else-if` ladder checks multiple conditions one by one and executes the first true condition.

Use case: Assign grades based on marks.

Syntax:
```java
int marks = 82;

if (marks >= 90) {
    System.out.println("Grade A+");
} else if (marks >= 75) {
    System.out.println("Grade A");
} else if (marks >= 60) {
    System.out.println("Grade B");
} else {
    System.out.println("Need improvement");
}
```

### 4) Nested if
A nested `if` is an `if` inside another `if`. It is used when one decision depends on another decision.

Use case: Allow entry only if the person is adult and has an ID.

Syntax:
```java
int age = 25;
boolean hasId = true;

if (age >= 18) {
    if (hasId) {
        System.out.println("Entry allowed");
    } else {
        System.out.println("ID is required");
    }
}
```

### 5) switch statement
A `switch` statement is used when a variable has multiple fixed possible values.

Use case: Print the day name based on a number.

Syntax:
```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

### 6) Ternary operator
The ternary operator is a short form of `if-else` for simple true/false decisions.

Use case: Check whether a number is even or odd and assign a result.

Syntax:
```java
int number = 10;
String result = (number % 2 == 0) ? "Even" : "Odd";
System.out.println(result);
```

## 3. Use Cases
- Checking age for eligibility
- Checking even or odd numbers
- Grading marks
- Allowing or blocking access
- Choosing actions based on menu/input value
- Simple true/false decision making

## 4. Syntax

### if
```java
if (condition) {
    // code
}
```

### if-else
```java
if (condition) {
    // true code
} else {
    // false code
}
```

### else-if
```java
if (condition1) {
    // code1
} else if (condition2) {
    // code2
} else {
    // default code
}
```

### switch
```java
switch (value) {
    case 1:
        // code
        break;
    default:
        // code
}
```

### ternary
```java
variable = condition ? value1 : value2;
```

## 5. Real-Life Example
If a student is above 18 and has an ID, they can enter a college event. Otherwise, they are not allowed.

```java
int age = 20;
boolean hasId = true;

if (age >= 18 && hasId) {
    System.out.println("Entry allowed");
} else {
    System.out.println("Entry not allowed");
}
```

## Quick Revision Points
- Conditional statements are used for decision-making.
- `if` = run only when condition is true.
- `if-else` = choose between two options.
- `else-if` = check many conditions.
- `switch` = choose from fixed values.
- Ternary = short version of `if-else`.
- Always use proper conditions and correct comparison operators.

## Important Things to Remember
- Use `==` for comparison, not `=`.
- Use `&&` for AND and `||` for OR.
- Use `break` in `switch` to stop matching further cases.
- The condition must evaluate to `true` or `false`.
