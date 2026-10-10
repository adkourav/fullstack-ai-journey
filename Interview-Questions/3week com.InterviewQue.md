# Fresher Interview Question Bank (Week 1 to Week 3)

This document is designed for freshers preparing for Java + HTML + CSS interviews based on the 3-week syllabus. It contains theory questions, coding questions, and short interview-ready answers.

---

# 1) Java Interview Questions

## Section A: Java Basics

### 1. What is JDK, JRE, and JVM?
**Answer:**
- JDK = Java Development Kit: includes compiler, tools, and JRE.
- JRE = Java Runtime Environment: includes JVM and libraries needed to run Java programs.
- JVM = Java Virtual Machine: executes Java bytecode and makes Java platform-independent.

**Example:**
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```
The Java source file is compiled to `.class` bytecode, and JVM runs it.

---

### 2. Why is Java platform independent?
**Answer:** Java source code is compiled into bytecode, not machine code. The JVM converts bytecode into platform-specific instructions. So the same Java program can run on Windows, Linux, and Mac.

---

### 3. What is bytecode?
**Answer:** Bytecode is a set of intermediate instructions generated after Java compilation. It is not directly executable by the machine but is executed by the JVM.

---

### 4. What are primitive data types in Java?
**Answer:** Java has 8 primitive data types:
- `byte` = 1 byte
- `short` = 2 bytes
- `int` = 4 bytes
- `long` = 8 bytes
- `float` = 4 bytes
- `double` = 8 bytes
- `char` = 2 bytes
- `boolean` = 1 bit

**Difference between primitive and reference types:**
- Primitive types store actual value.
- Reference types store memory address of an object.

---

### 5. What is type casting in Java?
**Answer:** Converting one data type into another is called type casting.

**Implicit casting:** smaller to larger type
```java
int a = 10;
double b = a; // implicit casting
```

**Explicit casting:** larger to smaller type
```java
double x = 9.8;
int y = (int) x; // explicit casting
```

**Data loss risk:** when converting `double` to `int`, decimal part is lost.

---

### 6. What is the difference between `==` and `.equals()`?
**Answer:**
- `==` compares references for objects, and values for primitives.
- `.equals()` compares content (logical value).

**Example:**
```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);       // false
System.out.println(s1.equals(s2));  // true
```

---

### 7. Why are Strings immutable in Java?
**Answer:** Strings are immutable because their values cannot be changed once created. This helps in:
- memory safety
- string pooling
- thread safety

**Example:**
```java
String s = "Hello";
s = s + " Java";
```
This creates a new string object, not modifies the original one.

---

### 8. What is the String pool?
**Answer:** The String pool is a special memory area where string literals are stored for reuse. It improves memory efficiency.

```java
String a = "Java";
String b = "Java";
System.out.println(a == b); // true
```

---

### 9. String vs StringBuilder vs StringBuffer
**Answer:**
- `String` → immutable, good for fixed data
- `StringBuilder` → mutable, faster, not thread-safe
- `StringBuffer` → mutable, thread-safe, slower than `StringBuilder`

**Example:**
```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" Program");
System.out.println(sb); // Java Program
```

---

### 10. What is method overloading?
**Answer:** Method overloading means creating multiple methods in the same class with the same name but different parameters.

```java
class MathOps {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

**Can return type alone be overloaded?**
No. Java does not consider return type alone for method overloading because it causes ambiguity.

---

### 11. What is the difference between `this` and `super`?
**Answer:**
- `this` refers to current object instance.
- `super` refers to parent class instance.

```java
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println(this.x);  // 20
        System.out.println(super.x); // 10
    }
}
```

---

### 12. What is static in Java?
**Answer:** `static` members belong to the class, not to a specific object.

```java
class Demo {
    static int count = 0;

    Demo() {
        count++;
    }
}
```

**Static methods** can be called using class name without object creation.

---

### 13. What is the difference between constructor and method?
**Answer:**
- Constructor is called when an object is created.
- Method is called later to perform a task.
- Constructor has no return type.
- Constructor name matches class name.

---

### 14. What are access modifiers in Java?
**Answer:** They define the visibility of classes, methods, and variables.
- `public` – accessible everywhere
- `private` – accessible only in same class
- `protected` – accessible in same package and subclasses
- default – accessible in same package only

---

## Section B: Java Coding Questions

### 15. Reverse a string in Java
**Code:**
```java
public class Main {
    public static void main(String[] args) {
        String s = "Java";
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println(reversed); // avaJ
    }
}
```

**Time complexity:** O(n)
**Space complexity:** O(n)

---

### 16. Check if a string is palindrome
**Code:**
```java
public class Main {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam")); // true
    }
}
```

---

### 17. Fibonacci series (iterative)
**Code:**
```java
public class Main {
    public static void fib(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        fib(10);
    }
}
```

**Time complexity:** O(n)
**Space complexity:** O(1)

---

### 18. Factorial using recursion
**Code:**
```java
public class Main {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}
```

**Time complexity:** O(n)
**Space complexity:** O(n)

---

### 19. Prime number check
**Code:**
```java
public class Main {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17)); // true
    }
}
```

**Time complexity:** O(√n)
**Space complexity:** O(1)

---

### 20. Armstrong number
**Code:**
```java
public class Main {
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // true
    }
}
```

---

### 21. Swap two numbers without a temporary variable
**Code:**
```java
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b); // 20 10
    }
}
```

---

### 22. Print pyramid pattern
**Code:**
```java
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

---

### 23. Linear search in array
**Code:**
```java
public class Main {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(linearSearch(arr, 30)); // 2
    }
}
```

**Time complexity:** O(n)
**Space complexity:** O(1)

---

### 24. What is recursion? Explain with example.
**Answer:** Recursion is when a function calls itself.

```java
public class Main {
    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
```

**Important:** A base case is required to stop recursion.

---

## Section C: OOP in Java

### 25. What are the 4 pillars of OOP?
**Answer:**
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

### 26. What is encapsulation?
**Answer:** Encapsulation means wrapping data and methods into a single class and protecting them using access modifiers.

```java
class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
```

---

### 27. What is inheritance?
**Answer:** Inheritance allows one class to inherit properties and methods from another class.

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

---

### 28. What is polymorphism?
**Answer:** Polymorphism means one form can behave in many ways.

**Types:**
- Compile-time polymorphism = method overloading
- Runtime polymorphism = method overriding

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

---

### 29. What is abstraction?
**Answer:** Abstraction hides implementation details and shows only the required functionality.

```java
abstract class Shape {
    abstract void draw();
}
```

---

### 30. Abstract class vs Interface
**Answer:**
- Abstract class can have abstract + non-abstract methods.
- Interface can only have abstract methods (before Java 8), but now can have default/static methods too.
- A class can extend only one abstract class but can implement multiple interfaces.

---

### 31. What is constructor overloading?
**Answer:** Multiple constructors in the same class with different parameter lists.

```java
class Student {
    Student() {}
    Student(String name) {}
    Student(String name, int age) {}
}
```

---

### 32. What is method overriding?
**Answer:** A child class provides a different implementation of a method already defined in the parent class.

```java
class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child");
    }
}
```

---

### 33. What is `final`, `static`, and `this`?
**Answer:**
- `final` = constant / cannot be overridden
- `static` = shared across all objects
- `this` = current object reference

---

### 34. Can a `static` method be overridden?
**Answer:** No. `static` methods are resolved at compile time, not runtime. So they cannot be overridden in the usual polymorphic sense.

---

### 35. What is the `Object` class?
**Answer:** Every class in Java inherits from `Object` by default.

Common methods:
- `toString()`
- `equals()`
- `hashCode()`
- `getClass()`

---

### 36. What is the difference between arrays and ArrayList?
**Answer:**
- Arrays have fixed size.
- ArrayList is dynamic and resizable.

```java
int[] arr = new int[5];
ArrayList<Integer> list = new ArrayList<>();
```

---

### 37. What is the difference between `length` and `length()`?
**Answer:**
- `length` is used for arrays.
- `length()` is used for strings.

```java
int[] a = {1,2,3};
System.out.println(a.length); // 3

