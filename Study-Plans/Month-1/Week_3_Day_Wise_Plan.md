# WEEK 3 - DAY-WISE STUDY ROADMAP
## Java OOP + Prefix Sum/Kadane + Flexbox/Grid

**Theme:** Build strong Java OOP fundamentals while learning CSS layout systems and completing the next six DSA problems.

**Duration:** 6 study days + 1 weekly review day
**Time zone:** All times below are Indian Standard Time (IST, UTC+5:30).
**Target:** About 7 focused study hours per day, plus breaks
**Main deliverable:** A responsive portfolio layout built with Flexbox and Grid

> **Study rule:** For every Java concept, write a runnable example. For every DSA problem, record the approach, edge cases, time complexity, and space complexity. Explain one OOP concept aloud every day.

---

## WEEK 3 AT A GLANCE

| Day | Java OOP focus | DSA focus | CSS / project focus | Interview focus |
|-----|----------------|-----------|---------------------|------------------|
| D1 | Classes, objects, constructors, memory | Prefix sum array and range queries | Flexbox foundations | Java Q15, HTML/CSS Q14 |
| D2 | `this`, `static`, `final`, encapsulation | Equilibrium index | Flex alignment and sizing | Java Q16, HTML/CSS Q15 |
| D3 | Inheritance, `super`, overriding | Subarray sum equals K | Flexbox practice and navbar | Java Q17-18, HTML/CSS Q16 |
| D4 | Polymorphism and abstraction | Kadane's algorithm | Grid foundations and card layout | Java Q19-20, HTML/CSS Q17 |
| D5 | Interfaces and access modifiers | Maximum subarray with actual range | Responsive design and portfolio sections | Java Q21-23, HTML/CSS Q18-19 |
| D6 | `Object` class and OOP modelling | 2D prefix sum and mixed revision | Grid placement, responsive polish | Java Q24, HTML/CSS Q20 |
| Sunday | Full OOP and week revision | Timed six-problem review | Portfolio test and fixes | Mock interview and exit check |

---

## DAILY ROUTINE

| Time | Block | What to do |
|------|-------|------------|
| 10:00 AM - 10:30 AM | Revision and planning | Revise yesterday's Java and DSA notes; write today's target |
| 10:30 AM - 12:00 PM | DSA block 1 | Learn the pattern and solve the assigned problem |
| 12:00 PM - 12:15 PM | Break | Step away from the screen |
| 12:15 PM - 2:00 PM | Java block | Study the day's OOP topic and write runnable examples |
| 2:00 PM - 3:00 PM | Lunch and rest | Full break |
| 3:00 PM - 4:30 PM | CSS / project block | Learn the layout topic and apply it to the portfolio |
| 4:30 PM - 5:00 PM | Break | Full break |
| 5:00 PM - 6:00 PM | DSA block 2 / classic programs | Finish the DSA problem or write the assigned programs |
| 6:00 PM - 6:30 PM | Interview block | Write and answer the day's Java and HTML/CSS questions aloud |
| 6:30 PM - 7:00 PM | Aptitude | Ratio, proportion, or averages practice |
| 7:00 PM - 7:30 PM | English | Explain the day's OOP concept and learn 10 words |
| 7:30 PM - 8:00 PM | Review and Git | Log mistakes, update notes, test files, and commit the work |

**Focused study time:** Approximately 7 hours per day, excluding lunch and breaks.

---

# DAY 1 - CLASSES, OBJECTS, CONSTRUCTORS, AND PREFIX SUM

**Daily outcome:** Create Java objects confidently, explain stack versus heap at a beginner level, and answer range-sum queries in O(1) after preprocessing.

## 10:00 AM - 10:30 AM - Start-up revision

- Revise arrays, methods, and access to array elements.
- Explain the difference between a class and an object in your own words.
- Write today's target: create a small class with fields, methods, and three constructor forms.

## 10:30 AM - 12:00 PM - DSA: prefix sum and range queries

Learn and implement:

