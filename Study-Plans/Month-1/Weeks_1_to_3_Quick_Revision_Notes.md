# WEEKS 1-3 QUICK REVISION NOTES
## Java Foundations, Arrays/Strings, OOP, DSA, HTML/CSS

**Test revision sheet:** Read the definitions, formulas, comparisons, and checklists first. For every coding problem, say the approach and complexity aloud.

---

# 1. JAVA FOUNDATIONS

## JDK, JRE, JVM and execution

- **JDK:** JRE + development tools such as `javac`, debugger, and documentation tools.
- **JRE:** JVM + Java class libraries required to run Java programs.
- **JVM:** Loads, verifies, and executes bytecode; JVM differs by operating system.
- Flow: `.java` source -> `javac` -> `.class` bytecode -> JVM -> machine code.
- `main`: `public static void main(String[] args)`.
- Java is platform independent because the same bytecode runs on any compatible JVM.

## Variables and data types

- **Primitive:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
- Typical sizes: byte 8-bit, short 16-bit, int 32-bit, long 64-bit, float 32-bit, double 64-bit, char 16-bit; boolean size is JVM-dependent.
- **Reference:** stores a reference to an object, for example `String`, arrays, and classes.
- **Widening cast:** automatic, smaller compatible type to larger type: `int` -> `long`.
- **Narrowing cast:** explicit and may lose data: `double` -> `int`.
- Literals: integer, floating-point, character, string, boolean, and `null` reference literal.
- Local variables must be initialised before use.

## Operators and input/output

- Arithmetic: `+ - * / %`; relational: `== != > < >= <=`.
- Logical: `&& || !`; bitwise: `& | ^ ~ << >> >>>`; ternary: `condition ? a : b`.
- Parentheses control precedence; arithmetic before relational, relational before logical, assignment last.
- `Scanner` reads input; `System.out.print`, `println`, and `printf` produce output.
- Beware `nextInt()` followed by `nextLine()` because of the leftover newline.

## Conditions and loops

- `if`, `else if`, `else`; nested conditions; `switch` and enhanced switch.
- `for`: known repetition; `while`: condition-first; `do-while`: runs at least once.
- `break` exits a loop/switch; `continue` skips to the next iteration.
- Nested loops multiply complexity: two loops of size `n` usually O(n^2).

## Methods and recursion

- Method parts: access modifier, return type, name, parameters, body.
- `void` returns nothing; parameters receive values; Java is pass-by-value.
- Scope: local, parameter, instance, and class/static scope.
- **Overloading:** same method name, different parameter list; return type alone is not enough.
- Recursion needs a base case and a smaller recursive call; include stack-space cost.

## Big O essentials

- One loop: O(n); nested loops: O(n^2); sequential loops: O(n + m), or O(n) if both use `n`.
- Halving/doubling loop: O(log n).
- Binary search: O(log n); linear scan: O(n).
- Constant work: O(1); sorting usually O(n log n); brute-force subarrays often O(n^2).
- **O:** upper bound; **Omega:** lower bound; **Theta:** tight bound.
- Best/average/worst case must be identified for the specific algorithm.
- Space complexity includes extra memory and recursion stack; input storage is usually excluded.

---

# 2. ARRAYS, MATRICES, AND STRINGS

## Arrays

- Fixed size, indexed from `0`; use `arr.length`, not `length()` or `size()`.
- Traverse with normal or enhanced `for`; validate indexes to avoid `ArrayIndexOutOfBoundsException`.
- Core operations: max/min, sum/average, frequency, linear search, swap, copy, reverse, `Arrays.sort`, `Arrays.toString`.
- Array memory is contiguous conceptually and stores primitives or references; `ArrayList` is resizable.
- 2D arrays are arrays of arrays; jagged rows may have different lengths, so use `matrix[row].length`.
- Matrix dimensions: rows = `matrix.length`, columns = `matrix[row].length`.

## Array patterns

