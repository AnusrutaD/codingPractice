# DYNAMIC PROGRAMMING

Is a programming paradigm that can systematically and 
efficiently explore all possible solutions to a problem. 
As such, it is capable of solving a wide variety of problems 
that often have the following characteristics:

1. The problem can be broken down into **Overlapping Subproblems** - 
smaller versions of the original problem that are re-used multiple times.
2. The problem has an **Optimal Substructure** - any given problem has optimal
Substructure if the solution of the given problem can be 
formade from the optimal solutions to the overlapping subproblems of the original problem.

### Memoization: 
storing the value of sub problem to use it again in future

<p style="color: yellow">There are 2 ways to solve DP problem</p>

1. Top Down DP ( <span style="color: magenta">Recursion + Memoization</span> ):
- Start with a bigger problem
- go down recursively to the smaller subproblem for which we already know the answer 
(base case)

2. Bottom up DP ( <span style="color: magenta">Iterative</span> ):
- Start with a sub problem which we already know the solution and use that to iteratively 
Solve the bigger problem


## Questions
- Fibonacci Series

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

Given an integer array nums, return the length of the longest strictly increasing subsequence.

A subsequence is a sequence that can be derived from an array by deleting some or no 
elements without changing the order of the remaining elements. For example, [3,6,2,7] 
is a subsequence of the array [0,3,1,6,2,2,7].

#### Example 1:
**Input:** nums = [10,9,2,5,3,7,101,18]
**Output:** 4
**Explanation:** The longest increasing subsequence is [2,3,7,101], therefore the 
length is 4.

#### Example 2:
**Input:** nums = [0,1,0,3,2,3]
**Output:** 4

#### Example 3:
**Input:** nums = [7,7,7,7,7,7,7]
**Output:** 1

#### Constraints:
- 1 <= nums.length <= 2500
- -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>

