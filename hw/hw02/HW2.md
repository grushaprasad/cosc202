# COSC 202 Fall 2026: HW1


## Overview

In this HW you are given the implementations of finding ranks you designed in Lab 2 which doesn't use auxiliary space. Your task is as follows: 

* Fix any errors in the implementation provided
* Implement the algorithm which uses additional space.
* Explain how the final implementations work and justify their correctness. 

### Files provided
1. `SortedListWithEnd.java` with an implementation of the SortedList data structure where you know the size of the list. 
2. `FindRanks.java` with the incorrect implementation of one of the algorithms, and the header for the other algorithm. 
3. [A google doc template](https://docs.google.com/document/d/1SYUz5DxK2NKSU6aOH_Ncux8f_E-8ftxz47H28N_DebA/edit?usp=sharing) to put together the writeup with the justification of correctness. 

### Submission 

Submit the following two files to Gradescope: 
1. `FindRanks.java`
2. `writeup.pdf`

## Grading

You will receive 2 points from autograder, and 1 point for the justification of correctness document. The syllabus has further details about how these scores fit into the overall course grade. 

Note: The names of test cases in the autograder are deliberately vague, since the goal is for you to be able to reason about what to test your implementation on. Some test cases give you expected output, whereas others just tell you whether you failed. 

| **Possible outcome** | **How it impacts autograder score**|
| --- | --- 
| Test case passed. | Full credit for test case | 
| Test case passed. Run time is correct asymptotically, but can do better. | Full credit for test case | 
| Correct output, incorrect runtime | Partial credit for test case| 
| Test failed. | No credit for test case | 


*Hint: When testing for efficiency, look at the `get_count` method in SortedListWithEnd and think about how you might use it*