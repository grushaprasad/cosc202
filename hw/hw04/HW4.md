# COSC 202 Fall 2026: HW3


## Overview

In this HW your task is to implemet the two greedy segmentation algorithms you designed in Lab 5. As a starting point, you are given an implementation of the greedy algorithm that picks the shortest words, but with errors. Your task is as follows: 

* Fix the errors in `segmentShortest()`
* Implement `segmentLongest()`
* For both these functions, include test cases that show that the functions produce the correct segmentation where the greedy rule works, and fails in cases where the greedy rule doesn't work. 

### Files provided

1. `Trie.java` which implements a Trie data structure. It creates this from a `.txt` file. 
2. `Segmenter.java` which contains the `segmentShortest()` and `segmentLongest()` functions you need to work on. 
3. `sample_vocab.txt` which gets you started with a simple vocab file. The `main()` function in `Trie.java` has some preliminary code for you to see how to create a trie using this vocab file. 

### Submission

Submit the following two files to Gradescope: 
1. `Segmenter.java`
2. `writeup.pdf` which uses the HW template. 
3. Any vocab files you created to test your implementation. You must submit at least one file.

**Note: The main() function in `Segmenter.java` should contain test cases which use the vocab file(s) you submitted**

### Output requirements
Your functions should return one of two things: 

* An ArrayList with correct segments if a valid segmentation exists. 
* An **empty ArrayList** if a valid segmentation does not exist. 


## Grading

You will receive 2 points from autograder, and 1 point for the justification of correctness document and the vocab files. The syllabus has further details about how these scores fit into the overall course grade. 

Note: The names of test cases in the autograder are deliberately vague, since the goal is for you to be able to reason about what to test your implementation on. Some test cases give you expected output, whereas others just tell you whether you failed. 

| **Possible outcome** | **How it impacts autograder score**|
| --- | --- 
| Test case passed. | Full credit for test case | 
| Test case passed. Run time is correct asymptotically, but can do better. | Full credit for test case | 
| Correct output, incorrect runtime | Partial credit for test case| 
| Test failed. | No credit for test case | 


*Hint: When testing for efficiency, look at the `getCount` method in `Trie` and think about how you might use it*