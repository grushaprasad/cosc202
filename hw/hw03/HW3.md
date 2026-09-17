# COSC 202 Fall 2026: HW3


## Overview

In this HW your task is to implement the Divide and Conquer implementation of the rank finding algorithm you designed in Lab 3. As a starting point, you are given an implementation of the simple case, but with errors. 
* Implement the general algorithm 
* Explain how the final implementations work and justify their correctness. 

Note: the autograder will test for cases when the simplifying assumptions hold, and when they do not hold. As a starting point, it might be useful to have a working implementation of the simplified algorithm, make sure it works on the simple test cases, before you try to implement the more general version. 

### Files provided
1. `SortedListWithEnd.java` with an implementation of the SortedList data structure where you know the size of the list. 
2. `FindRanksRecursive.java` with the incorrect implementation of one of the algorithms, and the header for the other algorithm. 
3. [A google doc template](https://docs.google.com/document/d/1SYUz5DxK2NKSU6aOH_Ncux8f_E-8ftxz47H28N_DebA/edit?usp=sharing) to put together the writeup with the justification of correctness. 

### Submission 

Submit the following two files to Gradescope: 
1. `FindRanksRecursive.java`
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