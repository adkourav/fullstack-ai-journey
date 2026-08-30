# 6-MONTH INTERVIEW-READY ROADMAP

**Goal:** In 6 months, be able to **crack interviews** as an **AI Full Stack Developer**.
**Not the goal:** Becoming an expert in Java, AI/ML theory, or 20 technologies.

**Core principle:** Every hour spent must map to something an interviewer can ask.

---

## 1. FINAL TARGET STACK (locked — do not add anything)

```
DSA              → Java
Frontend         → HTML, CSS, JavaScript, React
Backend          → C#, ASP.NET Core Web API, EF Core
Databases        → SQL Server, MongoDB
AI               → LLM APIs, Prompting, Embeddings, RAG, basic Agents
                   + GitHub Copilot in the SDLC (vibe coding, Spec-Driven
                     Development, AI-assisted design/test/review/docs)
Tools / DevOps   → Git + GitHub, Azure DevOps (Boards/Repos/Pipelines),
                   GitHub Actions, Docker, AKS (awareness only)
Interview        → DSA + Coding tests + Frontend Q&A + Backend Q&A +
                   SQL/MongoDB Q&A + DevOps Q&A + AI/Copilot Q&A +
                   OOP + DBMS + OS + CN + System Design basics +
                   Projects + Aptitude + Reasoning + English + HR
Support          → English (daily, all 6 months), Aptitude & Reasoning (Month 3–6)
```

**Rule:** If a topic is not in this list, it is *awareness only*. Do not spend study hours on it.
**Rule:** Every technology in this stack has a matching **interview question bank** (Section 8). No exceptions.

---

## 2. PRIORITY MODEL

| Tier | Meaning | Action |
|------|---------|--------|
| **P0** | Asked in almost every interview | Learn deeply, practice, revise monthly |
| **P1** | Asked often / needed to build projects | Learn properly, use in projects |
| **P2** | Good to mention | Practical basics only |
| **P3** | Only need a 2-line answer | Read once, never revisit |

### P0 — Deep
Java OOP + Collections · DSA patterns · Coding-test practice · JavaScript core · React core · C# OOP + LINQ + async · ASP.NET Core Web API · EF Core · SQL queries + joins + normalization · JWT auth · REST design · Git · OOP/DBMS interview theory · Project explanation · **All interview question banks**

### P1 — Proper
HTML semantics + CSS Flexbox/Grid/responsive · React Router + Context + API integration · MongoDB CRUD + aggregation · LLM APIs + prompting + structured output + tool calling · RAG · **Copilot in SDLC + Spec-Driven Development** · Docker · Azure DevOps Pipelines · GitHub Actions · OS + CN interview theory · System design basics · English · Aptitude + Reasoning

### P2 — Practical basics
Tailwind/Bootstrap · Redux Toolkit (concept) · Middleware/filters/caching · Vector DB (one only — Chroma or Pinecone) · Azure Boards/Repos workflow · Container registry

### P3 — Awareness only (read once)
AKS / Kubernetes · LangChain internals · Hugging Face · Ollama · Microservices · Fine-tuning · Advanced guardrails/evals

---

## 3. REALISTIC HOUR BUDGET

**7 productive hours/day × 6 days/week × 24 weeks ≈ 1000 hours.**