- Build a prefix sum array.
- Answer an inclusive range query from index `left` to `right` in O(1).
- Handle ranges beginning at index `0`.
- Compare repeated direct summation with prefix-sum preprocessing.
- Test empty arrays, one-element arrays, negative values, and invalid ranges.

**Deliverable:** A Java method that answers at least five range-sum queries and includes complexity notes.

## 12:15 PM - 2:00 PM - Java: classes, objects, and constructors

Study and code:

- Class declaration and object creation with `new`.
- Instance fields versus instance methods.
- Reference variables and object state.
- A simple explanation of stack references and heap objects.
- Default, parameterised, and copy constructors.
- Constructor overloading.
- Constructor chaining with `this()`.

**Practice model:** Create a `BankAccount` class with account number, owner, balance, deposit, withdrawal, and display methods.

## 3:00 PM - 4:30 PM - CSS: Flexbox foundations

Learn and apply:

- `display: flex`
- Main axis and cross axis
- `flex-direction`
- `justify-content`
- `align-items`
- `gap`
- `flex-wrap`

Build the portfolio shell with a header, navigation links, and a hero section.

## 5:00 PM - 6:00 PM - Classic program 13

Write from memory:

13. Matrix transpose

Use both a square matrix and a rectangular matrix. State the time and space complexity.

## 6:00 PM - 6:30 PM - Interview block

- **Java Q15:** What are the four pillars of OOP? Give a code example for each.
- **HTML/CSS Q14:** Flexbox versus Grid: when do you use which?

## 6:30 PM - 7:30 PM - Aptitude and English

- **Aptitude:** Ratios, equivalent ratios, and simplifying ratios.
- **English:** Explain classes and objects aloud for two minutes.
- **Vocabulary:** class, object, instance, constructor, instantiate, field, method, reference, heap, stack.

## 7:30 PM - 8:00 PM - Review

- Run the `BankAccount` and prefix-sum examples.
- Record one confusing point in the mistake notebook.
- Commit with a message such as `study: complete week 3 day 1 oop and prefix sum`.

---

# DAY 2 - `this`, `static`, `final`, AND ENCAPSULATION

**Daily outcome:** Use `this`, `static`, and `final` correctly, and protect object state with encapsulation.

## 10:00 AM - 10:30 AM - Revision

- Rebuild the prefix-sum formula without notes.
- Recreate the `BankAccount` constructors from memory.
- Explain the difference between an instance variable and a local variable.

## 10:30 AM - 12:00 PM - DSA: equilibrium index

Solve the equilibrium-index problem using total sum and a running left sum.

- Define what an equilibrium index means.
- Avoid recomputing left and right sums for every index.
- Test the first index, last index, multiple answers, and no answer.
- State why the solution is O(n) time and O(1) extra space.

## 12:15 PM - 2:00 PM - Java: `this`, `static`, and `final`

Write examples for all four common uses of `this`:

- Refer to the current object's field.
- Call the current object's method.
- Call another constructor with `this()`.
- Pass or return the current object with `this`.

Then practise:

- `static` variables, methods, and blocks.
- Why static members belong to the class.
- `final` variables, methods, and classes.
- Why a static method is hidden rather than overridden.

Add encapsulation to `BankAccount` using private fields, validation, getters, and carefully designed setters or methods.

## 3:00 PM - 4:30 PM - CSS: Flexbox alignment and sizing

Learn and apply:

- `align-content`
- `flex-grow`, `flex-shrink`, and `flex-basis`
- The meaning of `flex: 1`
- `align-self`
- `order`

Build a responsive skills row and make it wrap cleanly on narrow screens.

## 5:00 PM - 6:00 PM - Classic program 14

Write from memory:

14. Matrix addition and matrix multiplication

Validate dimensions before multiplying matrices. Include complexity notes.

## 6:00 PM - 6:30 PM - Interview block

- **Java Q16:** Constructor versus method: five differences. Can a constructor be `final`, `static`, or `abstract`?
- **HTML/CSS Q15:** Explain `justify-content` versus `align-items`, including axis changes with `flex-direction`.