- **Reverse:** two pointers, swap inward; O(n) time, O(1) space.
- **Rotate by k:** use `k % n`; reversal algorithm; O(n), O(1).
- **Second largest:** one pass with largest and second-largest; decide duplicate policy.
- **Remove duplicates from sorted array:** keep/write pointer; O(n), O(1).
- **Move zeroes:** write non-zero values, fill remaining positions with zero; O(n), O(1).
- **Sorted/rotated check:** count order breaks; usually O(n).
- **Union/intersection:** sorting or frequency/set; state whether duplicates are retained.
- **Matrix transpose:** `result[col][row] = matrix[row][col]`; square in-place is possible.
- **Rotate matrix 90 degrees:** transpose, then reverse each row; square matrix.
- **Spiral traversal:** maintain `top`, `bottom`, `left`, `right`; guard against duplicate final row/column.
- **Sorted matrix search:** begin top-right or bottom-left; O(rows + columns).
- **Diagonal sum:** primary `i == j`, secondary `i + j == n - 1`; avoid double-counting centre.
- **Set matrix zeroes:** mark original zero rows/columns before changing cells; constant-space markers are an optimisation.
- **Matrix addition:** same dimensions; element-wise sum.
- **Matrix multiplication:** `A[rows][common] * B[common][columns]`; result is `rows x columns`; O(r * common * c).

## Strings and text

- `String` literals use the String pool; `new String("x")` creates a heap object as well.
- Strings are immutable; operations return new strings.
- Use `.equals()` for content, `==` for reference identity.
- Important methods: `length`, `charAt`, `substring`, `indexOf`, `contains`, `split`, `replace`, `trim`, `toUpperCase`, `equalsIgnoreCase`, `compareTo`.
- `intern()` returns the pooled representation.
- `StringBuilder` is mutable and efficient for repeated edits: `append`, `insert`, `delete`, `reverse`, `setCharAt`.
- `StringBuffer` is synchronised; use it when thread-safe mutable text is required.
- `Character.isDigit`, `isLetter`, `toUpperCase`; ASCII arithmetic can convert characters.

---

# 3. JAVA OOP

## Class, object, constructor

- **Class:** blueprint containing fields and methods. **Object:** runtime instance created with `new`.
- Instance fields belong to objects; static fields belong to the class.
- Constructor has the class name, no return type, and initialises objects.
- Default/no-argument, parameterised, copy, and overloaded constructors are common.
- `this()` calls another constructor in the same class and must be first.
- `super()` calls the parent constructor and must be first; Java inserts it if no explicit constructor call exists.
- Stack commonly holds local references; heap holds objects. Use this as a simplified model.

## `this`, `static`, `final`

- `this.field` distinguishes an instance field from a parameter.
- `this.method()` calls the current object's method.
- `this()` chains constructors.
- `this` can be passed or returned.
- `static` variables are shared; static blocks run during class initialisation; static methods cannot directly access instance members.
- Static methods are hidden, not overridden.
- `final` variable is assigned once; final method cannot be overridden; final class cannot be extended.
- Constructors cannot be `static`, `final`, or `abstract`.

## Encapsulation

- Keep fields `private`; expose controlled getters and behaviour methods.
- Validate state changes in methods such as `deposit` and `withdraw`.
- Benefits: data hiding, validation, low coupling, maintainability, and preserved invariants.

## Inheritance and overriding

- `extends` supports single, multilevel, and hierarchical inheritance.
- `super.field`, `super.method()`, and `super()` access parent members/constructor.
- Overriding requires the same signature; use `@Override`.
- Cannot reduce visibility; final/static/private methods are not overridden in the normal sense.
- Static methods are hidden; private methods are not inherited.
- Checked exceptions cannot be broader in an override.
- Covariant return type allows a more specific return type.
- Java avoids multiple class inheritance to prevent ambiguity such as the diamond problem; interfaces provide multiple contracts.

## Polymorphism

- **Compile-time:** overloading; method selected from reference type and arguments.
- **Runtime:** overriding; method selected from actual object type through dynamic dispatch.
- Upcasting: `Parent p = new Child();` is safe and enables polymorphism.
- Downcasting: `(Child) p`; only do it after `p instanceof Child`.
- Fields and static methods are resolved by reference type; overridden instance methods use runtime object type.

## Abstraction

- Abstract class may have fields, constructors, concrete methods, and abstract methods.
- Abstract methods have no body and must be implemented by concrete subclasses.
- Use an abstract class when related types share state or implementation.

## Interfaces

- A class uses `implements`; it may implement multiple interfaces.
- Interfaces define contracts and constants; methods may be abstract, `default`, `static`, or private helper methods.
- Interfaces have no constructors and cannot be instantiated.
- Use an interface for a capability/contract across unrelated classes; use an abstract class for shared base state and behaviour.

