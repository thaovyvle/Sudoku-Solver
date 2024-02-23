// Sudoku Solver

import java.util.*;

public class sudokuSolver {

    final public static int N = 9;
    public static int[] board;

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        int numCases = stdin.nextInt();

        // Go through each case.
        for (int loop =1 ; loop <= numCases; loop++) {

            // Read in board.
            board = new int[N*N];
            for (int i = 0; i < N*N; i++)
                board[i] = stdin.nextInt();

            // Solve.
            boolean hasSol = solve();

            // Output result
            System.out.println("Test case "+loop+":\n");
            if (!hasSol) System.out.println("No solution possible.");
            else print();

            // Two blank lines.
            System.out.println("\n");
        }
    }

    public static boolean solve() {

        // Bad board...
        for (int i = 0; i < N*N; i++) if (!isConsistent(i)) return false;

        // Recursively solve.
        return solve(0);
    }

    public static boolean solve(int k) {

        // Done!
        if (k == N*N) return true;

        // Fixed square, go to next.
        if (board[k] != 0) return solve(k+1);

        // Try each number in this spot.
        for (int i = 1; i <= N; i++) {
            board[k] = i;
            if (isConsistent(k)) {
                boolean branch = solve(k+1);
                if (branch) return true;
            }
            board[k] = 0;
        }

        // Nothing worked!
        return false;
    }

    // Prints the board.
    public static void print() {
        for (int i = 0; i < N*N; i++) {
            System.out.print(board[i] + " ");
            if (i % N == 8) System.out.println();
        }
    }

    // Returns true iff there is no problem with this square.
    public static boolean isConsistent(int pos) {
        return isConsistentRow(pos) && isConsistentCol(pos) && isConsistentBox(pos);
    }

    // Returns true iff the row of pos is consistent with pos.
    public static boolean isConsistentRow(int pos) {

        // Automatically okay.
        if (board[pos] == 0) return true;

        // Make sure no other square has this value on this row.
        for (int i = 0; i < N; i++) {
            if (i == pos % N) continue;
            if (board[(pos/N) * N+i] == board[pos]) return false;
        }
        return true;
    }

    public static boolean isConsistentCol(int pos) {

        // Automatically okay.
        if (board[pos] == 0) return true;

        // Make sure no other square has this value on this column.
        for (int i = 0; i < N; i++) {
            if (i == pos/N) continue;
            if (board[i * N + pos % N] == board[pos]) return false;
        }
        return true;
    }

    public static boolean isConsistentBox(int pos) {

        // For readability.
        int row = pos / N;
        int col = pos % N;
        int val = board[pos];

        // Automatically okay.
        if (val == 0) return true;

        // Box loops are a bit tricky...
        for (int i = 3 * (row/3); i < 3 * (row/3) + 3; i++) {
            for (int j = 3 * (col/3); j < 3 * (col/3) + 3; j++) {
                if (N * i + j == pos) continue;
                if (board[N * i + j] == val) return false;
            }
        }
        return true;
    }
}