## 6:30 PM - 7:30 PM - Aptitude and English

- **Aptitude:** Proportion and direct/inverse proportion.
- **English:** Explain encapsulation and why private fields matter. Record this explanation.
- **Vocabulary:** encapsulation, private, getter, setter, static, final, immutable, validation, invariant, access.

## 7:30 PM - 8:00 PM - Review

- Test invalid deposits and withdrawals.
- Check that outside code cannot directly modify private account fields.
- Commit today's Java, DSA, and CSS work.

---

# DAY 3 - INHERITANCE, `super`, AND METHOD OVERRIDING

**Daily outcome:** Build an inheritance hierarchy, use `super` correctly, and distinguish overloading from overriding.

## 10:00 AM - 10:30 AM - Revision

- Explain the four uses of `this` without notes.
- Review static versus instance members.
- Re-solve equilibrium index on paper.

## 10:30 AM - 12:00 PM - DSA: subarray sum equals K

Implement the prefix-sum plus `HashMap` solution.

- Store prefix-sum frequencies.
- Look for `currentSum - k` before updating the current sum's frequency.
- Count all matching subarrays, including overlapping ranges.
- Test `k = 0`, negative values, and arrays beginning with a valid subarray.

**Deliverable:** Explain why a sliding window does not work reliably when negative numbers are allowed.

## 12:15 PM - 2:00 PM - Java: inheritance and overriding

Study and code:

- `extends` with single, multilevel, and hierarchical inheritance.
- The `super` field, `super` method, and `super()` constructor.
- Constructor order in a parent-child hierarchy.
- Method overriding and the `@Override` annotation.
- Overriding rules: visibility, `final`, `static`, private methods, and checked exceptions.
- Covariant return types.
- Why Java does not support multiple inheritance for classes.

**Practice model:** Create `Employee`, `Developer`, and `Manager` classes with overridden `calculatePay()` or `getRole()` methods.

## 3:00 PM - 4:30 PM - CSS: Flexbox navbar and hero

Build by hand:

- A responsive navbar using Flexbox.
- A hero section with text and an action link.
- A mobile-first layout that changes direction at a breakpoint.
- A footer with evenly distributed columns.

## 5:00 PM - 6:00 PM - Classic program 15

Write from memory:

15. Bubble sort, including swap count

Show an early-exit optimisation when a pass makes no swaps.

## 6:00 PM - 6:30 PM - Interview block

- **Java Q17:** What is constructor chaining? Explain `this()` versus `super()`.
- **Java Q18:** Method overloading versus method overriding, using a full comparison table.
- **HTML/CSS Q16:** What does `flex: 1` actually mean?

## 6:30 PM - 7:30 PM - Aptitude and English

- **Aptitude:** Averages: basic average, replacing a value, and combined average.
- **English:** Explain inheritance and overriding aloud for two minutes.
- **Vocabulary:** inherit, extend, override, parent, child, super, hierarchy, polymorphic, covariant, visibility.

## 7:30 PM - 8:00 PM - Review

- Test parent-reference and child-object behaviour.
- Record the difference between overloading and overriding in the mistake notebook.
- Commit today's work.

---

# DAY 4 - POLYMORPHISM, DYNAMIC DISPATCH, AND ABSTRACTION

**Daily outcome:** Predict runtime method selection and design an abstract class for shared behaviour.

## 10:00 AM - 10:30 AM - Revision

- Draw the `Employee` hierarchy from memory.
- Explain `super()` constructor order.
- Re-solve one subarray-sum example manually with a prefix-sum table.

## 10:30 AM - 12:00 PM - DSA: Kadane's algorithm

Implement maximum subarray sum with Kadane's algorithm.

- Track the best sum ending at the current index.
- Track the best sum seen overall.
- Decide how the algorithm handles an all-negative array.
- Test one-element, all-negative, all-positive, and mixed arrays.
- Compare the O(n) solution with brute force.

## 12:15 PM - 2:00 PM - Java: polymorphism and abstraction

Study and code:

