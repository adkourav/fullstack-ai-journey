# WEEK 2 - DAY-WISE STUDY ROADMAP
## Arrays, Strings + CSS Fundamentals

**Theme:** Master array/string manipulation in Java; make HTML look like something.

**Duration:** 6 study days
**Time zone:** All times below are Indian Standard Time (IST, UTC+5:30).
**Target:** About 7 focused study hours per day, plus breaks
**Main deliverable:** A fully styled version of the Week 1 HTML resume

> **Study rule:** For every DSA problem and classic program, write the approach, edge cases, time complexity, and space complexity. Do not mark a topic complete until you can explain it aloud and write a small example without copying.

---

## WEEK 2 AT A GLANCE

| Day | Java focus | DSA focus | CSS / project focus | Interview focus |
|-----|------------|-----------|---------------------|------------------|
| D1 | 1D arrays and core operations | Reverse, rotate, second largest | CSS syntax, cascade, selectors | Java Q9 and CSS Q7 |
| D2 | 2D arrays and matrix basics | Array cleanup and matrix sums | Specificity, colours, fonts, text | Java Q10 and CSS Q8 |
| D3 | Matrix operations | Transpose, rotate, spiral | Box model, units, display | Java Q11 and CSS Q9 |
| D4 | String class and methods | Sorted-matrix search, diagonal sums | Position, z-index, backgrounds | Java Q12 and CSS Q10 |
| D5 | StringBuilder and Character | Set matrix zeroes and mixed revision | Borders, radius, shadows, opacity | Java Q13 and CSS Q11 |
| D6 | Consolidation and timed practice | Full 14-problem review | Style and finish the resume | Java Q14 and CSS Q12-13 |

---

## DAILY ROUTINE

Use this structure every day. The exact topic for each block is listed below.

| Time | Block | What to do |
|------|-------|------------|
| 9:30 AM - 10:00 AM | Revision and planning | Revise yesterday's Java and DSA notes; choose today's edge cases and write the day's target |
| 10:00 AM - 12:00 PM | DSA block 1 | Learn the pattern, solve the assigned problems, and record complexity |
| 12:00 PM - 12:15 PM | Break | Step away from the screen |
| 12:15 PM - 2:00 PM | Java block | Study the day's Java topic and write runnable examples |
| 2:00 PM - 3:00 PM | Lunch and rest | Full break |
| 3:00 PM - 4:30 PM | CSS block | Learn the CSS topic and apply it to the resume |
| 4:30 PM - 5:00 PM | Break | Full break |
| 5:00 PM - 6:00 PM | DSA block 2 / classic programs | Finish DSA practice or write the assigned classic programs from memory |
| 6:00 PM - 6:30 PM | Interview block | Write and answer the day's Java and HTML/CSS questions aloud |
| 6:30 PM - 6:45 PM | Aptitude | Percentages, profit and loss practice |
| 6:45 PM - 7:15 PM | English | Grammar, vocabulary, and speaking practice |
| 7:15 PM - 7:45 PM | Review and Git | Log mistakes, update complexity notes, and make a meaningful Git commit |

**Focused study time:** Approximately 7 hours per day, excluding lunch and longer breaks.

---

# DAY 1 - 1D ARRAYS AND CSS FOUNDATIONS

**Daily outcome:** Traverse and modify one-dimensional arrays confidently, and understand how CSS rules are applied to an HTML document.

## 9:30 AM - 10:00 AM - Start-up revision

- Revise Week 1 array basics: traversal, max/min, sum, average, frequency, and linear search.
- Review the difference between an array declaration, allocation, and initialisation.
- Write today's target: solve three 1D-array problems without looking at a solution.

## 10:00 AM - 12:00 PM - DSA: reverse, rotation, and second largest

### Learn and implement

- Reverse an array in place using two pointers.
- Rotate an array by `k` positions to the left using the reversal algorithm.
- Rotate an array by `k` positions to the right using the reversal algorithm.
- Handle `k > arr.length` with `k % arr.length`.
- Find the second largest element in a single pass.
- Decide how your solution handles duplicate values and arrays with fewer than two distinct values.

### Practice deliverable

For each problem, record:

- Input and output examples
- Brute-force idea, if applicable
- Optimal approach
- Edge cases
- Time and space complexity

## 12:15 PM - 2:00 PM - Java: 1D arrays and array operations

