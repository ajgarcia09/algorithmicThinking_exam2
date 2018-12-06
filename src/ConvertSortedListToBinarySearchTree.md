# 109. Convert Sorted List to Binary Search Tree

https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/

```
Given a singly linked list where elements are sorted in ascending order,
convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary
tree in which the depth of the two subtrees of every node never
differ by more than 1.
```


## Using I.D.E.A.L.
The first step I took was *identifying* what the problem asked me to solve for
and then *defining* it in my own words. I was given a sorted linked list
and I needed to insert the contents of the linked list into a balanced binary
search tree (BST). I *explored* solutions to obtain the middle node in the
linked list, (since the list is sorted, the middle node would be the root
of the BST, all the nodes to the left of the middle node would be the left
subtree and all the nodes to the right of the middle node would be the right
subtree. *Looking back* on my results, I debugged accordingly to obtain the
results specified in the problem's test cases.


## Using Duke's Seven Steps
Duke's Seven Steps helped me in solving this problem by allowing me to
start writing small examples; a small singly-linked list. I realized that
I could recursively find middle nodes of the linked list and build subtrees
that would comprise the biggest tree. I ran test cases I came up with on my
code and I debugged the failed test cases until they passed.
