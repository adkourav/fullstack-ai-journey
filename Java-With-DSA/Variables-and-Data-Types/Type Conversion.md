# Type Conversion in Java

Type conversion is the process of converting one data type into another.

Java supports two main types of conversion:

1. Widening Conversion (Automatic / Implicit)
2. Narrowing Conversion (Manual / Explicit)

---

## 1) Widening Conversion

This happens when a smaller data type is converted into a larger data type.

Java does this automatically if there is no risk of data loss.

### Example
```java
int a = 10;
double b = a;   // automatic conversion
System.out.println(b);  // 10.0
```

### Diagram
```text
byte  -> short -> int -> long -> float -> double
  ^
  |
 char
```

### Important rule
- Smaller to larger type is allowed automatically.
- Example: `byte -> int`, `int -> long`, `float -> double`

---

## 2) Narrowing Conversion

This happens when a larger data type is converted into a smaller data type.

Java does NOT do this automatically. You must use explicit casting.

### Example
```java
double d = 9.78;
int x = (int) d;   // explicit conversion
System.out.println(x); // 9
```

### Diagram
```text
double -> float -> long -> int -> short -> byte
          ^
          |
         char
```

### Important rule
- Larger to smaller type requires casting.
- Example: `double -> int`, `long -> short`, `float -> byte`

---

## 3) Java Type Conversion Rules

### Automatic conversion happens when:
- Both types are compatible
- Destination type is larger than source type

### Manual conversion happens when:
- Converting from larger to smaller type
- You want to force the value into a smaller range

---

## 4) Lossy Conversion

Lossy conversion means some value or precision is lost during conversion.

Example:
```java
double d = 123.987;
int x = (int) d;
System.out.println(x); // 123
```

Here, `.987` is lost. So the conversion is lossy.

### Why it happens
When converting from `double`/`float` to `int`, decimal part is removed.

### Common lossy conversions
- `double -> int`
- `float -> int`
- `long -> int`
- `int -> short`
- `int -> byte`

### Example of data loss
```java
int num = 130;
byte b = (byte) num;
System.out.println(b); // -126
```

Why?
- `byte` range is from `-128` to `127`
- `130` cannot fit in byte, so it overflows
- Data is lost or wrapped around

---

## 5) Key Points to Remember

- `byte -> short -> int -> long -> float -> double` is widening
- `double -> float -> long -> int -> short -> byte` is narrowing
- Widening is automatic
- Narrowing needs cast
- Lossy conversion loses precision or range

---

## 6) Simple Java Example

```java
public class TypeConversionDemo {
    public static void main(String[] args) {
        int a = 100;
        double d = a;  // widening

        double x = 45.89;
        int y = (int) x;  // narrowing (lossy)

        System.out.println("d = " + d);
        System.out.println("y = " + y);
    }
}
```

### Output
```text
d = 100.0
y = 45
```

---

## 7) Final Summary

Type conversion in Java is important because:
- it helps in storing values correctly
- it allows compatibility between different data types
- it may cause precision loss in narrowing conversion

> Remember: widening is safe, narrowing is risky, and lossy conversion loses information.

