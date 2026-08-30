# 📅 WEEK 1 - DAY-WISE DETAILED STUDY PLAN
**Java Advanced + HTML Fundamentals + DSA Foundation | 7.5 Hours/Day | 10 AM - 7 PM**

---

## 📍 WEEK 1 OVERVIEW

| Day | Focus | Main Topics | DSA Problems | Time |
|-----|-------|-----------|--------------|------|
| **Day 1 (Monday)** | Java Collections Intro | ArrayList, LinkedList | 5 | 7.5 hrs |
| **Day 2 (Tuesday)** | HashMap & HashSet | Deep dive + Generics | 5 | 7.5 hrs |
| **Day 3 (Wednesday)** | Exception Handling | try-catch, throws, Custom | 5 | 7.5 hrs |
| **Day 4 (Thursday)** | HTML Basics | Tags, Structure, Forms | 5 | 7.5 hrs |
| **Day 5 (Friday)** | HTML Semantic + CSS Start | Semantic HTML, CSS intro | 5 | 7.5 hrs |
| **Day 6 (Saturday)** | DSA Complexity Deep | Big O, Complexity Analysis | 5 | 7.5 hrs |
| **Day 7 (Sunday)** | Revision + Projects | Practice + Week Review | 5 | 7.5 hrs |

**Total Week 1: 30 DSA Problems + Complete topics + 1 HTML Project**

---

# 🗓️ DAY 1 - MONDAY: JAVA COLLECTIONS INTRO + DSA BASICS

## ⏰ DAILY SCHEDULE (10 AM - 7:10 PM)

```
10:00 AM - 11:15 AM   | SESSION 1: Java Collections (75 min)
11:15 AM - 11:25 AM   | BREAK (10 min)

11:25 AM - 12:30 PM   | SESSION 1 (Continued): ArrayList Problems (65 min)
12:30 PM - 1:00 PM    | LUNCH (30 min)

1:00 PM - 2:30 PM     | SESSION 2: DSA - Big O Notation (90 min)
2:30 PM - 2:45 PM     | BREAK (15 min)

2:45 PM - 3:45 PM     | SESSION 2 (Continued): Complexity Problems (60 min)
3:45 PM - 4:00 PM     | BREAK (15 min)

4:00 PM - 5:00 PM     | SESSION 3: HTML Basics Intro (60 min)
5:00 PM - 5:15 PM     | BREAK (15 min)

5:15 PM - 6:00 PM     | SESSION 4: English Speaking (45 min)
6:00 PM - 6:30 PM     | REVISION + NOTES (30 min)
6:30 PM - 7:00 PM     | RECAP (30 min)

TOTAL: 7 Hours 30 Minutes
```

---

## 📚 SESSION 1: JAVA COLLECTIONS - ARRAYLIST & LINKEDLIST (2.5 Hours)

### 🎯 Learning Objectives
- ✅ Understand ArrayList and LinkedList differences
- ✅ Learn when to use which collection
- ✅ Implement ArrayList operations
- ✅ Understand internal structure

### 📖 TOPICS & SUBTOPICS

#### Topic 1: ArrayList Fundamentals (40 min)
| Subtopic | Duration | Key Points |
|----------|----------|-----------|
| **What is ArrayList?** | 10 min | Dynamic array, resizable, sequential |
| **ArrayList Syntax** | 10 min | Initialization, add(), remove(), get() |
| **Time Complexity** | 10 min | Add O(1) amortized, Remove O(n), Get O(1) |
| **When to use** | 10 min | Frequent read, occasional add/remove |

#### Topic 2: LinkedList Fundamentals (35 min)
| Subtopic | Duration | Key Points |
|----------|----------|-----------|
| **What is LinkedList?** | 8 min | Doubly linked list, node-based structure |
| **LinkedList Syntax** | 9 min | Node creation, add(), remove(), get() |
| **Time Complexity** | 10 min | Add O(1), Remove O(1), Get O(n) |
| **When to use** | 8 min | Frequent add/remove, Queue operations |

#### Topic 3: ArrayList vs LinkedList Comparison (10 min)
| Feature | ArrayList | LinkedList |
|---------|-----------|-----------|
| **Access** | O(1) | O(n) |
| **Insert** | O(n) | O(1) |
| **Delete** | O(n) | O(1) |
| **Space** | Compact | More overhead |
| **Use Case** | Read-heavy | Add/Remove heavy |

### 🎥 VIDEO RESOURCES

#### ENGLISH (Primary)
1. **Kunal Kushwaha - ArrayList** (45 min)
   - URL: https://www.youtube.com/watch?v=OWbcAkZVj7k
   - Topics: Basics, Operations, Time complexity
   - **Watch from**: 0:00 to 45:00

2. **Apna College - Collections Framework** (Complete)
   - URL: Check your Sigma 10X course
   - Topics: ArrayList, LinkedList deep dive

3. **Striver A2Z DSA - Arrays & ArrayList** (30 min)
   - URL: https://www.youtube.com/watch?v=PzIwpjSbg-A
   - Topics: ArrayList operations, edge cases