Study and code all of the following:

- 1D array declaration
- Initialisation
- Traversal with a normal `for` loop
- Traversal with an enhanced `for` loop
- `arr.length`
- Find maximum and minimum
- Calculate sum
- Reverse in place
- Swap two elements
- Copy an array
- `Arrays.sort()`
- `Arrays.toString()`

Create one file containing small demonstrations, then create separate methods for the operations. Do not rely only on library methods; write the manual version first where it makes sense.

**Resource:** Apna College Arrays and Oracle Arrays tutorial.

## 3:00 PM - 4:30 PM - CSS: syntax, inclusion, cascade, and inheritance

Learn and apply:

- CSS rule syntax: selector, property, and value
- Inline CSS
- Internal CSS
- External CSS
- The cascade and source order
- Inheritance
- Why inherited properties are different from non-inherited properties

Start a stylesheet for the Week 1 resume. Move presentation rules out of the HTML and into the external CSS file.

## 5:00 PM - 6:00 PM - Classic programs 7 and 8

Write from memory in Java:

7. GCD and LCM using the Euclidean algorithm
8. Swap two numbers without a temporary variable

Test normal, zero, and negative-value cases where they are meaningful. Add a short complexity comment to each program.

## 6:00 PM - 6:30 PM - Interview block

Answer aloud and write short answers for:

- **Java Q9:** How are arrays stored in memory? Array vs ArrayList.
- **HTML/CSS Q7:** Explain the CSS box model. What does `box-sizing: border-box` change?

Use a three-part answer: definition, comparison or example, and practical use.

## 6:30 PM - 7:15 PM - Aptitude and English

- **Aptitude:** Percentages: percentage increase/decrease and converting fractions to percentages.
- **English grammar:** Articles: `a`, `an`, and `the`.
- **Vocabulary:** compile, deploy, iterate, immutable, invoke.
- Read your 60-second self-introduction aloud once.

## 7:15 PM - 7:45 PM - Review

- Run every Java file created today.
- Record mistakes in the mistake notebook.
- Commit with a message such as `study: complete week 2 day 1 arrays and css basics`.

---

# DAY 2 - 2D ARRAYS, MATRIX SUMS, AND CSS SPECIFICITY

**Daily outcome:** Read, print, and calculate over rectangular and jagged matrices, while controlling CSS conflicts predictably.

## 9:30 AM - 10:00 AM - Revision

- Re-solve array reverse and second largest on paper.
- Explain why array rotation uses `k % n`.
- Recall the difference between the CSS cascade and inheritance.

## 10:00 AM - 12:00 PM - DSA: array cleanup and matrix foundations

Solve:

- Remove duplicates from a sorted array.
- Move all zeros to the end while preserving the order of non-zero values.
- Print a matrix.
- Calculate row-wise sums.
- Calculate column-wise sums.

For matrix work, first identify `rows` and `columns`. Test both square and rectangular matrices.

## 12:15 PM - 2:00 PM - Java: 2D arrays

Study and code:

- 2D array declaration
- 2D array initialisation
- Row traversal
- Column traversal
- Jagged arrays with different row lengths
- Matrix input and output using `Scanner`
- Matrix operations: row-wise sum and column-wise sum

Be careful not to assume every row in a jagged array has the same length. Use `matrix[row].length` when needed.

**Resource:** GfG Multidimensional Arrays and GfG Matrix programs.

## 3:00 PM - 4:30 PM - CSS: selectors and specificity

Learn and apply every selector below:

- Element selector
- Class selector
- ID selector
- Group selector
- Descendant selector
- Child selector
- Attribute selector
- Pseudo-class: `:hover`
- Pseudo-class: `:focus`
- Pseudo-class: `:nth-child`
- Pseudo-element: `::before`
- Pseudo-element: `::after`

Then study specificity and conflict resolution. Calculate specificity for sample selectors using the order:

1. Inline styles
2. IDs
3. Classes, attributes, and pseudo-classes
4. Elements and pseudo-elements
5. Source order when specificity is tied

Use `!important` only as a demonstration. Record why it should generally be avoided.

## 5:00 PM - 6:00 PM - Classic programs 9 and 10

Write from memory:

9. Count vowels, consonants, digits, and spaces in a string
10. Remove duplicates from an array

