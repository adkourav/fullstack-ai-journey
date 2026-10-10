# Java Access Modifiers

Access modifiers in Java are used to restrict the access of classes, methods, variables, constructors, and data members.

They help in:
- controlling visibility
- protecting data
- implementing encapsulation
- managing inheritance safely

---

## 1) public

A `public` member can be accessed from anywhere in the program.

### Example
```java
public class Student {
    public String name = "John";

    public void show() {
        System.out.println("Hello, " + name);
    }
}
```

### Use when
- you want a class or method to be accessible everywhere
- for APIs and shared methods

### Limit
- too much use can reduce security and encapsulation

---

## 2) private

A `private` member can be accessed only inside the same class.

### Example
```java
class Student {
    private String name = "John";

    public void show() {
        System.out.println(name);
    }
}
```

### Use when
- you want to hide internal data
- to protect important variables and methods

### Important
- `private` is the most restrictive access modifier
- used heavily for data hiding

---

## 3) protected

A `protected` member can be accessed:
- within the same class
- within the same package
- in subclasses, even if they are in a different package

### Example
```java
class Animal {
    protected String type = "Mammal";
}

class Dog extends Animal {
    void display() {
        System.out.println(type);
    }
}
```

### Use when
- you want a member to be accessible to subclasses
- while still restricting general access

---

## 4) default (no modifier)

If no access modifier is specified, it is called default access or package-private access.

### Example
```java
class Student {
    String name = "John";
}
```

### Access level
- accessible only within the same package
- not accessible from other packages

### Use when
- you want limited visibility within the same package

---

## Access Modifier Table

| Modifier | Same Class | Same Package | Subclass | Other Package |
|----------|------------|--------------|----------|---------------|
| private  | Yes        | No           | No       | No            |
| default  | Yes        | Yes          | No       | No            |
| protected| Yes        | Yes          | Yes      | No            |
| public   | Yes        | Yes          | Yes      | Yes           |

---

## Example Program
```java
class Person {
    public String name;        // accessible everywhere
    private int age;           // accessible only inside Person
    protected String city;     // accessible in same package/subclasses
    String country;            // default, accessible in same package

    public Person(String name, int age, String city, String country) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Amit", 22, "Delhi", "India");
        System.out.println(p.name);
        p.show();
    }
}
```

---

## Important Notes

### 1. `private` is used for encapsulation
```java
class BankAccount {
    private double balance = 5000;

    public double getBalance() {
        return balance;
    }
}
```

This protects the balance from direct modification.

### 2. `protected` is used in inheritance
```java
class Vehicle {
    protected String brand = "Honda";
}

class Car extends Vehicle {
    void display() {
        System.out.println(brand);
    }
}
```

### 3. `public` is for global access
```java
public class Demo {
    public void print() {
        System.out.println("Public method");
    }
}
```

---

## Quick Summary

- `public` → accessible everywhere
- `private` → accessible only inside same class
- `protected` → accessible in same package and subclasses
- default → accessible only in same package

---

## Interview Short Answer

> Access modifiers in Java are used to define the visibility and accessibility of classes, methods, variables, and constructors. The four main access modifiers are `public`, `private`, `protected`, and default. They help implement encapsulation and restrict unwanted access to data.

---

## One-line memory trick

- `public` = everyone can access
- `private` = only same class
- `protected` = same package + subclasses
- default = same package only

---

## Best Practice

Use:
- `private` for variables
- `public` for methods you want to expose
- `protected` for inheritance-related access
- default only when package-level access is enough

This is the most common and recommended pattern in Java.
