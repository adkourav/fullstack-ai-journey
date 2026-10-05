# Java Interview Questions: Core Concepts and Collections

These notes give a short interview answer first, then a simple explanation and example. The sections build from Java fundamentals to object-oriented programming, exceptions, and collections.

## Part 1: Java Fundamentals

### 1. What is the difference between JDK, JRE, and JVM?

- **JVM (Java Virtual Machine):** Runs Java bytecode.
- **JRE (Java Runtime Environment):** The JVM plus libraries and files needed to run Java applications.
- **JDK (Java Development Kit):** The tools used to develop Java programs, including the compiler, plus the runtime components.

```text
JDK = development tools + runtime
Runtime = JVM + Java libraries
```

For example, `javac` compiles source code and `java` launches a program. This is the conceptual relationship; modern Java distributions do not always provide a separately installable JRE.

### 2. Is Java platform-independent? What is bytecode?

Java is **portable across platforms** because `javac` compiles source code into bytecode, and a compatible JVM for each operating system can run that bytecode. The JVM itself is platform-specific.

```text
Hello.java --javac--> Hello.class (bytecode) --Windows/Linux/macOS JVM--> run
```

**Bytecode** is the intermediate instruction format stored in `.class` files. It is not native machine code; the JVM interprets or compiles it for the host platform. This is the idea behind “Write Once, Run Anywhere,” subject to compatible Java versions and platform-dependent code or libraries.

### 3. What are the eight primitive types and their sizes? Primitive vs reference?

| Primitive | Size | Basic purpose |
|---|---:|---|
| `byte` | 8 bits | Small whole numbers |
| `short` | 16 bits | Whole numbers |
| `int` | 32 bits | Common whole numbers |
| `long` | 64 bits | Large whole numbers |
| `float` | 32 bits | Single-precision decimal values |
| `double` | 64 bits | Double-precision decimal values |
| `char` | 16 bits | One UTF-16 code unit |
| `boolean` | Not specified exactly by the language | `true` or `false` |

`boolean` has two possible values, but Java does not promise that it occupies exactly one bit or one byte in memory. `char` is a UTF-16 code unit, so one `char` does not represent every Unicode character by itself.

```java
int count = 12;
double price = 19.95;
char grade = 'A';
boolean active = true;
```

| Primitive | Reference type |
|---|---|
| Holds a value such as `12` or `true`. | Holds a reference to an object, such as a `String`, array, or `ArrayList`. |
| Cannot be `null`. | Can be `null`. |
| Has no methods of its own. | Objects provide methods. |
| Examples: `int`, `char`, `boolean`. | Examples: `String`, `int[]`, `Integer`. |

Wrapper types such as `Integer` are reference types; Java can convert between many wrappers and primitives through boxing and unboxing.

### 4. What is type casting? Implicit vs explicit, and where can data loss happen?

**Casting** converts a value from one compatible type to another.

**Widening (usually implicit):** Converts to a type that can represent a broader range.

```java
int whole = 25;
double decimal = whole; // 25.0
```

**Narrowing (explicit):** Converts to a smaller or less precise type, so Java requires a cast.

```java
double amount = 9.8;
int wholeAmount = (int) amount; // 9; decimal part is discarded

int large = 130;
byte small = (byte) large; // overflow; result is -126
```

Data loss can occur when a decimal part is discarded, an integer overflows the destination range, or a floating-point conversion loses precision. Casting an object reference down the class hierarchy can instead fail at runtime with `ClassCastException` if the object is not that type.

### 5. What is the difference between `==` and `.equals()`?

- For primitives, `==` compares values.
- For references, `==` checks whether both references point to the same object.
- `.equals()` checks logical/content equality when the class implements it that way. `String` does.

```java
String first = new String("Java");
String second = new String("Java");

System.out.println(first == second);      // false: different objects
System.out.println(first.equals(second)); // true: same text
```

Use `.equals()` to compare String contents. For a value that could be `null`, this form avoids a null-pointer error:

```java
if ("Java".equals(input)) {
	System.out.println("Match");
}
```

### 6. Why are Strings immutable? What is the String pool?

