# Loops in Java - Quick Revision Notes

## 1. Short and Simple Definition
A loop is a programming structure that repeats a block of code again and again until a condition becomes false.

## 2. Types and Their Definitions

### 1) while loop
A `while` loop checks the condition first. If the condition is true, the code inside the loop runs. It may run zero times.

Syntax:
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### 2) do-while loop
A `do-while` loop runs the code at least once before checking the condition. It checks the condition after execution.

Syntax:
```java
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### 3) for loop
A `for` loop is used when the number of repetitions is known in advance. It contains initialization, condition, and update in one line.

Syntax:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### 4) for-each loop
A `for-each` loop is used to iterate through arrays or collections easily.

Syntax:
```java
int[] numbers = {10, 20, 30};
for (int n : numbers) {
    System.out.println(n);
}
```

## 3. Use Cases
- Repeating a task many times
- Printing numbers from 1 to 10
- Reading data from arrays or collections
- Running code until a condition becomes false
- Creating patterns and tables

## 4. Syntax

### while loop
```java
while (condition) {
    // code
}
```

### do-while loop
```java
do {
    // code
} while (condition);
```

### for loop
```java
for (initialization; condition; update) {
    // code
}
```

### for-each loop
```java
for (dataType variable : arrayOrCollection) {
    // code
}
```

## 5. Real-Life Example
If you want to print your daily study hours for 5 days, you can use a loop instead of writing the same print statement five times.

Example:
```java
for (int day = 1; day <= 5; day++) {
    System.out.println("Study day " + day);
}
```

### Quick Revision
- Loop = repeat code
- `while` = check first
- `do-while` = run first, then check
- `for` = known number of times
- `for-each` = iterate through array/collection

### Important Points
- Use `break` to stop the loop
- Use `continue` to skip the current iteration
- Avoid infinite loops by updating the variable properly