String s = "Java";
System.out.println(s.length()); // 4
```

---

### 38. What is `==` for strings?
**Answer:** `==` compares references, not actual content. Use `.equals()` to compare value.

---

# 2) HTML Interview Questions

## Section A: HTML Basics

### 1. What is HTML?
**Answer:** HTML stands for HyperText Markup Language. It is used to create the structure of web pages.

---

### 2. What is the purpose of `<!DOCTYPE html>`?
**Answer:** It tells the browser that the document is HTML5.

---

### 3. What are the main sections of an HTML document?
**Answer:**
```html
<!DOCTYPE html>
<html>
  <head>
    <title>My Page</title>
  </head>
  <body>
    <h1>Hello</h1>
  </body>
</html>
```

---

### 4. What is the difference between `head` and `body`?
**Answer:**
- `head` contains meta information, title, link tags, scripts.
- `body` contains visible content on the webpage.

---

### 5. What is the purpose of the `meta` tag?
**Answer:** It provides metadata like character encoding and viewport settings.

```html
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
```

---

### 6. What is semantic HTML?
**Answer:** Semantic HTML uses meaningful tags like `header`, `nav`, `main`, `section`, `article`, `aside`, and `footer` to describe the content.

**Why does it matter?**
- SEO
- accessibility
- better code readability

---

### 7. Difference between block-level and inline elements?
**Answer:**
- Block elements start on new line and take full width.
  Example: `div`, `p`, `h1`, `section`
- Inline elements do not start on a new line.
  Example: `span`, `a`, `strong`, `em`

---

### 8. Difference between `div` and `span`
**Answer:**
- `div` is block-level container.
- `span` is inline container.

```html
<div>This is a block element</div>
<span>This is inline</span>
```

---

### 9. What is an `a` tag and how do links work?
**Answer:** The anchor tag creates hyperlinks.

```html
<a href="https://example.com" target="_blank">Visit</a>
```

**Relative path:** page within the same site
**Absolute path:** full URL

---

### 10. What is the purpose of `img` tag?
**Answer:** It displays an image.

```html
<img src="image.jpg" alt="A beautiful landscape" width="300">
```

**`alt` text** helps accessibility and is shown if image fails to load.

---

### 11. What is `alt` attribute and why is it important?
**Answer:** `alt` provides a text alternative for an image. It helps:
- screen readers
- accessibility
- SEO
- image loading failure

---

### 12. What is the difference between `id` and `class`?
**Answer:**
- `id` is unique for one element.
- `class` can be used by many elements.

```html
<p id="intro">Hello</p>
<p class="text">World</p>
```

---

### 13. What are lists in HTML?
**Answer:**
- `ul` = unordered list
- `ol` = ordered list
- `dl` = description list

```html
<ul>
  <li>Java</li>
  <li>HTML</li>
