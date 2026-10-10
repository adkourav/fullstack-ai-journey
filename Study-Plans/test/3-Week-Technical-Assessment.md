
# 3-Week Technical Assessment — IT Services / Startup Screening Format

**Duration:** 60 minutes (strict) · **Total marks:** 100 · **Pass:** 60 · **Strong:** 75+
**Format modeled on:** TCS NQT coding round + Infosys InfyTQ technical MCQ + startup take-home screener
**Allowed:** Plain text editor / paper only. **Not allowed:** IDE autocomplete, Copilot, internet search, notes.

> **Scope note for the evaluator:** This test is built strictly from what exists in the repo today — Java syntax, conditionals, loops, methods/overloading, patterns, 1D/2D arrays, bubble/selection sort, string basics, Big-O reasoning, and basic HTML/CSS (box model, selectors, forms). **OOP, Collections, exceptions, Flexbox/Grid, and recursion depth are intentionally excluded** because the repo shows these are not yet coded (Week 3 topics not started) — testing them now would measure the plan, not the learner. Re-test those separately once OOP code actually appears in the repo.

Give the candidate only **Section 1–5** below (not the Answer Key at the end). Time-box each section with a visible timer and stop when time is up, even if incomplete — this simulates real test-center pressure.

---

## Section 1 — MCQ / Rapid Fire (12 min · 20 marks · 2 marks each)

Circle one answer. No explanation needed.

1. What is the output?
```java
int x = 5;
int y = 2;
System.out.println(x / y + " " + x % y);
```
A) 2.5 1  B) 2 1  C) 2.5 0  D) Compile error

2. What is the output?
```java
System.out.println(10 > 5 && 3 > 5 || 2 < 4);
```
A) true  B) false  C) Compile error  D) 0

3. Which loop guarantees the body executes **at least once**?
A) `for`  B) `while`  C) `do-while`  D) enhanced `for`

4. What does this print?
```java
for (int i = 0; i < 3; i++) {
    if (i == 1) continue;
    System.out.print(i);
}
```
A) 012  B) 02  C) 01  D) 0

5. Method overloading in Java is resolved based on:
A) Return type only  B) Number/type of parameters  C) Access modifier  D) Method body

6. What is the time complexity of linear search on an unsorted array of size n?
A) O(1)  B) O(log n)  C) O(n)  D) O(n²)

7. What is the time complexity of bubble sort in the **worst case**?
A) O(n)  B) O(n log n)  C) O(n²)  D) O(2ⁿ)

8. Array indices in Java start at:
A) 1  B) 0  C) -1  D) Depends on declaration

9. What happens when you access `arr[arr.length]`?
A) Returns 0  B) Returns null  C) `ArrayIndexOutOfBoundsException`  D) Compiles but prints garbage

10. Which is the correct way to declare a 2D array in Java?
A) `int arr[2][3]`  B) `int[][] arr = new int[2][3]`  C) `int arr = new int[2,3]`  D) `array int[2][3] arr`

11. `String a = "cat"; String b = "cat";` — what does `a == b` return?
A) false, always  B) true (same String pool reference)  C) Compile error  D) Depends on JVM flag

12. In HTML, which tag is used to group related form controls with a visible caption?
A) `<section>` with a heading  B) `<fieldset>` + `<legend>`  C) `<div class="group">`  D) `<form-group>`

13. Which CSS property increases space **between** the border and the content?
A) margin  B) padding  C) outline  D) gap

14. Given `div { padding: 10px; border: 2px solid; width: 100px; }` with default `box-sizing: content-box`, what is the **rendered width**?
A) 100px  B) 110px  C) 120px  D) 124px

15. Which selector has the **highest specificity**?
A) `.card`  B) `div.card`  C) `#card`  D) `div`

16. `<input type="email" required>` — what does `required` do?
A) Nothing without JS  B) Browser blocks form submit until field is filled  C) Makes field read-only  D) Validates email format only, ignores empty