#### HINDI (Secondary)
1. **Code with Harry - ArrayList & LinkedList** (Hindi) (40 min)
   - URL: https://www.youtube.com/watch?v=fzwJ-dcP4p0
   - Topics: ArrayList, LinkedList comparison, operations
   - **Watch**: 0:00 to 40:00

2. **Jenny's Lectures - Collections Framework** (Hindi) (50 min)
   - URL: https://www.youtube.com/watch?v=TvCeJ-10-YY
   - Topics: Array vs ArrayList, LinkedList basics

3. **Apna College SigmaX - Hindi Track**
   - Collections Framework (Hindi explanation)
   - Check your course materials

### 💻 PRACTICAL CODING - SESSION 1 CONTINUED (65 min)

#### Coding Exercise 1: ArrayList Operations (35 min)
```java
TASKS:
1. Create ArrayList of integers
2. Add 10 random numbers
3. Remove element at index 5
4. Find maximum element
5. Reverse the ArrayList
6. Print all elements
```

**Program Name**: `ArrayListOperations.java`

#### Coding Exercise 2: LinkedList vs ArrayList (30 min)
```java
TASKS:
1. Create both ArrayList and LinkedList
2. Add 1000 elements to both
3. Measure time for insertion at beginning
4. Measure time for access at end
5. Compare and print results
```

**Program Name**: `ArrayListVsLinkedList.java`

### ✅ DELIVERABLES (Session 1)
- [ ] 2 Java programs created
- [ ] Both programs tested & working
- [ ] Time complexity documented
- [ ] Comparison table filled

---

## 📚 SESSION 2: DSA - BIG O NOTATION & COMPLEXITY ANALYSIS (2.5 Hours)

### 🎯 Learning Objectives
- ✅ Understand Big O notation
- ✅ Analyze time & space complexity
- ✅ Learn common complexity patterns
- ✅ Practice complexity analysis

### 📖 TOPICS & SUBTOPICS

#### Topic 1: Big O Basics (45 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **O(1) - Constant** | 10 min | Single operation, dictionary access |
| **O(n) - Linear** | 10 min | Loop through array once |
| **O(n²) - Quadratic** | 10 min | Nested loops, Bubble sort |
| **O(log n) - Logarithmic** | 10 min | Binary search, Divide & conquer |
| **O(n log n) - Linearithmic** | 5 min | Merge sort, Quick sort |

#### Topic 2: Complexity Analysis (40 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **Best Case** | 10 min | Ideal scenario, minimum operations |
| **Average Case** | 10 min | Typical scenario, expected behavior |
| **Worst Case** | 10 min | Worst scenario, maximum operations |
| **Analysis Examples** | 10 min | Practice problems analysis |

#### Topic 3: Space Complexity (10 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **O(1) Space** | 3 min | Constant space |
| **O(n) Space** | 3 min | Linear space allocation |
| **Stack vs Heap** | 4 min | Memory management |

### 🎥 VIDEO RESOURCES

#### ENGLISH (Primary)
1. **Abdul Bari - Time Complexity** (40 min) ⭐
   - URL: https://www.youtube.com/watch?v=9TlHvICSfsE
   - Topics: Big O, Best/Average/Worst, Examples
   - **MUST WATCH**

2. **Abdul Bari - Space Complexity** (30 min)
   - URL: https://www.youtube.com/watch?v=R4OIoR1QUwI
   - Topics: Space analysis, Stack vs Heap

3. **Striver A2Z DSA - Complexity Analysis** (35 min)
   - URL: https://www.youtube.com/watch?v=TyJS_D7q6f0
   - Topics: Interview perspective, Deep analysis

#### HINDI (Secondary)
1. **Code with Harry - Time Complexity (Hindi)** (35 min)
   - URL: https://www.youtube.com/watch?v=xm2Q9Qz7nuc
   - Topics: Big O notation, Complexity examples

2. **Jenny's Lectures - Time & Space Complexity** (Hindi) (40 min)
   - URL: https://www.youtube.com/watch?v=o7G9LJEPsn0
   - Topics: Detailed analysis, Algorithm comparison

3. **Apna College SigmaX - DSA Complexity (Hindi)**
   - Your course materials
   - Hindi explanation of complexity

### 💻 PRACTICAL PROBLEMS - SESSION 2 CONTINUED (60 min)

#### Problem 1: Analyze Time Complexity (15 min)
```java
ANALYZE COMPLEXITY of these code snippets:

1. for(int i=0; i<n; i++) {
     print(i);
   }
   Complexity: ?

2. for(int i=0; i<n; i++) {
     for(int j=0; j<n; j++) {
       print(i, j);
     }
   }
   Complexity: ?

3. for(int i=0; i<n; i=i*2) {
     print(i);
   }
   Complexity: ?

4. for(int i=0; i<n; i++) {
     for(int j=i; j<n; j++) {
       print(i, j);
     }
   }
   Complexity: ?

5. Binary search - Complexity: ?
```