## Access modifiers

| Context | private | default/package | protected | public |
|---|---:|---:|---:|---:|
| Same class | Yes | Yes | Yes | Yes |
| Same package | No | Yes | Yes | Yes |
| Subclass, different package | No | No | Yes, through inheritance | Yes |
| Unrelated class, different package | No | No | No | Yes |

- `import` makes classes from another package available by simple name.

## Object class

- `toString()` gives readable text; override it for useful output.
- `equals()` checks logical equality; `==` checks reference identity for objects.
- `hashCode()` must obey: if `a.equals(b)` is true, `a.hashCode() == b.hashCode()` must be true.
- Equal objects should remain consistent while used in hash collections; mutable key fields are risky.
- `getClass()` returns the runtime class.
- Composition means “has-a”; inheritance means “is-a”. Prefer composition when reuse does not represent a true subtype.
- SOLID: Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion.

---

# 4. DSA: 30-PROBLEM CHECKLIST

## Week 1: complexity + arrays (1-10)

1. Analyse a single-loop snippet.
2. Analyse nested loops.
3. Analyse a halving/logarithmic loop.
4. Analyse recursion.
5. Analyse two sequential loops; write O, Omega, Theta and best/average/worst.
6. Traverse and print an array.
7. Find maximum and minimum.
8. Find sum and average.
9. Count frequency of an element.
10. Linear search.

## Week 2: arrays and matrices (11-24)

11. Reverse an array in place.
12. Rotate array by `k` left and right.
13. Second largest element.
14. Remove duplicates from sorted array.
15. Move zeroes to the end.
16. Check sorted/rotated sorted array.
17. Union and intersection.
18. Matrix print and row/column sums.
19. Matrix transpose.
20. Matrix rotate 90 degrees.
21. Spiral traversal.
22. Search row-and-column-sorted matrix.
23. Diagonal sums.
24. Set matrix zeroes.

## Week 3: prefix sum and Kadane (25-30)

25. Build prefix sum and answer range queries in O(1) after O(n) preprocessing.
26. Equilibrium index using total sum and left sum; O(n), O(1).
27. Subarray sum equals K using prefix-sum frequency map; O(n) average, O(n) space.
28. Kadane maximum subarray sum; O(n), O(1); handle all-negative input.
29. Kadane with actual subarray start/end indexes.
30. 2D prefix sum and O(1) sub-matrix queries after preprocessing.

**For every problem:** write input/output, brute force, optimal approach, edge cases, time, space, and one verbal explanation.

---

# 5. HTML QUICK REVISION

- Document: `<!DOCTYPE html>`, `html`, `head`, `body`, `title`, meta tags, favicon.
- Text: headings, paragraph, `br`, `hr`, `strong`/`b`, `em`/`i`, `span`, `div`.
- Links/images: `a`, `target`, relative/absolute paths, `img`, `alt`, basic `srcset`.
- Lists: `ul`, `ol`, `dl`; tables: `table`, `thead`, `tbody`, `th`, `td`, `colspan`, `rowspan`.
- Semantic structure: `header`, `nav`, `main`, `section`, `article`, `aside`, `footer`, `figure`.
- Forms: `form`, labels, text/email/password/number/date/radio/checkbox/file inputs, `select`, `textarea`, `button`, `required`, `placeholder`, `pattern`.
- Media: `audio`, `video`, `iframe`.
- Accessibility: useful `alt`, label every form control, logical heading order, keyboard-friendly controls.

---

# 6. CSS FUNDAMENTALS AND LAYOUT

## CSS foundations

- Syntax: `selector { property: value; }`; include inline, internal, or external CSS.
- Cascade order depends on importance, origin, specificity, and source order.
- Inheritance passes selected properties from parent; cascade decides conflicts.
- Specificity order: inline > ID > class/attribute/pseudo-class > element/pseudo-element; source order breaks ties.
- Selectors: element, class, ID, group, descendant, child, attribute, `:hover`, `:focus`, `:nth-child`, `::before`, `::after`.
- Avoid `!important` except for controlled exceptions.
- Colours: hex, `rgb`, `rgba`, `hsl`; use readable font stacks and text properties.
- Box model: content + padding + border + margin; use `box-sizing: border-box`.
- Units: `px`, `%`, `em`, `rem`, `vh`, `vw`, `ch`, `fr`.
- Display: block, inline, inline-block, none.
- Position: static, relative, absolute, fixed, sticky; `z-index` controls stacking contexts.
- Visuals: backgrounds, borders, radius, shadows, opacity.