17. What is the output?
```java
int[] arr = {3, 1, 4, 1, 5};
System.out.println(arr.length);
```
A) 4  B) 5  C) Compile error  D) 1

18. Which statement about Java `switch` is TRUE?
A) `default` must be the last case  B) Fall-through happens unless `break` is used  C) `switch` cannot work on `String`  D) Each case needs its own `{}`

19. What does `arr.length` return for `int[] arr = new int[5]`?
A) 4  B) 5  C) 0  D) Error, arrays have no length

20. Nested loop `for(i=0;i<n;i++) for(j=0;j<n;j++)` has time complexity:
A) O(n)  B) O(2n)  C) O(n²)  D) O(log n)

---

## Section 2 — Code Output Prediction / Debugging (10 min · 10 marks · 2 marks each)

Write the **exact output**, or if it doesn't compile/run, say so and state why.

**Q1.**
```java
public class Test {
    static void show(int a) { System.out.println("int: " + a); }
    static void show(double a) { System.out.println("double: " + a); }
    public static void main(String[] args) {
        show(5);
        show(5.0);
        show('A');
    }
}
```

**Q2.**
```java
int[] arr = {1, 2, 3, 4, 5};
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.print(arr[i] + " ");
}
```

**Q3.**
```java
int a = 10;
int b = 3;
System.out.println(a + " " + b + " " + (a + b));
System.out.println(a + b + " vs " + a + b);
```

**Q4.** This code intends to print the second largest element but has a bug. Identify the bug (no need to fix unless time allows):
```java
int[] arr = {4, 8, 2, 9, 9, 3};
int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] > largest) {
        largest = arr[i];
    } else if (arr[i] > secondLargest) {
        secondLargest = arr[i];
    }
}
System.out.println(secondLargest);
```

**Q5.**
```java
String s = "Hello";
s.toUpperCase();
System.out.println(s);
```

---

## Section 3 — Technical Interview Round (Short Answer, 10 min · 20 marks · 4 marks each)

Answer in 2–4 sentences each, as if speaking to an interviewer. No code required unless asked.

1. You wrote both iterative and recursive solutions for factorial in your practice. Explain **one trade-off** between the two (think: what happens on very large `n`).
2. Why does Java force you to declare array size at creation (`new int[5]`) instead of letting it grow automatically like a Python list? What do you do in Java when you don't know the size in advance?
3. In bubble sort, after the **first full pass** over an n-element array, what guarantee do you have about the array? How does this let you optimize the inner loop on later passes?
4. Explain the difference between `==` and `.equals()` for comparing **two integer arrays** (not Strings) — what would `arr1 == arr2` actually compare?
5. A fresher says "HTML is a programming language." Correct this statement and explain what role HTML actually plays versus CSS and JavaScript in a web page.

---

## Section 4 — Coding Round (20 min · 30 marks · 15 marks each)

Write complete, compilable Java methods (you may assume a `main` calls them). State the time and space complexity of your solution at the end of each.

**Problem 1 — Array manipulation (classic service-company screening question):**
Write a method `rotateLeft(int[] arr, int k)` that rotates an array left by `k` positions **in place** (O(1) extra space ideally; partial credit for O(n) extra space).
Example: `[1,2,3,4,5]` rotated left by `2` → `[3,4,5,1,2]`.

**Problem 2 — Matrix (2D array):**
Write a method `boolean isDiagonalSumEqual(int[][] matrix)` that returns `true` if the sum of the main diagonal equals the sum of the anti-diagonal, for a square `n x n` matrix.
Example:
```
1 2 3
4 5 6
7 8 9
```
Main diagonal: 1+5+9=15, Anti-diagonal: 3+5+7=15 → return `true`.

---

## Section 5 — HTML/CSS Practical (8 min · 20 marks)