- Compile-time polymorphism through method overloading.
- Runtime polymorphism through method overriding.
- Upcasting and downcasting.
- Dynamic method dispatch.
- Safe downcasting with `instanceof`.
- Abstract classes and abstract methods.
- Concrete methods and constructors in abstract classes.
- When an abstract class is appropriate.

**Practice model:** Create an abstract `Shape` class with `area()` and ` describe()` methods, then implement `Circle` and `Rectangle`.

## 3:00 PM - 4:30 PM - CSS: Grid foundations

Learn and apply:

- `display: grid`
- `grid-template-columns` and `grid-template-rows`
- `fr` units
- `repeat()`
- `gap`
- `minmax()`
- `auto-fit` and `auto-fill`

Build the portfolio skills grid and a three-card projects section.

## 5:00 PM - 6:00 PM - Classic program 16

Write from memory:

16. Selection sort, including the selected minimum index on each pass

State time and space complexity and compare it with bubble sort.

## 6:00 PM - 6:30 PM - Interview block

- **Java Q19:** What is runtime polymorphism or dynamic method dispatch? How does the JVM resolve it?
- **Java Q20:** Abstract class versus interface: when do you choose which?
- **HTML/CSS Q17:** What are media queries? What is mobile-first design and why is it preferred?

## 6:30 PM - 7:30 PM - Aptitude and English

- **Aptitude:** Mixed ratio, proportion, and average questions.
- **English:** Explain polymorphism and abstraction aloud for two minutes.
- **Vocabulary:** abstract, concrete, dispatch, upcast, downcast, instance, runtime, compile-time, dynamic, implementation.

## 7:30 PM - 8:00 PM - Review

- Test an array of `Shape` references containing different shape objects.
- Verify that all-negative Kadane input gives the correct result.
- Commit today's work.

---

# DAY 5 - INTERFACES, ACCESS MODIFIERS, AND RESPONSIVE DESIGN

**Daily outcome:** Use interfaces for contracts and multiple behaviour types, understand package access, and make the portfolio responsive.

## 10:00 AM - 10:30 AM - Revision

- Explain abstract class versus interface.
- Re-solve Kadane's algorithm with an all-negative input.
- Review `auto-fit`, `minmax()`, and `fr`.

## 10:30 AM - 12:00 PM - DSA: maximum subarray with actual range

Extend Kadane's algorithm to print the actual subarray.

- Track the candidate start index.
- Update the start when a new subarray begins.
- Save the best start and end whenever the best sum changes.
- Print the sum and the selected elements.
- Test ties and all-negative input.

## 12:15 PM - 2:00 PM - Java: interfaces and access modifiers

Study and code:

- Interface declaration and `implements`.
- Multiple interfaces on one class.
- Interface constants.
- Abstract, default, static, and private interface methods.
- Why interfaces do not have constructors.
- Interface versus abstract class.
- `private`, package-private/default, `protected`, and `public`.
- Same class, same package, subclass in another package, and world access.
- Packages and `import`.

**Practice model:** Create a `Vehicle` interface with `start()` and `stop()`, then implement it in `Car` and `Bike`. Add a second interface such as `Electric`.

## 3:00 PM - 4:30 PM - CSS: responsive portfolio sections

Build and connect:

- About section using a two-column Grid layout on larger screens.
- Skills grid using `repeat(auto-fit, minmax(...))`.
- Projects card grid.
- Contact form.
- Responsive images with `max-width: 100%` and `height: auto`.
- Mobile-first media queries.
- Breakpoints based on layout needs, not device names.

## 5:00 PM - 6:00 PM - Portfolio project block

Combine the header, hero, about, skills, projects, contact form, and footer into one page. Check that no text overlaps at narrow widths.

## 6:00 PM - 6:30 PM - Interview block

- **Java Q21:** Can an interface have a constructor or method bodies? Explain default, static, and private methods.
- **Java Q22:** Why does Java not support multiple inheritance for classes? How do interfaces solve it?
- **Java Q23:** Explain all four access modifiers using the full access table.
- **HTML/CSS Q18:** Give four different ways to centre a `div`.
- **HTML/CSS Q19:** What is `fr` in Grid? Compare `auto-fit` and `auto-fill`.

