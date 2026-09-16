# Lab 3

## Overview

In this lab you will come up with a recursive Divide and Conquer algorithm to solve the problem from Lab 2 (i.e., given two sorted lists, return the item at rank `k` when both lists are considered). You will then summarize the contexts in which you would want to use all of the three algorithms you've designed for this problem.

## Problem review 

Your goal is to design an efficient algorithm to find the item at rank `k` within **two** `SortedListWithEnd`. Here are the properties of the `SortedListWithEnd` data structure. 


1. It is a finite list in which all the items are sorted in ascending order. This list allows for duplicates of items. 
2. You can get the size of the list using `size()` which is a O(1) operation.   
3. You can get an item at an index with `get(index)`, which is also a O(1) operation, and returns: 
* The item at position `index`  if `index` is less than the number of items in the list
* `null` otherwise  

### Input

* Two `SortedListWithEnd`, `list1` and `list2`. These lists can have overlapping items. 
* A rank `k`. In any given `SortedListWithEnd`, the item at the start of the list has rank 1, the item at the second position has rank 2 and so on.  

### Output

* If a valid rank is entered, i.e., `1 <= rank <= list1.size() + list2.size()`, then return the item at rank `k`. 
* If an invalid rank is entered, return null. 

## Step 0: Creating a shared collaborative document

**One** person in your team should create a copy of [the google doc template for this lab](https://docs.google.com/document/d/1VsFxjaOcdE0zvnwEWpcufmbIHun4iezCjXq5F5Piyik/edit?usp=sharing), and share it with your group. 

## Step 1: Conceptualizing the problem in terms of a recursive Divide and Conquer
When designing a recursive divide and conquer algorithm, you need to reason about the following: 

1. How are you dividing the problem space in each time step? Which parts of the space are you eliminating? Which parts are you keeping? 
2. What is/are the smallest sub-problem(s) (i.e., the base case)
3. What is the conquer step? What do you need to do (if anything) to combine the results from the sub-problems to get the final result? 

In the google doc, answer each of the above questions for the problem we are working on (i.e., finding elements at rank). 

**Note: this step is not asking you to design the specific algorithm. You will do that in the next steps. It is just asking you to conceptualize the problem, at a high level, in terms of Divide and Conquer**

*Hint: In answering these questions, it might help you to think about other recursive divide and conquer approaches we've seen in class: recursive power function, recursive binary search, and mergesort* 



## Step 2: Designing a Divide and Conquer that works under simplifying assumptions

Design a divide and conquer algorithm that works under the following simplifying assumptions:
 
* The two sorted lists are of equal lengths, each of size `n`.
* `k` is always a power of 2. 
* `k` is less than `n`. 

Here is an example of the two sorted lists and ranks that meet these assumptions: 

```
list1 = [A, C, D, E, F, G, H, J, K]
list2 = [B, C, D, D, F, G, H, I, L]

ranks = [1,2,4,8,2,8,4,1]

```


Sketch out your algorithm in the google doc, and answer the following questions: 

1. Why is your algorithm correct?
2. What are the best case and worst case inputs? 
3. What is the upper bound are the best case and worst case time complexities when you are finding item for one rank `k`? Why?
4. What is the upper bound on the best case and worst case time complexities when you are finding items from a list of ranks? Why?

In expressing the upper bound, use the following variables:
* `n` is the size of `list1` and `list2`
* `r` is the size of the list of ranks (the list can have repeating ranks)

*Hint: drawing out examples on the board can be very helpful*  

## Step 3: Reasoning about the role of the simplifying assumptions

**For each of the three simplifying assumptions**, provide a counter example where the assumption doesn't hold and show that the algorithm doesn't work for that example.


## Step 4: A more general Divide and Conquer algorithm without simplifying assumptions

Design a divide and conquer algorithm that works even when none of the simplifying assumptions hold. 

Sketch out your algorithm in the google doc, and answer the following questions: 

1. Why is your algorithm correct?
2. What are the best case and worst case inputs? 
3. What is the upper bound are the best case and worst case time complexities when you are finding item for one rank `k`? Why?
4. What is the upper bound on the best case and worst case time complexities when you are finding items from a list of ranks? Why?

In expressing the upper bound, use the following variables:
* `n` is the size of `list1` 
* `m` is the size of `list2`
* `r` is the size of the list of ranks (the list can have repeating ranks)

*Hint: in designing this more general approach, it can be helpful to think about why the divide and conquer logic works in the first place*

## Step 5: Reasoning about all three rank finding algorithms

In the last two labs, you designed three algorithms to find elements at ranks in two `SortedListWithEnd`:

* Algorithm 1: Which did not use any additional space
* Algorithm 2: Which used additional space, but did better in soem circumstances
* Algorithm 3: A Divide and Conquer approach

Comparing these three algorithms, answer the following questions: 

1. When you are asked to find element at only one rank, which algorithm would you use? Does your answer depend on the relative sizes of `n`, `m` and `r`? Why or why not?  

2. When you are asked to find elements for `r` different ranks, what algorithm would you use? Does your answer depend on the relative sizes of `n`, `m` and `r`? Why or why not? 


## Step 6: Submit the write-up

* **One** person in your team should export the google doc as pdf and upload it to gradescope under Lab 3

* **Make sure to add all the group members to the submission**