Build a single `.html` file (inline `<style>` is fine) for a **"Contact Card"** with:
- Semantic structure: `<header>` with a name/title, `<main>` containing the content, `<footer>` with a copyright line *(4 marks)*
- A form with: labeled text input (name), labeled email input (email, marked `required`), and a submit `<button>` *(6 marks)*
- CSS: the card has a fixed `width: 300px`, `padding: 20px`, a visible `border`, and uses `box-sizing: border-box` so the stated width doesn't visually grow *(6 marks)*
- At least one `:hover` style on the button *(2 marks)*
- Correct use of `id` vs `class` (one example of each, used appropriately) *(2 marks)*

---

## Scoring Sheet

| Section | Max Marks | Score |
|---|---:|---:|
| 1 — MCQ Rapid Fire | 20 | |
| 2 — Output Prediction/Debugging | 10 | |
| 3 — Technical Interview Short Answers | 20 | |
| 4 — Coding Round | 30 | |
| 5 — HTML/CSS Practical | 20 | |
| **Total** | **100** | |

**Decision bands:**
- **85–100:** Ready to be pushed into Week 4 (OOP) immediately; strong fundamentals.
- **70–84:** Solid pass; revise the lowest-scoring section for 1–2 days before moving on.
- **60–69:** Borderline; repeat weak section(s) with fresh problems, re-test in 3 days.
- **Below 60:** Do not start Week 4 OOP yet — redo Weeks 1–2 practice problems first.

**Hard retest triggers regardless of total score** (these are non-negotiable basics):
- Could not correctly trace the nested-loop output in Section 2.
- Could not state Big-O for linear search or bubble sort.
- Coding Problem 1 or 2 did not compile / had a logic error they couldn't spot when asked to re-check.
- Confused `padding` vs `margin`, or couldn't explain `box-sizing: border-box`.

---

<br><br>

# ANSWER KEY & RUBRIC (Evaluator Only — do not share with candidate before the test)

## Section 1 — MCQ Answers
1. B (2 1 — integer division truncates, modulo gives remainder)
2. A (true — `&&` binds tighter than `||`: `(10>5 && 3>5)` is false, `false || (2<4)` → true)
3. C (do-while)
4. B (02 — `continue` skips printing when i==1)
5. B
6. C
7. C
8. B
9. C
10. B
11. B (String literals are interned/pooled)
12. B
13. B
14. D (100 + 2×10 padding + 2×2 border = 124px, content-box adds padding+border to the declared width)
15. C (ID > class > element)
16. B
17. B
18. B
19. B
20. C

## Section 2 — Output Answers
**Q1.** `int: 5` / `double: 5.0` / `int: 65` — char `'A'` widens to int (65) since there's no `show(char)` overload, matching `show(int)`.
**Q2.** `5 4 3 2 1 `
**Q3.**
Line 1: `10 3 13`
Line 2: `13 vs 103` — left-to-right evaluation: `(a+b)` computed first (numeric, since both are int) → `"13 vs "`, then `+ a` → string concat `"13 vs 10"`, then `+ b` → `"13 vs 103"`. Classic trick question testing operator evaluation order with mixed `+`.
**Q4.** Bug: when `arr[i] > largest` is true, the **old largest value is lost** instead of being shifted into `secondLargest` before updating `largest`. With input `{4,8,2,9,9,3}`, correct answer should be 9 (since 9 appears twice) but this buggy code may give an incorrect/stale value depending on trace — correct fix: `if (arr[i] > largest) { secondLargest = largest; largest = arr[i]; }`. Full marks for identifying the missing "shift old largest down" step; partial marks for just saying "logic is wrong."
**Q5.** `Hello` — Strings are immutable; `toUpperCase()` returns a new String that is discarded here since it's not assigned back to `s`.

### Section 2 Rubric
- 2 marks for exact correct output/explanation.
- 1 mark if output is right but reasoning given is wrong or missing (for Q4/Q5 reasoning matters).
- 0 marks for compile-error guesses on code that actually compiles fine.