## 6:30 PM - 7:30 PM - Aptitude and English

- **Aptitude:** Averages and ratio word problems.
- **English:** Explain interfaces and access modifiers aloud. Record this explanation.
- **Vocabulary:** interface, contract, default, package, protected, public, modifier, implement, abstraction, composition.

## 7:30 PM - 8:00 PM - Review

- Compile the interface examples from the command line.
- Test access from at least two packages if your project structure supports it.
- Check the portfolio at a narrow mobile width.
- Commit today's work.

---

# DAY 6 - `Object`, OOP MODELLING, 2D PREFIX SUM, AND GRID PLACEMENT

**Daily outcome:** Explain the `Object` class contract, model real systems, and answer 2D sub-matrix queries efficiently.

## 10:00 AM - 10:30 AM - Revision

- Review the access-modifier table.
- Explain why interfaces can support multiple behaviour contracts.
- Re-solve the actual-subarray Kadane problem from memory.

## 10:30 AM - 12:00 PM - DSA: 2D prefix sum

Implement a 2D prefix-sum matrix and answer sub-matrix sum queries.

- Build the prefix matrix using inclusion-exclusion.
- Query any rectangle in O(1).
- Handle rectangles touching the first row or first column.
- Test square, rectangular, positive, negative, and one-cell matrices.
- State preprocessing and query complexity separately.

Then do a quick revision of all six Week 3 DSA problems.

## 12:15 PM - 2:00 PM - Java: `Object` class and OOP modelling

Study and code:

- `toString()` for readable object output.
- `equals()` for logical equality.
- `hashCode()` and the rule that equal objects must have equal hash codes.
- `getClass()`.
- Why mutable fields used in `equals()` and `hashCode()` can cause collection bugs.

Complete five small models:

1. `BankAccount` with encapsulation.
2. `Library` with books and members.
3. `Employee` hierarchy with overriding.
4. Abstract `Shape` with concrete shapes.
5. `Vehicle` interface with multiple implementations.

Also write one paragraph each on composition versus inheritance and the five SOLID principles.

## 3:00 PM - 4:30 PM - CSS: Grid placement and final layout

Learn and apply:

- Grid item placement with line numbers.
- `grid-column`, `grid-row`, and `grid-area`.
- `grid-template-areas` for the portfolio page.
- Alignment with `place-items`, `justify-items`, and `align-items`.
- A centred modal using Grid or Flexbox.
- Responsive sidebar layout.

Finish the first complete portfolio version.

## 5:00 PM - 6:00 PM - Portfolio validation

Check the portfolio at approximately 320px, 768px, 1024px, and 1440px widths.

- Confirm navigation, cards, form fields, and images fit.
- Confirm the page uses both Flexbox and Grid meaningfully.
- Complete remaining Flexbox Froggy and Grid Garden levels.

## 6:00 PM - 6:30 PM - Interview block

- **Java Q24:** What are static blocks, static variables, and static methods? Can static methods be overridden?
- **HTML/CSS Q20:** What makes a site responsive?
- **Bonus:** Explain the `equals()` and `hashCode()` contract, composition versus inheritance, and SOLID in one line each.

## 6:30 PM - 7:30 PM - Aptitude and English

- **Aptitude:** 15-question mixed ratio, proportion, and average set.
- **English:** Explain `equals()` and `hashCode()` aloud for two minutes.
- **Vocabulary:** equality, hash, contract, identity, composition, cohesion, coupling, principle, responsive, breakpoint.

## 7:30 PM - 8:00 PM - Review

- Run every Java example created this week.
- Add unresolved OOP questions to the mistake notebook.
- Commit the complete portfolio draft.

---

# SUNDAY - WEEKLY REVIEW, MOCK INTERVIEW, AND EXIT CHECK

**Daily outcome:** Prove that you can design and explain an OOP system without notes, solve the six DSA problems, and show a responsive portfolio.

