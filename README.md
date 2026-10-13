# Java Multithreading Assignment

## Aim
Create multiple threads in Java using both methods:
1. Extending the Thread class
2. Implementing the Runnable interface

Each thread displays a message at different intervals to demonstrate concurrent execution.

## Problem Statement
Write Java programs that create three threads:
- **Good Morning Thread** – displays "Good Morning" every 1 second
- **Hello Thread** – displays "Hello" every 2 seconds
- **Welcome Thread** – displays "Welcome" every 3 seconds

## Implementation

### Method 1: Extending the Thread Class
File: `src/ThreadExtendingDemo.java`

- `GoodMorningThread` extends Thread
- `HelloThread` extends Thread
- `WelcomeThread` extends Thread
- Each overrides `run()` with infinite loop + `Thread.sleep()`

### Method 2: Implementing the Runnable Interface
File: `src/ThreadRunnableDemo.java`

- `GoodMorningRunnable` implements Runnable
- `HelloRunnable` implements Runnable
- `WelcomeRunnable` implements Runnable
- Threads created by passing Runnable objects to Thread constructor

## How to Run

### Compile
```bash
cd src
javac ThreadExtendingDemo.java
javac ThreadRunnableDemo.java
```

### Run Method 1
```bash
java ThreadExtendingDemo
```

### Run Method 2
```bash
java ThreadRunnableDemo
```

Press `Ctrl+C` to stop the infinite threads.

## Expected Output (Sample)
```
=== Method 1: Extending Thread Class ===
Starting threads... (Press Ctrl+C to stop)

Good Morning
Hello
Welcome
Good Morning
Good Morning
Hello
Good Morning
Welcome
...
```

Messages appear concurrently at their respective intervals.

## Constraints Followed
- Threads run indefinitely (infinite while loop)
- Uses `Thread.sleep()` for timing
- Handles `InterruptedException`
- Uses `start()` to begin thread execution

## Project Structure
```
java-threads/
├── output/                 # Screenshots of program output
│   ├── output1.png
│   ├── output2.jpg
│   └── ...
├── src/
│   ├── ThreadExtendingDemo.java
│   └── ThreadRunnableDemo.java
├── README.md
└── .gitignore
```
