# Three-Week Completion Test

Use this as a live, closed-book test. The candidate may use a plain text editor, but not search, Copilot, notes, or autocomplete. Ask the questions in order and stop each section when its time ends.

## Scope and result

This is a test of the material currently studied and visible in the repository. Do not ask about Java OOP, inheritance, interfaces, recursion, StringBuilder, advanced matrix/array algorithms, prefix sums, Kadane's algorithm, or responsive portfolio implementation yet. Those topics may belong to the larger plan, but they are not completion criteria for this attempt.

- Total: 100 points
- Pass: 70 or higher
- Strong foundation: 80 or higher, with at least 18/30 in Java, 18/25 in coding/complexity, and 15/20 in HTML/CSS
- No notes, search, Copilot, or autocomplete. A plain text editor is allowed.

## Part A: Java foundations and interview theory - 8 minutes, 30 points

1. **JDK, JRE, JVM and bytecode** - Explain the compile/run flow and why Java is platform-independent. (5)
2. **Primitive and reference types** - Name the eight primitive types and explain one difference from reference types. (4)
3. **Type casting** - Distinguish implicit and explicit casting and give an example where data loss can occur. (4)
4. **Operators and precedence** - Predict the result of one expression containing arithmetic, relational, logical, and ternary operators. Explain the evaluation order. (4)
5. **Input and output** - Write or describe a `Scanner` input and a `printf` statement that prints a name and decimal value. (3)
6. **Conditionals and switch** - Explain when to use `if/else` versus `switch`, including `break` and fall-through. (4)
7. **Loops and methods** - Explain `for`, `while`, `do-while`, `break`, `continue`, parameters, return values, and method overloading. (6)

Do not ask OOP questions in this section. OOP is intentionally deferred until it has been taught.

## Part B: Basic coding, arrays, patterns, and complexity - 10 minutes, 25 points

Ask the candidate to write Java by hand or in a plain text editor.

1. Write a method that finds the largest and smallest values in an integer array. (7)
2. Extend it to calculate the sum and average, stating what should happen for an empty array. (5)
3. Write a linear search that returns the index of a target or `-1`. (5)
4. Choose one practiced star or number pattern and write the nested loops for it. Explain what each loop controls. (4)
5. State time and extra-space complexity for array traversal, linear search, one nested `n x n` loop, and two sequential loops. (4)

Correctness, loop control, meaningful names, and a spoken dry run are required for full credit. Do not substitute advanced DSA problems.

## Part C: HTML and CSS foundations - 7 minutes, 20 points

1. Write the minimum HTML document structure, including doctype, `html`, `head`, charset, viewport, title, and `body`. (4)
2. Design a semantic outline for a resume using `header`, `nav`, `main`, `section`, `article`, `figure`, and `footer`. (4)
3. Explain block, inline, and inline-block elements, then compare `div` and `span`. (3)
4. Explain relative versus absolute links, `alt` text, and one useful `srcset` scenario. (3)
5. Create a form containing a labeled text input, email input, password input, radio or checkbox, select, textarea, and submit button. Name two built-in validation attributes. (4)
6. Explain CSS cascade, inheritance, specificity, and the box model. Include what `box-sizing: border-box` changes. (2)

Use concrete tags and properties. Do not award full credit for definitions without an example.

## Part D: Covered classic programs - 3 minutes, 15 points

Ask the candidate to choose three prompts. Score 5 points each.

1. Reverse an integer and explain the digit extraction loop.
2. Check whether an integer is prime and explain the stopping condition.
3. Print primes in a range by reusing a prime-checking method.
4. Calculate factorial iteratively.
5. Write one star, number, or character pattern from memory.

For each answer, ask for time and extra-space complexity. Do not test missing programs such as recursive factorial, Fibonacci, Armstrong, perfect number, GCD/LCM, or string palindrome yet.

## Part E: Interview communication - 2 minutes, 10 points

1. Give a 60-second self-introduction focused only on the Java, DSA, HTML, and CSS topics already studied. (5)
2. Explain one completed repository program: its input, algorithm, output, one edge case, and complexity. (5)

## Interviewer score sheet

| Section | Score |
| --- | ---: |
| Java foundations and theory | /30 |
| Basic coding and complexity | /25 |
| HTML and CSS foundations | /20 |
| Covered classic programs | /15 |
| Communication | /10 |
| **Total** | **/100** |

### Decision bands

- **85-100:** Strongly ready for beginner questions limited to the tested foundation topics.
- **70-84:** Foundation is acceptable; revise the lowest-scoring section before interviewing.
- **50-69:** Repeat the tested foundation topics with more hands-on practice.
- **0-49:** Relearn the foundation topics before moving to the next stage.

## Retest gates for this scope

Regardless of the total, repeat the test if the candidate cannot:

- Explain the Java compile/run flow and primitive/reference distinction.
- Write a correct loop-based array traversal and linear search.
- Write a valid semantic HTML outline and an accessible labeled form.
- State time and extra-space complexity for their own solution.

After these foundations are passed, conduct a separate assessment when OOP and advanced DSA classes have actually been completed.