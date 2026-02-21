WORKFLOW:

**Phase 1: Code Walkthroughs** (3-5 hours)
- You say: "Ready to create [TOPIC]. Start Phase 1."
- I build all the code files (.java/.js/.ts files with examples)
- I build teaching scripts (code-walkthrough-script.md with comprehensive notes)
- You run verification commands
- You say: "Phase 1 verified. Start Phase 2."

**Phase 2: Slides** (4-6 hours)
- I create two directories: "Slides 1" and "Slides 2" (one for Part 1, one for Part 2)
- For EACH part, I create TWO SEPARATE FILES (NOT combined):
  - `slide-descriptions.md`: Visual content only (slides, code examples, diagrams, ASCII art)
  - `speaking-script.md`: Speaker notes only (what to say for each slide)
- You run verification commands
- You say: "Phase 2 verified. Start Phase 3."

**Phase 3: Exercises** (8-12 hours)
- I build all exercises with consistent structure
- Each exercise gets its own directory with a descriptive name showing what it teaches:
  - Folder name format: `Exercise 01 - Concept Name` (e.g., "Exercise 01 - Grade Calculator with If-Else")
  - `instructions.md`: Problem statement and requirements
  - `starter-code/`: Code with TODOs
  - `solutions/`: Complete working solutions
- You verify all exercises
- You say: "Phase 3 verified. Start Phase 4."

**Phase 4: Check Completeness** (30 minutes)
- I verify all components are present and complete
- I check that all files have correct structure and content
- I provide summary of what's been built
- You say: "Phase 4 verified. Start Phase 5."

**Phase 5: Verification** (1 hour)
- You run 7 verification commands (bash)
- Confirms all files present and complete
- Final QA pass





# COMPREHENSIVE TOPIC CREATION GUIDE - ALL LESSONS PRE-FILLED

**Purpose:** One centralized guide with every lesson pre-filled. Just select which topic to build, confirm sizing, and have the agent build it one phase at a time.

---

# VERIFICATION COMMANDS (Run after completing each topic)

**Command 1: Verify Folder Structure**
```bash
find "/Users/emilyosborne/Documents/DE-Class-Guide/Week X - Day Y - [Topic]" -type d | sort
```

**Command 2: Count Code Files**
```bash
find "/Users/emilyosborne/Documents/DE-Class-Guide/Week X - Day Y - [Topic]/Code-walkthrough" -name "*.java" -o -name "*.js" -o -name "*.jsx" -o -name "*.ts" -o -name "*.tsx" -o -name "*.sql" | wc -l
```

**Command 3: Count Exercises**
```bash
ls -d "/Users/emilyosborne/Documents/DE-Class-Guide/Week X - Day Y - [Topic]/Exercises/Exercise"* | wc -l
```

**Command 4: Verify Exercise Structure**
```bash
for i in {01..12}; do echo "Exercise $i:"; ls -la "/Users/emilyosborne/Documents/DE-Class-Guide/Week X - Day Y - [Topic]/Exercises/Exercise $i"*/; done 2>/dev/null | grep -E "instructions|starter-code|solutions"
```

**Command 5: Verify Slides Exist**
```bash
ls -la "/Users/emilyosborne/Documents/DE-Class-Guide/Week X - Day Y - [Topic]/Slides 1/" "/Users/emilyosborne/Documents/DE-Class-Guide/Week X - Day Y - [Topic]/Slides 2/"
```

**Command 6: Verify Guide Files**
```bash
ls -la "/Users/emilyosborne/Documents/DE-Class-Guide/Week X - Day Y - [Topic]/" | grep -E "INSTRUCTOR_GUIDE|COMPLETENESS_CHECKLIST"
```

---

# ALL LESSONS - QUICK LOOKUP

**Status: ✅ = Complete | ⏳ = Planned | 🔄 = In Progress**

## WEEK 1 - Core Java Fundamentals
- Day 1: Linux, Git, SDLC & Agile ⏳
- Day 2: Core Java Part 1 ✅
- Day 3: Core Java Part 2 ⏳
- Day 4: OOP Part 1 ⏳
- Day 5: OOP Part 2 ⏳

## WEEK 2 - Advanced Java
- Day 6: Collections & Generics ⏳
- Day 7: Exception Handling & I/O ⏳
- Day 8: Lambdas, Streams & DateTime ⏳
- Day 9: Multithreading ⏳
- Day 10: Advanced Java ⏳

## WEEK 3 - Frontend Foundations
- Day 11: HTML & CSS ⏳
- Day 12: JavaScript Fundamentals ⏳
- Day 13: DOM Manipulation & Events ⏳
- Day 14: ES6+, OOP in JS & Async JavaScript ⏳
- Day 15: TypeScript ⏳

## WEEK 4 - Frontend Frameworks (Dual Track)
- Day 16a: React Fundamentals ⏳ | 16b: Angular Fundamentals ⏳
- Day 17a: React Hooks ⏳ | 17b: Angular Services & DI ⏳
- Day 18a: React Routing & Redux ⏳ | 18b: Angular Routing & Forms ⏳
- Day 19a: React API & Testing ⏳ | 19b: Angular HTTP & RxJS ⏳
- Day 20a: React Advanced & Deployment ⏳ | 20b: Angular Signals & Testing ⏳

## WEEK 5 - SQL, REST Tooling & Spring Foundations
- Day 21: Database Fundamentals & Queries — Part 1 ⏳
- Day 22: SQL Database Design & Advanced Topics ⏳
- Day 23: REST & API Tools ⏳
- Day 24: Maven, Gradle & Spring Core ⏳
- Day 25: Spring Boot ⏳

## WEEK 6 - Spring Ecosystem, Testing & Security
- Day 26: Spring MVC & Spring AOP ⏳
- Day 27: Spring Data JPA ⏳
- Day 28: Testing ⏳
- Day 29: Spring Security & OWASP ⏳
- Day 30: JWT & RBAC ⏳