**Immutable** means an object cannot be changed after it is created. A String operation that appears to change text returns a new String; it does not change the original.

```java
String text = "Java";
text.concat(" SE");
System.out.println(text); // Java: result was not assigned
text = text.concat(" SE");
System.out.println(text); // Java SE
```

Immutability helps make Strings safe to share, predictable as map keys, and suitable for security-sensitive values. It also means multiple references can safely use the same pooled literal.

The **String constant pool** keeps canonical String values so equal literals can share a String object:

```java
String a = "cat";
String b = "cat";
System.out.println(a == b); // true: both refer to the pooled literal
```

Do not use `==` for content comparison; use `.equals()`.

### 7. `String` vs `StringBuilder` vs `StringBuffer`

| Type | Mutable? | Thread behavior | Typical use |
|---|---|---|---|
| `String` | No | Safe to share because content cannot change | Fixed text or text changed infrequently |
| `StringBuilder` | Yes | Not synchronized | Repeated edits in one thread; usually the default builder |
| `StringBuffer` | Yes | Its methods are synchronized | Shared mutable text when synchronized operations are specifically needed |

```java
StringBuilder message = new StringBuilder("Hello");
message.append(" ").append("Java");
System.out.println(message); // Hello Java
```

Repeated `String` concatenation may create many temporary objects. Use a builder for repeated changes, especially inside loops. Synchronization on `StringBuffer` does not automatically make a larger multi-step operation atomic.

### 8. What is method overloading? Can methods differ only by return type?

**Overloading** means using the same method name with different parameter lists in the same class. The list can differ by parameter count, types, or order.

```java
class Calculator {
	int add(int a, int b) { return a + b; }
	double add(double a, double b) { return a + b; }
	int add(int a, int b, int c) { return a + b + c; }
}
```

Overloading is selected at compile time. **Return type alone cannot distinguish overloads** because a call such as `add(1, 2);` would not tell the compiler which return type to choose. The method name and parameter types form the relevant signature for overloading.

### 9. How are arrays stored in memory? Array vs `ArrayList`

An array is an object with a fixed length. It is created at runtime, normally on the heap. A primitive array holds primitive values; an object array holds references to objects. The exact physical layout is JVM-implementation-specific.

| Array | `ArrayList` |
|---|---|
| Fixed length after creation | Resizable collection |
| Can store primitives directly, e.g. `int[]` | Stores objects/wrappers, e.g. `ArrayList<Integer>` |
| Use `array[index]` | Use `list.get(index)` and `list.set(index, value)` |
| Has `length` field | Has `size()` method |

```java
int[] scores = new int[3];
ArrayList<Integer> scoreList = new ArrayList<>();
scoreList.add(95);
```

Choose an array for a fixed number of elements or primitive storage. Choose `ArrayList` when the number of elements changes and convenient collection operations are useful.

### 10. Why is array size fixed? What happens on index out of bounds?

An array's length is set when it is created so its storage and indexing remain a fixed structure. To change capacity, create a new array and copy elements, or use a resizable collection such as `ArrayList`.

Valid indexes are from `0` through `array.length - 1`. An invalid index causes a runtime `ArrayIndexOutOfBoundsException` (a kind of `IndexOutOfBoundsException`).

```java
int[] values = {10, 20};
System.out.println(values[2]); // throws ArrayIndexOutOfBoundsException
```

### 11. `String s = "abc"` vs `new String("abc")`: how many objects?

```java
String first = "abc";
String second = new String("abc");
```

The literal refers to the pooled String. `new String(...)` explicitly creates a separate String object. In the usual explanation, there is one pooled String object for the literal and one separate object created by `new`. The pooled object may already exist, so it is not necessarily newly allocated at this line.

```java
String first = "abc";
String second = new String("abc");
System.out.println(first == second); // false
System.out.println(first.equals(second)); // true
```

Prefer a literal unless a distinct String object is specifically required.

### 12. What does `intern()` do? How does the String constant pool work?

`intern()` returns the canonical pooled String with the same contents. If the pool already has an equal String, it returns that reference. Otherwise, the String is added as the canonical representation.

```java
String created = new String("hello");
String pooled = created.intern();
String literal = "hello";

System.out.println(pooled == literal); // true
```

