# Lab 5

## Overview

In this lab we will be working with greedy algorithms for sequence segmentation, and reason about the contexts in which these algorithms work and don't work. 


## Problem description

You are given a sequence and and a vocab, and your task is to break it down into segments, where each segment is a word from the vocab.

For example, consider the following vocab: 
```
vocab = {'the', 'that', 'ant', 'panda', 'thing', 'near', 'in', 'saw', 'ate', 'bit'}

s = 'theantatethatthing'
```

Given this vocab, here are the correct input-output mappings: 

* `s='theantatethatthing'`. Output: `['the', 'ant', 'ate', 'that', thing']`

* `s='theantintheatticbitthepanda` Output: `['the', 'ant', 'in', 'the', 'attic', 'bit', 'the', 'panda']`

* `s='theantssawthepandas'` Output: `null` (because there is no valid way of segmenting the sequence into valid words)

Note, in reality sequences can often be *ambiguous* --- i.e., the same string can be divided onto multiple valid segments. For example given a vocab `{'tea', 'team', 'meat', 'eat', 'eats', 'spot', 'pot'}`, the sequence `teameatspot` can be split into the following valid segments: 

* `['tea', 'meat', 'spot']`
* `['team', 'eat', 'spot']`
* `['team', 'eats', 'pot']`
* `['tea', 'meats', 'pot']`

**For the purposes of this lab, we will focus on sequences that have only one valid segmentation given a vocab.** In later labs, we will work through how to find the most likely segmentation. 

## Defining greedy algorithms

A greedy algorithm solves a problem one step at a time. At each step, it makes a choice based only on what it can see right now, commits to that choice, and moves on. It never goes back to reconsider an earlier choice. 

There are contexts in which greedy algorithms work and give us the correct answer. We will learn about these contexts later in class. The goal of this lab is to help you articulate why a greedy approach doesn't work for the segmentation task. 


## Step 0: Creating a shared collaborative document

**One** person in your team should create a copy of [the google doc template for this lab](https://docs.google.com/document/d/1wLCkzKqFXh5GkOB6eHchz_nnoes8-dWpbjEQmQ3P8CA/edit?usp=sharing), and share it with your group. 

## Step 1: Analyzing a greedy algorithm which uses a `Hashset` to store the vocab

Here is a greedy algorithm that uses a `Hashset` to store the vocab. 

```
segment(seq:str, vocab:HashSet):
	segments = []
	start = 0
	end = start+1

	while start < len(seq)-1: 
		curr = seq[start:end]  
		if curr in vocab: 
			segments.add(curr)
			start=end
			end = start+1
			else:
				end+=1
		
	if segments.size()==0: 
		return null
	
	return segments

```
Answer the following questions in the google doc: 

1. What is the local choice that this greedy algorithm makes at every step? 

2. Why is this local choice guaranteed to work with the following vocab: `vocab1 = {'the', 'that', 'ant', 'panda', 'thing',
 'near', 'in', 'saw', 'ate', 'bit', 'supercalifragilisticexpialidocious'}`?

3. What is the worst case? What is the upperbound time complexity for this algorithm in the worst case when:
	* Vocab size: `V`
	* Length of the longest word in the vocab: `L`
	* Length of the seqeunce: `n`

*Hint: In answering question 2, remind yourself about the time complexity for Hashing a string of length `m`*


## Step 2: Making the greedy algorithm more efficient by using a `Trie` to store the vocab

Let's say that the vocab is stored in a `Trie` instead of a `Hashset`. Modify the algorithm from Step 1 to work with the Trie and in a way that is asymptotically more efficient than the algorithm in Step 1. You can assume that your `Trie` has the following operations: 

* `add(s)`: Adds a string `s` to the Trie. Runs in `O(l)` where `l` is the length of the string `s`
* `getChild(node)`: Gets the child of the node. Runs in `O(1)`.
* `contains(s)`: Returns True if `s` is in a word in the Trie. Runs in `O(s)`
* `contains_prefix(s)`: Returns True if `s` is in the Trie, even if `s` is not a word. Runs in `O(s)`

Once you've written your pseudocode and/or described your algorithm, answer the following questions: 
1. How does your algorithm work? 
2. Why is your algorithm correct? 
3. What is the worst case? What is upperbound time complexity in this worst case? Again, use `V` for vocab size, `L` for longest word in the vocab, and `n` for the length of the sequence.
4. What aspects of your algorithm make it more efficient than the one in Step 1?  

## Step 3: Reasoning about limitations of the greedy algorithm in the previous steps and designing a different greedy algorithm

Say we added two more words to our vocab: `a` and `an`. So now our vocab is:

```
vocab2 = {'the', 'that', 'ant', 'panda', 'thing',
 'near', 'in', 'saw', 'ate', 'bit', 'supercalifragilisticexpialidocious', 'a', 'an'}

```

Explain why adding these two words causes the greedy algorithm from Steps 1 and 2 to break. 

Then, design an algorithm with a different local choice (i.e., *greedy rule*) that works with `vocab2`. In this algorithm, continue to use a `Trie` to store your vocab. 

Once you've written your pseudocode and/or described your algorithm, answer the following questions: 


1. What is the local choice that your new greedy algorithm makes at every step?

2. Why is this local choice guaranteed to work with `vocab2`?

3. What is the worst case? What is the upperbound time complexity in this worst case? Again, use `V` for vocab size, `L` for longest word in the vocab, and `n` for the length of the sequence.


## Step 4: Reasoning about the limitations of greedy algorithms for sequence segmentation

Come up with a vocab and sequence combination for which neither your new greedy rule nor the old greedy rule work. Once you have your vocab, answer the following questions: 

1. Why does the vocab break the greedy rules?

2. What would you need to do to guarantee that you are able to find the correct segmentation for a sequence if one exists for *any* vocab and sequence? 



## Step 5: Submit the write-up

* **One** person in your team should export the google doc as pdf and upload it to gradescope under Lab 5

* **Make sure to add all the group members to the submission**