#### Problem 2: Compare Algorithms (20 min)
```
Tasks:
1. Write Linear Search - Calculate complexity
2. Write Binary Search - Calculate complexity
3. Compare: When to use which?
4. Write code for both
5. Test with arrays of different sizes
```

**Program Name**: `ComplexityAnalysis.java`

#### Problem 3: Real-world Analysis (15 min)
```
Analyze complexity for:
1. Finding maximum in array
2. Sorting an array (Bubble sort)
3. Creating multiplication table (n×n)
4. Fibonacci sequence (recursive)
```

**Program Name**: `RealWorldComplexity.java`

### ✅ DELIVERABLES (Session 2)
- [ ] 3 analysis documents completed
- [ ] 2 programs created with complexity analysis
- [ ] Complexity chart created
- [ ] 5 DSA problems solved

---

## 📚 SESSION 3: HTML BASICS INTRODUCTION (1 Hour)

### 🎯 Learning Objectives
- ✅ Understand HTML structure
- ✅ Learn basic HTML tags
- ✅ Create first HTML page
- ✅ Understand document structure

### 📖 TOPICS & SUBTOPICS

#### Topic 1: HTML Basics (30 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **What is HTML?** | 5 min | Markup language, web structure |
| **HTML Tags** | 10 min | Opening/Closing, Syntax, Common tags |
| **Attributes** | 10 min | id, class, href, src, style |
| **Comments** | 5 min | `<!-- Comment -->` syntax |

#### Topic 2: HTML Document Structure (20 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **DOCTYPE** | 5 min | HTML5 declaration |
| **html Tag** | 3 min | Root element |
| **head Section** | 6 min | meta, title, link tags |
| **body Section** | 6 min | Content container |

#### Topic 3: Common HTML Tags (10 min)
| Tag | Purpose | Example |
|-----|---------|---------|
| `<h1> to <h6>` | Headings | `<h1>Title</h1>` |
| `<p>` | Paragraph | `<p>Text content</p>` |
| `<a>` | Link | `<a href="#">Link</a>` |
| `<img>` | Image | `<img src="pic.jpg" />` |
| `<button>` | Button | `<button>Click</button>` |
| `<div>` | Container | `<div>Content</div>` |

### 🎥 VIDEO RESOURCES

#### ENGLISH (Primary)
1. **Traversy Media - HTML Crash Course** (1 hour) ⭐
   - URL: https://www.youtube.com/watch?v=UB3IbeQ0x5w
   - Topics: Complete HTML basics
   - **Watch**: 0:00 to 60:00

2. **freeCodeCamp - HTML Full Course** (2 hours)
   - URL: https://www.youtube.com/watch?v=qz0aGYrrlhU
   - Topics: Comprehensive HTML tutorial
   - **Watch**: 0:00 to 30:00 (Just first 30 min today)

#### HINDI (Secondary)
1. **Code with Harry - HTML Complete (Hindi)** (1.5 hours)
   - URL: https://www.youtube.com/watch?v=BkqKwjeevY4
   - Topics: HTML basics, tags, structure
   - **Watch**: 0:00 to 30:00 (Today)

2. **Apna College - HTML (Hindi) from SigmaX**
   - Your course materials
   - Detailed Hindi explanation

### 💻 PRACTICAL CODING - HTML (No coding time today, just theory)

**For today**: Just watch and take notes. HTML coding will be in Session 4.

### ✅ DELIVERABLES (Session 3)
- [ ] HTML notes created
- [ ] Tag list documented
- [ ] Structure diagram understood
- [ ] Ready for coding tomorrow

---

## 📚 SESSION 4: ENGLISH COMMUNICATION - SPEAKING & GRAMMAR (45 min)

### 🎯 Learning Objectives
- ✅ Understand basic tenses
- ✅ Practice speaking
- ✅ Record self-introduction
- ✅ Build confidence

### 📖 GRAMMAR TOPIC: TENSES (20 min)

#### Present Tense (5 min)
```
Simple Present: I play chess
Present Continuous: I am playing chess
Present Perfect: I have played chess
```

#### Past Tense (5 min)
```
Simple Past: I played chess
Past Continuous: I was playing chess
Past Perfect: I had played chess
```

#### Future Tense (5 min)
```
Simple Future: I will play chess
Future Continuous: I will be playing chess
Future Perfect: I will have played chess
```

#### Examples from Technical English (5 min)
```
Present: "This code runs efficiently"
Past: "We implemented the feature yesterday"
Future: "The API will return JSON data"
```

### 🎤 SPEAKING PRACTICE (25 min)

#### Exercise 1: Daily Routine Description (10 min)
**Task**: Describe your daily routine in English (2-3 minutes)

**Structure**:
```
"I wake up at 7 AM. 
I have breakfast at 7:30 AM.
I start studying at 8 AM.
I take a break at 12 PM.
I have lunch at 1 PM.
I resume studying at 2 PM.
...and so on"
```

