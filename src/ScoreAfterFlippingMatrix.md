# 861. Score After Flipping Matrix

https://leetcode.com/problems/score-after-flipping-matrix/

```
We have a two dimensional matrix A where each value is 0 or 1.

A move consists of choosing any row or column, and toggling each
value in that row or column: changing all 0s to 1s, and all 1s to 0s.

After making any number of moves, every row of this matrix is interpreted
as a binary number, and the score of the matrix is the sum of these numbers.

Return the highest possible score.
```

## Using I.D.E.A.L.
I used I.D.E.A.L.to first help me *define* what I needed to do, which is essentially
finding the highest score possible after deciding which 0s and 1s should be toggled
(change a 1 to a 0, or change a 0 to a 1), while keeping in mind that the values of
these numbers are binary numbers. Of the potential solutions that i *explored,* I
iterated over every possible way to toggle rows. After toggling each row, I calculated
the max score. If for example the last column has a column sum of 3, then the score is
max(3, R-3), where R-3 represents the score we get from toggling the last column. Then I
from my results, I *looked back* to the original problem statement and sample test cases
and debugged the test cases that failed.

## Using Duke's Seven Steps
I found Duke's framework useful in writing out the simplest test cases I could come up
with, such as a 2D array of only one element, a 2x2 array, a 2x3 and so forth. Then I
checked my algorithm by hand, and after verifying that ir worked, I translated it to
code which I ran against my test cases.