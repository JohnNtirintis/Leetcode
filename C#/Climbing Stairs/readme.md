# Solution Approach

## The ClimbStairs class in Solution.cs implements a recursive method SolveRecursive to calculate the number of ways to climb the stairs. To optimize the performance and avoid redundant calculations, memoization is used.
Key Features

    ### Recursion: 
	The solution uses a recursive approach, breaking down the problem into smaller, manageable sub-problems.
    ### Memoization: 
	To prevent repetitive calculations for the same number of steps, we utilize an array climbStairsMemo for storing intermediate results. This significantly reduces the time complexity from exponential to linear.


## Problem Description:

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

 

Constraints:

    1 <= n <= 45