**Instructions**:
1. Write script (5 min)
2. Practice pronunciation (2 min)
3. Record yourself (2 min)
4. Listen & improve

**Record**: Save as `Day1_Speaking_DailyRoutine.mp4`

#### Exercise 2: Self-Introduction (15 min)
**Task**: Create a 1-minute self-introduction

**Template**:
```
"Hello, my name is [Name].
I am [Age] years old.
I am from [City].
I am learning programming and web development.
My goal is to become an AI Full Stack Developer.
I am currently learning Java, C#, and React.
Thank you for listening."
```

**Instructions**:
1. Write script (5 min)
2. Practice pronunciation (3 min)
3. Record yourself (2 min)
4. Review (2 min)
5. Improve & re-record (3 min)

**Record**: Save as `Day1_Speaking_SelfIntro.mp4`

### 🎥 VIDEO RESOURCES

#### ENGLISH
1. **English Addict with Mr. Duncan - Basic Tenses** (Hindi subtitles available)
   - URL: https://www.youtube.com/watch?v=HK4lBMJv6Sc
   - Topics: Tenses explained simply

2. **Engvid - Tenses Grammar** (10 min)
   - URL: https://www.youtube.com/watch?v=k-rDPJGS-C8
   - Topics: Tense overview

#### HINDI
1. **English Speaking Course in Hindi - Tenses** (30 min)
   - URL: https://www.youtube.com/watch?v=DW6_ybUEGFE
   - Topics: Tenses in Hindi explanation

### ✅ DELIVERABLES (Session 4)
- [ ] Grammar notes created
- [ ] Daily routine script written
- [ ] Self-introduction script written
- [ ] Both videos recorded & saved
- [ ] Review completed

---

## 📋 DAY 1 SUMMARY & CHECKLIST

### ✅ Topics Completed
- [x] ArrayList Fundamentals
- [x] LinkedList Fundamentals
- [x] ArrayList vs LinkedList
- [x] Big O Notation
- [x] Complexity Analysis
- [x] HTML Basics
- [x] Tenses & Speaking

### ✅ Practical Work
- [x] 2 Java programs created
- [x] 5 DSA complexity problems solved
- [x] 2 speaking videos recorded
- [x] Grammar notes created

### 📊 Day 1 Metrics
| Metric | Target | Achieved |
|--------|--------|----------|
| Study Hours | 7.5 | ✓ |
| Programs | 2 | ✓ |
| DSA Problems | 5 | ✓ |
| Videos | 2 | ✓ |
| Topics | 7 | ✓ |

### 📝 Notes for Tomorrow
- [ ] Review ArrayList operations
- [ ] Practice complexity analysis
- [ ] Prepare HTML coding project

### 🎯 Tomorrow's Focus
**DAY 2: HashMap & HashSet + Generics + More DSA**

---

# 🗓️ DAY 2 - TUESDAY: HASHMAP & HASHSET + GENERICS + DSA

## ⏰ DAILY SCHEDULE (10 AM - 7:10 PM)

```
10:00 AM - 11:30 AM   | SESSION 1: HashMap & HashSet (90 min)
11:30 AM - 11:40 AM   | BREAK (10 min)

11:40 AM - 12:45 PM   | SESSION 1 (Continued): HashMap Coding (65 min)
12:45 PM - 1:15 PM    | LUNCH (30 min)

1:15 PM - 2:15 PM     | SESSION 2: Java Generics (60 min)
2:15 PM - 2:30 PM     | BREAK (15 min)

2:30 PM - 3:30 PM     | SESSION 2 (Continued): Generics Coding (60 min)
3:30 PM - 3:45 PM     | BREAK (15 min)

3:45 PM - 4:45 PM     | SESSION 3: DSA - Complexity Problems (60 min)
4:45 PM - 5:00 PM     | BREAK (15 min)

5:00 PM - 5:45 PM     | SESSION 4: HTML Coding (45 min)
5:45 PM - 6:00 PM     | BREAK (15 min)

6:00 PM - 6:30 PM     | SESSION 5: English + Notes (30 min)
6:30 PM - 7:00 PM     | REVISION (30 min)

TOTAL: 7 Hours 30 Minutes
```

---

## 📚 SESSION 1: HASHMAP & HASHSET FUNDAMENTALS (2.5 Hours)

### 🎯 Learning Objectives
- ✅ Understand HashMap structure & hashing
- ✅ Learn HashSet basics
- ✅ Implement HashMap operations
- ✅ Understand collision handling

### 📖 TOPICS & SUBTOPICS

#### Topic 1: HashMap Basics (50 min)
| Subtopic | Duration | Key Points |
|----------|----------|-----------|
| **What is HashMap?** | 10 min | Key-value pairs, Hash function, O(1) access |
| **HashMap Syntax** | 15 min | put(), get(), remove(), containsKey() |
| **Internal Structure** | 15 min | Hash table, Buckets, Collisions |
| **Time Complexity** | 10 min | Get/Put O(1) average, O(n) worst case |

