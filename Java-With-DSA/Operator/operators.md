# Operators in Java

An operator is a special symbol that tells the Java compiler to perform a specific operation on one or more operands.

### Example
```java
int a = 10;
int b = 5;
int sum = a + b;   // + is the operator
```

Here:
- `+` is the operator
- `a` and `b` are operands
- result is stored in `sum`

---

## Why operators are important
Operators are used for:
- arithmetic calculations
- comparisons
- logical decisions
- bit-level operations
- assigning values
- increment/decrement

---

## Types of operators in Java

Java operators are mainly divided into these categories:

1. Arithmetic Operators
2. Unary Operators
3. Assignment Operators
4. Relational Operators
5. Logical Operators
6. Bitwise Operators
7. Shift Operators
8. Ternary Operator

---

## 1) Arithmetic Operators

These are used for mathematical operations.

### Types
- Binary arithmetic operators: work on two operands
- Unary arithmetic operators: work on one operand

### Binary arithmetic operators
| Operator | Meaning | Example |
|---------|---------|---------|
| + | Addition | a + b |
| - | Subtraction | a - b |
| * | Multiplication | a * b |
| / | Division | a / b |
| % | Modulus (remainder) | a % b |

### Example
```java
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

### Unary arithmetic operators
| Operator | Meaning | Example |
|---------|---------|---------|
| + | Positive sign | +a |
| - | Negative sign | -a |
| ++ | Increment by 1 | a++ or ++a |
| -- | Decrement by 1 | a-- or --a |

### Increment and decrement
```java
int a = 5;
System.out.println(++a); // 6
System.out.println(a++); // 6 then becomes 7
System.out.println(--a); // 6
System.out.println(a--); // 6 then becomes 5
```

### Difference between prefix and postfix
- `++a` → increment first, then use value
- `a++` → use value first, then increment

---

## 2) Assignment Operators

These are used to assign values to variables.

### Common assignment operators
| Operator | Meaning | Example |
|---------|---------|---------|
| = | Assign value | a = 10 |
| += | Add and assign | a += 5 |
| -= | Subtract and assign | a -= 2 |
| *= | Multiply and assign | a *= 3 |
| /= | Divide and assign | a /= 2 |
| %= | Modulus and assign | a %= 3 |

### Example
```java
int a = 10;
a += 5;   // a = a + 5
System.out.println(a); // 15
```

---

## 3) Relational Operators

These compare two values and return either `true` or `false`.

| Operator | Meaning | Example |
|---------|---------|---------|
| == | Equal to | a == b |
| != | Not equal to | a != b |
| > | Greater than | a > b |
| < | Less than | a < b |
| >= | Greater than or equal | a >= b |
| <= | Less than or equal | a <= b |

### Example
```java
int a = 10;
int b = 20;

System.out.println(a < b);   // true
System.out.println(a == b);  // false
```

These are often used in `if` conditions.

---

## 4) Logical Operators

These are used to combine multiple conditions.

| Operator | Meaning | Example |
|---------|---------|---------|
| && | Logical AND | a > 5 && b < 10 |
| || | Logical OR | a > 5 || b < 10 |
| ! | Logical NOT | !(a > 5) |

### Example
```java
int a = 10;
int b = 5;

System.out.println(a > 5 && b < 10); // true
System.out.println(a < 5 || b == 5); // true
System.out.println(!(a > 5)); // false
```

### Rule
- `&&` → true only if both are true
- `||` → true if at least one is true
- `!` → reverses the condition

---

## 5) Bitwise Operators

These work on bits (0 and 1) of integer values.

| Operator | Meaning |
|---------|---------|
| & | Bitwise AND |
| | | Bitwise OR |
| ^ | Bitwise XOR |
| ~ | Bitwise complement |
| << | Left shift |
| >> | Right shift |
| >>> | Unsigned right shift |

### Example
```java
int a = 5; // 0101
int b = 3; // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
```

### Bitwise operators are useful for:
- low-level programming
- mask operations
- optimization
- binary logic

---

## 6) Unary Operators

These work with only one operand.

### Examples
| Operator | Meaning |
|---------|---------|
| + | unary plus |
| - | unary minus |
| ++ | increment |
| -- | decrement |
| ! | logical NOT |

### Example
```java
int a = 7;
System.out.println(+a); // 7
System.out.println(-a); // -7
System.out.println(!true); // false
```

---

## 7) Shift Operators

These shift bits left or right.

### Types
- `<<` left shift
- `>>` right shift
- `>>>` unsigned right shift

### Example
```java
int a = 8; // 1000
System.out.println(a << 1); // 16
System.out.println(a >> 1); // 4
```

Use case:
- fast multiplication/division by powers of 2
- bit manipulation

---

## 8) Ternary Operator

The ternary operator is a short form of `if-else`.

### Syntax
```java
condition ? expression1 : expression2;
```

### Example
```java
int a = 10;
int b = 20;
int max = (a > b) ? a : b;
System.out.println(max); // 20
```

### Meaning
- If condition is true, choose expression1
- Otherwise, choose expression2

---

## Operator precedence in Java

Some operators are evaluated before others.

### Order from highest to lowest
1. `()`, `[]`, `.`
2. unary `++`, `--`, `!`, `~`, `+`, `-`
3. multiplicative `*`, `/`, `%`
4. additive `+`, `-`
5. shift `<<`, `>>`, `>>>`
6. relational `<`, `>`, `<=`, `>=`, `instanceof`
7. equality `==`, `!=`
8. bitwise AND `&`
9. bitwise XOR `^`
10. bitwise OR `|`
11. logical AND `&&`
12. logical OR `||`
13. ternary `?:`
14. assignment `=`, `+=`, `-=`, etc.

### Example
```java
int result = 10 + 5 * 2;
System.out.println(result); // 20
```

Because multiplication happens before addition.

---

## Diagram / Flowchart of Operators

```text
                   Operators in Java
                          |
                          v
              +-------------------------+
              | What type of operation? |
              +-------------------------+
                          |
          ---------------------------------------------------
          |                 |                 |               |
          v                 v                 v               v
     Arithmetic        Relational         Logical         Assignment
       +,-,*,/,%,       ==,!=,>,<,       &&,||,!        =,+=,-=,
       ++,--             >=,<=                                *=,/=,%=

          |
          v
     Bitwise / Shift / Ternary
       &,|,^,~,<<,>>,>>> , condition ? x : y
```

---

## Summary

Java operators are symbols that perform actions on operands.

### Main categories
- Arithmetic
- Assignment
- Relational
- Logical
- Bitwise
- Shift
- Unary
- Ternary

### Important idea
Operators help us do:
- calculations
- comparisons
- decisions
- data assignment
- bit operations

---

## Quick Example Program

```java
public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a + b);     // arithmetic
        System.out.println(a > b);     // relational
        System.out.println(a > 5 && b < 10); // logical
        System.out.println(a += 2);    // assignment
        System.out.println(a << 1);    // shift
    }
}
```

---

## Final simple definition

An operator is a symbol in Java that tells the compiler to perform a specific operation on values or variables.

> In simple words: operators are the tools used to calculate, compare, decide, and assign values in Java.