String literals are pooled automatically. `intern()` can be useful when many repeated strings need canonical references, but it is not a replacement for `.equals()` and should not be used indiscriminately for many unique, dynamic values.

### 13. Is Java pass-by-value or pass-by-reference?

Java is **always pass-by-value**. A method receives a copy of the argument value. For an object, that value is a copy of the reference, so the method can mutate the shared object but cannot make the caller's variable refer to a different object.

```java
class Box {
	int value;
	Box(int value) { this.value = value; }
}

class PassByValueExample {
	static void changeNumber(int number) { number = 99; }

	static void changeBox(Box box) {
		box.value = 99;
		box = new Box(500);
	}

	public static void main(String[] args) {
		int number = 10;
		changeNumber(number);
		System.out.println(number); // 10

		Box box = new Box(10);
		changeBox(box);
		System.out.println(box.value); // 99
	}
}
```

The mutation is visible because both references identify the same object. Reassigning the method parameter changes only its local copy of the reference.

### 14. `length` (array), `length()` (String), and `size()` (Collection)

| Expression | Used with | Meaning |
|---|---|---|
| `array.length` | Arrays | Number of slots; a field, so no parentheses |
| `text.length()` | `String` | Number of UTF-16 code units; a method |
| `collection.size()` | Collections such as `List` and `Set` | Number of elements; a method |

```java
int[] numbers = {1, 2, 3};
String word = "Java";
ArrayList<Integer> items = new ArrayList<>();

System.out.println(numbers.length); // 3
System.out.println(word.length());  // 4
System.out.println(items.size());   // 0
```

A String's UTF-16 length can differ from the number of user-perceived Unicode characters.

## Part 2: Object-Oriented Programming

### 15. What are the four pillars of OOP?

The four pillars are **encapsulation, inheritance, polymorphism, and abstraction**.

**Encapsulation** bundles data and methods, and controls access to data. A common pattern is private fields with public methods:

```java
class BankAccount {
	private double balance;
	public void deposit(double amount) {
		if (amount > 0) balance += amount;
	}
	public double getBalance() { return balance; }
}
```

**Inheritance** lets a class reuse and specialize another class with `extends`:

```java
class Animal { void eat() { System.out.println("Eating"); } }
class Dog extends Animal { void bark() { System.out.println("Bark"); } }
```

**Polymorphism** lets a parent type refer to different child objects, whose overridden methods behave according to their actual object type:

```java
Animal pet = new Dog();
pet.eat();
```

**Abstraction** exposes what an object does while hiding implementation details. An interface is one way to define that contract:

```java
interface Payment { void pay(double amount); }
```

Together, these ideas help organize code, hide implementation details, and make implementations replaceable.

### 16. Constructor vs method. Can a constructor be `final`, `static`, or `abstract`?

| Constructor | Method |
|---|---|
| Name must match the class name | Can have any valid method name |
| Has no return type, not even `void` | Declares a return type or `void` |
| Initializes a new object | Performs an operation; may be called after construction |
| Runs when an object is created with `new` | Runs when explicitly invoked |
| Is not inherited or overridden | Can be inherited and may be overridden, subject to rules |

A constructor **cannot** be `final`, `static`, or `abstract`: constructors are not overridden, initialize a particular object, and must perform initialization.

```java
class User {
	private final String name;
	User(String name) { this.name = name; } // constructor
	String getName() { return name; }       // method
}

### 17. What is constructor chaining? `this()` vs `super()`

**Constructor chaining** means one constructor calls another constructor to reuse initialization code.

- `this(...)` calls another constructor in the same class.
- `super(...)` calls a constructor in the parent class.

```java
class Person {
	String name;
	Person(String name) { this.name = name; }
}

