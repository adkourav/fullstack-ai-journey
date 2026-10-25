# Month 1 Full-Syllabus Technical Assessment — Examiner Script

**Use this version to run the assessment.** Questions are followed by reference answers and plain-language scoring notes. Read the question, let the learner answer without hints, then compare their response with the guide.

**Duration:** 60 minutes · **Total:** 100 marks · **Pass:** 60 · **Strong:** 75+

Keep a timer visible. Move on when a section's time ends; unanswered parts score 0. The learner should not use Copilot, AI, search, or IDE autocomplete. They may write code on paper or in a plain text editor.

**How to score:** Award full marks when the answer has the essential idea, half marks when the core idea is right but incomplete, and 0 for a wrong or missing answer. For coding, accept equivalent correct solutions; the reference code is not the only acceptable implementation.

**Coverage:** This assessment samples the full Month 1 plan: Java syntax and methods, arrays and strings, OOP, exceptions, Collections, complexity and core array/matrix/string algorithms, semantic HTML and forms, CSS fundamentals and responsive layout, Bootstrap/Tailwind, portfolio JavaScript, Git/GitHub Pages, and aptitude basics. Spoken answers also give practice explaining technical ideas clearly in English. It is a timed sample, not a requirement to recite every interview-bank question or reproduce all 20 classic programs.

---

## SECTION 1 — Quick-Fire Questions
### 10 minutes · 20 marks · 10 questions, 2 marks each

Ask for a concise answer. Give 1 mark for a substantially correct but incomplete answer.

**1.** What are the JVM, JRE, and JDK, and how do they relate?

✅ **Answer:** The JVM runs Java bytecode. The JRE provides the JVM and runtime libraries needed to run Java programs. The JDK includes development tools such as the compiler as well as the runtime. The JDK is used to develop; the JRE/runtime is used to run.

**2.** What does this print, and why?
```java
System.out.println(7 / 2);
```

✅ **Answer:** `3`. Both operands are integers, so Java performs integer division and discards the fractional part.

**3.** Name the four OOP pillars and give a short meaning for one of them.

✅ **Answer:** Encapsulation, abstraction, inheritance, and polymorphism. For example, encapsulation bundles state and behavior and controls access to state.

**4.** State one difference between method overloading and method overriding.

✅ **Answer:** Overloading uses the same method name with different parameter lists and is resolved at compile time. Overriding replaces an inherited instance method with a compatible implementation and is selected at runtime based on the actual object.

**5.** What is the difference between a checked and an unchecked exception? Give one example of each.

✅ **Answer:** Checked exceptions must be caught or declared, such as `IOException`. Unchecked exceptions are runtime exceptions and do not have that requirement, such as `NullPointerException`.

**6.** Give one suitable use for a `List`, a `Set`, and a `Map`.

✅ **Answer:** A `List` keeps an ordered sequence and permits duplicates; a `Set` stores unique elements; a `Map` associates keys with values. Examples include `ArrayList`, `HashSet`, and `HashMap`.

**7.** What is the average lookup complexity of a `HashMap`, and what happens when two keys land in the same bucket?

✅ **Answer:** Average lookup is O(1). A collision occurs; the map stores both entries in the bucket and compares keys (using hashing and equality) to find the right one. Implementations may treeify a heavily populated bucket.

**8.** Give the time complexity of binary search and name the condition it needs.

✅ **Answer:** O(log n); the data must be sorted (and accessible in a way that supports efficient middle-element access, as with an array).

**9.** What do prefix sums help calculate, and what does Kadane's algorithm find?

✅ **Answer:** Prefix sums support range-sum calculations efficiently after preprocessing. Kadane's algorithm finds the maximum-sum contiguous subarray in O(n) time.

**10.** An item costs ₹500 and has a 20% discount. What is the discounted price?

✅ **Answer:** ₹400. The discount is ₹100 (20% of ₹500), so ₹500 − ₹100 = ₹400. Award 1 mark for calculating the ₹100 discount and 1 mark for the final price.

**Section 1 score: ___ / 20**

---

## SECTION 2 — Read the Code and Explain
### 8 minutes · 15 marks · 5 questions, 3 marks each

Ask for the output or behavior and a brief explanation. Give 2 marks for the right result with a weak explanation, or 1 mark for sound reasoning with a small output error.

**1.** What is printed?
```java
class Parent {
    void speak() { System.out.println("parent"); }
}
class Child extends Parent {
    @Override
    void speak() { System.out.println("child"); }
}
Parent item = new Child();
item.speak();
```

✅ **Answer:** `child`. The overridden instance method is dispatched using the runtime object's class.

**2.** What is printed?
```java
try {
    System.out.print("A");
    int value = 4 / 0;
    System.out.print("B");
} catch (ArithmeticException e) {
    System.out.print("C");
} finally {
    System.out.print("D");
}
```

✅ **Answer:** `ACD`. Division throws before `B`; the matching `catch` prints `C`, then `finally` prints `D`.

**3.** What is printed, and why?
```java
String word = "java";
word.toUpperCase();
StringBuilder text = new StringBuilder(word);
text.append("!");
System.out.println(word + " " + text);
```

