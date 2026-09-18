# Type Conversion in Java - Quick Revision Notes

## 1. Short and Simple Definition
Type conversion is the process of converting one data type into another in Java.

## 2. Types and Their Definitions

### 1) Widening Conversion (Implicit)
This happens when a smaller data type is converted into a larger data type automatically.

Use case: Store an integer value in a double variable for calculation.

Syntax:
```java
int a = 10;
double b = a;  // automatic conversion
System.out.println(b); // 10.0
```

### 2) Narrowing Conversion (Explicit)
This happens when a larger data type is converted into a smaller data type manually using casting.

Use case: Remove decimal values from a floating-point number.

Syntax:
```java
double d = 9.78;
int x = (int) d;
System.out.println(x); // 9
```

### 3) Type Casting
Casting is the process of manually converting one type into another using parentheses.

Use case: Convert a percentage value from double to int.

Syntax:
```java
double price = 99.99;
int roundedPrice = (int) price;
System.out.println(roundedPrice); // 99
```

## 3. Use Cases
- Converting integer to double for division
- Converting marks from float to int
- Converting char to int for ASCII values
- Converting larger values into smaller data types when needed

## 4. Syntax

### Widening
```java
int a = 10;
double b = a;
```

### Narrowing
```java
double d = 9.78;
int x = (int) d;
```

### Arithmetic example
```java
int total = 5;
int count = 2;

double average = (double) total / count;
System.out.println(average); // 2.5
```

## 5. Real-Life Example
If a shopkeeper wants to calculate average sales using whole numbers, he may convert integer values into double before dividing.

```java
int totalSales = 250;
int days = 4;

double average = (double) totalSales / days;
System.out.println(average); // 62.5
```

## Quick Revision Points
- Widening = smaller to larger = automatic
- Narrowing = larger to smaller = manual casting
- Casting may cause data loss
- Integer division may give wrong result without conversion

## Important Things to Remember
- `byte -> short -> int -> long -> float -> double` is widening
- `double -> float -> long -> int -> short -> byte` is narrowing
- Explicit conversion may remove decimal values
- Overflow can happen in narrowing conversion
