# 807. Max Increase to Keep City Skyline

https://leetcode.com/problems/max-increase-to-keep-city-skyline/

```
In a 2 dimensional array grid, each value grid[i][j] represents the height
of a building located there. We are allowed to increase the height of any
number of buildings, by any amount (the amounts can be different for
different buildings). Height 0 is considered to be a building as well.

At the end, the "skyline" when viewed from all four directions of the grid,
i.e. top, bottom, left, and right, must be the same as the skyline of the original
grid. A city's skyline is the outer contour of the rectangles formed by all the
buildings when viewed from a distance. See the following example.

What is the maximum total sum that the height of the buildings can be increased?
```

## Using I.D.E.A.L.
I found this problem somewhat complicated to understand. Before I tried solving it,
I re-read the problem and evaluated the examples provided to understand the problem.
Once I understood the kind of input the problem provided (a 2D array representing
building heights). I proceeded to *explore* potential solutions. For example, I used
an algorithm that would find the row and column maximums in order to determine the
maximum sum that the height of the buildings could be increased to. I then *looked back*
on my results and determined if my output satisfied the problem description and test cases.


## Using Duke's Seven Steps
Duke's framework was particularly helpful for me in writing down the simplest examples I
could up up with; a 2D array with one building and a height of 0, a 2D array with two
buildings of height 0 and 1, and so on. Once I figured out how to find the max and min
of each row and column, respectively, I realized that each building at grid[row][col]
could become height min(max(row_r), max(col_c)) and that this is the largest height, then
the skyline row_maxes would change. After tracing this algorithm by hand, I translated it
to code and I debugged it as failed test cases appeared.