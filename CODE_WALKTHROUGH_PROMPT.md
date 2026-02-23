# Code Walkthrough & Script Creation Prompt

Use this prompt every time you want to create a code walkthrough and speaking script for a single day.
Just fill in the bracketed sections and paste the whole thing into a new chat.

---

## HOW TO USE

1. Copy everything below the `--- PROMPT START ---` line
2. At the bottom, replace `[PASTE THE DAY'S SECTION FROM half-day-syllabus.txt HERE]` with the day block from the syllabus — paste it exactly as it appears, starting from the `### Week X - Day Y (Weekday): Title` heading line, through Part 1, Part 2, and Learning Objectives. You can paste multiple days at once and it will only build the **first** one.
3. Paste into a new chat and send it

That's it. One prompt per day.

---

--- PROMPT START ---

I am a full-stack software engineering instructor. I need you to create a **code walkthrough** and a **speaking script** for the day described below.

## Your Deliverables

The workspace root is `/Users/scottburman/Documents/DE-Class-Guide/`.

The day's topics are pasted at the bottom of this prompt. The heading will look like:
`### Week X - Day Y (Weekday): Topic Name`

Use that heading to identify the correct folder. Match it to the list below — the folder names follow the same Week/Day/Topic pattern (just without the weekday in parentheses):

- Week 1 - Day 1 - Foundations — Linux, Git, SDLC & Agile → heading contains "Day 1" and "Linux" / "Git" / "SDLC"
- Week 1 - Day 2 - Core Java Fundamentals — Part 1 → heading contains "Day 2" and "Core Java" / "Part 1"
- Week 1 - Day 3 - Core Java Fundamentals — Part 2 → heading contains "Day 3" and "Core Java" / "Part 2"
- Week 1 - Day 4 - OOP — Part 1 → heading contains "Day 4" and "OOP"
- Week 1 - Day 5 - OOP — Part 2 → heading contains "Day 5" and "OOP"
- Week 2 - Day 6 - Collections & Generics
- Week 2 - Day 7 - Exception Handling & I/
- Week 2 - Day 8 - Lambdas, Streams & DateTime
- Week 2 - Day 9 - Multithreading
- Week 2 - Day 10 - Advanced Java
- Week 3 - Day 11 - HTML & CSS
- Week 3 - Day 12 - JavaScript Fundamentals
- Week 3 - Day 13 - DOM Manipulation & Events
- Week 3 - Day 14 - ES6+, OOP in JS & Async JavaScript
- Week 3 - Day 15 - TypeScript
- Week 4 - Day 16a - React Fundamentals
- Week 4 - Day 16b - Angular Fundamentals
- Week 4 - Day 17a - React Hooks
- Week 4 - Day 17b - Angular Services & DI
- Week 4 - Day 18a - React Routing & Redux
- Week 4 - Day 18b - Angular Routing & Forms
- Week 4 - Day 19a - React API & Testing
- Week 4 - Day 19b - Angular HTTP & RxJS
- Week 4 - Day 20a - React Advanced & Deployment
- Week 4 - Day 20b - Angular Signals & Testing
- Week 5 - Day 21 - Database Fundamentals & Queries — Part 1
- Week 5 - Day 22 - SQL Database Design & Advanced Topics
- Week 5 - Day 23 - REST & API Tools
- Week 5 - Day 24 - Maven, Gradle & Spring Core
- Week 5 - Day 25 - Spring Boot
- Week 6 - Day 26 - Spring MVC & Spring AOP
- Week 6 - Day 27 - Spring Data JPA
- Week 6 - Day 28 - Testing
- Week 6 - Day 29 - Spring Security & OWASP
- Week 6 - Day 30 - JWT & RBAC
- Week 7 - Day 31 - GraphQL
- Week 7 - Day 32 - GraphQL Client
- Week 7 - Day 33 - AI & Developer Productivity
- Week 7 - Day 34 - Spring AI
- Week 7 - Day 35 - MongoDB
- Week 8 - Day 36 - Docker & Kubernetes
- Week 8 - Day 37 - CI/
- Week 8 - Day 38 - Microservices
- Week 8 - Day 39 - Kafka
- Week 8 - Day 40 - AWS

**Only build the first day found in the pasted topics.** Ignore any additional days that may appear after it.

## ⚠️ REQUIRED FOLDER STRUCTURE — DO NOT DEVIATE

Every single file you create MUST live inside a folder called `Code-walkthrough`.
This folder is always a direct subfolder of the matched Week/Day folder.
**Never place files anywhere else. Never skip this folder.**

