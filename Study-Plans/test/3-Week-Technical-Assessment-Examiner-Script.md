
# 3-Week Technical Assessment — Examiner Script (for a non-Java examiner)

**Use this version to actually run the interview.** Every question is followed immediately by the correct answer and a plain-language note on how to score it — you don't need any Java/HTML background to use this. Read the question to him, let him answer (spoken or written), then compare to "✅ Correct answer" below it and tick a score.

**Duration:** 60 minutes · **Total marks:** 100 · **Pass:** 60 · **Strong:** 75+
Keep a phone timer visible. If a section's time runs out, move to the next section even if unfinished — mark what's left blank as 0.

**How to score each item:** every question tells you exactly what to look for. If his answer roughly matches the "✅ Correct answer" / "what to listen for" line, give full marks. If it's partially right (right idea, missing a detail), give half marks. If it's wrong or he has no answer, give 0.

> Scope note: this only covers what he's actually practiced so far (Java basics, loops, methods, arrays, sorting, strings, basic HTML/CSS). It does **not** include OOP (classes/inheritance) or advanced CSS (Flexbox) because the repo shows he hasn't started those yet — so don't be surprised if those words never come up.

---

## SECTION 1 — Quick Fire Questions (12 minutes · 20 marks · 2 marks each)

Read each question and the code out loud (or show it on screen). He answers verbally with just the letter or the output.

**1.** What is the output of this code?
```java
int x = 5;
int y = 2;
System.out.println(x / y + " " + x % y);
```
✅ **Correct answer: `2 1`**
*(Why: dividing two whole numbers in Java drops the decimal part, so 5/2 = 2, not 2.5. The % gives the remainder, 5%2 = 1.)*

**2.** What is the output?
```java
System.out.println(10 > 5 && 3 > 5 || 2 < 4);
```
✅ **Correct answer: `true`**
*(Listen for: he should mention that `&&` is checked before `||`. The middle part `3 > 5` is false, but the last part `2 < 4` is true, and "false OR true" = true.)*

**3.** Which loop type always runs its body **at least once**, even if the condition is false from the start?
✅ **Correct answer: `do-while`**

**4.** What does this print?
```java
for (int i = 0; i < 3; i++) {
    if (i == 1) continue;
    System.out.print(i);
}
```
✅ **Correct answer: `02`**
*(Why: `continue` skips printing only when i is 1, so 0 and 2 get printed, 1 is skipped.)*

**5.** In Java, how does the computer decide which version of an overloaded method to call (when the same method name has multiple versions)?
✅ **Correct answer: based on the number and type of parameters passed in** — NOT by return type, NOT by access modifier (public/private).

**6.** If you search for a value in an unsorted list of "n" items one by one until you find it, what do we call the speed/complexity of that search?
✅ **Correct answer: O(n)** — "linear time." *(He should say "O(n)" — if he explains "it takes longer as the list gets bigger, roughly in direct proportion," that also counts.)*

**7.** What is the worst-case complexity of Bubble Sort?
✅ **Correct answer: O(n²)** *("n squared" — gets much slower as the list grows, because of nested loops comparing every pair.)*

**8.** In Java, what is the index number of the very first element of an array?
✅ **Correct answer: 0** (not 1)

**9.** If an array has 5 elements (so valid indexes are 0 to 4), what happens if the code tries to access index 5?
✅ **Correct answer: the program crashes with an error called `ArrayIndexOutOfBoundsException`** — it does NOT silently return 0 or null.

**10.** Which is the correct way to create a grid/table-like array (2D array) in Java?
✅ **Correct answer: `int[][] arr = new int[2][3];`**

**11.** `String a = "cat"; String b = "cat";` — if you compare `a == b`, what do you get?
✅ **Correct answer: `true`** — because Java reuses the same memory for identical text written directly in the code (called the "String pool"). *(Bonus understanding if he adds that this is different from comparing two arrays or using `new String(...)`.)*

**12.** In HTML, which tag groups related form fields together with a visible title/caption around them (like a box labeled "Personal Details")?
✅ **Correct answer: `<fieldset>` with a `<legend>` inside it**

**13.** Which CSS property adds space **between the border and the content inside** a box (not the space outside the box)?
✅ **Correct answer: `padding`** (margin is the space *outside* the border, padding is *inside*)

**14.** A box is written as: `padding: 10px; border: 2px solid; width: 100px;` using the default box model. What is the box's actual rendered width on screen?
✅ **Correct answer: 124px** (100 width + 10+10 padding on both sides + 2+2 border on both sides = 124). *(If he says "100px" that's wrong — it means he doesn't know the default box model adds padding/border on top of the width. This is a common real gap — see note in Section 3, Q where this repeats.)*

**15.** Which of these has the strongest/highest priority when two CSS rules conflict: a class selector (`.card`), an ID selector (`#card`), or a plain tag selector (`div`)?
✅ **Correct answer: ID selector (`#card`)** — IDs beat classes, classes beat plain tags.

**16.** What does adding the word `required` to an HTML input do? Example: `<input type="email" required>`
✅ **Correct answer: the browser won't let the form be submitted until that field is filled in** — it's built into the browser, no extra code needed.

