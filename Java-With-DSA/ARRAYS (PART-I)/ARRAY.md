# Arrays – Complete Interview Notes

## 1) Definition of an Array

An array is a collection of elements of the same data type stored in contiguous memory locations. Each element is accessed using an index.

In simple words:
- It stores multiple values in one variable name.
- All elements must be of the same type.
- Indexing starts from 0 in Java, C, C++, JavaScript, etc.

Example:
```java
int[] marks = {90, 85, 78, 96};
```

Here:
- `marks[0]` = 90
- `marks[1]` = 85
- `marks[2]` = 78
- `marks[3]` = 96

---

## 2) Why Arrays Are Useful

Arrays are useful because they:
- store many values in one place
- allow fast access using index
- make processing easier with loops
- are memory-efficient for fixed-size collections
- support sorting, searching, and mathematical operations

Example use cases:
- storing marks of students
- keeping temperatures for a week
- storing inventory items in a shop
- storing scores in a game

---

## 3) Real-Life Example

Imagine you want to store marks of 5 students:

```java
int[] marks = {78, 88, 92, 64, 81};
```

This is conceptually like:

```text
Index:    0    1    2    3    4
Value:   78   88   92   64   81
```

A student’s marks can be found directly using their position.

---

## 4) Basic Array Diagram

### 1D Array

```text
+-------------------------------+
| Array name: marks             |
+-------------------------------+
| index | value                 |
|  0    |  78                   |
|  1    |  88                   |
|  2    |  92                   |
|  3    |  64                   |
|  4    |  81                   |
+-------------------------------+
```

### Memory Layout

```text
Memory addresses:
 1000   1004   1008   1012   1016
  |      |      |      |      |
  78     88     92     64     81
  marks[0] marks[1] marks[2] marks[3] marks[4]
```

This shows that array elements are stored in contiguous memory blocks.

---

## 5) Properties of Arrays

1. Fixed Size
   - Once created, the size cannot be changed.
   - Example: `int[] arr = new int[5];` gives exactly 5 slots.

2. Same Data Type
   - All values in an array must be of the same type.
   - Example: all `int`, all `double`, all `String`.

3. Indexed Access
   - Every element has an index.
   - Index always starts from 0.

4. Contiguous Memory Allocation
   - Elements are stored one after another.

5. Random Access
   - You can directly access any element using its index.
   - Example: `arr[3]` is available in constant time.

---

## 6) Syntax in Java

### Declaration
```java
int[] numbers;
```

### Allocation
```java
numbers = new int[5];
```

### Initialization
```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Accessing elements
```java
System.out.println(numbers[0]); // 10
System.out.println(numbers[2]); // 30
```

### Updating element
```java
numbers[1] = 25;
```

### Length of array
```java
System.out.println(numbers.length); // 5
```

---

## 7) Types of Arrays

### A) One-Dimensional Array
A single list or sequence of elements.

```java
int[] arr = {1, 2, 3, 4, 5};
```

Diagram:
```text
[1] [2] [3] [4] [5]
```

This is the most common type.

---

### B) Two-Dimensional Array
An array of arrays, often used to represent rows and columns like a matrix.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Diagram:
```text
[1][2][3]
[4][5][6]
[7][8][9]
```

Accessing element:
```java
System.out.println(matrix[1][2]); // 6
```

Use cases:
- matrix operations
- chessboard boards
- image pixels
- tables and grids

---

### C) Multi-Dimensional Array
Arrays with more than two dimensions.

```java
int[][][] cube = new int[2][3][4];
```

Used in:
- 3D graphics
- scientific computing
- advanced simulations

---

### D) Jagged Array
A jagged array is an array of arrays where each row can have a different length.

```java
int[][] jagged = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```

Diagram:
```text
row 0 -> [1, 2]
row 1 -> [3, 4, 5]
row 2 -> [6]
```

This is useful when row lengths are not uniform.

---

## 8) Array Operations

### 1. Traversal
Visiting all elements one by one.

```java
int[] arr = {10, 20, 30, 40};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

---

### 2. Insertion
Adding an element at a particular index.

But in Java, arrays are fixed in size, so insertion is not direct unless we create a new array.

Example:
```java
int[] arr = {10, 20, 30};
int[] newArr = new int[arr.length + 1];

for (int i = 0; i < arr.length; i++) {
    newArr[i] = arr[i];
}
newArr[3] = 40;
```

---

### 3. Deletion
Removing an element from an array means shifting the remaining elements left.

```java
int[] arr = {10, 20, 30, 40};
int indexToDelete = 1;

for (int i = indexToDelete; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}
```

This reduces the effective size conceptually.

---

### 4. Searching
Finding whether an element exists.

#### Linear Search
```java
int[] arr = {12, 5, 8, 20, 3};
int target = 8;
boolean found = false;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        found = true;
        break;
    }
}
```