For the string program, decide how uppercase letters and non-letter symbols should be handled. For array duplicate removal, clearly state whether the input must be sorted.

## 6:00 PM - 6:30 PM - Interview block

Answer aloud and write:

- **Java Q10:** Why is array size fixed in Java? What happens on index out of bounds?
- **HTML/CSS Q8:** `em` vs `rem` vs `px` vs `%` - when do you use each?

## 6:30 PM - 7:15 PM - Aptitude and English

- **Aptitude:** Profit and loss basics: cost price, selling price, profit, loss, and percentage.
- **English grammar:** Prepositions of time and place.
- **Vocabulary:** instantiate, override, inherit, encapsulate, refactor.
- Read your self-introduction and improve one unclear sentence.

## 7:15 PM - 7:45 PM - Review

- Test a rectangular matrix and a jagged matrix.
- Check selector specificity with browser DevTools.
- Log one mistake and one useful shortcut from today.

---

# DAY 3 - MATRIX OPERATIONS, STRINGS, AND THE BOX MODEL

**Daily outcome:** Implement core matrix transformations and understand Java String creation and immutability.

## 9:30 AM - 10:00 AM - Revision

- Re-solve move-zeroes using the two-pointer idea.
- Review `matrix.length` versus `matrix[row].length`.
- Review selector specificity with three competing selectors.

## 10:00 AM - 12:00 PM - DSA: transpose, rotation, and spiral traversal

Solve:

- Transpose a matrix.
- Rotate a square matrix by 90 degrees.
- Traverse a matrix in spiral order.

For 90-degree rotation, understand both steps: transpose, then reverse each row. For spiral traversal, track top, bottom, left, and right boundaries and prevent duplicate traversal of the final row or column.

## 12:15 PM - 2:00 PM - Java: String class and String methods

Study and write examples for:

- String creation
- String literals versus `new String(...)`
- String pool
- Immutability
- `length()`
- `charAt()`
- `substring()`
- `indexOf()`
- `contains()`
- `split()`
- `replace()`
- `trim()`
- `toUpperCase()`
- `equals()` versus `equalsIgnoreCase()`
- `compareTo()`

Demonstrate that String operations return a new String when the original value is not changed. Compare strings with `.equals()`, not `==`, when comparing contents.

**Resource:** GfG Strings in Java and W3Schools String Methods.

## 3:00 PM - 4:30 PM - CSS: box model and units

Learn and apply:

- Content area
- Padding
- Border
- Margin
- `box-sizing: border-box`
- Margin collapse
- `px`
- `%`
- `em`
- `rem`
- `vh`
- `vw`
- `ch`
- `fr`

Add a clear card layout to the resume. Give the card controlled padding, border, margin, and width. Use `box-sizing: border-box` globally and verify the rendered size in DevTools.

## 5:00 PM - 6:00 PM - Classic programs 11 and 12

Write from memory:

11. Second largest element in an array
12. Sum of digits and reverse a number

Test duplicate maximum values, negative numbers where appropriate, zero, and numbers ending in zero. State the time and space complexity.

## 6:00 PM - 6:30 PM - Interview block

Answer aloud and write:

- **Java Q11:** Explain `String s = "abc"` vs `String s = new String("abc")` - how many objects are created?
- **HTML/CSS Q9:** Explain CSS specificity. Calculate specificity for a given selector.

## 6:30 PM - 7:15 PM - Aptitude and English

- **Aptitude:** Profit and loss word problems.
- **English grammar:** Subject-verb agreement.
- **Vocabulary:** use all ten Week 2 technical words in short sentences.
- Record one 60-second self-introduction attempt and listen back once.

## 7:15 PM - 7:45 PM - Review

- Verify matrix rotation on a 3x3 matrix and a non-square matrix where your implementation should reject or clearly handle the input.
- Check that the resume card does not overflow its parent.
- Update the pattern notebook with matrix boundaries and complexity.

---

# DAY 4 - STRING POOL, MATRIX SEARCH, AND POSITIONING

**Daily outcome:** Explain the String constant pool and use String APIs correctly; position resume elements without accidental overlap.

## 9:30 AM - 10:00 AM - Revision

- Explain why Java Strings are immutable.
- Trace spiral traversal on paper.
- Inspect the resume card's content, padding, border, and margin in DevTools.

