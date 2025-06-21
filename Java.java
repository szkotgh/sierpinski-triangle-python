import java.util.ArrayList;
import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // n == 3 * 2^k
        scanner.close();

        // Generate Pascal's Triangle
        ArrayList<ArrayList<Integer>> pascalsTriangle = new ArrayList<>();
        int triangleRows = n/3;
        for (int i = 0; i < triangleRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            for (int j = 1; j < i; j++) {
                int value = pascalsTriangle.get(i-1).get(j-1) + pascalsTriangle.get(i-1).get(j);
                row.set(j, value);
            }
            pascalsTriangle.add(row);
        }

        // Generate Sierpinski Triangle
        ArrayList<ArrayList<Integer>> sTriangle = new ArrayList<>();
        for (int i = 0; i < triangleRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                int modValue = pascalsTriangle.get(i).get(j) % 2;
                row.add(modValue);
            }
            sTriangle.add(row);
        }

        // Print Sierpinski Triangle
        int rowIndex = 0;
        for (int index = 0; index < triangleRows; index++) {
            for (int subRow = 0; subRow < 3; subRow++) {
                StringBuilder line = new StringBuilder();

                int paddingSpacesCount = n-3 * index-subRow-1;
                String paddingSpaces = " ".repeat(Math.max(0, paddingSpacesCount));

                // Front padding
                line.append(paddingSpaces);

                for (int j = 0; j <= index; j++) {
                    String pattern;

                    // Fill Triangle
                    if (sTriangle.get(index).get(j) == 1) {
                        if (subRow == 0) {
                            pattern = "*";
                        } else if (subRow == 1) {
                            pattern = "* *";
                        } else {
                            pattern = "*****";
                        }
                    }
                    // Empty Triangle
                    else {
                        if (subRow == 0) {
                            pattern = " ";
                        } else if (subRow == 1) {
                            pattern = "   ";
                        } else {
                            pattern = "     ";
                        }
                    }

                    line.append(pattern);

                    // Add space between triangles
                    if (j < index) {
                        if (subRow == 0) {
                            line.append("     ");
                        } else if (subRow == 1) {
                            line.append("   ");
                        } else {
                            line.append(" ");
                        }
                    }
                }

                rowIndex++;

                // Back padding
                line.append(paddingSpaces);
                if (n != rowIndex) {
                    line.append(" ");
                }

                System.out.println(line.toString());
            }
        }
    }
}