## Section 3 — Model Answers (grade for understanding, not exact wording)
1. Recursive factorial uses the call stack — one stack frame per call — so for large `n` it risks `StackOverflowError` and is generally slower due to call overhead; iterative uses O(1) extra space and a loop, so it scales better for large `n`. Full marks if stack overflow / space trade-off is mentioned.
2. Java arrays are fixed-size, contiguous memory blocks allocated at creation time, so the JVM must know the size upfront; when size is unknown in advance, use a resizable structure like `ArrayList` (acceptable even if `ArrayList` hasn't been formally taught yet — partial credit for "use a bigger array and copy/resize manually" showing they understand the resizing cost).
3. After pass 1, the largest element is guaranteed to be at the last index (bubbled to the end); subsequent passes don't need to check that last (already-sorted) position, so the inner loop bound can shrink each pass (`n-1`, `n-2`, ...), reducing comparisons.
4. `arr1 == arr2` compares **references** (memory addresses), not contents — it's true only if both variables point to the exact same array object, even if their contents are identical. To compare contents you'd need `Arrays.equals(arr1, arr2)` (fine if they only know the concept, not the exact method name).
5. HTML is a **markup language**, not a programming language — it has no logic/control flow; it defines structure/content. CSS handles presentation/styling. JavaScript provides behavior/logic/interactivity. Full marks for correctly naming HTML as markup and separating the three roles.

### Section 3 Rubric (per question, 4 marks)
- 4: Correct concept + correct reasoning/example
- 2–3: Correct concept, weak or incomplete reasoning
- 0–1: Misconception or no real answer

## Section 4 — Coding Round Rubric

**Problem 1 (rotateLeft) — 15 marks**
- Correct output for given example and at least one edge case (k=0, k=arr.length, k>arr.length): 8 marks
- Handles `k % arr.length` to avoid redundant full rotations: 3 marks
- States correct complexity (O(n) time; O(1) space via reversal algorithm, or O(n) space if using extra array — accept either if stated correctly): 4 marks
- Reference solution (reversal algorithm, O(1) space):
```java
static void rotateLeft(int[] arr, int k) {
    int n = arr.length;
    k = k % n;
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
    reverse(arr, 0, n - 1);
}
static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++; end--;
    }
}
```

**Problem 2 (isDiagonalSumEqual) — 15 marks**
- Correctly computes main diagonal sum `matrix[i][i]`: 5 marks
- Correctly computes anti-diagonal sum `matrix[i][n-1-i]`: 5 marks
- Correct comparison and return, handles any n x n size (not hardcoded to 3x3): 5 marks
- Reference solution:
```java
static boolean isDiagonalSumEqual(int[][] matrix) {
    int n = matrix.length;
    int mainSum = 0, antiSum = 0;
    for (int i = 0; i < n; i++) {
        mainSum += matrix[i][i];
        antiSum += matrix[i][n - 1 - i];
    }
    return mainSum == antiSum;
}
```

## Section 5 — HTML/CSS Practical Rubric
- Semantic header/main/footer present and used correctly (not divs renamed): 4
- Form has proper `<label for="">` linked to `input id=""`, email input uses `type="email" required`, submit button present: 6
- `box-sizing: border-box` actually applied and width genuinely stays 300px (check dev tools or visual box check): 6
- `:hover` style exists and visibly changes something (color/background/cursor): 2
- Shows correct, non-redundant use of one `id` and one `class`: 2

---

## Evaluator Notes
- This test deliberately **excludes OOP, Collections, exceptions, recursion depth, and Flexbox/Grid** — those are Week 3–4 curriculum items the repo shows are not yet implemented. Testing them now would unfairly fail the candidate on material never covered.
- If the candidate scores 75+, it is safe to proceed to Week 3 (OOP) as originally planned in [Month_1_Week_Wise_Plan.md](../Month-1/Month_1_Week_Wise_Plan.md).
- Keep this file's Answer Key hidden from the candidate until after grading — copy Sections 1–5 into a fresh file/printout for the actual test sitting.