#### Topic 2: HashSet Basics (30 min)
| Subtopic | Duration | Key Points |
|----------|----------|-----------|
| **What is HashSet?** | 8 min | Unique elements, Unordered, HashTable based |
| **HashSet Operations** | 12 min | add(), remove(), contains(), size() |
| **HashMap vs HashSet** | 10 min | Comparison, When to use each |

#### Topic 3: Hashing & Collision (20 min)
| Subtopic | Duration | Key Points |
|----------|----------|-----------|
| **Hash Function** | 8 min | Converting key to index |
| **Collision** | 7 min | Hash collision problem |
| **Resolution** | 5 min | Chaining, Open addressing |

### 🎥 VIDEO RESOURCES

#### ENGLISH (Primary)
1. **Kunal Kushwaha - HashMap** (1 hour)
   - URL: https://www.youtube.com/watch?v=OWbcAkZVj7k
   - Topics: HashMap deep dive
   - **Watch**: 45:00 to 105:00

2. **Striver A2Z DSA - HashMap** (40 min)
   - URL: https://www.youtube.com/watch?v=2cMhsJf7V1g
   - Topics: Concepts, Operations, Interview problems

#### HINDI (Secondary)
1. **Code with Harry - HashMap (Hindi)** (45 min)
   - URL: https://www.youtube.com/watch?v=hYk0X3E5iBc
   - Topics: HashMap operations, Hashing concept

2. **Jenny's Lectures - HashMap (Hindi)** (50 min)
   - URL: https://www.youtube.com/watch?v=_-qR2L9f-eY
   - Topics: Hash function, Collisions, Resolution

### 💻 PRACTICAL CODING - SESSION 1 CONTINUED (65 min)

#### Coding Exercise 1: HashMap Operations (35 min)
```java
TASKS:
1. Create HashMap<String, Integer> for student scores
2. Add 5 students with scores
3. Update a student's score
4. Remove a student
5. Check if student exists
6. Print all entries
7. Get total score
8. Find max score student
```

**Program Name**: `HashMapOperations.java`

#### Coding Exercise 2: HashSet Operations (30 min)
```java
TASKS:
1. Create HashSet<Integer> for unique numbers
2. Add 10 numbers (with duplicates)
3. Check set size (verify duplicates removed)
4. Check if number exists
5. Remove a number
6. Print all elements
7. Compare with ArrayList (what's the difference?)
```

**Program Name**: `HashSetOperations.java`

### ✅ DELIVERABLES (Session 1)
- [ ] 2 Java programs created
- [ ] HashMap operations tested
- [ ] HashSet operations tested
- [ ] Hashing concept documented

---

## 📚 SESSION 2: JAVA GENERICS (2 Hours)

### 🎯 Learning Objectives
- ✅ Understand generic classes & methods
- ✅ Learn type parameters
- ✅ Understand wildcards & bounds
- ✅ Apply generics in real code

### 📖 TOPICS & SUBTOPICS

#### Topic 1: Generics Basics (30 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **What are Generics?** | 8 min | Type safety, Code reusability |
| **Generic Class** | 12 min | `<T>` syntax, Type parameter |
| **Generic Methods** | 10 min | Method-level generics |

#### Topic 2: Wildcards & Bounds (20 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **Unbounded Wildcard** | 5 min | `<?>` meaning and use |
| **Upper Bounded** | 8 min | `<? extends Number>` |
| **Lower Bounded** | 7 min | `<? super Integer>` |

#### Topic 3: Real-World Generics (10 min)
| Topic | Example |
|-------|---------|
| **Collections** | `List<String>`, `HashMap<K, V>` |
| **Generic Classes** | Custom generic container |

### 🎥 VIDEO RESOURCES

#### ENGLISH
1. **Kunal Kushwaha - Generics in Java** (50 min)
   - URL: https://www.youtube.com/watch?v=ZzlP0EIJgVM
   - Topics: Complete generics tutorial

2. **Striver - Generics** (30 min)
   - URL: https://www.youtube.com/watch?v=5ytdJHq2ITE
   - Topics: Interview perspective

#### HINDI
1. **Code with Harry - Generics (Hindi)** (40 min)
   - URL: https://www.youtube.com/watch?v=nq8A-nPa5Qw
   - Topics: Generics complete guide

### 💻 PRACTICAL CODING - SESSION 2 CONTINUED (60 min)

#### Coding Exercise 1: Generic Class (30 min)
```java
CREATE a Generic Box class:
1. Create class Box<T>
2. Add generic methods
3. Store any type of data
4. Test with String, Integer, Double
5. Print contents
```

**Program Name**: `GenericBox.java`

#### Coding Exercise 2: Generic Methods (30 min)
```java
CREATE Generic methods:
1. Method to print any array
2. Method to find max in array
3. Method with bounded types
4. Test all methods
```

**Program Name**: `GenericMethods.java`

### ✅ DELIVERABLES (Session 2)
- [ ] 2 generic programs created
- [ ] Generics concepts understood
- [ ] Type safety principles learned

---

