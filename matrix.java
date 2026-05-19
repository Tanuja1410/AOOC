import java.util.Scanner;

class matrix {
    public static void main(String[] args) {

        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {5, 6}, {7, 8} };
        int[][] result = new int[2][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1 = Addition");
        System.out.println("2 = Multiplication");
        System.out.println("3 = Transpose of Matrix A");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Matrix Addition:");

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = a[i][j] + b[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("Matrix Multiplication:");

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {

                        result[i][j] = 0;

                        for (int k = 0; k < 2; k++) {
                            result[i][j] += a[i][k] * b[k][j];
                        }

                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Transpose of Matrix A:");

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(a[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}