class Student extends Person {
	int year;
	Student(String name) { this(name, 1); }
	Student(String name, int year) {
		super(name);
		this.year = year;
	}
}
```

An explicit `this(...)` or `super(...)` call must be the first statement in its constructor, and one constructor cannot use both directly. If there is no explicit parent call, Java inserts `super()` when possible; the parent must have an accessible no-argument constructor.

### 18. Method overloading vs method overriding

| Feature | Overloading | Overriding |
|---|---|---|
| Meaning | Same method name, different parameter list | Child supplies a new implementation of an inherited instance method |
| Where | Usually in the same class; can also occur across inherited methods | Parent and child classes |
| Parameters | Must differ | Must match the overridden method's parameter types |
| Return type | Can differ if parameter lists differ, subject to return rules | Same or covariant reference return type |
| Binding | Compile-time selection from declared types and arguments | Runtime selection from actual object type |
| Inheritance needed? | No | Yes |
| Access | Any valid overload visibility | Cannot reduce inherited method visibility |
| `static` methods | Can be overloaded | Are hidden, not overridden |
| `final` methods | Can be overloaded using another parameter list | Cannot be overridden |
| Annotation | Not required | `@Override` is recommended and compiler-checked |

```java
class Printer {
	void print(int value) { }
	void print(String value) { } // overload
}

class Parent { void speak() { System.out.println("Parent"); } }
class Child extends Parent {
	@Override
	void speak() { System.out.println("Child"); } // override
}
```

### 19. What is runtime polymorphism / dynamic method dispatch?

Runtime polymorphism occurs when an overridden **instance method** is called through a parent-class or interface reference. The JVM selects the implementation using the actual object's class at runtime.

```java
class Animal {
	void sound() { System.out.println("Animal sound"); }
}
class Cat extends Animal {
	@Override
	void sound() { System.out.println("Meow"); }
}

Animal animal = new Cat();
animal.sound(); // Meow
```

The compiler checks that `sound()` exists on the declared type `Animal`. At runtime, dispatch finds the override on the actual `Cat` object. Fields and static methods do not use this same overriding behavior.

### 20. Abstract class vs interface: when do you choose each?

| Abstract class | Interface |
|---|---|
| Use when related classes share state or common implementation | Use for a capability or contract shared by possibly unrelated classes |
| Can have instance fields, constructors, abstract and concrete methods | Has no constructors or per-instance fields; can have abstract, `default`, `static`, and private methods |
| A class can extend only one class | A class can implement multiple interfaces |
| Can use suitable access modifiers | Abstract interface methods are public; interface constants are implicitly `public static final` |

```java
abstract class Appliance {
	private final String model;
	Appliance(String model) { this.model = model; }
	String getModel() { return model; }
	abstract void turnOn();
}

interface Rechargeable {
	void charge();
}
```

Choose an abstract class for shared base state and implementation. Choose an interface for a role or capability that different class hierarchies can implement.

### 21. Can an interface have a constructor or method bodies?

An interface **cannot have a constructor** because it cannot be instantiated directly. It can contain method bodies in these forms:

```java
interface Logger {
	void log(String message); // implicitly public abstract

	default void logTwice(String message) {
		log(message);
		log(message);
	}

	static Logger console() {
		return message -> System.out.println(message);
	}

	private void validate(String message) {
		if (message == null) throw new IllegalArgumentException();
	}
}
```

`default` methods are inherited instance behavior, `static` methods belong to the interface, and `private` methods are helpers for other interface methods. Private interface methods are available from Java 9; default and static interface methods were added in Java 8.

### 22. Why does Java not support multiple inheritance for classes? How do interfaces help?

Java allows a class to extend only one class, avoiding ambiguous inherited state and implementations. If two parent classes both supplied a different `start()` implementation, a child would need a rule for which one to inherit; this is commonly called the **diamond problem**.

A class can implement multiple interfaces because interfaces define contracts that the class implements:

```java
interface Printable { void print(); }
interface Scannable { void scan(); }