## Flexbox

- `display: flex`; one-dimensional layout.
- Main axis is controlled by `flex-direction`; cross axis is perpendicular.
- `justify-content` aligns on the main axis; `align-items` aligns on the cross axis.
- `align-content` distributes wrapped lines, not individual items.
- `flex-wrap` allows wrapping; `gap` adds consistent spacing.
- `flex-grow`, `flex-shrink`, `flex-basis` control flexible sizing.
- `flex: 1` commonly means `flex-grow: 1; flex-shrink: 1; flex-basis: 0%`.
- `align-self` overrides one item; `order` changes visual order.
- Good for navbars, rows, toolbars, centred content, and one-dimensional alignment.

## Grid

- `display: grid`; two-dimensional layout.
- Use `grid-template-columns/rows`, `repeat()`, `fr`, `minmax()`, and `gap`.
- `auto-fit` collapses empty tracks and fits existing items; `auto-fill` preserves available tracks.
- Place items with `grid-column`, `grid-row`, and `grid-area`.
- Use `grid-template-areas` for named page regions.
- Alignment: `place-items`, `justify-items`, `align-items`.
- Good for card grids, page regions, sidebars, and two-dimensional layouts.

## Responsive design and project

- Mobile-first: write base styles for small screens, enhance with `@media` queries.
- Use layout-driven breakpoints, fluid units, flexible images (`max-width: 100%; height: auto`), and the viewport meta tag.
- Build: responsive navbar, hero, about section, skills grid, project cards, contact form, footer, sidebar, and centred modal.
- Test at 320, 768, 1024, and 1440px; check overflow, overlap, contrast, focus states, and readable text.
- Portfolio must use both Flexbox and Grid.
- Complete Flexbox Froggy (24 levels) and Grid Garden (28 levels).

---

# 7. INTERVIEW QUESTION BANK: JAVA 1-24

1. **JDK/JRE/JVM?** JDK develops, JRE runs, JVM executes bytecode.
2. **Platform independence/bytecode?** Source compiles to JVM bytecode, then the platform JVM executes it.
3. **Eight primitives/sizes and reference types?** Know all eight, their typical sizes, and that references point to objects.
4. **Type casting?** Widening is automatic; narrowing is explicit and may lose data.
5. **`==` vs `.equals()`?** `==` compares primitive values/references; `.equals()` compares logical content when overridden.
6. **String immutability/pool?** Immutable Strings are safe/shareable; literals are pooled.
7. **String vs StringBuilder vs StringBuffer?** Immutable text, fast mutable text, synchronised mutable text.
8. **Overload by return type alone?** No; the parameter list must differ.
9. **Array memory/ArrayList?** Arrays are fixed-size indexed structures; ArrayList resizes and provides collection methods.
10. **Why fixed size/index error?** Array length is fixed after creation; invalid indexes throw `ArrayIndexOutOfBoundsException`.
11. **`"abc"` vs `new String("abc")`?** Literal uses pool; `new` creates a distinct heap object and may reuse the literal value internally.
12. **`intern()`/pool?** Returns the canonical pooled String.
13. **Pass-by-value or reference?** Java always passes values; object values are copied references.
14. **`length`, `length()`, `size()`?** Array field, String method, Collection method.
15. **Four OOP pillars?** Encapsulation, inheritance, polymorphism, abstraction; give code examples.
16. **Constructor vs method?** Constructor initialises, has class name, no return type, runs on creation, and is not inherited; it cannot be final/static/abstract.
17. **Constructor chaining?** `this()` calls same-class constructor; `super()` calls parent constructor; each must be first.
18. **Overloading vs overriding?** Overloading is compile-time/different parameters; overriding is runtime/same signature in a child.
19. **Runtime polymorphism?** A parent reference calls the overridden method of the actual child object through dynamic dispatch.
20. **Abstract class vs interface?** Abstract class shares state/code; interface defines capabilities and supports multiple implementation.
21. **Interface constructor and method bodies?** No constructor/instance creation; abstract, default, static, and private methods may have bodies as allowed.
22. **No multiple class inheritance?** Ambiguous inherited state/behaviour; interfaces avoid shared implementation ambiguity through contracts/default-method rules.
23. **Four access modifiers?** Know the full same-class/package/subclass/world table.
24. **Static blocks/variables/methods and overriding?** Class initialisation, shared class data, class methods; static methods are hidden, not overridden.

