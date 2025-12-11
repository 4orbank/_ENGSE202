package Lab1;

import java.util.Scanner;

public class Lab1_14 {

	public static void main(String[] args) {
        Scanner sever = new Scanner(System.in);

        int rows = readInt(sever, "Enter number rows : ");
        int cols = readInt(sever, "Enter number columns : ");

        char[][] map = readMap(sever, rows, cols);

        int targetR = readInt(sever, "Enter row (0-indexed): ");
        int targetC = readInt(sever, "Enter column (0-indexed): ");

        processCell(map, targetR, targetC);

        sever.close();
    }

    private static int readInt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    private static char[][] readMap(Scanner sc, int rows, int cols) {
        sc.nextLine(); 
        char[][] map = new char[rows][cols];

        System.out.println("Enter the map row by row (* for mine, . for empty):");

        for (int i = 0; i < rows; i++) {
            String row;
            while (true) {
                row = sc.nextLine();
                if (row.length() == cols) break;
                System.out.println("Row length must be " + cols + ". Enter again:");
            }
            map[i] = row.toCharArray();
        }
        return map;
    }

    private static void processCell(char[][] map, int r, int c) {
        if (isMine(map, r, c)) {
            System.out.println("Mine");
        } else {
            System.out.println(countAdjacentMines(map, r, c));
        }
    }

    private static boolean isMine(char[][] map, int r, int c) {
        return map[r][c] == '*';
    }

    private static int countAdjacentMines(char[][] map, int r, int c) {
        int rows = map.length;
        int cols = map[0].length;
        int counts = 0;

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue;

                int nr = r + dr;
                int nc = c + dc;

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    if (map[nr][nc] == '*') {
                        counts++;
                    }
                }
            }
        }
        return counts;
    }
}
