# 34. Find First and Last Position of Element in Sorted Array

https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

```
Given an array of integers nums sorted in ascending order,
find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].
```


## Using I.D.E.A.L.
I *identified* and *defined* the problem in my own words before *exploring*
possible solutions to the problem. I need to find two numbers in the given
array that would add up to a provided target value. I implemented a linear
scan solution that searched for numbers to the left, breaking out of the search
loop if i found one instance in the array that was equal to the target (meaning
that I found the target in the array, so I could just return that element).
If I never broke out of the loop, I'd do a second linear scan from the right
and whenever I found the first instance of target, I returned a list containing
the 2 located indices from the left and right. I debugged accordingly after
I *looked back* from my results and debugged accordingly if I had any test
case that didn't provide the expected output as a result.

## Using Duke's Seven Steps
Since I found a straight-forward, linear solution with I.D.E.A.L, I found
that using Duke's was unnecessary in this case.