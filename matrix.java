class matrix {
    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] result = new int[2][2];

        int choice = 1; // 1-Addition, 2-Multiplication, 3-Transpose
    
        switch(choice) {
            case 1: // Addition
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[i][j] + b[i][j];

                System.out.println("Matrix Addition:");
                break;

            case 2: // Multiplication
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];

                System.out.println("Matrix Multiplication:");
                break;

            case 3: // Transpose of A
                System.out.println("Transpose of Matrix A:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(a[j][i] + " ");
                    }
                    System.out.println();
                }
                return;

            default:
                System.out.println("Invalid choice");
                return;
        }

        // Print result
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}