## 10:00 AM - 10:30 AM - Weekly review

- Review the mistake notebook.
- List the three OOP topics that still feel least automatic.
- Prepare a verbal requirement for a four-class system.

## 10:30 AM - 12:00 PM - Java OOP practical checkpoint

Without notes or autocomplete, design and code a small system containing:

- At least four classes.
- One inheritance relationship.
- One abstract class.
- One interface.
- Encapsulation with private fields.
- At least one overridden method.
- Correct `equals()`, `hashCode()`, and `toString()` for one model class.

Suggested prompt: design a delivery system with `User`, `Driver`, `Vehicle`, an abstract `Delivery`, and a `Trackable` interface.

## 12:15 PM - 1:45 PM - DSA timed review

Solve without looking at solutions:

1. Prefix sum range query.
2. Equilibrium index.
3. Subarray sum equals K.
4. Kadane's algorithm.
5. Maximum subarray with actual range.
6. 2D prefix sum query.

Give yourself 15 minutes per problem, then spend the remaining time checking edge cases and complexity.

## 1:45 PM - 2:45 PM - Lunch and rest

## 2:45 PM - 4:15 PM - Portfolio responsive review

- Test the page at 320px, 768px, 1024px, and 1440px.
- Fix overflow, overlapping text, stretched images, and unusable controls.
- Confirm the layout is mobile-first.
- Confirm the portfolio includes header/nav, hero, about, skills, projects, contact form, and footer.

## 4:15 PM - 4:45 PM - Break

## 4:45 PM - 5:45 PM - Mock interview

Answer aloud, without notes:

- Java Q15-24.
- HTML/CSS Q14-20.
- Bonus questions on `equals()`/`hashCode()`, composition, and SOLID.

Mark each answer as **clear**, **partial**, or **needs revision**.

## 5:45 PM - 6:15 PM - Break

## 6:15 PM - 7:15 PM - Classic programs review

Write from memory:

- Matrix transpose.
- Matrix addition and multiplication.
- Bubble sort with swap count.
- Selection sort.

Compare each solution with the expected time and space complexity.

## 7:15 PM - 7:45 PM - Aptitude and English

- Complete one 15-minute mixed aptitude test and review every mistake.
- Give a five-minute English explanation of what you learned in Java OOP this week.
- Confirm that two OOP explanations were recorded this week.

## 7:45 PM - 8:15 PM - Commit and exit check

- Commit all completed work.
- Mark unfinished tasks in the mistake notebook with a recovery date.
- Do not begin Week 4 until the core checkpoint is attempted honestly.

---

## WEEK 3 EXIT CHECK

- [ ] 30 DSA problems total, with the six Week 3 problems solved and explained
- [ ] Can design and code a four-class OOP system verbally, without notes
- [ ] Can use inheritance, an interface, and an abstract class in one system
- [ ] Can explain constructors, `this`, `static`, `final`, encapsulation, polymorphism, and access modifiers
- [ ] Can explain the `equals()` and `hashCode()` contract
- [ ] Flexbox Froggy levels completed
- [ ] Grid Garden levels completed
- [ ] Portfolio includes header/nav, hero, about, skills, projects, contact form, and footer
- [ ] Portfolio works at mobile and desktop widths
- [ ] Java Q15-24 written and answered
- [ ] HTML/CSS Q14-20 written and answered
- [ ] Classic programs 13-16 written from memory
- [ ] Five OOP concepts explained aloud; two explanations recorded
- [ ] Ratio, proportion, and average practice completed daily

## REQUIRED WEEK 3 FILES / DELIVERABLES

- `dsa/month-1/week-3/` - six prefix-sum and Kadane solutions with notes
- `interview-prep/01-java-oop.md` - Java Q15-24 and bonus answers
- `interview-prep/02-html-css.md` - HTML/CSS Q14-20
- `classic-programs/` - programs 13-16 with complexity notes
- `portfolio/` - responsive HTML and CSS using Flexbox and Grid
- `notebooks/mistake-notebook.md` - every failed test or unclear concept