| Category | Hours | % | Note |
|----------|-------|---|------|
| DSA + coding-test practice (Java) | 270 | 27% | 200 problems + patterns + timed tests |
| Java (language only) | 55 | 5.5% | OOP + Collections, nothing more |
| Frontend (HTML/CSS/JS/React) | 140 | 14% | |
| Backend (C# + ASP.NET + EF Core) | 185 | 18.5% | |
| Databases (SQL + MongoDB) | 65 | 6.5% | |
| AI integration + Copilot-in-SDLC | 75 | 7.5% | Practical only |
| Projects (dedicated build time) | 90 | 9% | Beyond learning hours |
| DevOps (Git/Azure DevOps/Docker/CI-CD) | 40 | 4% | |
| **Interview prep (all banks + mocks)** | **90** | **9%** | **Runs Month 1 → 6, never skipped** |
| English | 90 | 9% | 30–60 min daily, runs parallel |
| Aptitude + Reasoning | 40 | 4% | Month 3–6 |

> English, Aptitude and Interview prep run *inside* the daily schedule, not on top of it.

---

## 4. SIX-MONTH MAP

| Month | Primary | DSA | Project | Interview layer (mandatory) |
|-------|---------|-----|---------|------------------------------|
| **1** | Java fast-track + DSA foundation + HTML/CSS | 40 | Portfolio site | Complexity + Java/OOP bank (30 Q) + HTML/CSS bank (25 Q) + **1 timed coding test** |
| **2** | JavaScript + React | 40 | Todo + Weather | JS bank (40 Q) + React bank (35 Q) + OOP deep + **2 coding tests** + aptitude intro |
| **3** | C# + ASP.NET Core + SQL | 35 | REST API | C# bank (35 Q) + ASP.NET bank (35 Q) + SQL/DBMS bank (45 Q) + **2 coding tests** + aptitude daily |
| **4** | Advanced backend + MongoDB + Auth | 45 | **Full-Stack CRUD (resume #1)** | MongoDB bank (20 Q) + OS (20 Q) + CN (20 Q) + **mocks #1–#2** + project Q&A |
| **5** | AI integration (LLM + RAG) + Copilot in SDLC | 25 | **AI Chat + RAG (resume #2)** | AI/Copilot bank (30 Q) + DevOps bank (25 Q) + System design (5 scenarios) + **mocks #3–#4** |
| **6** | Final AI Full-Stack + DevOps + revision | 15 | **AI Full-Stack SaaS (resume #3)** | Full revision of all banks + **mocks #5–#10** + HR + English + aptitude mocks |
| | **Total** | **200** | **7 projects** | **~340 questions + 10 mocks + 8+ coding tests** |

---

## 5. MONTH-BY-MONTH DETAIL

### MONTH 1 — Java Fast-Track + DSA Foundation + HTML/CSS

**Java (60 hrs total, most of it this month) — learn ONLY this list:**
- Syntax, data types, operators, I/O, control flow, loops, patterns
- Methods, overloading, scope
- Arrays 1D/2D
- Strings + StringBuilder
- OOP: class, object, constructor, `this`, `static`, encapsulation, inheritance, polymorphism, abstraction, interfaces, access modifiers
- Exception handling
- Collections: ArrayList, LinkedList, Stack, Queue, Deque, PriorityQueue, HashMap, HashSet, TreeMap, TreeSet
- Comparable / Comparator
- Basic lambda syntax (only enough to write comparators)

**Explicitly SKIPPED:** Stream API deep dive, File I/O, Serialization, Generics theory, functional interfaces, Java 8 features beyond lambdas.

**DSA — 40 problems**
| Topic | Problems |
|-------|----------|
| Time & space complexity | 5 |
| Arrays (traversal, max/min, reverse, rotation, frequency) | 12 |
| Prefix sum + Kadane | 6 |
| 2D arrays / matrix (traversal, spiral, transpose, search) | 7 |
| Strings (palindrome, anagram, frequency, manipulation) | 10 |

**HTML/CSS**
- HTML structure, semantic tags, forms, inputs, tables, images, links, media
- CSS selectors, box model, units, display, position
- Flexbox, Grid, responsive design, media queries
- Bootstrap basics (grid + components) — 4 hrs max, Tailwind utility classes — 4 hrs max

**Project 1: Personal Portfolio** (HTML/CSS/JS-lite, responsive, deployed on GitHub Pages) — 10 hrs

#### 🎯 INTERVIEW LAYER — MONTH 1 (starts on day 1, not later)
| Item | Target |
|------|--------|
| **Java + OOP question bank** | 30 questions written & answered from memory (JVM/JRE/JDK, `==` vs `equals`, String immutability, StringBuilder vs StringBuffer, overloading vs overriding, `static`, `final`, constructors, access modifiers, abstract vs interface, ArrayList vs LinkedList, HashMap internal working, HashMap vs HashSet vs TreeMap, Comparable vs Comparator, checked vs unchecked exceptions, `finally` vs `finalize`, pass-by-value) |
| **HTML/CSS question bank** | 25 questions (semantic tags, block vs inline, `div` vs `span`, box model, `position` values, Flexbox vs Grid, `em` vs `rem` vs `px`, specificity, pseudo-classes vs pseudo-elements, media queries, `visibility:hidden` vs `display:none`, responsive strategy) |
| **Complexity Q&A** | Explain Big O / Ω / Θ, best/avg/worst for every problem you solve |
| **Classic programs asked in interviews** | 20 written from scratch: reverse a string, palindrome, Fibonacci, factorial, prime check, Armstrong, GCD/LCM, swap without temp, count vowels, remove duplicates, second largest, matrix transpose, star patterns (10 patterns), bubble/selection/insertion sort by hand |
| **Coding test** | **1 timed test** (60 min, 2 problems, LeetCode/HackerRank) |
| **Aptitude** | Light start — 15 min/day: number system, percentages |
| **English** | Grammar basics + 60-second self-introduction rehearsed |

**Month 1 exit check**
- [ ] Can write any Java OOP class without reference
- [ ] 40 DSA problems solved, complexity stated for each
- [ ] 20 classic interview programs written from memory
- [ ] Java/OOP (30) + HTML/CSS (25) question banks answered
- [ ] 1 timed coding test completed and reviewed
- [ ] Portfolio live on GitHub Pages
- [ ] Can explain arrays/strings approach verbally in English

---

### MONTH 2 — JavaScript + React + DSA Acceleration

**JavaScript (P0)**
- var/let/const, data types, operators, conditions, loops
- Functions, arrow functions, scope, hoisting, closures, `this`
- Arrays (map/filter/reduce/find/forEach/sort), objects, JSON
- Destructuring, spread/rest, modules
- DOM selection/creation/modification, events, event bubbling & delegation, forms
- Promises, async/await, try/catch, Fetch API, Axios
- Event loop (enough to explain in interview)

**React (P0 core only)**
- Vite setup, JSX, functional components
- Props, state (`useState`), `useEffect`, cleanup
- Events, conditional rendering, lists & keys
- Controlled forms + validation
- Custom hooks (write 2–3)
- Context API
- React Router: routes, params, links, protected routes
- API integration with loading/error states

**Awareness only:** Redux Toolkit (know what a store/slice is), Material UI, React Testing Library. **Do not build with them.**

**DSA — 40 problems**
| Topic | Problems |
|-------|----------|
| Sorting (bubble/selection/insertion/merge/quick + comparator) | 8 |
| Binary search + search on answer | 8 |
| Recursion (array, string, subsets, subsequences) | 10 |
| Backtracking (permutations, combinations, N-Queens, rat in maze) | 8 |
| Two pointers + sliding window | 6 |

**Projects 2 & 3:** Todo App (CRUD + filter + localStorage), Weather App (real API, loading/error states) — 20 hrs

#### 🎯 INTERVIEW LAYER — MONTH 2
| Item | Target |
|------|--------|
| **JavaScript question bank** | 40 questions (`var`/`let`/`const`, hoisting, TDZ, scope, closures, `this` in 4 contexts, arrow vs normal function, `call`/`apply`/`bind`, `==` vs `===`, truthy/falsy, shallow vs deep copy, spread vs rest, event bubbling vs capturing, event delegation, debounce vs throttle, synchronous vs asynchronous, callback hell, Promise states, `Promise.all` vs `allSettled` vs `race`, async/await vs `.then`, event loop + microtask vs macrotask, `map` vs `forEach`, `slice` vs `splice`, prototypal inheritance, `localStorage` vs `sessionStorage` vs cookies, CORS) |
| **React question bank** | 35 questions (what is JSX, virtual DOM & reconciliation, props vs state, controlled vs uncontrolled, why keys, `useState` batching, `useEffect` dependency array & cleanup, `useEffect` vs lifecycle methods, custom hooks, rules of hooks, prop drilling & Context, `useMemo` vs `useCallback`, React Router basics, protected routes, lifting state up, conditional rendering, CSR vs SSR, when to use Redux) |
| **OOP deep dive** | Expand Month 1 bank to 50 total: four pillars with code, SOLID with examples, composition vs inheritance, design patterns (Singleton, Factory, Observer, Strategy) |
| **Classic programs** | 20 more: array rotation, two-sum, anagram check, string compression, missing number, majority element, matrix spiral, binary search by hand, merge two sorted arrays, frequency map |
| **Coding tests** | **2 timed tests** (60–90 min each) |
| **Aptitude** | 20 min/day — ratio, average, profit/loss, number series |
| **English** | Daily conversation, technical vocabulary, explain a JS concept aloud daily |

**Verbalisation rule (starts now, never stops):** explain every DSA problem out loud in English *before* writing code.

**Month 2 exit check**
- [ ] 80 DSA problems total
- [ ] Two React apps on GitHub with READMEs
- [ ] JS (40) + React (35) question banks answered from memory
- [ ] OOP bank at 50 questions
- [ ] 40 classic interview programs written from scratch
- [ ] 2 timed coding tests completed and reviewed
- [ ] Can explain closures, promises, event loop, `this` verbally in English

---

### MONTH 3 — C# + ASP.NET Core + SQL

**C# (P0)**
- Syntax, types, operators, control flow, methods, arrays, strings
- OOP: classes, constructors, properties, encapsulation, inheritance (`virtual`/`override`), polymorphism, abstraction, interfaces
- Collections: List, Dictionary, HashSet, Queue, Stack
- Exception handling
- **LINQ** (query + method syntax, common operators) — important
- **async/await + Task** — important
- Generics basics, nullable types
- Delegates/events — concept level only

**ASP.NET Core Web API (P0) — full sequence**
1. .NET ecosystem, project structure, `Program.cs`
2. Controllers, action methods, HTTP verbs
3. Routing (attribute routing, templates, constraints)
4. Model binding + DTOs
5. Validation (data annotations, custom)
6. Dependency Injection + lifetimes (Scoped/Transient/Singleton)
7. Middleware pipeline + custom middleware
8. Global exception handling
9. Logging (`ILogger`)
10. Swagger / OpenAPI
11. REST design + status codes
12. CORS

**EF Core (P0) — full sequence**
DbContext → entity config → relationships (1-1, 1-M, M-M) → migrations → CRUD → LINQ queries → eager vs lazy loading (`Include`/`ThenInclude`) → transactions → basic query optimization

**SQL (45 hrs — trimmed)**
- Tables, keys, constraints, data types
- CRUD, WHERE, ORDER BY, DISTINCT, LIMIT/TOP
- Aggregates, GROUP BY, HAVING
- **Joins (INNER/LEFT/RIGHT/FULL/SELF)** — most asked
- Subqueries + correlated subqueries
- Indexes (what/why/when)
- Transactions + ACID
- Normalization 1NF/2NF/3NF
- Views (basic)

**Skipped:** stored procedures deep, triggers, T-SQL specifics, materialized views, execution plan tuning.

**DSA — 35 problems**
| Topic | Problems |
|-------|----------|
| Linked list (reverse, middle, cycle, merge, fast/slow) | 12 |
| Stack (balanced parens, next greater, monotonic) | 8 |
| Queue / Deque / PriorityQueue basics | 5 |
| Binary tree (traversals, height, diameter, LCA, paths) | 10 |

**Project 4: REST API** — Notes/Blog API with C# + ASP.NET Core + EF Core + SQL Server + JWT (basic) + Swagger — 18 hrs

#### 🎯 INTERVIEW LAYER — MONTH 3
| Item | Target |
|------|--------|
| **C# question bank** | 35 questions (C# vs Java, value vs reference types, `struct` vs `class`, boxing/unboxing, `string` vs `StringBuilder`, `const` vs `readonly`, `ref` vs `out`, abstract class vs interface, `virtual`/`override`/`new`, sealed, extension methods, delegates vs events, `IEnumerable` vs `IQueryable` vs `List`, deferred execution, LINQ operators, `async`/`await` internals, `Task` vs `Thread`, `try-catch-finally`, `using`/`IDisposable`, garbage collection, nullable reference types, generics + constraints, records) |
| **ASP.NET Core question bank** | 35 questions (`Program.cs` startup flow, middleware pipeline & order, DI lifetimes with examples, model binding, DTO purpose, data annotations, filters vs middleware, routing types, attribute routing, REST verbs + idempotency, HTTP status codes, `IActionResult` vs `ActionResult<T>`, CORS, Swagger, JWT flow, `ILogger`, configuration & `IOptions`, hosted services, MVC vs Web API, `Kestrel`, exception-handling middleware, API versioning) |
| **EF Core question bank** | 20 questions (DbContext lifetime, change tracker, `AsNoTracking`, migrations, eager vs lazy vs explicit loading, N+1 problem, `IQueryable` vs `IEnumerable` in EF, code-first vs db-first, fluent API vs annotations, concurrency, transactions, raw SQL) |
| **SQL + DBMS question bank** | 45 questions (DBMS vs RDBMS, keys, all join types with output, `WHERE` vs `HAVING`, `UNION` vs `UNION ALL`, `DELETE` vs `TRUNCATE` vs `DROP`, subquery vs join, correlated subquery, indexes — clustered vs non-clustered, when indexes hurt, normalization 1NF/2NF/3NF/BCNF with examples, denormalization, ACID, isolation levels, deadlock, views, `RANK`/`DENSE_RANK`/`ROW_NUMBER`, CTE, nth highest salary) |
| **SQL query practice** | **40 queries written by hand** — nth highest salary, duplicate rows, employees earning more than manager, department-wise max, self-join, running total, top-N per group |
| **Classic programs** | 20 more in C# and Java (linked-list reversal, stack with min, balanced parentheses, tree traversals — all written from memory) |
| **Coding tests** | **2 timed tests** (90 min, mixed DSA + SQL) |
| **Aptitude + Reasoning** | 30 min/day — time & work, speed-distance-time, coding-decoding, blood relations |
| **English** | Explain your API architecture in 5 minutes, unscripted |

**Month 3 exit check**
- [ ] 115 DSA problems total
- [ ] Working REST API with Swagger + JWT
- [ ] C# (35) + ASP.NET (35) + EF Core (20) + SQL/DBMS (45) banks answered
- [ ] 40 SQL queries written without help
- [ ] 2 timed coding tests done
- [ ] Can explain DI, middleware order, REST verbs and joins in an interview

---

### MONTH 4 — Advanced Backend + MongoDB + Auth + Full-Stack Project

**ASP.NET Core advanced**
- JWT deep: token generation, validation, refresh tokens, password hashing
- Authorization: roles, claims, policies
- Filters & attributes
- Response caching basics
- Repository + Service layer, layered architecture, DTO pattern

**MongoDB (25 hrs — practical only)**
- NoSQL vs SQL, documents, collections, BSON
- CRUD + query operators (`$eq`, `$gt`, `$in`, `$exists`, logical)
- Update operators (`$set`, `$inc`, `$push`, `$pull`)
- Aggregation pipeline (`$match`, `$group`, `$project`, `$sort`, `$limit`)
- Embedded vs referenced design
- Indexes, MongoDB Atlas, .NET driver

**DSA — 45 problems (heaviest DSA month)**
| Topic | Problems |
|-------|----------|
| BST (insert/delete/validate/kth/LCA) | 8 |
| Heap / PriorityQueue (top-K, kth largest) | 7 |
| Hashing patterns (pair sum, subarray, duplicates) | 8 |
| Graph (adjacency list, BFS, DFS, cycle, components, topological sort) | 12 |
| Greedy (activity selection, intervals, fractional knapsack) | 5 |
| DP intro (memo → tabulation, 1D DP) | 5 |

**Trie / DSU / Segment tree / Dijkstra:** concept + 1 problem each, awareness level. **Not a priority.**

**Project 5 — RESUME PROJECT #1: Full-Stack CRUD Application** (30 hrs)
React + ASP.NET Core + SQL (or MongoDB) + JWT
- Auth flow with protected routes
- Repository/service architecture
- Pagination, filtering, searching
- Validation + global error handling
- Swagger docs + professional README

#### 🎯 INTERVIEW LAYER — MONTH 4 (mocks begin)
| Item | Target |
|------|--------|
| **MongoDB question bank** | 20 questions (SQL vs NoSQL, when to choose Mongo, BSON, embedded vs referenced, `$lookup`, aggregation stages, indexes, compound index order, sharding & replication concepts, transactions in Mongo, schema design for 1-M and M-M, 16 MB limit) |
| **Auth/Security question bank** | 20 questions (authentication vs authorization, JWT structure & flow, access vs refresh token, where to store tokens, password hashing + salting, roles vs claims vs policies, OAuth2 basics, CORS, CSRF, XSS, SQL injection prevention, HTTPS/TLS) |
| **OS question bank** | 20 questions (process vs thread, PCB, context switching, scheduling algorithms, deadlock 4 conditions + prevention/avoidance, semaphore vs mutex, race condition, critical section, paging vs segmentation, virtual memory, thrashing, page replacement) |
| **Computer Networks bank** | 20 questions (OSI 7 layers, TCP/IP, TCP vs UDP, 3-way handshake, HTTP vs HTTPS, HTTP methods + status codes, DNS resolution, IP/subnet basics, cookies vs sessions vs tokens, REST principles, WebSocket vs HTTP, load balancer, proxy vs reverse proxy) |
| **Project Q&A** | Write and rehearse the **10-minute project walkthrough script** for resume project #1 |
| **Mock interviews** | **Mock #1 (technical, recorded)** and **Mock #2 (DSA-only, timed)** |
| **Coding tests** | **2 timed tests** (90 min, medium-hard) |
| **Aptitude + Reasoning** | 30 min/day — probability, P&C, seating arrangement, syllogism, DI charts |
| **English** | Project explanation + behavioral answers using STAR |

**Month 4 exit check**
- [ ] 160 DSA problems total
- [ ] Resume project #1 complete + deployed
- [ ] MongoDB (20) + Auth (20) + OS (20) + CN (20) banks answered
- [ ] 2 mocks done and reviewed
- [ ] 10-minute project walkthrough rehearsed

---

### MONTH 5 — AI Integration + Copilot in the SDLC

> **Hard rule for this month:** You are learning to *integrate and use* AI, not to study AI/ML.
> No model architecture, no training, no fine-tuning, no math.

**AI fundamentals (8 hrs — just enough to answer questions)**
- AI vs ML vs DL vs GenAI (one paragraph each)
- What an LLM is, tokens, context window, temperature
- Hallucination, model limitations, cutoff dates

**LLM APIs (P0 — 20 hrs)**
- API keys + secure key management (never in client code)
- Request/response, system vs user messages, chat history
- Structured/JSON output
- Streaming responses
- Function / tool calling
- Error handling, retries, rate limits, token cost awareness

**Prompt engineering (8 hrs)**
Zero-shot, few-shot, role prompting, chain-of-thought, output formatting, prompt iteration.

**Embeddings + Vector DB (10 hrs)**
Embeddings concept, similarity search, **one vector DB only** (Chroma locally, or Pinecone free tier). Do not learn three.

**RAG (18 hrs — P0, this is your differentiator)**
Document load → chunking → embed → store → retrieve → context injection → generate → cite sources. Basic quality checks.

**Basic agents (6 hrs)**
Agent loop, tool definitions, tool selection, multi-step task, when *not* to use an agent.

**Awareness only (2 hrs total, read once):** LangChain (what LCEL/chains/retrievers are), Hugging Face (what the Hub is), Ollama (what local inference is), guardrails & evals (prompt injection, output validation, groundedness — concepts only).

---

#### 🤖 GITHUB COPILOT IN THE SDLC (15 hrs — P1, today's market expects this)

Interviewers now ask *"how do you use AI in your development workflow?"*. You must have a confident, specific answer with examples from your own projects.

**1. Copilot fundamentals (3 hrs)**
- Inline completions, Copilot Chat, inline chat, edit mode, agent mode
- Slash commands (`/explain`, `/fix`, `/tests`, `/doc`), `@workspace`, `#file` context
- Custom instructions (`copilot-instructions.md`), prompt files, chat modes
- Choosing the right model for the task; token/context limits

**2. Vibe coding — and its limits (2 hrs)**
- What vibe coding is: describing intent in natural language and iterating on generated code
- Where it works: prototypes, boilerplate, UI scaffolding, scripts, tests
- Where it fails: business logic, security, performance, data modelling
- **Interview position to hold:** "I vibe-code to explore, then I review, refactor and test every line. I own the code, not the model."

**3. Spec-Driven Development / SDD (4 hrs)**
- Write the **spec first** (requirements → acceptance criteria → API contract → data model), then let AI generate against the spec
- Spec → plan → tasks → implement → verify loop
- Keeping the spec in the repo as the source of truth
- Why SDD beats free-form prompting: reviewable, testable, repeatable
- Practise: write a spec for one feature of your final project, then implement it AI-assisted

**4. Copilot across the SDLC (6 hrs — do each once, for real)**
| SDLC stage | AI-assisted practice |
|------------|----------------------|
| Requirements | Turn a rough idea into user stories + acceptance criteria |
| Design | Generate API contract, DB schema options, architecture trade-offs; you decide |
| Coding | Scaffold controllers/components; refactor; explain unfamiliar code |
| Testing | Generate unit tests, edge cases, test data; verify coverage gaps |
| Code review | Pre-review your own PR; catch smells, security issues, naming |
| Debugging | Explain stack traces, isolate root cause, suggest fixes |
| Documentation | README, API docs, code comments, architecture notes |
| DevOps | Generate Dockerfile, pipeline YAML, `.gitignore`, env templates |

**5. Responsible AI-assisted development (awareness, but you must be able to speak to it)**
- Never paste secrets, credentials or proprietary data into prompts
- Licence and IP awareness for generated code
- Hallucinated APIs — always verify against real docs
- Human accountability: AI suggests, the developer is responsible
- Team standards: prompt/instruction files in the repo, AI usage in PR descriptions

**Deliverable:** use Copilot deliberately on the Month 6 project and keep notes on **3 concrete examples** (one where it saved hours, one where it was wrong and you caught it, one where SDD produced a better result than prompting). These three stories are interview gold.

---

**Projects 6 & 7 — RESUME PROJECT #2**
- AI Chat app: React + ASP.NET Core proxy + LLM API + streaming + history (15 hrs)
- **RAG Document Assistant**: upload → chunk → embed → Q&A with citations (20 hrs)

**DSA — 25 problems:** DP patterns (knapsack, LCS, LIS, grid DP, partition, string DP).

#### 🎯 INTERVIEW LAYER — MONTH 5
| Item | Target |
|------|--------|
| **AI integration question bank** | 20 questions (what is an LLM, tokens vs words, context window, temperature/top-p, hallucination + mitigation, prompt engineering techniques, structured/JSON output, function/tool calling, streaming, embeddings, cosine similarity, vector DB, **what is RAG and why**, chunking strategy, retrieval quality, when RAG vs fine-tuning, cost/latency control, prompt injection, keeping API keys server-side) |
| **Copilot / AI-in-SDLC bank** | 15 questions (how do you use AI daily, what is vibe coding and its risks, what is Spec-Driven Development, how do you review AI-generated code, how do you use AI for tests/docs/review, how do you prevent hallucinated APIs, security & IP concerns, does AI make you faster — prove it with an example, when do you *not* use AI) |
| **DevOps question bank** | 25 questions (Git branching strategy, merge vs rebase, resolving conflicts, PR workflow, what is CI/CD, Azure DevOps Boards/Repos/Pipelines, YAML pipeline stages, build vs release pipeline, variables & secrets, GitHub Actions workflow triggers, Docker image vs container, Dockerfile layers & caching, `COPY` vs `ADD`, `CMD` vs `ENTRYPOINT`, Docker Compose, volumes, networking, registry, **AKS awareness:** pod/service/deployment, why orchestration) |
| **System design basics** | Client/server, load balancing, caching, DB scaling, horizontal vs vertical, API gateway, rate limiting, CDN. **Design 5 out loud:** URL shortener, chat app, file storage, rate limiter, notification service |
| **Mock interviews** | **Mock #3 (full technical)** and **Mock #4 (frontend + backend mixed)** |
| **Coding tests** | **2 timed tests** including one full online-assessment simulation (DSA + SQL + MCQ) |
| **Aptitude + Reasoning** | 30 min/day + **1 full-length aptitude mock per week** |
| **English** | Explain AI concepts and your RAG architecture in simple English |

**Month 5 exit check**
- [ ] 185 DSA problems total
- [ ] AI Chat + RAG app both working and deployed
- [ ] Can explain RAG architecture on a whiteboard
- [ ] AI (20) + Copilot/SDLC (15) + DevOps (25) banks answered
- [ ] 3 concrete Copilot-in-SDLC stories written down
- [ ] 4 mocks done total

---

### MONTH 6 — Final Project + DevOps + Interview Sprint

**Week 1 — DevOps (P1/P2) — Azure DevOps + GitHub + Docker only**

*Git & GitHub (P0)*
- Branching strategy, feature branches, PRs, code review, merge vs rebase, conflict resolution
- `.gitignore`, tags/releases, professional README, protected branches

*Azure DevOps (P1 — your primary CI/CD platform)*
- **Boards:** work items, sprints, backlog, Agile/Scrum flow (this is also an HR/process interview topic)
- **Repos:** branch policies, pull requests, required reviewers
- **Pipelines:** YAML pipeline, stages/jobs/steps, build → test → deploy, variables, variable groups, secrets, service connections, artifacts, environments & approvals
- Build one real pipeline for your final project

*GitHub Actions (P1)*
- Workflow triggers, jobs, steps, matrix, secrets, deploying a container
- Know how it compares to Azure Pipelines (a common interview question)

*Docker (P1)*
- Images vs containers, Dockerfile, layer caching, multi-stage builds
- `CMD` vs `ENTRYPOINT`, `COPY` vs `ADD`, env vars, volumes, networking
- Docker Compose for API + DB + frontend
- Push to a container registry

*AKS / Kubernetes (P3 — awareness only, 1–2 hrs total)*
- Why orchestration exists; pod, node, service, deployment, ConfigMap/Secret, scaling
- Be able to answer *"have you worked with Kubernetes?"* honestly: "conceptual awareness, my apps are containerised and deployed via Azure Pipelines."

**Explicitly dropped:** AWS, Kubernetes hands-on, Terraform, service mesh.

**Week 2–3 — RESUME PROJECT #3: AI Full-Stack SaaS** (40 hrs)
Suggested: **AI Resume Analyzer + Job Matcher + RAG Interview Coach**
- React frontend (responsive, clean UX)
- ASP.NET Core API (layered, DI, validation, logging, global error handling)
- SQL + MongoDB (whichever fits each data type)
- JWT auth with roles
- LLM integration with streaming
- RAG over uploaded documents
- Dockerized, **Azure DevOps pipeline**, deployed live
- Built using **Spec-Driven Development with Copilot** — keep the spec in the repo
- Professional README + architecture diagram + demo video

#### 🎯 INTERVIEW LAYER — MONTH 6 (the sprint)
| Item | Target |
|------|--------|
| **Full bank revision** | Re-answer all ~340 questions across Java/OOP, HTML/CSS, JS, React, C#, ASP.NET, EF Core, SQL/DBMS, MongoDB, Auth/Security, OS, CN, AI, Copilot/SDLC, DevOps |
| **DSA revision** | Re-solve the 50 highest-yield problems from your pattern notebook, cold |
| **Coding tests** | **4 timed full assessments** (LeetCode contest / HackerRank / company OA style) |
| **System design** | 5 scenarios rehearsed out loud with diagrams |
| **Mock interviews** | **Mocks #5–#10:** 3 technical, 1 full-stack scenario-based, 2 HR/behavioral — all recorded and reviewed |
| **Project defence** | 20 questions per resume project, answered without notes |
| **Aptitude + Reasoning** | 1 full-length mock test per week (quant + reasoning + verbal, timed) |
| **English test prep** | Reading comprehension, sentence correction, vocabulary, group-discussion practice |
| **HR round** | Self-introduction (60 s + 2 min), strengths/weaknesses, why this role, conflict, failure, biggest learning, salary expectation, questions to ask them |
| **Resume + profile** | One-page ATS-friendly resume, GitHub pinned repos, LinkedIn updated |

**DSA — 15 problems:** mixed hard / company-tagged.

**Month 6 exit check**
- [ ] 200 DSA problems + all patterns recognized
- [ ] 3 resume-grade projects deployed with CI/CD
- [ ] All 15 question banks revised and answerable cold
- [ ] 10 mock interviews completed
- [ ] 8+ timed coding tests completed
- [ ] 4 full aptitude mocks completed
- [ ] Resume + GitHub + LinkedIn ready
- [ ] **Applying to jobs**

---

## 5B. BEYOND MONTH 6 — MAINTENANCE MODE (while applying)

Interview readiness decays. Once you start applying, run this weekly loop until you are hired:

| Activity | Frequency |
|----------|-----------|
| DSA problems (mixed, timed) | 5/week |
| One question bank re-read (rotate through all 15) | 1/week |
| Timed coding contest | 1/week |
| Mock interview (peer or platform) | 1 every 2 weeks |
| Company-specific prep before each interview | Per application |
| Post-interview debrief written into the mistake notebook | Every interview |
| Small project improvement / new feature | 1/week (keeps GitHub green) |
| English speaking + aptitude | 30 min/day |

**After every real interview:** write down every question asked, your answer, and the better answer. This file becomes your strongest asset by interview #5.

---

## 6. DSA — PATTERN-FIRST PLAN (200 problems)

The number is not the goal. **Pattern recognition is the goal.**

| Pattern | Problems | Month |
|---------|----------|-------|
| Complexity analysis | 5 | 1 |
| Arrays + prefix sum + Kadane | 18 | 1 |
| 2D matrix | 7 | 1 |
| Strings | 10 | 1 |
| Sorting + comparator | 8 | 2 |
| Binary search (incl. on answer) | 8 | 2 |
| Recursion | 10 | 2 |
| Backtracking | 8 | 2 |
| Two pointers + sliding window | 6 | 2 |
| Linked list + fast/slow | 12 | 3 |
| Stack (incl. monotonic) | 8 | 3 |
| Queue / Deque / PQ | 5 | 3 |
| Binary tree | 10 | 3 |
| BST | 8 | 4 |
| Heap / top-K | 7 | 4 |
| Hashing patterns | 8 | 4 |
| Graph (BFS/DFS/topo/cycle) | 12 | 4 |
| Greedy + intervals | 5 | 4 |
| DP (intro + patterns) | 30 | 4–5 |
| Trie / DSU / Segment tree / Dijkstra | 5 | 4–5 (awareness) |
| Mixed hard / company-tagged | 15 | 6 |
| **Total** | **200** | |

**Rules**
1. Never look at a solution before 25 minutes of genuine attempt.
2. After solving, write the **pattern name + trigger condition** in your pattern notebook.
3. Re-solve any problem you needed help with after 7 days.
4. Say the approach out loud in English before writing code.
5. Always state time and space complexity.

**Platform split:** LeetCode 70% · GFG 20% (concept clarity) · InterviewBit/company-tagged 10%.
**Difficulty split:** Easy 25% · Medium 65% · Hard 10%.

---

## 7. PROJECTS (7 total, 3 resume-grade)

| # | Project | Stack | Month | Hours | Resume |
|---|---------|-------|-------|-------|--------|
| 1 | Portfolio | HTML/CSS/JS | 1 | 10 | ⭐ |
| 2 | Todo App | React | 2 | 10 | ⭐ |
| 3 | Weather App | React + API | 2 | 10 | ⭐ |
| 4 | REST API | C#/ASP.NET/EF/SQL/JWT | 3 | 18 | ⭐⭐⭐ |
| 5 | **Full-Stack CRUD** | React + ASP.NET + SQL + JWT | 4 | 30 | ⭐⭐⭐⭐ |
| 6 | **AI Chat + RAG Assistant** | React + ASP.NET + LLM + Vector DB | 5 | 35 | ⭐⭐⭐⭐ |
| 7 | **AI Full-Stack SaaS** | Everything + Docker + Azure DevOps CI/CD | 6 | 40 | ⭐⭐⭐⭐⭐ |

> Projects 1–3 are learning projects — do not over-polish them.
> Projects 5, 6, 7 are **interview assets**. Every line must be explainable (see Section 8.5).

**Every resume project must have:** professional README · architecture diagram · setup instructions · live link · clean commit history · CI/CD pipeline · a written "biggest challenge & how I solved it" · **20 answered defence questions**.

---

## 8. INTERVIEW PREPARATION — THE MASTER SECTION (Month 1 → 6 → beyond)

> This is the section that gets you hired. It starts on **day 1 of Month 1** and never pauses.
> **Rule:** the day you learn a topic, you write its interview questions. No topic is "done" until its Q&A exists.

### 8.1 What a real interview actually contains

| Round | What is tested | Where it's covered |
|-------|----------------|--------------------|
| **1. Online assessment / coding test** | Timed DSA + SQL + MCQ (aptitude, output-based, language trivia) | 8.3, 8.4, 8.7 |
| **2. Technical round 1** | DSA live coding + language fundamentals + classic programs | 8.3, 8.4 |
| **3. Technical round 2** | Frontend + backend + DB + API design + your projects | 8.2 banks, 8.5 |
| **4. Technical round 3 / architecture** | System design, DevOps, AI usage, trade-offs | 8.2, 8.6 |
| **5. Managerial** | Project depth, process (Agile), teamwork, ownership | 8.5, 8.8 |
| **6. HR** | Communication, English, behavioral, expectations | 8.8, 8.9 |

You must be prepared for **all six**. Missing any one loses the offer.

---

### 8.2 THE 15 QUESTION BANKS (~340 questions total)

Maintain each as a file in a `interview-prep/` folder in your GitHub repo. Format: **Question → 3-line answer → code example if applicable.**

| # | Bank | Questions | Built in | Revised in |
|---|------|-----------|----------|------------|
| 1 | **Java + OOP** | 50 | Month 1–2 | 3, 4, 6 |
| 2 | **HTML + CSS** | 25 | Month 1 | 4, 6 |
| 3 | **JavaScript** | 40 | Month 2 | 4, 6 |
| 4 | **React** | 35 | Month 2 | 5, 6 |
| 5 | **C#** | 35 | Month 3 | 5, 6 |
| 6 | **ASP.NET Core + REST API** | 35 | Month 3 | 5, 6 |
| 7 | **EF Core** | 20 | Month 3 | 6 |
| 8 | **SQL + DBMS** | 45 | Month 3 | 5, 6 |
| 9 | **MongoDB** | 20 | Month 4 | 6 |
| 10 | **Auth + Web Security** | 20 | Month 4 | 6 |
| 11 | **Operating Systems** | 20 | Month 4 | 6 |
| 12 | **Computer Networks** | 20 | Month 4 | 6 |
| 13 | **AI / LLM / RAG** | 20 | Month 5 | 6 |
| 14 | **Copilot + AI in SDLC** | 15 | Month 5 | 6 |
| 15 | **DevOps (Git, Azure DevOps, Docker, AKS)** | 25 | Month 5–6 | 6 |
| | **Total** | **~425** | | |

Plus: **System design (5 scenarios)**, **Project defence (20 Q × 3 projects)**, **HR/behavioral (20)**.

---

### 8.3 CODING TESTS & TIMED PRACTICE (starts Month 1)

| Month | Tests | Format |
|-------|-------|--------|
| 1 | 1 | 60 min, 2 easy problems |
| 2 | 2 | 60–90 min, easy + medium |
| 3 | 2 | 90 min, DSA + SQL section |
| 4 | 2 | 90 min, medium–hard |
| 5 | 2 | Full OA simulation: DSA + SQL + MCQ + aptitude |
| 6 | 4 | Weekly full assessments / LeetCode contests |
| **Total** | **13** | |

**Rules for every test:** no IDE hints, no Copilot, no searching. Review every wrong answer the same day and log it in the mistake notebook.

---

### 8.4 CLASSIC PROGRAMS ASKED IN INTERVIEWS (write from memory, Java + C#)

**Month 1 — 20 programs**
Reverse string · palindrome · Fibonacci (iterative + recursive) · factorial · prime check · Armstrong · perfect number · GCD/LCM · swap without temp · count vowels/consonants · sum of digits · reverse a number · remove duplicates from array · second largest element · array reverse · matrix transpose · matrix addition/multiplication · 10 star/number patterns · bubble sort · linear vs binary search

**Month 2 — 20 programs**
Two-sum · anagram check · string compression · first non-repeating character · count word frequency · missing number · majority element · move zeros · array rotation · merge two sorted arrays · spiral matrix · rotate matrix 90° · selection sort · insertion sort · merge sort · quick sort · binary search (iterative + recursive) · find duplicates · intersection of two arrays · Kadane's algorithm

**Month 3 — 20 programs**
Reverse a linked list · detect & remove cycle · middle node · nth from end · merge two sorted lists · palindrome linked list · implement stack using array & linked list · balanced parentheses · next greater element · min-stack · queue using two stacks · circular queue · tree traversals (all 4) · height of tree · diameter · mirror tree · LCA · level-order · validate BST · kth smallest in BST

**Month 4–6 — 20 programs**
Top-K frequent elements · kth largest with heap · subarray with given sum · longest substring without repeat · group anagrams · BFS & DFS on graph · detect cycle in graph · topological sort · number of islands · 0/1 knapsack · LCS · LIS · coin change · edit distance · climbing stairs · house robber · activity selection · merge intervals · trie insert/search · LRU cache

> **80 programs total.** These plus your 200 DSA problems cover almost any live-coding round.

---

### 8.5 PROJECT DEFENCE (20 questions per resume project)

For **each** of the 3 resume projects, write answers to all of these:

1. Why did you build this? What problem does it solve?
2. Draw the architecture end-to-end.
3. Walk me through what happens when a user clicks X.
4. Why React? Why ASP.NET Core? Why this database?
5. Show me the database schema. Why normalized/denormalized this way?
6. How did you design the API? Why these endpoints/verbs/status codes?
7. Explain your authentication and authorization flow.
8. Where do you store the JWT and why?
9. How do you handle validation and errors globally?
10. How do you handle pagination, filtering and searching?
11. What is your folder/layer structure and why?
12. Where did you use dependency injection and which lifetime?
13. What was the hardest bug? How did you find and fix it?
14. What performance issue did you hit and how did you solve it?
15. How is it deployed? Walk me through the pipeline.
16. How did you use AI/Copilot while building it? Give a specific example.
17. Where did AI give you wrong code and how did you catch it?
18. How would you scale this to 100× users?
19. What would you do differently with two more weeks?
20. What did you learn from this project?

**Also rehearse:** a **10-minute unscripted walkthrough** and a **60-second elevator version** of each project.

---

### 8.6 SYSTEM DESIGN (basics only — 5 scenarios, Month 5–6)

**Concepts:** client/server, horizontal vs vertical scaling, load balancer, caching (where & what to cache), CDN, database scaling (replication, sharding, read replicas), SQL vs NoSQL choice, API gateway, rate limiting, message queue (concept), stateless services, monolith vs microservices trade-off.

**Scenarios to design out loud, with a diagram, in 20 minutes each:**
1. URL shortener
2. Chat application (real-time)
3. File upload / storage service
4. Rate limiter
5. **AI document Q&A (RAG) system** ← your differentiator; you have actually built this

**Template to follow every time:** requirements → scale estimate → API design → data model → high-level diagram → bottleneck → trade-offs.

---

### 8.7 APTITUDE, REASONING & VERBAL TESTS (Month 3 → 6, 30 min/day)

Almost every company screens with an aptitude test **before** the technical round. Failing it means never reaching the interview.

| Area | Topics |
|------|--------|
| **Quantitative** | Number system, percentages, ratio & proportion, average, profit & loss, simple & compound interest, time & work, pipes & cisterns, speed-distance-time, trains/boats, mixtures, probability, permutation & combination, algebra basics, mensuration basics |
| **Logical reasoning** | Number & letter series, coding-decoding, blood relations, direction sense, seating arrangement (linear & circular), syllogism, statement–assumption, puzzles, clocks & calendars, analogy, odd one out |
| **Data interpretation** | Bar charts, line graphs, pie charts, tables, caselets |
| **Verbal / English test** | Reading comprehension, sentence correction, error spotting, fill in the blanks, synonyms & antonyms, para-jumbles, one-word substitution |
| **Technical MCQs** | Output-based Java/C#/JS questions, complexity MCQs, SQL output questions, OOP true/false |

**Schedule:** Month 3–4 → 20–30 min/day topic-wise. Month 5 → 30 min/day + 1 sectional test/week. Month 6 → **1 full-length timed mock per week** (quant + reasoning + verbal).

---

### 8.8 HR & BEHAVIORAL (Month 4 → 6)

**20 questions to prepare with the STAR method:**
Tell me about yourself (60 s + 2 min) · Why this role? · Why should we hire you? · Strengths · Weaknesses (with a fix in progress) · Biggest achievement · Biggest failure and what you learned · A time you handled conflict · A time you missed a deadline · How do you handle pressure/feedback? · Describe your learning process · How do you stay updated? · Do you prefer working alone or in a team? · Explain Agile/Scrum and your role in it · How do you estimate work? · Where do you see yourself in 3 years? · Are you willing to relocate? · Salary expectation · Why the career switch / gap? · **Questions you ask them** (always have 3)

**Also prepare:** your **2-minute self-introduction**, memorised but natural, tailored to an AI Full Stack role.

---

### 8.9 MOCK INTERVIEW SCHEDULE (10 mocks)

| # | Month | Type | Focus |
|---|-------|------|-------|
| 1 | 4 | Technical (recorded) | Java/OOP + DSA + SQL |
| 2 | 4 | DSA only, timed | Live coding under pressure |
| 3 | 5 | Full technical | Backend + DB + API design |
| 4 | 5 | Full-stack scenario | React + ASP.NET + integration |
| 5 | 6 | Technical | DSA hard + core CS |
| 6 | 6 | Technical | AI/RAG + Copilot-in-SDLC + DevOps |
| 7 | 6 | Project deep-dive | 45 min on one project |
| 8 | 6 | System design | 2 scenarios |
| 9 | 6 | HR / behavioral | STAR answers, English |
| 10 | 6 | Full interview simulation | All rounds back-to-back |

**Every mock must be recorded and reviewed the same day.** Log three things you did badly into the mistake notebook.

---

### 8.10 MONTH-BY-MONTH INTERVIEW TRACKER

| Month | Banks built | Programs | Coding tests | Mocks | Aptitude | Cumulative |
|-------|-------------|----------|--------------|-------|----------|------------|
| 1 | Java/OOP (30), HTML/CSS (25) | 20 | 1 | — | 15 min/day | 55 Q |
| 2 | JS (40), React (35), OOP→50 | 20 | 2 | — | 20 min/day | 150 Q |
| 3 | C# (35), ASP.NET (35), EF (20), SQL/DBMS (45) | 20 | 2 | — | 30 min/day | 285 Q |
| 4 | Mongo (20), Auth (20), OS (20), CN (20) | 10 | 2 | 2 | 30 min/day | 365 Q |
| 5 | AI (20), Copilot (15), DevOps (25) | 10 | 2 | 2 | 30 min + weekly test | 425 Q |
| 6 | Full revision + system design + HR (20) | — | 4 | 6 | Weekly full mock | 425 Q mastered |

---

## 9. ENGLISH — 30–60 MIN EVERY DAY (never a syllabus, always a habit)

```
10 min  Listening   (tech talk / podcast)
10 min  Speaking    (read aloud + record yourself)
10 min  Vocabulary  (10 new words, incl. technical)
10 min  Technical explanation (explain today's topic aloud)
10 min  Interview answer practice
```

| Month | English focus |
|-------|---------------|
| 1 | Grammar basics, tenses, articles, self-introduction |
| 2 | Daily conversation, technical vocabulary |
| 3 | Technical explanation, documentation/README writing |
| 4 | Project presentation (10-min demo script) |
| 5 | HR/behavioral answers, STAR method |
| 6 | Full mock interviews, recorded and reviewed |

**Non-negotiable:** record yourself once a week and listen back.

---

## 10. APTITUDE & REASONING

Full topic list, schedule and test plan are in **Section 8.7**. Summary:

| Month | Time/day | Activity |
|-------|----------|----------|
| 1–2 | 15–20 min | Number system, percentages, ratio, averages, series (light) |
| 3–4 | 30 min | Full quant + reasoning topic coverage |
| 5 | 30 min | Sectional tests, 1 per week |
| 6 | 30 min | **1 full-length timed mock per week** (quant + reasoning + verbal) |

---

## 11. DAILY SCHEDULE (~7 productive hours)

```
08:30 – 09:00   Revision of yesterday + plan today
09:00 – 11:00   DSA (learn + solve)
11:00 – 11:15   Break
11:15 – 13:00   DSA practice + classic interview programs
13:00 – 14:00   Lunch + rest
14:00 – 15:30   Development learning (Frontend / C# / ASP.NET per month)
15:30 – 16:00   Break
16:00 – 17:30   Project / hands-on coding
17:30 – 18:00   Break
18:00 – 18:45   🎯 INTERVIEW BLOCK (question bank / AI / core CS — never skipped)
18:45 – 19:15   Aptitude + reasoning
19:15 – 19:45   English
19:45 – 20:00   Mistake notebook + GitHub commit
```

**Time ratio target:** 30% learning · 50% coding & projects · 20% revision & interview prep.

### Priority when the day goes short
1. DSA → 2. **Interview block** → 3. Development → 4. Project → 5. AI → 6. Aptitude
**English and the interview block are never skipped** — both fit in 20 minutes on a bad day.

### Weekly rhythm
- **Mon–Fri:** DSA + Development + Interview block + English
- **Saturday:** Project work + DSA revision + clearing pending topics
- **Sunday:** Weekly revision + **timed test (coding or aptitude)** + backlog clearing + next-week plan

**Backlog rule:** never let backlog exceed one week. If it does, cut a P2 topic — never cut DSA or the interview block.

---

## 12. REVISION SYSTEM

**Daily (30 min):** yesterday's DSA (15) + yesterday's code (10) + mistake notebook (5)
**Weekly (2 hrs, Sunday):** week's patterns (30) + dev concepts (30) + **one question bank re-read (30)** + timed test review (20) + plan (10)
**Monthly (4 hrs, day 1):** month's DSA topics (1.5 hr) + stack revision (1 hr) + **all banks built so far, spot-check (1 hr)** + re-solve 5 hardest (30 min)

**Five notebooks (keep them small):**
1. **Pattern notebook** — one pattern per page: trigger, template, 3 example problems
2. **Mistake notebook** — what went wrong, why, correct approach (includes wrong test answers and bad mock answers)
3. **Interview Q&A banks** — 15 files in `interview-prep/`, one page per topic
4. **Project notebook** — architecture, challenges, the 20 defence answers per project
5. **AI/Copilot notebook** — your 3 concrete SDLC stories + prompts that worked

---

## 13. JOB-READY CHECKLIST (Month 6 final gate)

**Technical**
- [ ] 200 DSA problems + 80 classic programs, all patterns recognizable, complexity always stated
- [ ] Java OOP + Collections solid (interview level)
- [ ] HTML semantics + CSS layout explainable
- [ ] JavaScript core (closures, promises, event loop, `this`) explainable
- [ ] React: components, hooks, routing, context, API integration
- [ ] C#: OOP, LINQ, async/await
- [ ] ASP.NET Core: controllers, routing, DI, middleware, validation, JWT, Swagger
- [ ] EF Core: DbContext, relationships, migrations, LINQ, loading strategies
- [ ] SQL: joins, group by, subqueries, indexes, transactions, normalization + 40 hand-written queries
- [ ] MongoDB: CRUD, aggregation, schema design
- [ ] AI: LLM API, prompting, structured output, tool calling, embeddings, RAG
- [ ] **Copilot in SDLC: vibe coding, Spec-Driven Development, AI-assisted test/review/docs — with 3 real examples**
- [ ] Git + Azure DevOps pipeline + Docker + GitHub Actions + AKS awareness + one live deployment

**Portfolio**
- [ ] 3 resume-grade projects, deployed with CI/CD, README + architecture diagram
- [ ] `interview-prep/` folder with all 15 question banks committed
- [ ] GitHub profile polished, repos pinned, green graph
- [ ] One-page ATS-friendly resume

**Interview**
- [ ] All 15 question banks (~425 questions) answerable cold
- [ ] 13 timed coding tests completed and reviewed
- [ ] 5 system design scenarios practiced with diagrams
- [ ] 20 defence questions answered for each of the 3 projects
- [ ] 10-minute + 60-second project walkthroughs rehearsed
- [ ] 10 mock interviews completed and reviewed
- [ ] 4+ full-length aptitude mocks completed
- [ ] HR/behavioral answers using STAR, 3 questions ready to ask them

**Communication**
- [ ] Self-introduction in 60 sec and 2 min
- [ ] Can explain any project in English confidently
- [ ] Can think out loud while coding
- [ ] Can answer "how do you use AI in your workflow?" with specifics

---

## 14. TEN RULES FOR THE NEXT SIX MONTHS

1. **Interview-ready beats course-complete.** Finishing lectures is not progress.
2. **Never add a technology.** The stack in Section 1 is locked.
3. **Pattern > problem count.** 200 understood beats 400 rushed.
4. **Java is for DSA and OOP interviews only.** C# is your backend.
5. **AI means integration and SDLC usage, not ML.** No training, no math, no fine-tuning.
6. **Interview prep starts Month 1, day 1.** No topic is done until its Q&A exists.
7. **Code more than you take notes.** 50% of your time is hands-on.
8. **Commit to GitHub every single day.**
9. **English and the interview block are daily, no exceptions.** 20 min minimum on a bad day.
10. **Consistency > intensity.** Never miss two days in a row.

---

*6-Month Interview-Ready Roadmap — AI Full Stack Developer*
*Targets: 200 DSA problems · 80 classic programs · ~425 interview questions across 15 banks · 13 timed coding tests · 10 mock interviews · 3 resume-grade deployed projects*