class Machine implements Printable, Scannable {
	public void print() { System.out.println("Printing"); }
	public void scan() { System.out.println("Scanning"); }
}
```

If interfaces provide conflicting `default` methods with the same signature, the implementing class must resolve the conflict by overriding the method or explicitly selecting an inherited default.

### 23. What are the four access modifiers?

| Modifier | Same class | Same package | Subclass in another package | Other package, not subclass |
|---|---:|---:|---:|---:|
| `private` | Yes | No | No | No |
| *(package-private; no keyword)* | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes, subject to subclass access rules | No |
| `public` | Yes | Yes | Yes | Yes |

Across packages, a subclass can access an inherited protected member through subclass access, but cannot freely access it through an arbitrary parent-class object. Top-level classes can be `public` or package-private, not `private` or `protected`.

### 24. What are `static` blocks, variables, and methods? Can static methods be overridden?

- A **static variable** belongs to the class and is shared by its instances.
- A **static method** belongs to the class and can be called without an instance.
- A **static initialization block** runs when the class is initialized, commonly to set up class-level state.

```java
class Counter {
	static int total;
	static {
		total = 0;
	}
	Counter() { total++; }
	static int getTotal() { return total; }
}

System.out.println(Counter.getTotal());
```

Static methods are **not overridden** because they are resolved from the declared class/reference context, not the runtime object's type. A child can declare a static method with the same signature; this is called **method hiding**.

## Part 3: Exceptions

### 25. Checked vs unchecked exceptions

| Checked exception | Unchecked exception |
|---|---|
| Compiler requires handling or declaration with `throws` | Compiler does not require handling or declaration |
| Subclass of `Exception`, excluding `RuntimeException` subclasses | `RuntimeException` subclasses; `Error` is also unchecked but represents serious JVM/system problems |
| Examples: `IOException`, `SQLException` | Examples: `NullPointerException`, `IllegalArgumentException`, `IndexOutOfBoundsException` |
| Often a recoverable external condition | Often invalid input, a programming mistake, or a violated assumption |

```java
// Checked: catch it or declare `throws IOException`.
try (FileReader reader = new FileReader("notes.txt")) {
	System.out.println(reader.read());
} catch (IOException exception) {
	System.out.println("Could not read the file");
}

