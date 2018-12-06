# 94. Binary Tree Inorder Traversal

https://leetcode.com/problems/binary-tree-inorder-traversal/

```
Given a binary tree, return the inorder traversal of its nodes' values.
```


## Using I.D.E.A.L.

To solve this problem, I first *identified* what I needed to solve for,
in this case, traversing a binary tree. *Defining* the problem was
simple because I understood that I needed to traverse a binary tree with
inorder traversal and add each value to a list. I *explored* solutions
to this problem by implementing the popular inorder traversal technique
I learned in CS2. Lastly, I *looked back* on the results and I realized
that I had a local Arraylist that wasn't generating the desired results,
since each activation record was creating its own ArrayList. I then
solved this problem by using a helper method to which I passed the
TreeNode's root and an ArrayList declared in the inorderTraversal method.


## Using Duke's Seven Steps

Since this was a relatively simple tree traversal problem, I found that
using I.D.E.A.L was sufficient to help me solve the problem.