</ul>
```

---

### 14. What are tables in HTML?
**Answer:** Tables are created using:
- `table`
- `thead`
- `tbody`
- `tr`
- `th`
- `td`

```html
<table>
  <tr>
    <th>Name</th>
    <th>Age</th>
  </tr>
  <tr>
    <td>Amit</td>
    <td>22</td>
  </tr>
</table>
```

---

### 15. What is `colspan` and `rowspan`?
**Answer:** They allow a table cell to span multiple columns or rows.

```html
<td colspan="2">Full Width</td>
<td rowspan="2">Two Rows</td>
```

---

## Section B: Forms and Media

### 16. What is a form in HTML?
**Answer:** A form is used to collect information from users.

```html
<form>
  <label for="name">Name:</label>
  <input type="text" id="name" required>
  <button type="submit">Submit</button>
</form>
```

---

### 17. What are common input types in HTML?
**Answer:**
- `text`
- `email`
- `password`
- `number`
- `date`
- `radio`
- `checkbox`
- `file`
- `submit`

```html
<input type="email" placeholder="Enter email">
<input type="password">
<input type="checkbox">
```

---

### 18. What are `required`, `placeholder`, and `pattern`?
**Answer:**
- `required` → field must be filled
- `placeholder` → hint inside input
- `pattern` → custom regex validation

```html
<input type="text" pattern="[A-Za-z]{3,}" required>
```

---

### 19. What is `label` used for?
**Answer:** It associates a text label with an input element and improves accessibility.

```html
<label for="email">Email</label>
<input type="email" id="email">
```

---

### 20. Difference between `select`, `textarea`, and `button`
**Answer:**
- `select` = dropdown list
- `textarea` = multi-line text area
- `button` = clickable button

---

### 21. What is the purpose of `audio` and `video` tags?
**Answer:** They embed media in the web page.

```html
<audio controls src="song.mp3"></audio>
<video controls src="movie.mp4"></video>
```

---

### 22. What is `iframe`?
**Answer:** It embeds another web page inside the current page.

```html
<iframe src="https://example.com" width="600" height="400"></iframe>
```

---

### 23. What is accessibility in HTML?
**Answer:** Accessibility means making content usable for people with disabilities. It can include:
- `alt` text
- proper labels
- heading structure
- semantic tags

---

### 24. Why is semantic HTML important?
**Answer:** It improves:
- accessibility
- SEO
- maintainability
- browser understanding

---

### 25. What is the difference between `header`, `nav`, `main`, `section`, `article`, `aside`, `footer`?
**Answer:**
- `header` = page/section top area
- `nav` = navigation links
- `main` = main content
- `section` = thematic grouping
- `article` = independent content block
- `aside` = side content
- `footer` = page bottom content

---

# 3) CSS Interview Questions

## Section A: CSS Fundamentals

### 1. What is CSS?
**Answer:** CSS stands for Cascading Style Sheets. It is used to style HTML elements.

---

### 2. How many ways can CSS be applied to HTML?
**Answer:**
- Inline CSS
- Internal CSS
- External CSS

```html
<p style="color:red;">Inline</p>
<style>
  p { color: blue; }