// Unchecked: compiler does not require a catch.
int denominator = 0;
int result = 10 / denominator; // ArithmeticException at runtime
```

Use checked exceptions when callers can reasonably recover and should be required to consider the condition. Use unchecked exceptions for programming errors or invalid method arguments.

### 26. `throw` vs `throws` vs `Throwable`; can `finally` be skipped?

- **`throw`** actively throws one exception object inside a method: `throw new IllegalArgumentException("bad input");`
- **`throws`** declares possible exceptions in a method signature: `void read() throws IOException { ... }`
- **`Throwable`** is the root type for Java objects that can be thrown. Its main branches are `Exception` and `Error`.

```java
static void checkAge(int age) {
	if (age < 0) {
		throw new IllegalArgumentException("age cannot be negative");
	}
}
```

`finally` normally runs after `try`/`catch`, including when the method returns or throws. It can be skipped if the process or JVM terminates first, for example with `System.exit(...)`, a forced process kill, or a JVM crash. Avoid returning or throwing from `finally`, because it can hide an earlier return or exception. For resource cleanup, prefer **try-with-resources**.

| Keyword | Meaning |
|---|---|
| `final` | Prevents reassignment, overriding, or inheritance depending on what it modifies |
| `finally` | A cleanup block associated with `try`/`catch` |
| `finalize()` | A legacy garbage-collection callback; deprecated and unreliable, so do not use it for cleanup |

## Part 4: Collections and Ordering

### 27. `ArrayList` vs `LinkedList`

| Feature | `ArrayList` | `LinkedList` |
|---|---|---|
| Internal structure | Resizable array | Doubly linked nodes |
| Read by index | `O(1)` | `O(n)` traversal |
| Append at end | Amortized `O(1)` | `O(1)` when adding at the end |
| Insert/remove in middle | `O(n)` because later elements shift | `O(1)` once the target node/iterator position is reached; finding it is `O(n)` |
| Memory/cache behavior | Compact and cache-friendly | Extra links per node; less cache-friendly |
| Good choice | Frequent indexed reads and general-purpose lists | Frequent end operations or edits at an existing iterator position |

```java
List<String> names = new ArrayList<>();
names.add("Ava");
String first = names.get(0);
```

Use `ArrayList` as the usual default for a list. Choose `LinkedList` when its end-operation or iterator behavior is specifically useful. For queue/deque behavior, also consider `ArrayDeque`.

### 28. How does `HashMap` work internally?

A `HashMap<K, V>` stores entries in an internal bucket array. These details describe common OpenJDK implementations, especially Java 8 and later; they are not guarantees of the Java language specification.

1. **Hash:** The map gets the key's `hashCode()` and spreads its bits to help distribute hashes.
2. **Bucket:** The hash helps choose a bucket index. Different keys can land in the same bucket.
3. **Collision:** A bucket stores multiple entries, commonly in a linked list. The map uses the hash and `equals()` to find a matching key.
4. **Treeification:** In OpenJDK, a heavily populated bucket can become a balanced tree at around 8 entries, provided the table capacity is at least 64. With a smaller table, the map generally resizes first. Tree bins can later become lists again at a lower threshold.
5. **Resize:** The default load factor is `0.75`. When entries exceed `capacity * loadFactor`, the table grows and entries are redistributed. Resizing takes work, so a suitable initial capacity can help when the expected size is known.

```java
Map<String, Integer> ages = new HashMap<>();
ages.put("Mina", 25);
int age = ages.get("Mina");
```

Keys need consistent `equals()` and `hashCode()` implementations: equal keys must have equal hash codes. Do not mutate a key in a way that changes its equality or hash code while it is in the map. `HashMap` allows one `null` key and `null` values, and does not guarantee iteration order.

Average `get`/`put` is typically `O(1)`; heavy collisions can make operations slower. Tree bins improve worst-case behavior for suitably comparable keys.

### 29. `HashMap` vs `HashSet` vs `TreeMap` vs `LinkedHashMap`

| Type | Stores | Ordering | Typical operation cost | Use it when |
|---|---|---|---|---|
| `HashMap<K,V>` | Key/value pairs | No guaranteed order | Average `O(1)` lookup/insert | Fast lookup by key; order is unimportant |
| `HashSet<E>` | Unique elements | No guaranteed order | Average `O(1)` contains/add | You need uniqueness and fast membership checks |
| `TreeMap<K,V>` | Key/value pairs | Sorted by key | `O(log n)` lookup/insert | You need sorted keys or range queries |
| `LinkedHashMap<K,V>` | Key/value pairs | Predictable insertion order by default; can use access order | Average `O(1)` lookup/insert | You need predictable iteration or an LRU-cache building block |

```java
Map<String, Integer> fastLookup = new HashMap<>();
Set<String> uniqueNames = new HashSet<>();
Map<String, Integer> sortedKeys = new TreeMap<>();
Map<String, Integer> insertionOrder = new LinkedHashMap<>();
```

### 30. `Comparable` vs `Comparator`

Both define ordering for sorting and sorted collections.

| `Comparable<T>` | `Comparator<T>` |
|---|---|
| Defines the class's natural/default order | Defines an external or alternative order |
| Implemented by the class being compared | Created separately or supplied as a lambda |
| Implements `compareTo(T other)` | Implements `compare(T first, T second)` |
| Usually one natural order | Many orderings can be defined |

**Using `Comparable`:**

```java
class Employee implements Comparable<Employee> {
	private final int id;
	private final String name;
	private final int age;

	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() { return name; }
	public int getAge() { return age; }

	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}
}

Collections.sort(employees); // natural order: employee ID
```

**Using `Comparator`:**

```java
employees.sort(Comparator.comparingInt(Employee::getAge));
employees.sort(Comparator.comparing(Employee::getName)
						  .thenComparingInt(Employee::getAge));
```

Use `Comparable` when the class has one sensible natural order. Use `Comparator` for alternate sort orders or when the class cannot be changed. For sorted sets and maps, comparisons should be consistent with equality when possible, or distinct objects may be treated as the same sort key.

## Fast Interview Recap

- Java source is compiled to bytecode; a platform-specific JVM runs it.
- Use `.equals()` for String contents; Strings are immutable.
- Java passes every argument by value, including copied object references.
- Overloading is compile-time selection; overriding is runtime instance-method dispatch.
- Prefer interfaces for capabilities and abstract classes for shared state and behavior.
- Prefer `ArrayList` for general-purpose indexed lists and `HashMap` for fast key lookup.
- Use `Comparable` for natural order and `Comparator` for alternate orderings.
```
