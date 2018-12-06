# 22. Generate Parentheses

https://leetcode.com/problems/generate-parentheses/

```
Given n pairs of parentheses, write a function to generate
all combinations of well-formed parentheses.
```


## Using I.D.E.A.L.
I *identified* and *defined* in my own words what the problem asked me to do,
which was to generate all combinations of well-formed parentheses given on a
number of parentheses, n. I *explored* possible solutions and the one I implemented
used brute force. I tried generating all of the 2^2n sequences of '(' and ')' characters
and then checked if each one of those was valid. I generated all sequences recursively
and kept track of whether each sequence was "balanced," such as "()" instead of "(()."
I then *looked back* to the original problem and made note of any test case results
that differed from the ones given in the problem definition and debugged accordingly.


## Using Duke's Seven Steps
Duke's was very helpful in writing out small instances of the problem, starting with
number of parenthesis n = 1, n = 2, n = 3, and so on so I could test by hand my potential
solution before translating it to code. I found the pattern that all sequences of length
n are just '(' in addition to all sequences of length n-1, and then ')' plus all
sequences of length n-1. Finally, I ran my test cases and debugged the code accordingly.