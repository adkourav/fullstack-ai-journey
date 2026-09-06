 # Loops in Java

 ## Definition

 A **loop** is a control-flow statement that repeatedly executes a block of code while a condition is `true` or for each item in a collection. Loops reduce repeated code and are useful when the same operation must be performed multiple times.

 ### Why are loops used?

 - To repeat a task without writing the same statements again.
 - To process numbers, arrays, strings, and collections.
 - To continue execution until a condition changes.
 - To traverse every element in a data structure.

 ## Important Terms

 | Term | Meaning |
 |---|---|
 | Initialization | Gives the loop variable its starting value | 
 | Condition | Decides whether the loop should continue | 
 | Iteration | One complete execution of the loop body | 
 | Update | Changes the loop variable after an iteration | 
 | Loop body | Statements repeated by the loop | 
 | Infinite loop | A loop whose condition never becomes `false` | 

 ## General Loop Flow

 ```mermaid
 flowchart TD
	 A[Start] --> B[Initialize]
	 B --> C{Condition true?}
	 C -- Yes --> D[Execute loop body]
	 D --> E[Update loop variable]
	 E --> C
	 C -- No --> F[Continue after loop]
	 F --> G[End]
 ```

 ## Types of Loops in Java

 Java mainly provides these loops:

 1. `while` loop
 2. `do-while` loop
 3. `for` loop
 4. Enhanced `for` loop, also called the `for-each` loop

 A loop can also be **nested**, meaning one loop is written inside another loop.

 ---

 ## 1. `while` Loop

 A `while` loop checks its condition before executing the body. Therefore, it may execute zero or more times.

 ### Syntax

 ```java
 initialization;

 while (condition) {
	 // statements
	 update;
 }
 ```

 ### Example

 ```java
 int number = 1;

 while (number <= 5) {
	 System.out.println(number);
	 number++;
 }
 ```

 **Output:**

 ```text
 1
 2
 3
 4
 5
 ```

 Use a `while` loop when the number of repetitions is not known in advance.

 ---

 ## 2. `do-while` Loop

 A `do-while` loop executes its body first and checks the condition afterward. Therefore, it always executes at least once.

 ### Syntax

 ```java
 do {
	 // statements
 } while (condition);
 ```

 Notice the semicolon after the condition.

 ### Example

 ```java
 int number = 6;

 do {
	 System.out.println(number);
	 number++;
 } while (number <= 5);
 ```

 **Output:**

 ```text
 6
 ```

 Use a `do-while` loop when the code must run at least once, such as displaying a menu before asking whether the user wants to continue.

 ---

 ## 3. `for` Loop

 A `for` loop is commonly used when the number of repetitions is known. Initialization, condition, and update are written in one line.

 ### Syntax

 ```java
 for (initialization; condition; update) {
	 // statements
 }
 ```

 ### Example

 ```java
 for (int number = 1; number <= 5; number++) {
	 System.out.println(number);
 }
 ```

 The loop works in this order:

 1. `int number = 1` runs once.
 2. `number <= 5` is checked.
 3. The loop body runs.
 4. `number++` updates the variable.
 5. Steps 2 to 4 repeat until the condition is `false`.

 ---

 ## 4. Enhanced `for` Loop

 The enhanced `for` loop visits each element of an array or collection. It is also called the `for-each` loop.

 ### Syntax

 ```java
 for (dataType variable : arrayOrCollection) {
	 // statements
 }
 ```

 ### Example

 ```java
 int[] numbers = {10, 20, 30, 40};

 for (int number : numbers) {
	 System.out.println(number);
 }
 ```

 Use it when you need each value but do not need the element index.

 ---

 ## Nested Loops

 A **nested loop** is a loop inside another loop. For every one iteration of the outer loop, the inner loop completes all its iterations.

 ### Example: Multiplication pattern

 ```java
 for (int row = 1; row <= 3; row++) {
	 for (int column = 1; column <= 3; column++) {
		 System.out.print("* ");
	 }
	 System.out.println();
 }
 ```

 **Output:**

 ```text
 * * *
 * * *
 * * *
 ```

 ## Loop Control Statements

 ### `break`

 `break` immediately terminates the nearest loop.

 ```java
 for (int number = 1; number <= 10; number++) {
	 if (number == 5) {
		 break;
	 }
	 System.out.println(number);
 }
 ```

 This prints numbers from `1` to `4`.

 ### `continue`

 `continue` skips the remaining statements in the current iteration and moves to the next iteration.

 ```java
 for (int number = 1; number <= 5; number++) {
	 if (number == 3) {
		 continue;
	 }
	 System.out.println(number);
 }
 ```

 This prints `1`, `2`, `4`, and `5`.

 ## Choosing the Right Loop

 | Loop | Best used when | Minimum executions |
 |---|---|---:|
 | `while` | The number of repetitions may change | 0 |
 | `do-while` | The body must execute at least once | 1 |
 | `for` | The number of repetitions is known | 0 |
 | Enhanced `for` | Every array or collection element must be visited | 0 |

 ## Complete Example

 ```java
 public class LoopExample {
	 public static void main(String[] args) {
		 int sum = 0;

		 for (int number = 1; number <= 5; number++) {
			 sum += number;
		 }

		 System.out.println("Sum = " + sum);
	 }
 }
 ```

 **Output:**

 ```text
 Sum = 15
 ```

 ## Common Mistakes

 - Forgetting to update the loop variable, which can create an infinite loop.
 - Using `=` instead of `==` when comparing values.
 - Adding an extra semicolon after the loop condition:

   ```java
   // Incorrect: the loop body is empty
   for (int number = 1; number <= 5; number++);
   ```

 - Changing a collection while using an enhanced `for` loop.
 - Using a nested loop when a simpler solution would be easier to read.

 ## Summary

 - A loop repeats a block of code.
 - `while` checks the condition before each iteration.
 - `do-while` checks the condition after each iteration and runs at least once.
 - `for` keeps initialization, condition, and update together.
 - Enhanced `for` is convenient for reading every array or collection element.
 - `break` exits a loop, while `continue` skips to the next iteration.
