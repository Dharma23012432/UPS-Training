import java.util.Scanner;

class Main {

    public static int[][] createMatrix(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static int[][] addMatrix(int[][] arr1, int[][] arr2) {

        int[][] sum = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return sum;
    }

    public static void displayResult(int[][] result) {

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Matrix:");
        int[][] arr1 = createMatrix(sc);

        System.out.println("Enter Second Matrix:");
        int[][] arr2 = createMatrix(sc);

        int[][] result = addMatrix(arr1, arr2);

        System.out.println("Sum Matrix:");
        displayResult(result);

    }
}