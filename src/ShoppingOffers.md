# 638. Shopping Offers

https://leetcode.com/problems/shopping-offers/

```
In LeetCode Store, there are some kinds of items to sell. Each item has a price.

However, there are some special offers, and a special offer consists of one or
more different kinds of items with a sale price.

You are given the each item's price, a set of special offers, and the number
we need to buy for each item. The job is to output the lowest price you have
to pay for exactly certain items as given, where you could make optimal use
of the special offers.

Each special offer is represented in the form of an array, the last number
represents the price you need to pay for this special offer, other numbers
represents how many specific items you could get if you buy this offer.

You could use any of special offers as many times as you want.
```


## Using I.D.E.A.L.
I used I.D.E.A.L. to *define* the problem and understand how the problem described
making purchases on the LeetCode Store. I *explored* recursion as a possible solution
to this problem by using a function, which takes the price and special list
along with the current(updated) needs as the input and returns the minimum cost of
buying these items as required by this needs list. After trying this solution, I
*looked back* from my results to the problem description's and debugged accordingly.

## Using Duke's Seven Steps
Since I.D.E.A.L was for the most part very useful for solving the problem, the steps
I found most useful from Duke's were writing down small instances of the problem on
a piece of paper and checking my algorithm by hand.