✅ **Answer:** `java java!`. `String` is immutable and the result of `toUpperCase()` was not assigned. `StringBuilder.append` mutates `text`.

**4.** What does this print?
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
int main = 0;
int other = 0;
for (int i = 0; i < matrix.length; i++) {
    main += matrix[i][i];
    other += matrix[i][matrix.length - 1 - i];
}
System.out.println(main + " " + other);
```

✅ **Answer:** `15 15`. The main diagonal is `1 + 5 + 9`; the other diagonal is `3 + 5 + 7`.

**5.** In a CSS file, which rule wins for a paragraph if all rules have the same origin and importance?
```css
p { color: navy; }
.notice { color: green; }
#alert { color: red; }
```
```html
<p class="notice" id="alert">Hello</p>
```

✅ **Answer:** Red, from `#alert`; an ID selector is more specific than a class selector, which is more specific than an element selector.

**Section 2 score: ___ / 15**

---

## SECTION 3 — Spoken Interview Questions
### 10 minutes · 20 marks · 4 questions, 5 marks each

Let the learner speak for about one minute per question. Score the explanation and trade-offs, not memorized wording.

**1.** Explain encapsulation, abstraction, inheritance, and polymorphism. Describe how you might model a simple portfolio application with classes or interfaces.

✅ **What to listen for (5 marks):**
- 1 mark each for correctly explaining the four pillars (up to 4).
- 1 mark for a plausible design, such as a `Project` model and a `ProjectRepository`/interface, or for explaining why composition may be preferable to unnecessary inheritance.

**2.** When would you use an `ArrayList` versus a `LinkedList`? Explain `Comparable` versus `Comparator`, and how a `HashMap` handles lookup.

✅ **What to listen for (5 marks):**
- 1 mark: `ArrayList` uses a resizable array and provides fast indexed access.
- 1 mark: `LinkedList` is node-based; indexed access is slower, and it can be useful for operations at its ends (though `ArrayDeque` is generally preferred for a queue/deque).
- 1 mark: `Comparable` defines a type's natural ordering; `Comparator` supplies an external/custom ordering.
- 2 marks: `HashMap` hashes a key to a bucket, handles collisions within the bucket, and uses `equals` to identify the matching key; average operations are O(1).

**3.** Compare the approaches and complexity for rotating an array, finding a maximum subarray sum, and checking whether two strings are anagrams.

✅ **What to listen for (5 marks):**
- 2 marks: array rotation by reversal uses three reversals, O(n) time and O(1) extra space (for in-place rotation).
- 1 mark: Kadane's algorithm finds the maximum contiguous sum in O(n) time and O(1) extra space.
- 2 marks: anagrams can be checked by sorting (typically O(n log n)) or by frequency counts (O(n) time for a bounded alphabet / suitable character map); the learner should mention equal lengths or equivalent frequency counts.

**4.** Describe how you would make a portfolio page accessible and responsive. Also explain one small vanilla-JavaScript feature, how you would deploy the site, and how Bootstrap differs from Tailwind.

✅ **What to listen for (5 marks):**
- 1 mark: semantic landmarks, logical headings, useful image `alt` text, or labels associated with form controls.
- 1 mark: viewport meta tag, flexible layout, and/or media queries for narrow and wide screens.
- 1 mark: a suitable vanilla-JavaScript interaction, such as a mobile menu toggle, smooth scrolling, or simple form validation.
- 1 mark: Bootstrap provides predefined components and a grid; Tailwind is utility-first and composes styles from utility classes.
- 1 mark: describes `git add` → `git commit` → `git push` and publishing the static site with GitHub Pages. Award this mark for a sensible deployment sequence even if command wording varies.

**Communication note:** Across the spoken section, consider whether the learner explains ideas clearly and can give a short, understandable description of their portfolio. This is feedback, not an extra mark.

**Section 3 score: ___ / 20**

---

## SECTION 4 — Coding Round
### 22 minutes · 35 marks

The learner should write both methods in Java and state time and space complexity. No IDE autocomplete or AI. Give partial credit for a correct approach with a small syntax error.

### Problem 1 — First non-repeating character (15 marks)

Write a method that returns the index of the first character that appears exactly once in a string. Return `-1` if every character repeats.

Examples:
- `"swiss"` → `1` (the first unique character is `w`)
- `"aabb"` → `-1`
- `"z"` → `0`

✅ **Reference solution:**
```java
import java.util.HashMap;
import java.util.Map;

static int firstUniqueIndex(String text) {
    Map<Character, Integer> counts = new HashMap<>();

    for (int i = 0; i < text.length(); i++) {
        char current = text.charAt(i);
        counts.put(current, counts.getOrDefault(current, 0) + 1);
    }

    for (int i = 0; i < text.length(); i++) {
        if (counts.get(text.charAt(i)) == 1) {
            return i;
        }
    }
    return -1;
}
```