</style>
<link rel="stylesheet" href="style.css">
```

---

### 3. What is the CSS box model?
**Answer:** Every element is treated as a box with:
- content
- padding
- border
- margin

```css
.box {
  width: 200px;
  padding: 20px;
  border: 2px solid black;
  margin: 10px;
}
```

---

### 4. What is `box-sizing: border-box`?
**Answer:** It makes the total width/height include padding and border. This is useful for predictable layouts.

---

### 5. What are CSS selectors?
**Answer:** CSS selectors target HTML elements.

Examples:
```css
p { color: red; }
.text { color: blue; }
#idname { color: green; }
```

---

### 6. Explain CSS specificity.
**Answer:** Specificity determines which CSS rule wins when multiple rules match the same element.

Order from highest to lowest:
- inline styles
- id selectors
- class selectors
- element selectors

Example:
```css
#box { color: red; }
.box { color: blue; }
p { color: green; }
```

`#box` wins.

---

### 7. What is the cascade in CSS?
**Answer:** The cascade means CSS rules are applied in a defined order, and certain rules override others based on specificity, source order, and importance.

---

### 8. What is inheritance in CSS?
**Answer:** Some CSS properties are inherited by child elements from parent elements like `color` and `font-family`.

```css
body { color: blue; }
```

---

### 9. What are the most common CSS units?
**Answer:**
- `px` = fixed pixels
- `%` = relative to parent
- `em` = relative to parent font size
- `rem` = relative to root font size
- `vh` / `vw` = viewport height/width

**Use cases:**
- `px` → fixed sizes
- `rem` → scalable typography
- `%` → flexible layout
- `vh`/`vw` → full-screen sections

---

### 10. Difference between `display: block`, `inline`, and `inline-block`
**Answer:**
- `block` → takes full width, new line
- `inline` → same line, width based on content
- `inline-block` → same line but can set width/height

---

### 11. What are `position` values in CSS?
**Answer:**
- `static` → default
- `relative` → positioned relative to itself
- `absolute` → relative to nearest positioned ancestor
- `fixed` → fixed to viewport
- `sticky` → sticks while scrolling

---

### 12. What is `z-index`?
**Answer:** It controls stacking order of positioned elements. Higher `z-index` appears on top.

---

### 13. What is the difference between `visibility: hidden` and `display: none`?
**Answer:**
- `visibility: hidden` hides the element but keeps the space reserved.
- `display: none` removes it completely from layout.

---

### 14. What is `opacity: 0`?
**Answer:** The element becomes invisible but still takes up space and remains in the layout. It is transparent, not removed.

---

### 15. What are pseudo-classes and pseudo-elements?
**Answer:**
- pseudo-class = state-based
  Example: `:hover`, `:focus`, `:nth-child(2)`
- pseudo-element = creates virtual element
  Example: `::before`, `::after`

```css
button:hover { background: blue; }
.box::before { content: "Hi"; }
```

---

## Section B: Flexbox and Grid

### 16. What is Flexbox?
**Answer:** Flexbox is a one-dimensional layout system used for arranging items in a row or column.

Common properties:
- `display: flex`
- `justify-content`
- `align-items`
- `flex-direction`
- `flex-wrap`
- `gap`

```css
.container {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 20px;
}
```

---

### 17. What is Grid?
**Answer:** Grid is a two-dimensional layout system for rows and columns.

```css
.container {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 20px;
}
```

---

### 18. Flexbox vs Grid
**Answer:**
- Flexbox is best for 1D layout (row/column)
- Grid is best for 2D layout (rows + columns)

---

### 19. What is `fr` in CSS Grid?
**Answer:** `fr` stands for flexible fraction. It allocates available free space.

```css
grid-template-columns: 1fr 1fr 1fr;
```

---

### 20. What is a media query?
**Answer:** Media queries apply CSS only under certain screen conditions.

```css
@media (max-width: 768px) {
  .container {
    flex-direction: column;
  }
}
```

---

### 21. What is responsive design?
**Answer:** Responsive design makes the website adapt to different screen sizes and devices.

Key ideas:
- viewport meta tag
- fluid widths
- media queries
- flexible images
- mobile-first design

---

### 22. What is `justify-content` vs `align-items`?
**Answer:**
- `justify-content` aligns items along the main axis
- `align-items` aligns items along the cross axis

For row flex:
- main axis = horizontal
- cross axis = vertical

---