**Bonus:** Explain the `equals()`/`hashCode()` contract, composition versus inheritance, and each SOLID principle in one line.

---

# 8. INTERVIEW QUESTION BANK: HTML/CSS 1-20

1. Semantic HTML improves structure, SEO, accessibility, and maintainability.
2. Block starts a new line; inline uses content width; inline-block stays inline but accepts width/height.
3. `div` is generic block container; `span` is generic inline container.
4. `alt` describes meaningful images and supports accessibility/fallback.
5. `id` should identify one element; `class` is reusable.
6. Know text, email, password, number, date, radio, checkbox, file, `required`, `placeholder`, `pattern`, labels.
7. Box model is content, padding, border, margin; `border-box` includes padding/border in declared size.
8. `px` fixed, `%` relative to parent, `em` relative to current font, `rem` relative to root.
9. Specificity: inline, ID, class/attribute/pseudo-class, element/pseudo-element, then source order.
10. Static normal flow; relative offsets itself; absolute uses positioned ancestor; fixed uses viewport; sticky switches during scroll.
11. `display:none` removes layout; `visibility:hidden` keeps layout; opacity zero remains layout and may still receive interaction.
12. Pseudo-class describes state/position (`:hover`); pseudo-element styles a part (`::before`).
13. Cascade resolves competing declarations; inheritance passes selected parent properties.
14. Flexbox is mainly one-dimensional; Grid is two-dimensional; choose by layout need.
15. `justify-content` uses the main axis; `align-items` uses the cross axis; `flex-direction` changes the axes.
16. `flex: 1` generally means grow 1, shrink 1, basis 0%, so items share free space.
17. Media queries apply styles conditionally; mobile-first starts small and progressively enhances.
18. Centre with Flexbox, Grid, absolute positioning plus transform, or margins with a constrained width.
19. `fr` is a fraction of available grid space; `auto-fit` collapses empty tracks, `auto-fill` keeps them.
20. Responsive sites use viewport meta, fluid units, media queries, flexible images, and layouts that adapt to width.

---

# 9. CLASSIC PROGRAMS 1-16

1. Reverse a string.
2. Palindrome check for string and number.
3. Fibonacci iterative and recursive.
4. Factorial iterative and recursive.
5. Prime check and primes in a range.
6. Armstrong number and perfect number.
7. GCD and LCM using Euclid's algorithm.
8. Swap two numbers without a temporary variable.
9. Count vowels, consonants, digits, and spaces.
10. Remove duplicates from an array.
11. Second largest element.
12. Sum of digits and reverse a number.
13. Matrix transpose.
14. Matrix addition and multiplication.
15. Bubble sort with swap count.
16. Selection sort.

For each: write from memory, test boundaries, and state time/space complexity.

---

# 10. LAST-MINUTE TEST CHECKLIST

- [ ] Explain JDK -> JRE -> JVM and compilation flow.
- [ ] Write a Java program with input, conditions, loops, methods, overloading, and switch.
- [ ] State Big O, Omega, Theta, and best/average/worst case.
- [ ] Solve one array, one matrix, one String, one prefix-sum, and one Kadane problem.
- [ ] Explain constructor chaining, `this`, `super`, `static`, `final`, and encapsulation.
- [ ] Explain overloading, overriding, dynamic dispatch, upcasting, downcasting, and `instanceof`.
- [ ] Compare abstract class and interface; recite access table.
- [ ] State the `equals()`/`hashCode()` contract.
- [ ] Explain Flexbox axes and Grid `fr`/`auto-fit`/`auto-fill`.
- [ ] Recall responsive design rules and four ways to centre a `div`.
- [ ] Review Java Q1-24 and HTML/CSS Q1-20 aloud.
- [ ] Revisit every mistake instead of rereading everything equally.

## 30-SECOND ANSWER FORMAT

**Definition -> small example -> comparison/use case -> complexity or key rule.**

Stay concise in the test: first answer the question directly, then add one accurate example.
