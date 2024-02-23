# Sudoku Solver
Programming Language: Java

Given a sudoku unsolved grid, output the solved puzzle. Written in Java and uses backtracking

# Problem
• Given a 9x9 grid, with some squares filled in with positive integers in between 1 and 9, inclusive.

• The goal is to complete the grid with positive integers in between 1 and 9, inclusive, so that each row, column and mini 3x3 square that is designated contain each integer in the range 1 through 9 exactly once.

# Input 
The first line of the input file will be a positive integer n, representing the number of puzzles to solve in the input file. This will be followed by a blank line. The following 10n lines will contain the n cases, with each case taking exactly 10 lines. Within each test case, the ith line will contain the 9 values on the i
th row of the unsolved puzzle, in order, from left to right, each separated by spaces. This will be followed by the 10th line that is blank. In particular, all blank entries of the puzzle will be indicated with a 0, and the 9 integer values (all in between 0 and 9, inclusive) on the line each will be separated by a space.

# Output
The first line for each test case will be of the format:

```text
  Test case k:
```

Where k ranges in between 1 and n, inclusive and represents the test case number. Follow this with a blank line.

If the puzzle has no solution, then the line of output after the blank line will be:
```text
  No solution possible.
```

If the puzzle has a solution, output it on the following nine lines, with each value separated by a single space. Output would look something like this:
```text
  9 6 3 1 7 4 2 5 8
  1 7 8 3 2 5 6 4 9
  2 5 4 6 8 9 7 3 1
  8 2 1 4 3 7 5 9 6
  4 9 6 8 5 2 3 1 7
  7 3 5 9 6 1 8 2 4
  5 8 9 7 1 3 4 6 2
  3 1 7 2 4 6 9 8 5
  6 4 2 5 9 8 1 7 3
```

## Sample Input
```text
2

0 6 0 1 0 4 0 5 0
0 0 8 3 0 5 6 0 0
2 0 0 0 0 0 0 0 1
8 0 0 4 0 7 0 0 6
0 0 6 0 0 0 3 0 0
7 0 0 9 0 1 0 0 4
5 0 0 0 0 0 0 0 2
0 0 7 2 0 6 9 0 0
0 4 0 5 0 8 0 7 0

0 6 0 1 0 4 0 5 0
0 0 8 3 0 5 6 0 0
2 0 0 0 0 0 0 0 1
8 0 0 4 0 7 0 0 6
0 0 6 0 0 0 3 0 0
7 0 0 9 0 1 0 0 4
5 0 0 0 0 0 0 0 2
0 0 7 2 0 6 9 0 0
0 4 0 5 0 8 0 7 9
```

## Sample Output
```text
Test case 1:

9 6 3 1 7 4 2 5 8
1 7 8 3 2 5 6 4 9
2 5 4 6 8 9 7 3 1
8 2 1 4 3 7 5 9 6
4 9 6 8 5 2 3 1 7
7 3 5 9 6 1 8 2 4
5 8 9 7 1 3 4 6 2
3 1 7 2 4 6 9 8 5
6 4 2 5 9 8 1 7 3

Test case 2:
No solution possible.
```
