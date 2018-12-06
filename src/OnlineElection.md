# 911. Online Election

https://leetcode.com/problems/online-election/

```
In an election, the i-th vote was cast for persons[i] at time times[i].

Now, we would like to implement the following query function:
TopVotedCandidate.q(int t) will return the number of the person
that was leading the election at time t.

Votes cast at time t will count towards our query.
In the case of a tie, the most recent vote (among tied candidates) wins.
```

## Using I.D.E.A.L.
I used I.D.E.A.L to first *identify* and *define* the problem in my own words;
I needed to return the number of the person that was leading during an election
at a specified time t. The solution I *explored* was using a List of Lists to
store the votes, and I used Binary Search on the list of votes and the specified
time (since the array of votes and the array with specified times are increasing
in value) to find the most recent vote by time. I then looked back on my results
and debugged my code until my test cases had the same output as the sample test
cases provided by the problem description.



## Using Duke's Seven Steps
Duke's steps were useful because I wrote small examples to better understand the problem.
The pattern that I found was that since the array of votes and the array with specified
times are increasing in value, so I could use binary search on it. I verified my potential
solution on paper and then I translated my algorithm to code. Lastly, I developed my test
cases and ran my code against them, fixing those that were failing.
