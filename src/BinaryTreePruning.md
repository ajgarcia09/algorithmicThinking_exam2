# 814. Binary Tree Pruning

https://leetcode.com/problems/binary-tree-pruning/

```
We are given the head node root of a binary tree, where additionally
every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not
containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
```

## Using I.D.E.A.L.

I.D.E.A.L. helped me *identify* and *define* what the problem was asking.
At first it wasn't very straight forward but I then realized that I needed
to traverse the tree recursively and prune each subtree that did not have a 1.
I *explored* solutions until I implemented a method that checked whether a
given node contained a 0 or a 1 and if it prunes all subtrees not containing 1.
I debugged and tested by code by *looking back* at my results compared to the
sample input and output provided by LeetCode.


## Using Duke's Seven Steps
This framework helped me solve the problem by writing down small instances
of binary trees, starting with a tree with only one node, a tree with
one root and left node, a root, a left and right node, etc. Then I was able
to find patterns in my written examples, for example, that I needed to traverse
each node and determine whether it had a 0 or a 1 before deciding what to prune.
I designed my test cases, translated to code and verified that everything worked
correctly by debugging the test cases that I wasn't getting right.