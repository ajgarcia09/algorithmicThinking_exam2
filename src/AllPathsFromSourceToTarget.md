# 797. All Paths From Source to Target

https://leetcode.com/problems/all-paths-from-source-to-target/

```
Given a directed, acyclic graph of N nodes.  Find all
 possible paths from node 0 to node N-1, and return them in any order.

The graph is given as follows:  the nodes are 0, 1, ..., graph.length - 1.
graph[i] is a list of all nodes j for which the edge (i, j) exists.
```

## Using I.D.E.A.L.
I.D.E.A.L. helped me *identify* and *define* what the problem was asking.
I had to spend some time in this stage because I had forgotten some of my
basic graph theory terminology/traversals. Then I *explored* solutions to the
problem, which was finding all possible paths from node 0 to the node N-1
and return all of the paths. Since the input graph was a directed, acyclic graph,
any path from node A to node B would be composed of node A plus a path from any
neighboring nodes of node A to node B. I used recursion to solve for this problem.



## Using Duke's Seven Steps
Duke's Seven Steps helped me because I wrote down small instances of the problem, in
this case, small graphs of two, or three nodes and then incrementally increasing the
number of nodes. I found the pattern that I also found using I.D.E.A.L, which was that
Since the input graph was a directed, acyclic graph,any path from node A to node B
would be composed of node A plus a path from any neighboring nodes of node A to node B.
Then I checked my reasoning on paper with some examples and then I translated my solution
to code, and proceeded to run my test cases and debug the failing ones.