## 📚 SESSION 3: DSA PRACTICE - COMPLEXITY PROBLEMS (1 Hour)

### 🎯 Learning Objectives
- ✅ Practice complexity analysis
- ✅ Solve 5 problems
- ✅ Understand pattern recognition

### 💻 5 DSA PROBLEMS TO SOLVE

**Problem 1: Count Operations** (12 min)
- Problem: Count operations in nested loops
- Complexity Analysis: Write O(?) notation
- Code it in Java

**Problem 2: Search in Array** (12 min)
- Problem: Linear vs Binary search
- Complexity Analysis: Compare both
- Code implementation

**Problem 3: Two Sum** (12 min)
- Problem: Find two numbers that sum to target
- Complexity Analysis: Brute force vs HashMap
- Code both approaches

**Problem 4: Palindrome String** (12 min)
- Problem: Check if string is palindrome
- Complexity Analysis: Two-pointer approach
- Code the solution

**Problem 5: Remove Duplicates** (12 min)
- Problem: Remove duplicates from array
- Complexity Analysis: Using HashSet
- Code the solution

### 🎥 VIDEO RESOURCES
- **LeetCode**: Easy problems related to Arrays
- **GeeksforGeeks**: DSA articles on problems

### ✅ DELIVERABLES (Session 3)
- [ ] 5 problems solved with complexity analysis
- [ ] Code tested
- [ ] Solutions documented

---

## 📚 SESSION 4: HTML PRACTICAL CODING (45 min)

### 🎯 Learning Objectives
- ✅ Create first HTML page
- ✅ Practice HTML tags
- ✅ Create forms

### 💻 CODING PROJECT: Personal Info Form

**Create file**: `Day2_PersonalForm.html`

```html
Requirements:
1. Create HTML document with proper structure
2. Add heading "My Personal Information"
3. Create a form with following fields:
   - Name (text input)
   - Email (email input)
   - Age (number input)
   - Country (dropdown)
   - Hobby (checkbox - multiple)
   - Gender (radio buttons)
   - Submit button
4. Use proper semantic HTML
5. Add comments explaining each section
```

**Visual Preview**:
```
┌─────────────────────────────────────┐
│   My Personal Information           │
│─────────────────────────────────────│
│ Name: [____________]                │
│ Email: [____________]               │
│ Age: [__]                           │
│ Country: [Select Country ▼]         │
│ Hobbies: □ Reading □ Gaming □ Music │
│ Gender: ◯ Male ◯ Female ◯ Other    │
│ [ SUBMIT ] [ RESET ]                │
└─────────────────────────────────────┘
```

### ✅ DELIVERABLES (Session 4)
- [ ] HTML file created
- [ ] Form with all fields
- [ ] Proper structure
- [ ] Displays correctly in browser

---

## 📚 SESSION 5: ENGLISH & REVISION (1 Hour)

### 📝 ENGLISH TASK (30 min)
**Task**: Describe today's learning in English (3 minutes)

**Topics to describe**:
1. What is HashMap?
2. How does hashing work?
3. What are generics?
4. What HTML tags did you learn?

**Record**: Save as `Day2_Speaking_DayReview.mp4`

### 📖 REVISION (30 min)
- Review HashMap operations
- Review generics concepts
- List all HTML tags learned so far
- Create a summary document

### ✅ DELIVERABLES (Session 5)
- [ ] Speaking video created
- [ ] Revision notes completed
- [ ] Summary document created

---

## 📋 DAY 2 SUMMARY

### ✅ Topics Completed
- [x] HashMap & HashSet
- [x] Hashing & Collisions
- [x] Java Generics
- [x] DSA - 5 Problems
- [x] HTML Forms

### ✅ Practical Work
- [x] 4 Java programs
- [x] 5 DSA problems
- [x] 1 HTML file
- [x] 1 speaking video

### 📊 Day 2 Metrics
| Metric | Target | Achieved |
|--------|--------|----------|
| Study Hours | 7.5 | ✓ |
| Programs | 4 | ✓ |
| DSA Problems | 5 | ✓ |
| HTML Pages | 1 | ✓ |
| Videos | 1 | ✓ |

---

# 🗓️ DAY 3 - WEDNESDAY: EXCEPTION HANDLING + MORE DSA

## ⏰ DAILY SCHEDULE

```
10:00 AM - 11:30 AM   | SESSION 1: Exception Handling (90 min)
11:30 AM - 11:40 AM   | BREAK (10 min)

11:40 AM - 12:45 PM   | SESSION 1: Coding (65 min)
12:45 PM - 1:15 PM    | LUNCH (30 min)

1:15 PM - 2:15 PM     | SESSION 2: DSA Problems (60 min)
2:15 PM - 2:30 PM     | BREAK (15 min)

2:30 PM - 3:30 PM     | SESSION 2: More Problems (60 min)
3:30 PM - 3:45 PM     | BREAK (15 min)

3:45 PM - 4:45 PM     | SESSION 3: HTML + CSS Intro (60 min)
4:45 PM - 5:00 PM     | BREAK (15 min)

5:00 PM - 5:45 PM     | SESSION 4: Speaking Practice (45 min)
5:45 PM - 7:00 PM     | REVISION (1 hr 15 min)

TOTAL: 7 Hours 30 Minutes
```