## 10:00 AM - 12:00 PM - DSA: sorted matrix and diagonal work

Solve:

- Search in a row-and-column-sorted matrix.
- Calculate diagonal sums.
- Revisit transpose and 90-degree rotation with a timed attempt.

For the sorted matrix search, begin at the top-right or bottom-left corner and eliminate one row or column at each step. State the complexity in terms of rows and columns.

## 12:15 PM - 2:00 PM - Java: String pool and comparison practice

Deepen the String topic:

- Explain the String constant pool.
- Explain what `intern()` does.
- Compare String literals and heap-created Strings.
- Demonstrate reference comparison versus content comparison.
- Use `compareTo()` for lexicographical comparison.
- Combine `split`, `trim`, `replace`, and `toUpperCase` in a small text-cleaning program.

Write down the object-creation answer for common examples, including repeated literals and `new String(...)`.

## 3:00 PM - 4:30 PM - CSS: display, position, and z-index

Study and apply:

- `display: block`
- `display: inline`
- `display: inline-block`
- `display: none`
- `position: static`
- `position: relative`
- `position: absolute`
- `position: fixed`
- `position: sticky`
- `z-index`

Use `position: relative` on a suitable resume card and `position: absolute` for a small decorative label or badge. Use `sticky` or `fixed` only where it improves navigation. Check that no element overlaps text or becomes unreachable on a narrow viewport.

## 5:00 PM - 6:00 PM - Classic program revision

Rewrite programs 7-12 without opening yesterday's files:

- GCD and LCM
- Swap without a temporary variable
- Count vowels, consonants, digits, and spaces
- Remove duplicates from an array
- Second largest element
- Sum of digits and reverse a number

Compare your new version with the original only after finishing. Log every forgotten step.

## 6:00 PM - 6:30 PM - Interview block

Answer aloud and write:

- **Java Q12:** What does `intern()` do? How does the String constant pool work?
- **HTML/CSS Q10:** Explain all `position` values with a use case for each.

## 6:30 PM - 7:15 PM - Aptitude and English

- **Aptitude:** Mixed percentages and profit/loss questions under a 15-minute limit.
- **English grammar:** Correct five subject-verb agreement mistakes.
- **Vocabulary:** revise all ten technical words.
- Listen to your recorded self-introduction and write one improvement.

## 7:15 PM - 7:45 PM - Review

- Test the resume at a narrow width.
- Check absolute, fixed, and sticky elements for overlap.
- Add a matrix-search and diagonal-sum entry to the pattern notebook.

---

# DAY 5 - STRINGBUILDER, CHARACTER, AND RESPONSIVE POLISH

**Daily outcome:** Build strings efficiently in loops, use Character utilities, finish the remaining matrix problem, and complete the visual styling foundation.

## 9:30 AM - 10:00 AM - Revision

- Review String pool, `intern()`, and `.equals()`.
- Re-derive the matrix-search complexity.
- Review the difference between `display: none`, `visibility: hidden`, and opacity conceptually before the interview block.

## 10:00 AM - 12:00 PM - DSA: set matrix zeroes and mixed practice

Solve:

- Set matrix zeroes.
- Re-solve one array problem and one matrix problem selected from your mistake notebook.
- Time yourself for the final 45 minutes.

For set matrix zeroes, first distinguish original zeroes from zeroes created during the update. Learn the constant-space marker approach after understanding a row/column marker solution.

## 12:15 PM - 2:00 PM - Java: StringBuilder and Character class

Study and code:

- `StringBuilder`
- `append`
- `insert`
- `delete`
- `reverse`
- `setCharAt`
- Why StringBuilder beats String in loops
- `Character.isDigit`
- `Character.isLetter`
- `Character.toUpperCase`
- ASCII arithmetic

Create a small program that builds a sentence in a loop, edits selected characters, reverses text, and counts digits and letters. Explain why repeated String concatenation can create many temporary String objects.

**Resource:** Oracle StringBuilder and GfG Character class.

## 3:00 PM - 4:30 PM - CSS: visual styling and resume polish

Complete the remaining CSS fundamentals:

- Backgrounds
- Borders
- `border-radius`
- `box-shadow`
- Opacity
- Typography and colours
- `font-family` stacks
- Google Fonts
- Text properties