**17.** `int[] arr = {3, 1, 4, 1, 5}; System.out.println(arr.length);` — what prints?
✅ **Correct answer: 5** (it's counting how many items are in the array, not their values)

**18.** True or false: in a Java `switch` statement, if you forget to write `break`, the code will automatically "fall through" and keep running the next case too.
✅ **Correct answer: True**

**19.** `int[] arr = new int[5];` — what does `arr.length` give?
✅ **Correct answer: 5**

**20.** A loop inside another loop, both running `n` times — what is the overall complexity called?
✅ **Correct answer: O(n²)**

**Section 1 score: ___ / 20**

---

## SECTION 2 — Read the Code, Predict the Output (10 minutes · 10 marks · 2 marks each)

Show him each code block and ask him to say/write the **exact output**. Give him a minute per question max.

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
✅ **Correct answer:**
```
int: 5
double: 5.0
int: 65
```
*(The tricky part is the last line — a character `'A'` doesn't have its own matching method, so Java converts it to its number code, 65, and uses the "int" version. Give full marks only if he gets "int: 65", half marks if he got the first two lines right but missed the trick on the last one.)*

**Q2.**
```java
int[] arr = {1, 2, 3, 4, 5};
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.print(arr[i] + " ");
}
```
✅ **Correct answer: `5 4 3 2 1`** (loop runs backwards, printing the array in reverse)

**Q3.**
```java
int a = 10;
int b = 3;
System.out.println(a + " " + b + " " + (a + b));
System.out.println(a + b + " vs " + a + b);
```
✅ **Correct answer:**
```
10 3 13
13 vs 103
```
*(This is a classic trick question. Line 2: Java reads left to right — `a + b` happens first as actual math (10+3=13) because nothing text-like has appeared yet, giving "13 vs ". Then it keeps adding `a` then `b` as text onto the end, giving "13 vs 10" then "13 vs 103". Full marks only if both lines are exactly right. This question is genuinely hard — if he gets line 1 right and struggles on line 2, give 1 out of 2, it's a fair gap at this stage.)*

**Q4.** This code is supposed to find the second-largest number in the list, but it has a bug. Ask him to find the bug (he doesn't need to fix it unless there's time left).
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
✅ **Correct answer / what to listen for:** When a new biggest number is found, the code should save the OLD biggest number into "second largest" before overwriting it — this code forgets to do that, so it loses track of the previous largest number. He doesn't need to say it in those exact words — give full marks if he points out that "the old largest value is being thrown away instead of being saved as the second largest."

**Q5.**
```java
String s = "Hello";
s.toUpperCase();
System.out.println(s);
```
✅ **Correct answer: `Hello`** (not "HELLO")
*(Why: in Java, text (String) can never be changed once created. `.toUpperCase()` creates a brand NEW piece of text but it was never saved back into `s`, so `s` is still the original "Hello". This is an important concept — full marks only if he explains WHY, not just states the output.)*

**Section 2 score: ___ / 10**

---

## SECTION 3 — Spoken Interview Questions (10 minutes · 20 marks · 4 marks each)

Ask these like a real interviewer — let him talk for 30–60 seconds each. You're checking if the IDEA is right, not for exact textbook wording.

**1.** "You've written both a loop-based (iterative) and a call-itself (recursive) version of factorial. What's one downside of the recursive version if the number is very large?"
✅ **What to listen for:** Each recursive call uses a bit of memory that doesn't get freed until it returns — with a very large number, this can run out and crash with something called a "stack overflow." Full marks if he mentions it can crash/run out of memory for large inputs and that the loop version doesn't have this problem. Partial marks if he only says "recursion is slower."

**2.** "Why does Java make you decide the size of an array before you can use it (like `new int[5]`), instead of just letting it grow automatically?"
✅ **What to listen for:** Java reserves a fixed, continuous block of memory for an array upfront, so it needs to know the size in advance. Full marks if he also says what you'd use instead when you don't know the size ahead of time (something that can resize itself — he may say "ArrayList" or just describe "a list that grows" — either is fine).

**3.** "In Bubble Sort, after you finish the very first full pass through the list, what do you already know for certain about the list?"
✅ **What to listen for:** The single largest number has definitely "bubbled" to the very last position and is now in its correct final spot. Bonus if he says this means later passes don't need to re-check that last position, saving some time.

**4.** "If you have two arrays with the exact same numbers in them, and you compare them with `==`, will it say they're equal?"
✅ **Correct answer: No / false** — `==` on arrays only checks if they are literally the same object in memory, not whether their contents match. Even with identical numbers inside, two separate arrays will say `false`. Full marks if he gets this right — this is commonly confused with how `==` sort of works for Strings (Q11 in Section 1), so test if he can tell the two situations apart.

**5.** "A junior developer says 'HTML is a programming language.' Is that correct? If not, what is it, and what do CSS and JavaScript each actually do differently?"
✅ **What to listen for:** HTML is NOT a programming language — it has no logic, decisions, or calculations. It's a "markup language" that just defines the structure/content of a page (headings, paragraphs, images, forms). CSS handles how it looks (colors, spacing, layout). JavaScript handles behavior/interactivity (things happening when you click, logic, calculations). Full marks if he correctly separates these three roles, even in his own words.

**Section 3 score: ___ / 20**

---

## SECTION 4 — Coding Round (20 minutes · 30 marks · 15 marks each)

Let him write this on paper or in a plain text editor (no autocomplete/Copilot). He should write the whole method and briefly say how fast it is (time complexity) at the end.

**Problem 1 (15 marks):** Write a method that takes an array and a number `k`, and shifts/rotates every element to the LEFT by `k` positions.
Example: `[1,2,3,4,5]` rotated left by `2` becomes `[3,4,5,1,2]`.

✅ **Reference solution to compare against (don't expect his to look identical — any working version counts):**
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
**How to grade (you don't need to read his code line by line — just check these 3 things):**
- Does his solution give the CORRECT final array for the example above? → trace through on paper with his logic, or ask him to "dry run" it out loud for you (8 marks)
- Does it still work sensibly if `k` is bigger than the array size, or `k` is 0? Ask him "what if k was 7 for a 5-item array?" (3 marks)
- Did he correctly state the time complexity? Correct answer: **O(n)** — it touches every element roughly a constant number of times (4 marks)

**Problem 2 (15 marks):** Write a method that checks if the sum of a square grid/matrix's main diagonal (top-left to bottom-right) equals the sum of its other diagonal (top-right to bottom-left).
Example:
```
1 2 3
4 5 6
7 8 9
```
Main diagonal: 1+5+9 = 15. Other diagonal: 3+5+7 = 15. They're equal, so answer is `true`.

✅ **Reference solution:**
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
**How to grade:**
- Correctly adds up the main diagonal (top-left to bottom-right) (5 marks)
- Correctly adds up the other diagonal (top-right to bottom-left) (5 marks)
- Works for any size grid (not just hardcoded for a 3x3) and gives a true/false answer (5 marks)

**Section 4 score: ___ / 30**

---

## SECTION 5 — HTML/CSS Practical (8 minutes · 20 marks)

Ask him to build one simple webpage file for a "Contact Card" — he can write it directly in a `.html` file with a `<style>` section inside it. Open the finished file in a browser so you can both look at it.

**What it must include, and how to check each one:**

1. **(4 marks) Structure:** the page should use a `<header>` tag (for a name/title at the top), a `<main>` tag (for the main content), and a `<footer>` tag (for a copyright line at the bottom) — not just plain `<div>`s for everything.
   *How to check: open the file he gives you in a text viewer and look for the words `<header>`, `<main>`, `<footer>` — just search/skim for these tags.*

2. **(6 marks) A working form:** a text box for name, an email box that's required, and a submit button.
   *How to check: open the page in a browser, click the submit button without typing anything in the email box — the browser itself should block submission and show a warning. If it doesn't, the `required` part is missing.*

3. **(6 marks) Box sizing:** the card should be a fixed width of 300px with padding and a visible border, but using `box-sizing: border-box` so it doesn't visually grow past 300px.
   *How to check: look at the card in the browser — does it look reasonably like a 300px-wide box, or does it look unexpectedly wider because of extra padding/border? Also check the code for the literal text `box-sizing: border-box`.*

4. **(2 marks) Hover effect:** hovering the mouse over the submit button should visibly change something (color/background).
   *How to check: just hover your mouse over the button in the browser and see if anything changes.*

5. **(2 marks) id vs class used correctly:** somewhere in the file there should be one correct use of `id="..."` (something unique, used once) and one correct use of `class="..."` (something that could apply to multiple elements).
   *How to check: just skim the code for `id=` and `class=` attributes — doesn't need to be complicated, just present and sensible.*

**Section 5 score: ___ / 20**

---

## FINAL SCORE SHEET

| Section | Max Marks | His Score |
|---|---:|---:|
| 1 — Quick Fire Questions | 20 | |
| 2 — Predict the Output | 10 | |
| 3 — Spoken Interview Questions | 20 | |
| 4 — Coding Round | 30 | |
| 5 — HTML/CSS Practical | 20 | |
| **TOTAL** | **100** | |

**What the total means:**
- **85–100:** Excellent — fundamentals are strong, ready to move on to the next topic (OOP/classes).
- **70–84:** Good pass — just revise whichever section scored lowest for a day or two.
- **60–69:** Borderline — pick the weakest section and have him redo similar practice problems, then re-test just that section in a few days.
- **Below 60:** Not ready to move forward yet — go back over Weeks 1–2 material before continuing.

**A few things that should concern you regardless of the total score** (these are basics, not nice-to-haves):
- He couldn't trace through the nested loop in Section 2, Q2 (the backwards-printing one).
- He didn't know bubble sort or linear search's speed (O(n²) / O(n)) at all in Section 1.
- His code in Section 4 didn't actually work for the given example when you traced it with him.
- He mixed up `padding` and `margin`, or had no idea what `box-sizing: border-box` does.

If any of those come up, it's worth a gentle note to go back and practice that specific thing — it's not a sign he's behind, just where to focus next.
