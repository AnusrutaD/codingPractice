# DYNAMIC PROGRAMMING

is a programming paradigm that can systematically and 
efficiently explore all possible solutions to a problem. 
As such, it is capable of solving a wide variety of problems 
that often have the following characteristics:

1. The problem can be broken down into "overlapping subproblems" - 
smaller versions of the original problem that are re-used multiple times.
2. The problem has an "optimal substructure" - an optimal solution can be 
formed from optimal solutions to the overlapping subproblems of the original problem.


## Some Problems from leetcode

### [198. House Robber problem](https://leetcode.com/problems/house-robber/)

We can do by memoise the previous data inside an array of same length, 
For that the 

- Time Complexity : O(N)
- Space Complexity: O(N);

we can decrease the space complexity ti O(1);