#### Binary Search
Works only on sorted arrays.

```java
int[] arr = {2, 5, 8, 12, 20, 25};
int low = 0, high = arr.length - 1;
int target = 20;

while (low <= high) {
    int mid = low + (high - low) / 2;
    if (arr[mid] == target) {
        System.out.println("Found at index: " + mid);
        break;
    } else if (arr[mid] < target) {
        low = mid + 1;
    } else {
        high = mid - 1;
    }
}
```

---

### 5. Sorting
Arranging array elements in ascending or descending order.

```java
int[] arr = {5, 2, 9, 1, 7};
java.util.Arrays.sort(arr);
System.out.println(java.util.Arrays.toString(arr));
```

Output:
```text
[1, 2, 5, 7, 9]
```

---

## 9) Time Complexity of Common Operations

For a one-dimensional array:

| Operation | Time Complexity |
|-----------|-----------------|
| Access by index | O(1) |
| Search (linear) | O(n) |
| Insert at end | O(1) if array has free space |
| Insert in middle | O(n) |
| Delete element | O(n) |
| Sort | O(n log n) average |

Important interview note:
- Access by index is very fast.
- Insert/delete in middle is expensive because elements shift.

---

## 10) Array vs Other Data Structures

### Array vs List
- Array has fixed size.
- List can grow dynamically.

### Array vs Stack
- Stack follows LIFO.
- Array is random access based on index.

### Array vs Queue
- Queue follows FIFO.
- Array may be used to implement queue with front and rear indices.

### Array vs LinkedList
- Arrays provide fast index access.
- LinkedList is better for frequent insertions/deletions.

---

## 11) Advantages of Arrays

- Fast random access
- Simple and easy to understand
- Memory efficient for fixed-size data
- Good for loops and mathematical operations
- Easy to sort and search

---

## 12) Disadvantages of Arrays

- Fixed size (cannot resize easily)
- Insertion and deletion are costly
- Wastage of memory if the size is larger than needed
- Only same-type data can be stored
- Not flexible for dynamic data

---

## 13) Common Interview Questions on Arrays

### Q1. What is an array?
Answer:
An array is a fixed-size collection of elements of the same data type stored contiguously in memory and accessed using index.

### Q2. What is the difference between array and ArrayList?
Answer:
- Array has fixed size and is faster for indexed access.
- ArrayList is dynamic and resizable.

### Q3. What is the time complexity of array access?
Answer:
O(1), because array index directly maps to the memory location.

### Q4. Why is insertion/deletion costly in arrays?
Answer:
Because after insertion or deletion, elements must be shifted to maintain contiguous arrangement.

### Q5. Can arrays store different data types?
Answer:
Not in Java primitive arrays, because all elements must be of the same type. But object arrays can store references to different objects if declared as a common supertype.

### Q6. What is a 2D array?
Answer:
A 2D array is an array of arrays used to represent rows and columns, like a matrix.

### Q7. What is a jagged array?
Answer:
A jagged array is an array where each row can have different lengths.

---

## 14) Java-Specific Important Points

### Array Initialization
```java
int[] a = new int[3];
```
This creates an array of size 3 with default values:
```text
0, 0, 0
```

### Printing array
```java
int[] a = {1, 2, 3, 4};
System.out.println(Arrays.toString(a));
```

### Array length
```java
System.out.println(a.length);
```

### Array index out of bounds
This is a common error:
```java
int[] a = {10, 20, 30};
System.out.println(a[5]); // throws ArrayIndexOutOfBoundsException
```

---

## 15) Important Interview Tips

- Always explain with an example.
- Mention index starts from 0.
- Mention fixed-size nature.
- Discuss contiguous memory and random access.
- Explain time complexity clearly.
- Compare arrays with ArrayList/LinkedList when asked.
- Use diagrams when possible to show memory layout.

---

## 16) Short Interview-Ready Summary

An array is a collection of same-type values stored in contiguous memory locations and accessed by index. It offers fast access, fixed size, and efficient memory use. While arrays are excellent for indexed access and simple data storage, they are less flexible than dynamic data structures because insertion and deletion are costly and size cannot be changed easily.

---

## 17) Example Program

```java
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] marks = {78, 88, 92, 64, 81};

        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("First mark: " + marks[0]);
        System.out.println("Length: " + marks.length);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
    }
}
```

---

## 18) Final Quick Revision

### Array =
A fixed-size collection of same-type elements stored sequentially in memory.

### Key Points =
- Index starts from 0
- Same data type
- Fixed size
- Contiguous memory
- Fast access using index
- Good for loops and math operations

### Best Use Cases =
- storing scores
- matrix data
- tabular data
- image pixels
- list of fixed items

---

If you want, I can also make this into:
1. a very short 1-page revision sheet
2. a Java-specific notes version
3. a interview Q&A version with 20 most asked questions and answers
4. a colorful handwritten-style notes version
