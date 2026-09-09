# Lab 2

## Overview

In this lab you will work with a custom data structure `SortedListWithEnd ` which, is a variation of the `SortedList` from Lab 1. Here are the properties of this data structure: 

1. It is a finite list in which all the items are sorted in ascending order. This list allows for duplicates of items. 
2. Unlike `SortedList`, you can get the size of the list using `size()` which is a O(1) operation.   
3. Like `SortedList`, the data structure still has `get(index)`, which is also a O(1) operation. This returns the item at index if it exists. In other words, it returns: 
* The item at position `index`  if `index` is less than the number of items in the list
* `null` otherwise  


Your goal is to design an efficient algorithm to find the item at rank `k` within **two** `SortedListWithEnd`s. You will design two efficient algorithms, each of which follow different constraints. 

### Input

* Two `SortedListWithEnd`, `list1` and `list2`. These lists can have overlapping items. 
* A rank `k`. In any given `SortedListWithEnd`, the item at the start of the list has rank 1, the item at the second position has rank 2 and so on.  

### Output

* If a valid rank is entered, i.e., `1 <= rank <= list1.size() + list2.size()`, then return the item at rank `k`. 
* If an invalid rank is entered, return null. 

### Example 

Consider the following lists: 

```
list1 = [1,2,3,3,5]
list2 = [0,1,1,3,4]

```

The correct return value for the following ranks is as follows: 

* `k=1`, return 0
* `k=2`, return 1
* `k=3`, return 1
* `k=5`, return 2
* `k=8`, return 3
* `k=10`, return 5
* `k=11`, return null

## Step 0: Creating a shared collaborative document

**One** person in your team should create a copy of [the google doc template for this lab](https://docs.google.com/document/d/1ENVJ3sLAApi0-hmbuzQQX_hg2B9UoAKljK99NVex7Pg/edit?usp=sharing), and share it with your group. 


## Step 1: Design an efficient algorithm that uses constant space

In this step, your algorithm can use O(1) space. Sketch out your algorithm in the google doc, and answer the following questions: 

1. Why is your algorithm correct?
2. What are the best case and worst case inputs? 
3. What is the upper bound are the best case and worst case time complexities when you are finding item for one rank `k`? Why?
4. What is the upper bound on the best case and worst case time complexities when you are finding items from a list of ranks? Why?

In expressing the upper bound, use the following variables:
* `x` is the size of `list1`
* `y` is the size of `list2`
* `n` is the size of the list of ranks (the list can have repeating ranks)

## Step 2: Design a more efficient algorithm that can use extra space

In this step, your goal is to try to improve on the time complexity for finding items at `n` ranks. You can use extra space. Sketch out your algorithm in the google doc, and answer the following questions: 

1. Why is your algorithm correct?
2. What are the best case and worst case inputs? 
3. What is the upper bound are the best case and worst case time complexities when you are finding item for one rank `k`? Why?
4. What is the upper bound on the best case and worst case time complexities when you are finding items from a list of ranks? Why?
5. What is the upper bound on space complexity of this algorithm? 
6. What are the contexts in which you would use this algorithm over the first algorithm? 


## Step 3: Submit the write-up

* **One** person in your team should export the google doc as pdf and upload it to gradescope under Lab 1

* **Make sure to add all the group members to the submission**



