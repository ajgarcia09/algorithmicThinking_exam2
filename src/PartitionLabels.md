# 763. Partition Labels

https://leetcode.com/problems/partition-labels/

```
In an election, the i-th vote was cast for persons[i] at time times[i].

Now, we would like to implement the following query function: TopVotedCandidate.q(int t)
will return the number of the person that was leading the election at time t.

Votes cast at time t will count towards our query.  In the case of a tie, the most recent
vote (among tied candidates) wins.
```


## Using I.D.E.A.L.
I used this framework to better understand and *define* the problem in my own words.
The problem asks to partition an input string S into as many parts as possible so that
each letter appears in at most one part. The problem requires of me to return a list
of integers representing the size of these parts. I *explored* solutions to this problem,
using a greedy algorithm to repeatedly choose the smallest left-wise partition. For
each letter I encountered, I processed the last occurrence of that letter, extending
the current partition properly. Then I examined my results and *looked back* to the
test cases provided by the problem description and debugged accordingly.


## Using Duke's Seven Steps
Duke's framework was helpful because I wrote down small examples on a piece of paper
(a String S of size 1, S of size 2, and so on). The pattern I found was that the first
partition must include the first character in S and also the last occurrence of S.
For example, in "abccaddbeffe", the minimum first partition is "abccaddb".
This gives us the idea for the algorithm: For each letter encountered,
process the last occurrence of that letter, extending the current partition [anchor, j]
appropriately. Consequently, I translated this algorithm into code, wrote relevant
test cases and debugged the failing test cases accordingly.