**How to grade:**
- Counts every character correctly: **5 marks**
- Scans in original order and returns the first unique character's index, or `-1`: **6 marks**
- Correct complexity: **4 marks** — O(n) average time and O(k) extra space, where k is the number of distinct characters.

### Problem 2 — Maximum subarray sum (20 marks)

Write a method that returns the greatest sum of any **non-empty contiguous** part of an integer array. Assume the array contains at least one element.

Examples:
- `{-2, 1, -3, 4, -1, 2, 1, -5, 4}` → `6` (the subarray `{4, -1, 2, 1}`)
- `{-5, -2, -8}` → `-2`

✅ **Reference solution (Kadane's algorithm):**
```java
static int maxSubarraySum(int[] values) {
    int bestEndingHere = values[0];
    int bestOverall = values[0];

    for (int i = 1; i < values.length; i++) {
        bestEndingHere = Math.max(values[i], bestEndingHere + values[i]);
        bestOverall = Math.max(bestOverall, bestEndingHere);
    }

    return bestOverall;
}
```

**How to grade:**
- Tracks the best sum ending at the current position: **7 marks**
- Tracks and returns the best sum overall: **6 marks**
- Handles all-negative arrays by not defaulting the answer to zero: **3 marks**
- Correct complexity: **4 marks** — O(n) time and O(1) extra space.

**Section 4 score: ___ / 35**

---

## SECTION 5 — HTML/CSS Practical
### 10 minutes · 10 marks

Ask the learner to create a simple responsive contact/profile card as a single HTML file. Open it in a browser if time permits. This is a short skills check, not a portfolio polish exercise.

**Requirements and marking:**

1. **Semantic structure (2 marks):** includes appropriate `<header>`, `<main>`, and `<footer>` landmarks.
2. **Accessible form (2 marks):** includes a name or email field with a correctly associated `<label>`, an appropriate input type, and a `required` field.
3. **CSS fundamentals (2 marks):** uses a class selector and a sensible box model (for example, `box-sizing: border-box`, padding, and border).
4. **Responsive layout (2 marks):** uses Flexbox or Grid and a media query or fluid sizing so the layout adapts to a narrow screen.
5. **Usability (2 marks):** readable contrast and spacing, a visible focus or hover state, and no obvious horizontal overflow at mobile width.

✅ **Example solution to compare against:**
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Contact card</title>
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      margin: 0;
      padding: 1rem;
      font-family: Arial, sans-serif;
      color: #172033;
      background: #f2f5f9;
    }

    .card {
      width: min(100%, 34rem);
      margin: 2rem auto;
      padding: 1.5rem;
      border: 1px solid #aab5c5;
      border-radius: 0.75rem;
      background: white;
    }

    form {
      display: grid;
      gap: 0.75rem;
    }

    input,
    button {
      width: 100%;
      padding: 0.65rem;
      font: inherit;
    }

    button {
      color: white;
      background: #174ea6;
      border: 0;
      border-radius: 0.3rem;
      cursor: pointer;
    }

    button:hover,
    button:focus-visible {
      background: #103975;
    }

    @media (max-width: 30rem) {
      .card {
        margin-block: 0.5rem;
      }
    }
  </style>
</head>
<body>
  <header><h1>Contact</h1></header>
  <main>
    <section class="card" aria-labelledby="contact-title">
      <h2 id="contact-title">Send a message</h2>
      <form>
        <label for="email">Email</label>
        <input id="email" name="email" type="email" required>
        <button type="submit">Send</button>
      </form>
    </section>
  </main>
  <footer><p>Month 1 portfolio</p></footer>
</body>
</html>
```

**Section 5 score: ___ / 10**

---

## FINAL SCORE SHEET

| Section | Max marks | Score |
|---|---:|---:|
| 1 — Quick-Fire Questions | 20 | |
| 2 — Read the Code and Explain | 15 | |
| 3 — Spoken Interview Questions | 20 | |
| 4 — Coding Round | 35 | |
| 5 — HTML/CSS Practical | 10 | |
| **TOTAL** | **100** | |

### Interpreting the result

- **85–100 — Excellent:** Strong Month 1 foundation. Proceed to the next plan while continuing regular revision.
- **70–84 — Good pass:** Ready to move on; spend extra practice time on the lowest-scoring section.
- **60–69 — Borderline:** Review weak topics and retake a focused assessment before relying on the material.
- **Below 60 — Rebuild fundamentals:** Revisit the relevant weeks, write down missed concepts, and retest before moving on.

### Regardless of score, review these gaps if they appeared

- Could not explain runtime polymorphism, exception flow, or the purpose of `finally`.
- Confused `List`, `Set`, and `Map`, or could not explain hashing and key equality.
- Could not state time/space complexity or reason through a basic array/string algorithm.
- Kadane's solution returned 0 for an all-negative array, or string counting lost the original character order.
- Used non-semantic HTML, omitted form labels, or did not consider narrow screens and keyboard focus.
- Could not distinguish Bootstrap's components/grid approach from Tailwind's utility-first approach.

Use missed questions as revision targets, not as a judgment. Reattempt the missed problem without hints, record the mistake and its cause, and then test the concept again later.
