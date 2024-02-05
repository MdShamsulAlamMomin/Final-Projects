#include <stdio.h>

#define N 9

// Function declarations
int isSafe(int grid[N][N], int row, int col, int num);
int findUnassignedLocation(int grid[N][N], int *row, int *col);
int solveSudoku(int grid[N][N]);
void printGrid(int grid[N][N]);

int main() {
    int grid[N][N];

    // Get Sudoku grid from the user
    printf("Enter the Sudoku grid (row by row, use 0 for empty cells):\n");
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            scanf("%d", &grid[i][j]);
        }
    }

    if (solveSudoku(grid)) {
        printf("\nSolution:\n");
        printGrid(grid);
    } else {
        printf("\nNo solution exists.\n");
    }

    return 0;
}

// Check whether it's safe to place the number 'num' at position (row, col)
int isSafe(int grid[N][N], int row, int col, int num) {
    // Check if 'num' is not present in the current row, column, and the 3x3 subgrid
    for (int x = 0; x < N; x++) {
        if (grid[row][x] == num || grid[x][col] == num || grid[row - row % 3 + x / 3][col - col % 3 + x % 3] == num) {
            return 0;
        }
    }
    return 1;
}

// Find an unassigned location in the Sudoku grid
int findUnassignedLocation(int grid[N][N], int *row, int *col) {
    for (*row = 0; *row < N; (*row)++) {
        for (*col = 0; *col < N; (*col)++) {
            if (grid[*row][*col] == 0) {
                return 1; // Found an unassigned location
            }
        }
    }
    return 0; // No unassigned location found
}

// Solve the Sudoku puzzle using backtracking
int solveSudoku(int grid[N][N]) {
    int row, col;

    // Check if there is any unassigned location
    if (!findUnassignedLocation(grid, &row, &col)) {
        return 1; // No unassigned location, puzzle is solved
    }

    // Try placing a number from 1 to 9 in the current unassigned location
    for (int num = 1; num <= 9; num++) {
        if (isSafe(grid, row, col, num)) {
            // Assign the number if it's safe
            grid[row][col] = num;

            // Recur to try and solve the rest of the puzzle
            if (solveSudoku(grid)) {
                return 1; // If a solution is found, return true
            }

            // If placing 'num' at (row, col) doesn't lead to a solution, backtrack
            grid[row][col] = 0;
        }
    }

    return 0; // Backtrack if no number can be placed at the current location
}

// Print the Sudoku grid
void printGrid(int grid[N][N]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%2d ", grid[i][j]);
        }
        printf("\n");
    }
}