## WEEK 7 - GraphQL, AI & MongoDB
- Day 31: GraphQL ⏳
- Day 32: GraphQL Client ⏳
- Day 33: AI & Developer Productivity ⏳
- Day 34: Spring AI ⏳
- Day 35: MongoDB ⏳

## WEEK 8 - DevOps, Microservices & Cloud
- Day 36: Docker & Kubernetes ⏳
- Day 37: CI/CD & DevOps ⏳
- Day 38: Microservices ⏳
- Day 39: Kafka ⏳
- Day 40: AWS ⏳

## WEEK 9 - Integration, Review & Project Preparation
- Capstone Week ⏳

---

# READY TO BUILD? SELECT YOUR TOPIC BELOW

## Copy the section for your chosen topic and provide to agent with: "Ready to create [TOPIC]. Start with Phase 1. Assessment below:"

---

### WEEK 1 - DAY 1: Foundations — Linux, Git, SDLC & Agile

**Complexity Assessment:**
- Part 1: MODERATE-COMPLEX (Linux basics: MODERATE, Shell scripting: COMPLEX, SDLC: SIMPLE)
- Part 2: COMPLEX (Git workflows: COMPLEX, Agile/Scrum: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 shell script examples
- Code Walkthroughs Part 2: 5-6 git scenario walkthroughs
- Slides Part 1: ~18 slides
- Slides Part 2: ~20 slides
- Total Exercises: 8-10 exercises

**Rationale:** Part 1 is foundational (straightforward Linux commands). Part 2 is Git workflows and Agile ceremonies (practical application). Both require hands-on practice.

---

### WEEK 1 - DAY 2: Core Java Fundamentals — Part 1 ✅ COMPLETE

**Status:** Already created with 13 code files, 27 slides per part, 12 exercises, INSTRUCTOR_GUIDE, COMPLETENESS_CHECKLIST.

---

### WEEK 1 - DAY 3: Core Java Fundamentals — Part 2

**Complexity Assessment:**
- Part 1: MODERATE-COMPLEX (If/else: MODERATE, Switch: SIMPLE, For: COMPLEX, While: MODERATE, Do-while: SIMPLE, Enhanced for: MODERATE, Break/continue: SIMPLE)
- Part 2: COMPLEX (Arrays: MODERATE, Multi-dimensional: COMPLEX, Patterns: COMPLEX)

**Sizing Decision:**
- Code Walkthroughs Part 1: 7 .java files
- Code Walkthroughs Part 2: 5 .java files
- Slides Part 1: ~22 slides
- Slides Part 2: ~20 slides
- Total Exercises: 10 exercises

**Rationale:** Control flow is foundational but more complex than basic syntax. Arrays need visualization. Common patterns (search/sort) require integration.

---

### WEEK 1 - DAY 4: OOP — Part 1

**Complexity Assessment:**
- Part 1: COMPLEX (Classes: COMPLEX, Constructors: COMPLEX, Members: MODERATE)
- Part 2: COMPLEX (Access modifiers: COMPLEX, Non-access modifiers: COMPLEX, Static vs instance: COMPLEX, This keyword: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 7-8 .java files
- Code Walkthroughs Part 2: 6-7 .java files
- Slides Part 1: ~26 slides
- Slides Part 2: ~26 slides
- Total Exercises: 12 exercises

**Rationale:** OOP is foundational and complex. Students struggle with access modifiers and static vs instance. Needs many examples and deep practice.

---

### WEEK 1 - DAY 5: OOP — Part 2

**Complexity Assessment:**
- Part 1: VERY COMPLEX (Inheritance: COMPLEX, Override/Overload: COMPLEX, Polymorphism: VERY COMPLEX)
- Part 2: COMPLEX (Abstraction: COMPLEX, Encapsulation: MODERATE, Packages: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 8 .java files
- Code Walkthroughs Part 2: 6-7 .java files
- Slides Part 1: ~28 slides
- Slides Part 2: ~26 slides
- Total Exercises: 12 exercises

**Rationale:** Advanced OOP concepts are abstract and challenging. Polymorphism especially needs multiple examples. Students commonly confuse override vs overload.

---

### WEEK 2 - DAY 6: Collections & Generics

**Complexity Assessment:**
- Part 1: VERY COMPLEX (Framework overview: SIMPLE, Collections interfaces/implementations: VERY COMPLEX with 7+ types, Iterators: MODERATE)
- Part 2: COMPLEX (Generics: COMPLEX, Bounded types: COMPLEX, Comparable vs Comparator: COMPLEX, Collections methods: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 10-12 .java files
- Code Walkthroughs Part 2: 7-8 .java files
- Slides Part 1: ~35 slides
- Slides Part 2: ~28 slides
- Total Exercises: 14 exercises

**Rationale:** Collections is among the most complex core Java topics. Many types, each with performance trade-offs. Generics adds complexity.

---

### WEEK 2 - DAY 7: Exception Handling & I/O

**Complexity Assessment:**
- Part 1: MODERATE (Exception hierarchy: MODERATE, Try-catch-finally: MODERATE, Custom exceptions: SIMPLE, Throwing: MODERATE)
- Part 2: MODERATE (File I/O: MODERATE, Buffered streams: MODERATE, Try-with-resources: COMPLEX, Text files: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .java files
- Code Walkthroughs Part 2: 5-6 .java files
- Slides Part 1: ~20 slides
- Slides Part 2: ~20 slides
- Total Exercises: 8 exercises

**Rationale:** Exception handling is straightforward in concept but needs practice. I/O is practical and concrete. Less abstract than generics or streams.

---

### WEEK 2 - DAY 8: Lambdas, Streams & DateTime

**Complexity Assessment:**
- Part 1: COMPLEX (Lambda syntax: MODERATE, Functional interfaces: COMPLEX, Method references: MODERATE, Optional: COMPLEX)
- Part 2: VERY COMPLEX (Stream API creation: COMPLEX, Stream operations: COMPLEX, DateTime API: COMPLEX)

**Sizing Decision:**
- Code Walkthroughs Part 1: 6-7 .java files
- Code Walkthroughs Part 2: 8-9 .java files
- Slides Part 1: ~25 slides
- Slides Part 2: ~30 slides
- Total Exercises: 12 exercises

**Rationale:** Three separate complex topics combined in one day. Streams especially need good visualization. High cognitive load day.

---

### WEEK 2 - DAY 9: Multithreading

**Complexity Assessment:**
- Part 1: VERY COMPLEX (Thread basics: COMPLEX, Runnable: SIMPLE, Lifecycle: COMPLEX, Synchronization: VERY COMPLEX, Deadlock: VERY COMPLEX)
- Part 2: VERY COMPLEX (Producer-consumer: VERY COMPLEX, Concurrent collections: MODERATE, ExecutorService: COMPLEX, CompletableFuture: VERY COMPLEX, Utilities: VERY COMPLEX, Awareness: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 10-12 .java files
- Code Walkthroughs Part 2: 10-12 .java files
- Slides Part 1: ~35 slides
- Slides Part 2: ~40 slides
- Total Exercises: 15 exercises

**Rationale:** Most complex single topic in Java curriculum. Concurrency requires deep understanding. CompletableFuture is particularly abstract. May need to split.

---

### WEEK 2 - DAY 10: Advanced Java

**Complexity Assessment:**
- Part 1: MODERATE-COMPLEX (Big O: MODERATE, Complexity analysis: MODERATE, Design patterns: COMPLEX, JMM: COMPLEX)
- Part 2: COMPLEX (GC: COMPLEX, JVM tuning: COMPLEX, Reference types: COMPLEX, File I/O: MODERATE, Serialization: MODERATE, Debugging: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 6-7 .java files
- Code Walkthroughs Part 2: 8-9 .java files
- Slides Part 1: ~28 slides
- Slides Part 2: ~32 slides
- Total Exercises: 12 exercises

**Rationale:** Advanced topics but somewhat disconnected. Good under-the-hood Java concepts. May benefit from being split into 2 days.

---

### WEEK 3 - DAY 11: HTML & CSS

**Complexity Assessment:**
- Part 1: MODERATE (HTML basics: 4 SIMPLE + 1 MODERATE)
- Part 2: COMPLEX (CSS basics: SIMPLE, Selectors: MODERATE, Specificity: COMPLEX, Box Model: MODERATE, Positioning: COMPLEX, Flexbox/Grid: COMPLEX, Responsive: MODERATE, Advanced: MODERATE, Bootstrap: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .html files
- Code Walkthroughs Part 2: 8-9 .css/.html files
- Slides Part 1: ~18 slides
- Slides Part 2: ~28 slides
- Total Exercises: 10 exercises

**Rationale:** Part 1 is foundational HTML (straightforward). Part 2 is CSS complexity (specificity, positioning, layouts are tricky).

---

### WEEK 3 - DAY 12: JavaScript Fundamentals

**Complexity Assessment:**
- Part 1: MODERATE (Basics: SIMPLE, Variables: COMPLEX, Data types: MODERATE, Type coercion: COMPLEX, Arrays: MODERATE, Template literals: SIMPLE)
- Part 2: COMPLEX (Functions: MODERATE, This keyword: VERY COMPLEX, Closures: COMPLEX, Hoisting: COMPLEX, Strict mode: SIMPLE, Truthy/falsy: MODERATE, Control flow: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .js files
- Code Walkthroughs Part 2: 7-8 .js files
- Slides Part 1: ~22 slides
- Slides Part 2: ~26 slides
- Total Exercises: 10 exercises

**Rationale:** JavaScript differs from Java fundamentally. 'This' and closures particularly tricky for Java developers. Need good explanations.

---

### WEEK 3 - DAY 13: DOM Manipulation & Events

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (DOM overview: SIMPLE, Selecting: SIMPLE, Manipulation: MODERATE, Traversal: MODERATE, Styles/classes: SIMPLE, Attributes: SIMPLE)
- Part 2: MODERATE (Events: MODERATE, Bubbling: COMPLEX, Delegation: COMPLEX, Event object: MODERATE, Prevent default: SIMPLE, Event types: SIMPLE, Building features: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .js files
- Code Walkthroughs Part 2: 5-6 .js files
- Slides Part 1: ~18 slides
- Slides Part 2: ~20 slides
- Total Exercises: 8 exercises

**Rationale:** Part 1 is concrete DOM APIs (straightforward). Part 2 introduces event flow (non-intuitive). Smaller day.

---

### WEEK 3 - DAY 14: ES6+, OOP in JS & Async JavaScript

**Complexity Assessment:**
- Part 1: COMPLEX (Classes: COMPLEX, Prototypes: VERY COMPLEX, Constructor functions: MODERATE, OOP patterns: COMPLEX, ES6+ features: MODERATE, Modules: MODERATE, Map/Set: SIMPLE, Awareness: SIMPLE)
- Part 2: VERY COMPLEX (Event loop: VERY COMPLEX, Callbacks: MODERATE, Promises: COMPLEX, Promise methods: COMPLEX, Async/await: MODERATE, Error handling: COMPLEX, Fetch: MODERATE, JSON: SIMPLE, APIs: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 8-9 .js files
- Code Walkthroughs Part 2: 10-11 .js files
- Slides Part 1: ~30 slides
- Slides Part 2: ~35 slides
- Total Exercises: 14 exercises

**Rationale:** Three major topics compressed into one day. All three are complex. Event loop especially needs careful teaching. Very dense.

---

### WEEK 3 - DAY 15: TypeScript

**Complexity Assessment:**
- Part 1: MODERATE (Basics: SIMPLE, Type annotations: MODERATE, Simple types: SIMPLE, Special types: MODERATE, Object types: MODERATE, Union types: MODERATE, Arrays/tuples: SIMPLE, Enums: SIMPLE, Casting: SIMPLE, Functions: MODERATE)
- Part 2: MODERATE (Generics: COMPLEX, Classes: MODERATE, Decorators: MODERATE, Compiler: SIMPLE, Utility types: MODERATE, Type guards: MODERATE, Interface vs Type: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .ts files
- Code Walkthroughs Part 2: 6-7 .ts files
- Slides Part 1: ~24 slides
- Slides Part 2: ~22 slides
- Total Exercises: 9 exercises

**Rationale:** TypeScript adds type safety to JavaScript but is not deeply complex. Most concepts are straightforward. Needs practical examples of types catching bugs.

---

### WEEK 4 - DAY 16a: React Fundamentals

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Overview: SIMPLE, SPA: SIMPLE, Virtual DOM: MODERATE, JSX: MODERATE, Components: MODERATE, Functional components: SIMPLE)
- Part 2: MODERATE (Props: MODERATE, Lists: MODERATE, Rendering: MODERATE, Composition: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .jsx files
- Code Walkthroughs Part 2: 4-5 .jsx files
- Slides Part 1: ~20 slides
- Slides Part 2: ~18 slides
- Total Exercises: 8 exercises

**Rationale:** Foundational React concepts are not deeply complex. Functional components + props is the core. More hands-on than conceptually deep.

---

### WEEK 4 - DAY 16b: Angular Fundamentals

**Complexity Assessment:**
- Part 1: MODERATE (Overview: SIMPLE, CLI/structure: MODERATE, TypeScript: MODERATE, Components: MODERATE, Templates: MODERATE)
- Part 2: MODERATE-COMPLEX (Data binding: COMPLEX, Template references: SIMPLE, Lifecycle: MODERATE, Modules: COMPLEX, Directives: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .ts/.html files
- Code Walkthroughs Part 2: 5-6 .ts/.html files
- Slides Part 1: ~20 slides
- Slides Part 2: ~22 slides
- Total Exercises: 9 exercises

**Rationale:** Angular setup is heavier than React, but core concepts similarly complex. More traditional framework approach. Data binding and modules add complexity.

---

### WEEK 4 - DAY 17a: React Hooks

**Complexity Assessment:**
- Part 1: MODERATE-COMPLEX (useState: MODERATE, useEffect: COMPLEX, Dependencies: COMPLEX, Events: SIMPLE)
- Part 2: COMPLEX (Forms: MODERATE, Refs: MODERATE, useRef: MODERATE, useContext: COMPLEX, Custom hooks: COMPLEX, Lifecycle: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .jsx files
- Code Walkthroughs Part 2: 6-7 .jsx files
- Slides Part 1: ~24 slides
- Slides Part 2: ~26 slides
- Total Exercises: 10 exercises

**Rationale:** Hooks are central to modern React. useEffect dependencies are a common source of bugs. Context API is powerful but tricky.

---

### WEEK 4 - DAY 17b: Angular Services & DI

**Complexity Assessment:**
- Part 1: MODERATE (Communication: MODERATE, Directives: MODERATE, *ngIf/*ngFor: MODERATE, Pipes: SIMPLE, Custom pipes: SIMPLE)
- Part 2: MODERATE-COMPLEX (Services: COMPLEX, DI: COMPLEX, Providers: COMPLEX, Creating services: MODERATE, Sharing data: MODERATE, Encapsulation: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .ts/.html files
- Code Walkthroughs Part 2: 6-7 .ts files
- Slides Part 1: ~20 slides
- Slides Part 2: ~24 slides
- Total Exercises: 9 exercises

**Rationale:** Services and DI are foundational to Angular. Component communication and directives are moderate. Less complex than React Hooks day.

---

### WEEK 4 - DAY 18a: React Routing & Redux

**Complexity Assessment:**
- Part 1: MODERATE-COMPLEX (Routing: MODERATE, Parameters: MODERATE, Nested routes: MODERATE, HOC: COMPLEX)
- Part 2: VERY COMPLEX (Redux: VERY COMPLEX, Toolkit: COMPLEX, Connecting: MODERATE, Hooks: MODERATE, DevTools: SIMPLE, Patterns: COMPLEX)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .jsx files
- Code Walkthroughs Part 2: 7-8 .jsx files
- Slides Part 1: ~22 slides
- Slides Part 2: ~28 slides
- Total Exercises: 11 exercises

**Rationale:** Routing is straightforward but Redux is complex paradigm shift. Immutability, unidirectional flow, and DevTools all important.

---

### WEEK 4 - DAY 18b: Angular Routing & Forms

**Complexity Assessment:**
- Part 1: MODERATE (Routing: MODERATE, Config: MODERATE, Parameters: MODERATE, Nested: MODERATE, Guards: COMPLEX, Lazy loading: MODERATE)
- Part 2: COMPLEX (Template forms: MODERATE, Reactive forms: COMPLEX, FormBuilder: COMPLEX, Validation: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .ts/.html files
- Code Walkthroughs Part 2: 6-7 .ts/.html files
- Slides Part 1: ~22 slides
- Slides Part 2: ~26 slides
- Total Exercises: 10 exercises

**Rationale:** Routing is straightforward. Forms are complex with two approaches (template-driven vs reactive). Reactive forms especially need good examples.

---

### WEEK 4 - DAY 19a: React API & Testing

**Complexity Assessment:**
- Part 1: MODERATE (API integration: MODERATE, Error handling: MODERATE, Response handling: SIMPLE, Error boundaries: COMPLEX)
- Part 2: MODERATE (Testing Library: MODERATE, Jest: SIMPLE, Component tests: MODERATE, Hooks/state: MODERATE, Mock API: MODERATE, Env vars: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .jsx files
- Code Walkthroughs Part 2: 5-6 .test.jsx files
- Slides Part 1: ~20 slides
- Slides Part 2: ~22 slides
- Total Exercises: 9 exercises

**Rationale:** API integration is straightforward. Testing is important but not deeply complex. User-centric testing approach is modern.

---

### WEEK 4 - DAY 19b: Angular HTTP & RxJS

**Complexity Assessment:**
- Part 1: MODERATE-COMPLEX (HttpClient: MODERATE, HTTP methods: SIMPLE, Params/headers: SIMPLE, Interceptors: COMPLEX, Error handling: MODERATE)
- Part 2: VERY COMPLEX (Observables: VERY COMPLEX, Operators: COMPLEX, Subjects: COMPLEX, Unsubscribe: COMPLEX, Async pipe: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .ts files
- Code Walkthroughs Part 2: 7-8 .ts files
- Slides Part 1: ~20 slides
- Slides Part 2: ~28 slides
- Total Exercises: 11 exercises

**Rationale:** HTTP is straightforward. RxJS Observables are major paradigm shift. Operators and Subjects need good visualization.

---

### WEEK 4 - DAY 20a: React Advanced & Deployment

**Complexity Assessment:**
- Part 1: MODERATE-COMPLEX (Composition: MODERATE, Render props: COMPLEX, Compound components: MODERATE, Performance: COMPLEX)
- Part 2: MODERATE (Code splitting: MODERATE, Suspense: COMPLEX, DevTools: SIMPLE, Building: SIMPLE, Deployment: MODERATE, Best practices: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .jsx files
- Code Walkthroughs Part 2: 3-4 config/build files
- Slides Part 1: ~24 slides
- Slides Part 2: ~18 slides
- Total Exercises: 8 exercises

**Rationale:** Advanced patterns are less commonly used. Performance optimization is important but not deeply complex. Deployment is practical.

---

### WEEK 4 - DAY 20b: Angular Signals & Testing

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Signals: MODERATE, Creating: SIMPLE, Computed: SIMPLE, Effects: MODERATE, vs Observables: MODERATE)
- Part 2: MODERATE (Testing: MODERATE, Component tests: MODERATE, Services/HTTP: MODERATE, TestBed: MODERATE, Mocking: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 3-4 .ts files
- Code Walkthroughs Part 2: 4-5 .spec.ts files
- Slides Part 1: ~16 slides
- Slides Part 2: ~20 slides
- Total Exercises: 8 exercises

**Rationale:** Signals are newer and simpler than Observables. Testing is important but not deeply complex. More practical than conceptually deep.

---

### WEEK 5 - DAY 21: Database Fundamentals & Queries — Part 1

**Complexity Assessment:**
- Part 1: SIMPLE (Fundamentals: SIMPLE, DQL: SIMPLE, SELECT: SIMPLE, WHERE: SIMPLE, Operators: SIMPLE, ORDER BY: SIMPLE, LIMIT: SIMPLE, DISTINCT: SIMPLE)
- Part 2: MODERATE-COMPLEX (Aggregates: MODERATE, GROUP BY: MODERATE, Relationships: SIMPLE, JOINS: COMPLEX, Subqueries: COMPLEX, Correlated: COMPLEX, EXISTS: MODERATE, CASE: MODERATE, Expressions: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .sql files
- Code Walkthroughs Part 2: 7-8 .sql files
- Slides Part 1: ~20 slides
- Slides Part 2: ~26 slides
- Total Exercises: 10 exercises

**Rationale:** Part 1 is fundamentals (straightforward). Part 2 adds joins and subqueries (complex). Students struggle with joins.

---

### WEEK 5 - DAY 22: SQL Database Design & Advanced Topics

**Complexity Assessment:**
- Part 1: MODERATE (DDL: SIMPLE, Statements: SIMPLE, Creation: SIMPLE, Types: SIMPLE, Constraints: MODERATE, Normalization: COMPLEX, Data modeling: MODERATE, ER diagrams: MODERATE)
- Part 2: COMPLEX (DML: SIMPLE, Indexes: COMPLEX, Views: SIMPLE, Stored procedures: MODERATE, Triggers: MODERATE, Transactions: MODERATE, ACID: MODERATE, Isolation: COMPLEX, Optimization: COMPLEX, Plans: COMPLEX, Backup: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .sql files
- Code Walkthroughs Part 2: 7-8 .sql files
- Slides Part 1: ~22 slides
- Slides Part 2: ~28 slides
- Total Exercises: 11 exercises

**Rationale:** Part 1 is schema design (moderate). Part 2 is advanced topics and optimization (complex). Normalization needs good explanation.

---

### WEEK 5 - DAY 23: REST & API Tools

**Complexity Assessment:**
- Part 1: SIMPLE (HTTP overview: SIMPLE, Methods: SIMPLE, Lifecycle: SIMPLE, Status codes: SIMPLE, Headers: SIMPLE, REST principles: MODERATE, Naming: SIMPLE, Versioning: MODERATE)
- Part 2: MODERATE (Postman: SIMPLE, Requests: SIMPLE, Variables: SIMPLE, Collections: MODERATE, Testing: MODERATE, Assertions: SIMPLE, Swagger: MODERATE, Documentation: MODERATE, Paths: MODERATE, Schemas: MODERATE, Error handling: MODERATE, Exceptions: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 3-4 API examples
- Code Walkthroughs Part 2: 5-6 Postman/Swagger examples
- Slides Part 1: ~18 slides
- Slides Part 2: ~22 slides
- Total Exercises: 8 exercises

**Rationale:** REST principles are straightforward. Postman is a tool (not conceptually complex). Swagger adds structure but not depth. Practical day.

---

### WEEK 5 - DAY 24: Maven, Gradle & Spring Core

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Concepts: SIMPLE, Maven basics: MODERATE, Lifecycle: SIMPLE, Dependencies: MODERATE, Plugins: SIMPLE, Gradle: MODERATE, Comparison: SIMPLE, Standards: SIMPLE, Naming: SIMPLE, Organization: SIMPLE, Comments: SIMPLE)
- Part 2: MODERATE-COMPLEX (Spring overview: SIMPLE, IoC: COMPLEX, DI: COMPLEX, Injection types: MODERATE, Configuration: MODERATE, Beans: MODERATE, Scanning: SIMPLE, Auto-wiring: MODERATE, Scopes: MODERATE, Lombok: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 Maven/Gradle files
- Code Walkthroughs Part 2: 6-7 .java Spring files
- Slides Part 1: ~20 slides
- Slides Part 2: ~26 slides
- Total Exercises: 9 exercises

**Rationale:** Build tools are tools (not deeply conceptual). Spring Core is important but IoC/DI are abstract concepts. Needs good explanation.

---

### WEEK 5 - DAY 25: Spring Boot

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Overview: SIMPLE, Initializr: SIMPLE, Starters: SIMPLE, Auto-config: MODERATE, Properties: SIMPLE, Profiles: SIMPLE)
- Part 2: SIMPLE-MODERATE (Actuator: MODERATE, Servers: SIMPLE, DevTools: SIMPLE, Building: SIMPLE, Running: SIMPLE, Observability: MODERATE, Awareness: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 3-4 .yaml/.properties files
- Code Walkthroughs Part 2: 4-5 .java monitoring files
- Slides Part 1: ~18 slides
- Slides Part 2: ~18 slides
- Total Exercises: 7 exercises

**Rationale:** Spring Boot abstracts away complexity. Most concepts are straightforward. Developer experience focused. Smaller day.

---

### WEEK 6 - DAY 26: Spring MVC & Spring AOP

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Architecture: MODERATE, DispatcherServlet: MODERATE, Controllers: SIMPLE, RestController: SIMPLE, Mapping: SIMPLE, Parameters: SIMPLE, Body: SIMPLE, ResponseEntity: MODERATE, Headers/status: SIMPLE, Layers: SIMPLE, Validation: MODERATE, Custom validators: MODERATE, Exception handling: MODERATE, WebSocket: SIMPLE, DTOs: MODERATE, CORS: MODERATE)
- Part 2: MODERATE-COMPLEX (AOP: COMPLEX, Cross-cutting: MODERATE, Spring AOP vs AspectJ: MODERATE, Join points: COMPLEX, Advice: MODERATE, Aspects: COMPLEX, Logging: SIMPLE, Performance: MODERATE, Transactions: MODERATE, Code review: SIMPLE, Debugging: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 6-7 .java controller files
- Code Walkthroughs Part 2: 7-8 .java aspect files
- Slides Part 1: ~24 slides
- Slides Part 2: ~26 slides
- Total Exercises: 11 exercises

**Rationale:** Spring MVC REST APIs are core skill. AOP is powerful but abstract concept. Needs good explanation and examples.

---

### WEEK 6 - DAY 27: Spring Data JPA

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Overview: SIMPLE, Repositories: SIMPLE, Auto-implementation: MODERATE, CRUD: SIMPLE, Query methods: MODERATE, Custom methods: MODERATE, @Query: MODERATE, Pagination: SIMPLE, DAO: SIMPLE, Transactions: MODERATE)
- Part 2: MODERATE-COMPLEX (Hibernate: MODERATE, JPA vs Hibernate: SIMPLE, Entities: SIMPLE, Primary keys: SIMPLE, Mappings: SIMPLE, Relationships: COMPLEX, Fetch types: COMPLEX, HQL: MODERATE, Criteria: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .java repository files
- Code Walkthroughs Part 2: 6-7 .java entity files
- Slides Part 1: ~22 slides
- Slides Part 2: ~24 slides
- Total Exercises: 9 exercises

**Rationale:** Spring Data simplifies data access. Relationships are moderately complex. Lazy loading is a common problem area.

---

### WEEK 6 - DAY 28: Testing

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (TDD: SIMPLE, Red-Green-Refactor: SIMPLE, Unit testing: SIMPLE, JUnit: SIMPLE, Test classes: SIMPLE, Annotations: SIMPLE, Lifecycle: SIMPLE, Display names: SIMPLE, Parameterized: MODERATE, Suites: SIMPLE, Coverage: MODERATE, Arrange-Act-Assert: SIMPLE)
- Part 2: MODERATE (Mocking: MODERATE, Mockito: MODERATE, Mocks: MODERATE, Stubbing: SIMPLE, Verify: MODERATE, Matchers: SIMPLE, Spring testing: MODERATE, MockMvc: MODERATE, Integration testing: MODERATE, Coverage goals: MODERATE, Testcontainers: MODERATE, WireMock: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .java test files
- Code Walkthroughs Part 2: 6-7 .java test files
- Slides Part 1: ~20 slides
- Slides Part 2: ~24 slides
- Total Exercises: 10 exercises

**Rationale:** Unit testing is foundational. Mocking and Spring testing are moderately complex. Testcontainers adds practical depth.

---

### WEEK 6 - DAY 29: Spring Security & OWASP

**Complexity Assessment:**
- Part 1: MODERATE (Secure coding: MODERATE, OWASP Top 10: MODERATE, Injection: MODERATE, Auth: MODERATE, XSS: MODERATE, CSRF: MODERATE, Misconfiguration: SIMPLE, Data exposure: MODERATE)
- Part 2: MODERATE (Framework overview: MODERATE, Auth vs Authz: SIMPLE, Filter chain: MODERATE, In-memory: SIMPLE, Database auth: MODERATE, Password encoding: SIMPLE, Providers: MODERATE, @EnableWebSecurity: MODERATE, CSRF: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .java security files
- Code Walkthroughs Part 2: 5-6 .java config files
- Slides Part 1: ~22 slides
- Slides Part 2: ~24 slides
- Total Exercises: 9 exercises

**Rationale:** Security is important but concepts relatively straightforward. OWASP and Spring Security are practical. Not deeply abstract.

---

### WEEK 6 - DAY 30: JWT & RBAC

**Complexity Assessment:**
- Part 1: MODERATE (JWT structure: MODERATE, Flow: MODERATE, Generation: MODERATE, Validation: MODERATE, Token vs session: MODERATE, Implementation: MODERATE, Filters: MODERATE)
- Part 2: MODERATE (RBAC: SIMPLE, Method security: MODERATE, URL security: MODERATE, Custom authz: MODERATE, Context: MODERATE, Failures: MODERATE, Best practices: MODERATE, HTTPS: SIMPLE, API keys: MODERATE, Rate limiting: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .java JWT files
- Code Walkthroughs Part 2: 5-6 .java RBAC files
- Slides Part 1: ~22 slides
- Slides Part 2: ~24 slides
- Total Exercises: 9 exercises

**Rationale:** JWT and RBAC are straightforward concepts. Implementation is practical. Good capstone to security topics.

---

### WEEK 7 - DAY 31: GraphQL

**Complexity Assessment:**
- Part 1: MODERATE (Overview: MODERATE, Schema: MODERATE, SDL: SIMPLE, Scalars: SIMPLE, Types: SIMPLE, Queries: MODERATE, Mutations: MODERATE, Subscriptions: MODERATE)
- Part 2: MODERATE (Arguments: SIMPLE, Aliases: SIMPLE, Fragments: MODERATE, Server: MODERATE, Libraries: SIMPLE, Resolvers: MODERATE, Design: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .graphql schema files
- Code Walkthroughs Part 2: 5-6 .java resolver files
- Slides Part 1: ~20 slides
- Slides Part 2: ~22 slides
- Total Exercises: 8 exercises

**Rationale:** GraphQL is different from REST but not deeply complex. Schema and resolvers are straightforward concepts. Practical day.

---

### WEEK 7 - DAY 32: GraphQL Client

**Complexity Assessment:**
- Part 1: MODERATE (Overview: SIMPLE, Apollo React: MODERATE, Apollo Angular: MODERATE, Consuming: MODERATE, Queries: MODERATE, Mutations: MODERATE, Errors: MODERATE)
- Part 2: MODERATE (Caching: MODERATE, Batching: MODERATE, Testing: SIMPLE, Playground: SIMPLE, GraphiQL: SIMPLE, Writing: SIMPLE, Nested: MODERATE, Optimization: COMPLEX)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .jsx/.ts client files
- Code Walkthroughs Part 2: 4-5 testing files
- Slides Part 1: ~20 slides
- Slides Part 2: ~20 slides
- Total Exercises: 8 exercises

**Rationale:** GraphQL clients are similar to REST clients. Apollo is straightforward. N+1 problem is the only deeply complex topic.

---

### WEEK 7 - DAY 33: AI & Developer Productivity

**Complexity Assessment:**
- Part 1: MODERATE-COMPLEX (Fundamentals: MODERATE, ML vs DL: SIMPLE, Supervised: SIMPLE, Training: SIMPLE, Neural networks: COMPLEX, Transformers: COMPLEX, Tokens: MODERATE, Embeddings: MODERATE, Attention: COMPLEX, LLMs: MODERATE)
- Part 2: MODERATE (Prompting: MODERATE, Few-shot: MODERATE, Agentic: MODERATE, Planning: MODERATE, Tools: MODERATE, Workflows: MODERATE, RAG: MODERATE, Vectors: MODERATE, Retrieval: MODERATE, Grounding: MODERATE, Hallucination: MODERATE, Structured: SIMPLE, JSON: SIMPLE, Chain-of-thought: MODERATE, Tools: MODERATE, MCP: MODERATE, Code reviews: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 6-7 .py/.java AI examples
- Code Walkthroughs Part 2: 5-6 .py prompt/MCP examples
- Slides Part 1: ~28 slides
- Slides Part 2: ~30 slides
- Total Exercises: 10 exercises

**Rationale:** AI fundamentals require good conceptual grounding. Transformer and attention are complex. RAG is practical and important.

---

### WEEK 7 - DAY 34: Spring AI

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Overview: SIMPLE, Interfaces: MODERATE, Templates: SIMPLE, Integrations: SIMPLE, Services: MODERATE, Building: MODERATE, Chatbots: MODERATE)
- Part 2: MODERATE (Function calling: MODERATE, Structured output: SIMPLE, RAG: COMPLEX, Vector stores: MODERATE, Configuration: MODERATE, Error handling: MODERATE, Logging: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .java service files
- Code Walkthroughs Part 2: 5-6 .java RAG files
- Slides Part 1: ~20 slides
- Slides Part 2: ~22 slides
- Total Exercises: 8 exercises

**Rationale:** Spring AI abstracts AI complexity. Most concepts are straightforward. RAG is moderately complex. Practical integration day.

---

### WEEK 7 - DAY 35: MongoDB

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (NoSQL: SIMPLE, SQL vs NoSQL: SIMPLE, Architecture: SIMPLE, Documents: MODERATE, BSON: SIMPLE, Collections: SIMPLE, ObjectId: SIMPLE, Installation: SIMPLE, Shell: SIMPLE)
- Part 2: MODERATE (CRUD: MODERATE, Operators: MODERATE, Aggregation: COMPLEX, Indexes: MODERATE, Atlas: SIMPLE, Spring Data: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .js/shell files
- Code Walkthroughs Part 2: 4-5 .java Spring files
- Slides Part 1: ~18 slides
- Slides Part 2: ~20 slides
- Total Exercises: 8 exercises

**Rationale:** MongoDB is simpler than SQL for basics. Aggregation framework adds complexity. Spring Data MongoDB simplifies integration.

---

### WEEK 8 - DAY 36: Docker & Kubernetes

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Overview: SIMPLE, Containerization: SIMPLE, Architecture: SIMPLE, Images: SIMPLE, Dockerfile: MODERATE, Building: MODERATE, CLI: SIMPLE, Registry: SIMPLE, Pulling: SIMPLE, Networking: MODERATE, Volumes: MODERATE, Compose: MODERATE, Best practices: MODERATE, Multi-stage: MODERATE)
- Part 2: MODERATE (K8s: SIMPLE, Architecture: SIMPLE, Resources: MODERATE, Replicas: SIMPLE, ConfigMaps: MODERATE, Secrets: MODERATE, Kubectl: SIMPLE, Deployments: MODERATE, Services: MODERATE, Orchestration: SIMPLE, Scaling: SIMPLE, Rollbacks: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 Dockerfile examples
- Code Walkthroughs Part 2: 5-6 .yaml K8s files
- Slides Part 1: ~22 slides
- Slides Part 2: ~26 slides
- Total Exercises: 10 exercises

**Rationale:** Docker and K8s are operational but not deeply conceptually complex. Hands-on practice important.

---

### WEEK 8 - DAY 37: CI/CD & DevOps

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (CI/CD: SIMPLE, DevOps: SIMPLE, Shift left: SIMPLE, Pipeline stages: SIMPLE, Build integration: MODERATE, Testing: MODERATE, Quality gates: MODERATE, Artifacts: MODERATE)
- Part 2: MODERATE (Strategies: MODERATE, IaC: SIMPLE, Environments: SIMPLE, Monitoring: MODERATE, Health: MODERATE, Containerized: MODERATE, Pipelines: MODERATE, Practices: SIMPLE, Observability: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 .yml pipeline files
- Code Walkthroughs Part 2: 4-5 monitoring/observability files
- Slides Part 1: ~20 slides
- Slides Part 2: ~22 slides
- Total Exercises: 9 exercises

**Rationale:** CI/CD is operational, not deeply complex. Most concepts are straightforward. Practical day focused on workflow.

---

### WEEK 8 - DAY 38: Microservices

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Overview: SIMPLE, vs Monolithic: SIMPLE, Advantages: SIMPLE, Disadvantages: MODERATE, Patterns: MODERATE, Decomposition: COMPLEX, API Gateway: MODERATE, Discovery: MODERATE, Load balancing: SIMPLE)
- Part 2: MODERATE-COMPLEX (Circuit breaker: MODERATE, CQRS: COMPLEX, Event sourcing: COMPLEX, Database per service: MODERATE, Communication: MODERATE, Best practices: MODERATE, Containers: SIMPLE, Tracing: MODERATE, OpenTelemetry: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 5-6 .java service files
- Code Walkthroughs Part 2: 5-6 .java pattern files
- Slides Part 1: ~22 slides
- Slides Part 2: ~24 slides
- Total Exercises: 10 exercises

**Rationale:** Microservices architecture is complex conceptually. CQRS and event sourcing are advanced. Service decomposition is tricky.

---

### WEEK 8 - DAY 39: Kafka

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Event-driven: SIMPLE, Patterns: SIMPLE, Overview: SIMPLE, Architecture: MODERATE, Producers: MODERATE, Consumers: MODERATE, CLI: SIMPLE, Topics: SIMPLE, Producing: SIMPLE, Consuming: SIMPLE)
- Part 2: MODERATE (Clusters: MODERATE, Offsets: MODERATE, Ordering: MODERATE, Spring Kafka: MODERATE, Producers: MODERATE, Consumers: MODERATE, Error handling: MODERATE, Dead letters: SIMPLE, Serialization: SIMPLE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 producer/consumer files
- Code Walkthroughs Part 2: 5-6 .java Spring Kafka files
- Slides Part 1: ~20 slides
- Slides Part 2: ~22 slides
- Total Exercises: 9 exercises

**Rationale:** Kafka basics are straightforward. Spring Kafka simplifies integration. Consumer groups and partitioning need good explanation.

---

### WEEK 8 - DAY 40: AWS

**Complexity Assessment:**
- Part 1: SIMPLE-MODERATE (Cloud: SIMPLE, Overview: SIMPLE, Infrastructure: SIMPLE, EC2: MODERATE, Launching: MODERATE, Security: MODERATE, SSH: SIMPLE, AMI: SIMPLE, EBS: SIMPLE, Auto Scaling: MODERATE)
- Part 2: MODERATE (S3: SIMPLE, Buckets: SIMPLE, Websites: SIMPLE, Beanstalk: MODERATE, RDS: MODERATE, ECS: MODERATE, ECR: SIMPLE, EKS: MODERATE, Lambda: MODERATE, SNS/SQS: MODERATE, CloudWatch: MODERATE, IAM: MODERATE, DynamoDB: MODERATE, Fargate: MODERATE, Deployment: MODERATE)

**Sizing Decision:**
- Code Walkthroughs Part 1: 4-5 CloudFormation/IaC files
- Code Walkthroughs Part 2: 6-7 .java AWS SDK files
- Slides Part 1: ~20 slides
- Slides Part 2: ~24 slides
- Total Exercises: 10 exercises

**Rationale:** AWS has many services but each is straightforward in concept. Hands-on practice critical. Deployment complexity.

---

# QUICK START

**Ready to build?**

1. Copy your topic section above
2. Confirm sizing is correct
3. Message agent: "Ready to create [TOPIC]. Start with Phase 1. Assessment: [copy section]"

**Expected workflow:**
- Phase 1: 3-5 hours (Code Walkthroughs)
- Phase 2: 4-6 hours (Slides)
- Phase 3: 8-12 hours (Exercises)
- Phase 4: 1-2 hours (Documentation)
- Phase 5: 1 hour (Validation)

**Total per topic: 20-30 hours**
