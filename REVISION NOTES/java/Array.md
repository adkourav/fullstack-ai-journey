# Arrays in Java - Quick Revision Notes

## 1. Short and Simple Definition
An array is a collection of elements of the same type stored in memory in order, and each element is accessed using an index.

## 2. Types and Their Definitions

### 1) One-Dimensional Array
A 1D array stores elements in a single list.

Use case: Store marks of 5 students.

Syntax:
```java
int[] marks = {78, 88, 92, 64, 81};
System.out.println(marks[0]); // 78
```

### 2) Two-Dimensional Array
A 2D array stores data in rows and columns, like a matrix.

Use case: Store marks of students in multiple subjects.

Syntax:
```java
int[][] matrix = {
    {90, 85, 88},
    {80, 75, 90}
};

System.out.println(matrix[0][1]); // 85
```

### 3) Jagged Array
A jagged array is an array of arrays where each row can have different length.

Use case: Store rows with different numbers of columns.

Syntax:
```java
int[][] jagged = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```

## 3. Use Cases
- Store marks of students
- Store temperatures for a week
- Save names in a list
- Store matrix or table data
- Store game scores

## 4. Syntax

### Declaration
```java
int[] numbers;
```

### Initialization
```java
int[] numbers = {10, 20, 30, 40};
```

### Accessing value
```java
System.out.println(numbers[2]); // 30
```

### Updating value
```java
numbers[1] = 25;
```

### Length
```java
System.out.println(numbers.length);
```

## 5. Real-Life Example
Suppose a school wants to store marks of 5 students.

```java
int[] marks = {78, 88, 92, 64, 81};
System.out.println("First student marks: " + marks[0]);
```

This helps us easily access each student’s marks by index.

## Quick Revision Points
- Array = collection of same-type values
- Index starts from 0
- Fixed size
- Fast access using index
- Good for loops and data processing
- Not good for frequent insertion and deletion

## Important Things to Remember
- All elements in an array must have the same type.
- Size is fixed once created.
- Use loops to access all elements.
- `ArrayIndexOutOfBoundsException` occurs if index is out of range.