---

## 📚 SESSION 1: EXCEPTION HANDLING (2.5 Hours)

### 📖 TOPICS & SUBTOPICS

#### Topic 1: try-catch-finally (50 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **try block** | 10 min | Code that may throw exception |
| **catch block** | 15 min | Handle specific exceptions |
| **finally block** | 15 min | Cleanup code (always executes) |
| **Multiple catch** | 10 min | Catching different exceptions |

#### Topic 2: throws & throw (30 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **throw keyword** | 10 min | Explicitly throw exception |
| **throws keyword** | 10 min | Declare exception in method |
| **Difference** | 10 min | throw vs throws usage |

#### Topic 3: Custom Exceptions (20 min)
| Subtopic | Duration | Description |
|----------|----------|------------|
| **Custom Exception Class** | 10 min | Extend Exception class |
| **Usage** | 10 min | Throw & catch custom |

### 🎥 VIDEO RESOURCES

#### ENGLISH
1. **Kunal Kushwaha - Exception Handling** (1 hour)
   - URL: https://www.youtube.com/watch?v=c1d0Yt-eaUk
   - Topics: Complete exception handling

2. **Striver - Exception Handling** (30 min)
   - URL: https://www.youtube.com/watch?v=ZG2KQLK8B5E
   - Topics: Interview focused

#### HINDI
1. **Code with Harry - Exception Handling (Hindi)** (45 min)
   - URL: https://www.youtube.com/watch?v=2vUHLU8V_7c
   - Topics: try-catch, throws, custom

### 💻 PRACTICAL CODING (65 min)

#### Exercise 1: try-catch-finally (30 min)
```java
CREATE programs:
1. Divide by zero handling
2. Array index out of bounds
3. String to Integer conversion error
4. File reading error handling
5. Test all error scenarios
```

**Program Name**: `ExceptionHandling.java`

#### Exercise 2: Custom Exception (20 min)
```java
CREATE:
1. Custom InvalidAgeException class
2. Custom NegativeNumberException class
3. Use in programs
4. Test exception throwing & catching
```

**Program Name**: `CustomExceptions.java`

#### Exercise 3: throws Keyword (15 min)
```java
CREATE method that:
1. Throws checked exception
2. Throws unchecked exception
3. Test both
```

**Program Name**: `ThrowsKeyword.java`

---

## 📚 SESSION 2: DSA PROBLEMS (2 Hours)

### 💻 5 DSA PROBLEMS

**Problem 1-5**: Solve array and string problems from LeetCode (Easy level)

Focus on:
- Linear search
- Element removal
- Array rotation
- String manipulation
- Frequency counting

---

## 📚 SESSION 3: HTML + CSS INTRO (1 Hour)

### 📖 TOPICS

#### CSS Basics (30 min)
- Selectors (class, id, element)
- Properties (color, font-size, etc)
- Box model (margin, padding, border)

#### HTML Forms Enhancement (30 min)
- Validation attributes
- Styling forms with CSS
- Input types deep dive

### 💻 CODING: Style the HTML Form from Day 2

**File**: `Day3_StyledForm.html`

Add CSS styling to make it look professional:
- Colors
- Fonts
- Layout
- Button styling

---

## 📚 SESSION 4: SPEAKING PRACTICE (45 min)

**Task**: Explain exception handling in 2 minutes

Record as: `Day3_Speaking_ExceptionHandling.mp4`

---

## 📋 DAY 3 CHECKLIST

- [x] Exception handling theory
- [x] 3 Java programs
- [x] 5 DSA problems
- [x] HTML/CSS styling
- [x] Speaking video

---

# 🗓️ DAY 4 - THURSDAY: HTML DEEP DIVE

---

# 🗓️ DAY 5 - FRIDAY: HTML SEMANTIC + CSS FUNDAMENTALS

---

# 🗓️ DAY 6 - SATURDAY: DSA COMPLEXITY DEEP DIVE

---

# 🗓️ DAY 7 - SUNDAY: WEEK 1 REVISION + PRACTICE + PROJECT

## ⏰ SUNDAY SCHEDULE (Lighter Day)

```
10:00 AM - 11:00 AM   | REVISION: Java Collections (60 min)
11:00 AM - 11:15 AM   | BREAK (15 min)

11:15 AM - 12:15 PM   | REVISION: DSA Concepts (60 min)
12:15 PM - 12:45 PM   | LUNCH (30 min)

12:45 PM - 1:45 PM    | REVISION: HTML Basics (60 min)
1:45 PM - 2:00 PM     | BREAK (15 min)

2:00 PM - 3:30 PM     | MINI PROJECT: Portfolio Page (90 min)
3:30 PM - 3:45 PM     | BREAK (15 min)

3:45 PM - 4:45 PM     | WEEK REVIEW + ASSESSMENT (60 min)
4:45 PM - 5:00 PM     | BREAK (15 min)

5:00 PM - 6:00 PM     | PREPARATION: Week 2 Planning (60 min)

TOTAL: 6 Hours (Lighter Load)
```