```
[MATCHED FOLDER NAME]/
└── Code-walkthrough/          ← ALWAYS required, ALWAYS this exact name
    ├── Part-1/
    │   ├── 01-topic-name.ext
    │   ├── 02-topic-name.ext
    │   └── walkthrough-script-part1.md
    └── Part-2/
        ├── 01-topic-subfolder/
        │   └── files...
        ├── 02-topic-name.ext
        └── walkthrough-script-part2.md
```

Full absolute paths:
- `/Users/scottburman/Documents/DE-Class-Guide/[MATCHED FOLDER NAME]/Code-walkthrough/Part-1/`
- `/Users/scottburman/Documents/DE-Class-Guide/[MATCHED FOLDER NAME]/Code-walkthrough/Part-2/`

### `Code-walkthrough/Part-1/`
- One or more code files (`.java`, `.js`, `.ts`, `.sh`, `.sql`, etc. — whatever language is appropriate for the topic) that **demonstrate every single topic listed under Part 1**
- A file called `walkthrough-script-part1.md` — a detailed, line-by-line speaking script that tells me **exactly what to say** as I walk through the Part 1 code with the class

### `Code-walkthrough/Part-2/`
- One or more code files that **demonstrate every single topic listed under Part 2**
- A file called `walkthrough-script-part2.md` — a detailed, line-by-line speaking script that tells me **exactly what to say** as I walk through the Part 2 code with the class

## Rules for the Code Files

- **Every topic from the day must appear in the code.** Do not skip anything. If a topic is conceptual (e.g. SDLC stages), represent it with comments or a demonstration script.
- Code must be clean, well-commented, and written so a student seeing it for the first time can follow along
- Each major topic should be clearly separated with a comment header so I can easily jump to it during the walkthrough
- If a topic is broad (e.g. "Collections Framework"), break it into clearly labeled sub-sections in the code
- Use realistic, relatable examples — not just `foo`, `bar`, `x`, `y`
- After writing the code, **verify your own work**: go through each bullet point in the syllabus below and confirm it appears in the code. If anything is missing, add it before finishing.

**File and folder structure within Part-1/ and Part-2/ is flexible — use your best judgment:**
- If a part covers one cohesive topic, a single well-organized file is fine
- If a part covers multiple distinct topics, split them into **separate files named after what they teach** (e.g. `01-linux-commands.sh`, `02-shell-scripting.sh`, `03-sdlc-overview.md`)
- If a topic is complex enough to need its own subfolder with multiple files (e.g. a full Git workflow demo with multiple scripts), create a **named subfolder — and always prefix it with a number** indicating its order in the walkthrough (e.g. `01-git-workflow/`, `02-spring-core/`)
- Standalone files that sit alongside subfolders must also be numbered to show their order (e.g. `02-agile-and-scrum.md`)
- Always name files and folders so it is immediately obvious what topic they cover — never use generic names like `demo.java` or `example.js`
- The goal is that I can open the folder and immediately see the order and topic of every file/subfolder in the lesson

## Rules for the Speaking Scripts

- The script should read like a **teacher talking to students** — natural, clear, and confident
- For every block of code, write what I should say BEFORE showing it (introduce the concept), DURING (explain each line), and AFTER (summarize and transition)
- Include prompts to **ask the class questions** (e.g. "Before I run this — what do you think the output will be?")
- Include **"watch out" callouts** for common mistakes or confusions students have
- Include **transition phrases** between topics so the walkthrough flows smoothly
- The script should be detailed enough that I could read it cold and deliver a great class

## Self-Check Before Finishing

Before you submit, run through this checklist:
- [ ] Every Part 1 topic is covered in the Part 1 code
- [ ] Every Part 2 topic is covered in the Part 2 code
- [ ] Every Learning Objective is addressed somewhere across the two parts
- [ ] The Part 1 script references every Part 1 code section
- [ ] The Part 2 script references every Part 2 code section
- [ ] **All files are inside `[MATCHED FOLDER NAME]/Code-walkthrough/Part-1/` or `Part-2/` — no files placed anywhere else**
- [ ] Any subfolders created within Part-1/ or Part-2/ are prefixed with a number (e.g. `01-git-workflow/`)
- [ ] Script files are named `walkthrough-script-part1.md` and `walkthrough-script-part2.md`

## The Day's Topics

[PASTE THE DAY'S SECTION FROM half-day-syllabus.txt HERE]

--- PROMPT END ---
