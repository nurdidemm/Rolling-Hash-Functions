# Rolling-Hash-Functions

Given two strings:

> S = s1s2s3...sn
> T = t1t2t3...tn

returns the positions of T where S is a substring using rolling hash functions.

---------------

Input Format

The input consists of two lines. The first line contains the string S and the second line contains T.

---------------

Output Format

The output contains all indices i such that S is a substring of T at index i, in sorted order, one on each line.

The indices are 1-based.

S is guaranteed to occur at least once in T.
