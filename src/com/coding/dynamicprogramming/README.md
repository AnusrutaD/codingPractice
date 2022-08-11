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
You are a professional robber planning to rob houses along a street. Each house has a certain amount 
of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses 
have security systems connected and it will automatically contact the police if two adjacent houses 
were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount 
of money you can rob tonight without alerting the police. We can do by memoise the previous data inside 
an array of same length, 

#### Example 1:
**Input:** nums = [1,2,3,1]
**Output:** 4
**Explanation:** Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

#### Example 2:
**Input:** nums = [2,7,9,3,1]
**Output:** 12
**Explanation:** Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.

#### Constraints:
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400
#### Solution: 
For that the 

- Time Complexity : O(N)
- Space Complexity: O(N);

we can decrease the space complexity to O(1) by using two integer variables first and second;

### [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)


