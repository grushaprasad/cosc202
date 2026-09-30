# Lab 4

## Overview

In this lab you will come up with a data structure that can efficiently implement inserting elements into dynamic sorted lists and finding elements at specific ranks. You will start by implementing operations that run in `O(n)`, and then devise more efficient solutions. Please make sure to check-in after each step. 

## Problem description

You are tasked with maintaining a dynamic list where the user wants to be able to perform the following operations efficiently. 

* `insert(item)`: Adds an item to the list
* `getRank(k)`: Gets an item at rank `k` in the list

Specifically, they want to be able to perform these two operations in `O(log n)` where `n` is the current number of items in the list. 


## Step 0: Creating a shared collaborative document

**One** person in your team should create a copy of [the google doc template for this lab](https://docs.google.com/document/d/1iKZHegdTfoZsAtJ0Hm6iFCCzMOr6u_JQrgxA5nmXLjg/edit?usp=sharing), and share it with your group. 

## Step 1: Implement getRank() in BST that runs in O(n)

Here is a straight forward approach to get rank in `O(n)`: traverse through the BST in the correct order of elements (i.e., lowest first, second lowest next, and so on) and keep track of the count. Return the node when count becomes equal to the rank. 

Write pseudocode that implements this approach in the google doc.  

Hints:
* You want to recursively traverse the BST
* Think about what you know about any particular node's relation to other nodes in the tree based on the BST property (i.e nodes smaller than the root of a subtree are to the left, and larger are to the right)

Once you've written your pseudocode answer the following questions: 
1. How does your algorithm work? 
2. Why is your algorithm correct? 
3. Why is this algorithm guaranteed to run in O(n) time?


## Step 2: Implement getRank() that runs in O(height) for an augmented BST
Assume that you have an augmented BST where each node has a `size` property. `node.size` gives you the size of the subtree that the node is the root of. Note, since node is the root, the count includes itself. For example, if node `x` had two children which were leaves of the tree, then `x.size` is 3. 

Design a version of `getRank()` that runs in `O(h)`, where h is the height of the tree. 

Once you've written your pseudocode in the google doc answer the following questions: 

Once you've written your pseudocode answer the following questions: 
1. How does your algorithm work? 
2. Why is your algorithm correct? 
3. Why is this algorithm guaranteed to run in O(h) time?


## Step 3: How would you add size to a standard BST?
In the previous question we assumed that `size` was already a property of a node. In this part you will work through what part(s) of the standard BST implementation will you need to modify to be able to maintain the size for every node. Specifically, answer the following questions: Can you create a new function to compute size without modifying any of the standard operations we've seen so far (e.g.,, `search()`,  `insert()`)? If yes, why? If no, which other operation(s) would you also need to modify and why?


## Step 4: Modify standard BST so you can maintain the size

Sketch pseudocode that shows how you can maintain the correct size property for each node in a standard BST. 

You can use this helper function if you would like: 

```
size(node):
    if node == null:
        return 0
    return node.size  
```

*Hint: when working on this part, it might help you to try creating a BST from scratch and see what you would need to do to get the size*

Once you've written your pseudocode answer the following questions: 
1. How does your algorithm work? 
2. Why is your algorithm correct? 
3. What is the time complexity of maintaining size?


## Step 5: Reason about limitations of the current implementation of insert() and getRank()

Remember our goal was for `insert()` and `getRank()` to run in `O(log n)`. Why are your current implementations of `insert()` and `getRank()` not guaranteed to be `O(log n)`? 


## Step 6: Improve the insert() so it is guaranteed to run in O(log n)

Once you've written your pseudocode answer the following questions: 
1. How does your algorithm work? 
2. Why is your algorithm correct? 
3. Why is your implementation of `insert()` guaranteed to run in `O(log n)`?
4. Why does this modification to `insert()` also guarantee that `getRank()` runs in `O(log n)`?



## Step 7: Submit the write-up

* **One** person in your team should export the google doc as pdf and upload it to gradescope under Lab 3

* **Make sure to add all the group members to the submission**