---

## 📚 SUNDAY ACTIVITIES

### 1️⃣ REVISION (3 Hours)
- [ ] Review ArrayList operations (20 min)
- [ ] Review HashMap/HashSet (20 min)
- [ ] Review Exception Handling (20 min)
- [ ] Review Complexity Analysis (20 min)
- [ ] Review HTML Tags (20 min)
- [ ] Review Generics (20 min)

### 2️⃣ MINI PROJECT: PORTFOLIO PAGE (90 min)

**Create**: `Week1_Portfolio.html`

**Requirements**:
```html
1. Header with name & title
2. About section (describe yourself)
3. Skills section (list technologies learned)
4. Learning Progress (show what you've learned)
5. Contact section (dummy contact form)
6. Footer with social links

Use all HTML tags learned:
- Semantic HTML tags
- Forms
- Links
- Images (if needed)
- Proper structure
```

### 3️⃣ WEEK REVIEW (60 min)

**Checklist**:
- [ ] All 7 topics covered?
- [ ] All programs working?
- [ ] All DSA problems solved?
- [ ] Speaking videos recorded?
- [ ] Notes organized?

**Assessment Questions**:
1. Explain ArrayList vs LinkedList
2. What is Big O notation?
3. When to use HashMap?
4. What are generics?
5. How does exception handling work?
6. Describe HTML structure

### 4️⃣ WEEK 1 METRICS

| Metric | Target | Achieved |
|--------|--------|----------|
| **Study Hours** | 52.5 | __ |
| **Java Programs** | 10+ | __ |
| **DSA Problems** | 30 | __ |
| **HTML Files** | 3 | __ |
| **Videos** | 5+ | __ |
| **Topics** | 15+ | __ |

---

## 📋 WEEK 1 FINAL CHECKLIST

### ✅ JAVA (2.5 Hours/Day × 7 = 17.5 Hours)
- [ ] ArrayList & LinkedList mastered
- [ ] HashMap & HashSet understood
- [ ] Generics applied in code
- [ ] Exception Handling practiced
- [ ] 10+ programs created

### ✅ DSA (2 Hours/Day × 7 = 14 Hours)
- [ ] Big O notation understood
- [ ] Complexity analysis done
- [ ] 30 problems solved
- [ ] Patterns recognized

### ✅ HTML (1.5 Hours/Day × 7 = 10.5 Hours)
- [ ] HTML structure mastered
- [ ] Forms created
- [ ] Semantic HTML used
- [ ] 3 HTML pages created

### ✅ ENGLISH (30 min/Day × 7 = 3.5 Hours)
- [ ] Tenses studied
- [ ] 5+ speaking videos
- [ ] Pronunciation improved
- [ ] Confidence built

### ✅ TOTAL WEEK 1
- [ ] **52.5 hours of study**
- [ ] **10+ Java programs**
- [ ] **30 DSA problems**
- [ ] **3+ HTML projects**
- [ ] **5+ speaking videos**
- [ ] **Complete revision done**

---

## 🎯 READY FOR WEEK 2?

By end of Week 1, you should:
- ✅ Comfortable with Java Collections
- ✅ Understand Complexity Analysis
- ✅ Know HTML basics
- ✅ Create simple web pages
- ✅ Speak English clearly

**Next Week**: JavaScript + React Foundation starts!

---

## 📝 NOTES & TIPS

### Study Tips
1. Follow time table strictly
2. Don't skip breaks
3. Code every day
4. Record speaking videos
5. Review notes daily

### Resource Tips
1. Bookmark all YouTube links
2. Subscribe to channels
3. Enable captions (help with understanding)
4. Use 1.5x speed for videos
5. Download videos (for offline viewing)

### Practice Tips
1. Code from scratch (don't copy-paste)
2. Understand each line
3. Debug when errors occur
4. Solve problems yourself first
5. Don't see solution immediately

### Time Management
- Follow schedule strictly
- Don't multitask during study
- Phone on silent
- Eliminate distractions
- Take proper breaks

---

## 📚 ADDITIONAL RESOURCES

### Helpful Links to Bookmark
- **GeeksforGeeks**: https://www.geeksforgeeks.org/
- **LeetCode**: https://leetcode.com/
- **InterviewBit**: https://www.interviewbit.com/
- **W3Schools HTML**: https://www.w3schools.com/html/
- **MDN Docs**: https://developer.mozilla.org/

### Communication
- Join coding community (Discord, Reddit)
- Share progress on social media
- Ask questions in comments
- Help others (reinforces learning)

---

**Good luck! You've got this! 🚀**

*Week 1 Complete = Strong Foundation*
*Week 2-26 = Unstoppable Progress*

---

**Last Updated**: 2026-08-30
**Status**: Ready to Execute
**Next Review**: End of Week 1