### 23. What does `flex: 1` mean?
**Answer:** It is shorthand for:
- `flex-grow: 1`
- `flex-shrink: 1`
- `flex-basis: 0%`

This makes an item flexible and fill available space.

---

### 24. What is the difference between `em` and `rem`?
**Answer:**
- `em` is relative to parent font size
- `rem` is relative to root font size

---

### 25. What is CSS specificity with example?
**Answer:**
```css
p { color: green; }
.main p { color: blue; }
#content p { color: red; }
```
The `#content p` rule is most specific and wins.

---

# 4) DSA + Complexity Interview Questions

## 1. What is time complexity?
**Answer:** Time complexity tells how the execution time of an algorithm grows with input size.

---

## 2. What is space complexity?
**Answer:** Space complexity measures extra memory used by the algorithm, excluding input storage.

---

## 3. Big O, Omega, Theta
**Answer:**
- Big O = upper bound (worst case)
- Omega = lower bound (best case)
- Theta = tight bound (average/typical case)

---

## 4. Complexity of a single loop
**Example:**
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
**Answer:**
- Time = O(n)
- Space = O(1)

---

## 5. Complexity of nested loops
**Example:**
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);
    }
}
```
**Answer:**
- Time = O(n²)
- Space = O(1)

---

## 6. Complexity of recursive factorial
**Example:**
```java
int fact(int n) {
    if (n == 1) return 1;
    return n * fact(n - 1);
}
```
**Answer:**
- Time = O(n)
- Space = O(n)

---

## 7. Complexity of binary search
**Answer:**
- Time = O(log n)
- Space = O(1)

---

## 8. What is linear search?
**Answer:** It checks every element in the array one by one.

**Time complexity:** O(n)

---

## 9. What is array traversal?
**Answer:** Visiting each element of the array once. Example:
```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

---

## 10. What is Kadane’s Algorithm?
**Answer:** Kadane’s algorithm finds the maximum sum subarray in O(n) time.

```java
public class Main {
    static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maxSoFar = Math.max(maxSoFar, current);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArraySum(arr));
    }
}
```

**Time complexity:** O(n)
**Space complexity:** O(1)

---

# 5) Common Fresher Interview Questions (Quick Answers)

### 1. Tell me about yourself.
**Answer:**
> I am a fresher with a strong interest in Java, frontend development, and problem solving. I have learned core Java concepts, OOP, HTML, CSS, and basic data structures. I enjoy building small projects and improving my logical thinking through coding practice.

---

### 2. Why do you want to become a Java developer?
**Answer:**
> Java is widely used in enterprise software, backend systems, and large-scale applications. I like Java because it is object-oriented, secure, and used in many real-world applications.

---

### 3. Why should we hire you?
**Answer:**
> I am eager to learn, I have good fundamentals, and I combine problem-solving ability with a practical understanding of Java and web development.

---

### 4. What is the difference between front-end and back-end?
**Answer:**
- Front-end = what users see in the browser (HTML, CSS, JavaScript)
- Back-end = server-side logic and database handling (Java, Spring Boot, Node.js, etc.)

---

### 5. What is OOP?
**Answer:** Object-Oriented Programming organizes code into objects and classes to make software modular, reusable, and maintainable.

---

### 6. Why is Java called object-oriented?
**Answer:** Because it uses classes and objects, and supports encapsulation, inheritance, polymorphism, and abstraction.

---

# 6) Final Revision Checklist for Fresher Interviews

## Java
- [ ] JDK/JRE/JVM
- [ ] Primitive types
- [ ] Type casting
- [ ] String immutability
- [ ] OOP pillars
- [ ] Inheritance and polymorphism
- [ ] Method overloading/overriding
- [ ] Access modifiers
- [ ] Arrays and loops
- [ ] Recursion and patterns

## HTML
- [ ] Semantic tags
- [ ] Forms and input types
- [ ] Tables and lists
- [ ] `img`, `a`, `video`, `audio`
- [ ] Accessibility

## CSS
- [ ] Box model
- [ ] Selectors
- [ ] Specificity
- [ ] Positioning
- [ ] Flexbox and Grid
- [ ] Media queries
- [ ] Responsive design

## DSA
- [ ] Big O notation
- [ ] Arrays basics
- [ ] Linear search
- [ ] Reverse array
- [ ] Fibonacci
- [ ] Prime number
- [ ] Kadane’s algorithm

---

### Short Interview Tip
Always answer in a structured way:
1. Define concept
2. Explain with example
3. Mention use case
4. Mention complexity if it is a coding concept

---

This is a fresher-friendly interview question bank built according to your Java + HTML + CSS + DSA syllabus.