Use a restrained colour palette, readable typography, consistent spacing, and a card layout using only the box model and position. Make sure the styling remains readable and usable rather than decorative.

## 5:00 PM - 6:00 PM - DSA and classic-program checkpoint

Complete all 14 DSA problems once, using this checklist:

### Arrays (7)

- [ ] Reverse an array in place
- [ ] Rotate array by `k` left and right using the reversal algorithm
- [ ] Second largest element in one pass
- [ ] Remove duplicates from a sorted array
- [ ] Move all zeros to the end
- [ ] Check if an array is sorted / rotated sorted
- [ ] Union and intersection of two arrays

### 2D arrays / Matrix (7)

- [ ] Print matrix and row-wise / column-wise sum
- [ ] Transpose a matrix
- [ ] Rotate matrix by 90 degrees
- [ ] Spiral matrix traversal
- [ ] Search in a row-and-column-sorted matrix
- [ ] Diagonal sums
- [ ] Set matrix zeroes

For any failed problem, write the failure in the mistake notebook instead of silently copying the answer.

## 6:00 PM - 6:30 PM - Interview block

Answer aloud and write:

- **Java Q13:** Is Java pass-by-value or pass-by-reference? Prove it with an example using a primitive and an object.
- **HTML/CSS Q11:** `visibility: hidden` vs `display: none` vs `opacity: 0`.

## 6:30 PM - 7:15 PM - Aptitude and English

- **Aptitude:** 15-minute mixed percentages and profit/loss set.
- **English grammar:** Articles, prepositions, and subject-verb agreement mixed correction exercise.
- **Vocabulary:** use compile, deploy, iterate, immutable, invoke, instantiate, override, inherit, encapsulate, and refactor in a short paragraph.
- Record another 60-second self-introduction.

## 7:15 PM - 7:45 PM - Review

- Check colour contrast and text readability.
- Check the resume at 320px, 768px, and desktop width.
- Commit the completed CSS foundation and DSA checkpoint.

---

# DAY 6 - FULL PRACTICE, INTERVIEW RECALL, AND RESUME DELIVERY

**Daily outcome:** Demonstrate Week 2 skills without guided notes and finish a presentable, fully styled resume page.

## 9:30 AM - 10:00 AM - Final revision plan

- Look only at your mistake notebook and pattern notebook.
- Select the three problems and two Java topics that still feel slow.
- Set a timer for every practice section today.

## 10:00 AM - 12:00 PM - Timed DSA set

Complete a timed set containing:

- One array rotation or move-zeroes problem
- One second-largest or duplicate-removal problem
- One matrix traversal problem
- One sorted-matrix search problem
- One set-matrix-zeroes or matrix-rotation problem

After the timer ends, review every solution and write complexity for all 14 DSA problems. Your Week 2 target is **24 DSA problems total**, including the 10 Week 1 problems.

**Sheet reference:** Striver A2Z -> "Arrays [Easy]" and the first half of "Arrays [Medium]".

## 12:15 PM - 2:00 PM - Java consolidation

Review and code a small menu-driven practice program that demonstrates:

- 1D array traversal and `arr.length`
- One 2D or jagged array
- A String comparison using `.equals()`
- A StringBuilder loop
- Character digit and letter checks
- One manual array operation and one matrix operation

Then review the complete Week 2 Java list:

- 1D arrays: declaration, initialisation, traversal, `arr.length`, enhanced `for`
- Array operations: max/min, sum, reverse in-place, swap, copy, `Arrays.sort()`, `Arrays.toString()`
- 2D arrays: declaration, row/column traversal, jagged arrays, matrix input/output
- Matrix operations: transpose, addition, multiplication, diagonal sum
- String class: creation, literal vs `new`, string pool, immutability
- String methods: `length`, `charAt`, `substring`, `indexOf`, `contains`, `split`, `replace`, `trim`, `toUpperCase`, `equals` vs `equalsIgnoreCase`, `compareTo`
- StringBuilder: `append`, `insert`, `delete`, `reverse`, `setCharAt`, and loop performance
- Character class: `isDigit`, `isLetter`, `toUpperCase`, and ASCII arithmetic

Also verify that your Java practice includes matrix addition and multiplication, even if they were not part of the seven DSA problems.

## 3:00 PM - 4:30 PM - Resume mini-task completion

Finish the Week 1 HTML resume using:

- External CSS
- Typography
- Colours
- Spacing
- Box model
- A card layout
- Positioning
- Backgrounds, borders, border radius, box shadow, and opacity
- Selectors, pseudo-classes, and at least one pseudo-element

Check:

- No horizontal scrolling at mobile width
- Clear heading order
- Readable contrast
- Consistent spacing
- Focus styles for interactive elements
- No accidental overlap from positioned elements
- The page remains usable without relying on hover alone

## 5:00 PM - 6:00 PM - Final classic-program practice

Write programs 7-12 once more from memory:

7. GCD and LCM using the Euclidean algorithm
8. Swap two numbers without a temp variable
9. Count vowels, consonants, digits, and spaces in a string
10. Remove duplicates from an array
11. Second largest element in an array
12. Sum of digits and reverse a number

Run them with representative inputs and confirm that each contains a complexity comment.

## 6:00 PM - 6:30 PM - Final interview block

Answer aloud without notes:

- **Java Q14:** What is the difference between `length` for an array, `length()` for a String, and `size()` for a Collection?
- **HTML/CSS Q12:** Pseudo-class vs pseudo-element - give examples.
- **HTML/CSS Q13:** What is the cascade? How is inheritance different from the cascade?

Then quickly revise Java Q9-Q14 and HTML/CSS Q7-Q13. Your written bank must contain Java Q1-Q14 and HTML/CSS Q1-Q13 in `interview-prep/`.

## 6:30 PM - 7:15 PM - Aptitude and English

- **Aptitude:** final 15-minute percentages and profit/loss mini-test.
- **English grammar:** one final mixed exercise covering articles, prepositions, and subject-verb agreement.
- **Vocabulary:** revise all ten technical words.
- Record the final 60-second self-introduction and listen back once.

## 7:15 PM - 7:45 PM - Week 2 review and commit

- Update the mistake notebook.
- Update the pattern notebook with at least these patterns: two pointers, reversal rotation, frequency/counting, matrix boundaries, sorted matrix search, and marker-based matrix updates.
- Commit all work with a meaningful message.
- Complete the exit check below honestly.

---

# WEEK 2 EXIT CHECK

- [ ] 24 DSA problems total, complexity written for each
- [ ] Can solve any array/matrix manipulation problem in Java without help
- [ ] Resume page fully styled with box model, position, typography
- [ ] Java Q1-14 + HTML/CSS Q1-13 in `interview-prep/`
- [ ] Classic programs 1-12 written from memory
- [ ] Self-introduction recorded
- [ ] All 14 Week 2 DSA problems completed:
  - [ ] Reverse an array in place
  - [ ] Rotate array by `k` left and right using the reversal algorithm
  - [ ] Second largest element in one pass
  - [ ] Remove duplicates from a sorted array
  - [ ] Move all zeros to the end
  - [ ] Check if an array is sorted / rotated sorted
  - [ ] Union and intersection of two arrays
  - [ ] Print matrix and row-wise / column-wise sum
  - [ ] Transpose a matrix
  - [ ] Rotate matrix by 90 degrees
  - [ ] Spiral matrix traversal
  - [ ] Search in a row-and-column-sorted matrix
  - [ ] Diagonal sums
  - [ ] Set matrix zeroes
- [ ] Matrix addition and multiplication practiced in Java
- [ ] CSS mini-task completed using typography, colours, spacing, box model, and position

---

## WEEK 2 REFERENCE LIST

### Java

- Apna College Arrays
- Oracle Arrays tutorial
- GfG Multidimensional Arrays
- GfG Matrix programs
- GfG Strings in Java
- W3Schools String Methods
- Oracle StringBuilder
- GfG Character class

### DSA

- Striver A2Z -> "Arrays [Easy]" and the first half of "Arrays [Medium]"

### CSS

- MDN CSS
- Kevin Powell "CSS basics" videos
- freeCodeCamp CSS sections

---

## WEEK 2 DAILY RULES

1. Write code yourself before checking a solution.
2. Test empty, one-element, duplicate, sorted, reversed, and boundary inputs where they apply.
3. State time and space complexity aloud after every DSA problem and classic program.
4. Keep interview answers short first, then add a code example or comparison.
5. Spend the final review block logging mistakes and committing progress.
6. Do not remove a difficult problem from the plan; mark it for re-solving during Week 5 revision.
