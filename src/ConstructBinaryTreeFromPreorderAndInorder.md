# 105. Construct Binary Tree from Preorder & Inorder Traversal

https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

```
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.
```


## Using I.D.E.A.L.
I.D.E.A.L. helped me solve the problem by helping me *identify* and
*define* in my own words what I needed to do, which was traversing both
the inorder and preorder traversal arrays and build a tree with them. I
*explored* solutions to this problem, such as using Depth-First Search and
Breadth-First Search. Then I tried out these recursive algorithms to build
the tree, and *looked back* from my results to the problem statement's test case
output and fixed my code accordingly.


## Using Duke's Seven Steps
Duke's framework helped me in writing out small examples first; a one-item
tree, a two-item tree, and so on. I found a pattern, which was that the first
element in the preorder list is a root. This root splits inorder lists into
left and right subtrees. Then I needed to pop up the root from the preorder list
since it would have already been used as a tree node. This process would be
repeated for the left and right subtrees. I traced my attempted solution on paper
and then I translated it to code, debugged the code and fixed any failing test cases.