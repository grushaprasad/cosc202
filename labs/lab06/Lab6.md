# Lab 6

In this lab we will continue working on the sequence segmentation problem from Lab 5. Specifically, we will work through brute force algorithms which will guarantee that a valid segmentation is returned if one exists. 

## Problem review

You are given a sequence and and a vocab, and your task is to break it down into segments, where each segment is a word from the vocab.

For example, consider the following vocab: 
```
vocab = {'the', 'that', 'ant', 'panda', 'thing', 'near', 'in', 'saw', 'ate', 'bit', 'a', 'an',  'ants'}
```

Given this vocab, here are the correct input-output mappings: 

* `s='theantsawthepanda'`. Output: `['the', 'ant', 'saw', 'the', panda']`. Note: neither the shortest or longest greedy segmentation algorithms could find this valid segmentation. 

* `s='theantsawthepandas` Output: `null` (because there is no valid way of segmenting the sequence into valid words; `pandas` isn't a word)

As indicated before, sequences can often be *ambiguous* --- i.e., the same string can be divided onto multiple valid segments. For example given a vocab `{'tea', 'team', 'meat', 'eat', 'eats', 'spot', 'pot'}`, the sequence `teameatspot` can be split into the following valid segments: 

* `['tea', 'meat', 'spot']`
* `['team', 'eat', 'spot']`
* `['team', 'eats', 'pot']`
* `['tea', 'meats', 'pot']`

**For the purposes of this lab, we will say that it is sufficient for the algorithm to return any of the valid segmentations**


## Step 0: Creating a shared collaborative document

**One** person in your team should create a copy of [the google doc template for this lab](https://docs.google.com/document/d/1jtx_AfN4sZxrJAfOkX0HUwhvBpPsJAuerva3i2CfPEc/edit?usp=sharing), and share it with your group. 

## Step 1: Analyzing a brute force algorithm

```
find_segments(input, i, pieces):
    if i == input.length:
        for each piece in pieces:
            if not vocab.contains(piece):
            	return null        
        return pieces                 
    for j  in [i + 1, i+2 ..., input.length]:
    	substr = input[i:j] ## j not included
    	result = find_segments(input, j, pieces + [substr]):
        if result is not null:
            return result
    return null

```

1. Describe what this brute force algorithm is doing and why it is guaranteed to give the right answer.

2. What is the recurrence relation? 

3. What is the time complexity? (Remember: time complexity can be broken down into the number of recursive call and time per recursive call)

4. Will your time complexity be worse if you used a HashSet to store the vocab instead of the Trie? Why or why not? 


## Step 2: Designing a better brute force algorithm 


Design a difference brute force algorithm `find_segments2` that has a better time complexity than `find_segments1` if you assume that `L`(the length of the longest word) is much smaller than `n` and does not grow as `n` grows. 

*Hint: it might help to think back to the counting example from class. If you are trying to cut down work, what branches can you prune?*

Once you have the algorithm, answer the following questions: 

1. Describe what this brute force algorithm is doing and why it is guaranteed to give the right answer.

2. Why does this algorithm do less work than the algorithm in step 1? 

3. What is the recurrence relation? 

4. What is the time complexity? (Remember: time complexity can be broken down into the number of recursive call and time per recursive call)

5. Will your time complexity be worse if you used a HashSet to store the vocab instead of the Trie? Why or why not?


## Step 3: Recognizing redundancy

Let us define redundant work as calling the same function with the same arguments multiple times. 

Use the vocab {"a", "aa"} and the input "aaab" for the questions below.


1. Is the algorithm from Step 1 doing redundant work? If yes, give an example of a call that is made more than once. If no, why not?

2. Is the algorithm from Step 2 doing redundant work? If yes, give an example of a call that is made more than once. If no, why not? 

3. Dynamic Programming (which we will learn about) is a way of removing redudant work. Based on your previous answers, which of the two algorithms do you think will benefit from Dynamic Programming? 

## Step 4: Submit the write-up

* **One** person in your team should export the google doc as pdf and upload it to gradescope under Lab 5

* **Make sure to add all the group members to the submission**

