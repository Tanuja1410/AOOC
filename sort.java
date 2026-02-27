class sort {
    public static void main(String[] args) {
        int[] a = {45, 12, 89, 23, 5, 67, 34, 90, 1, 10};
        int temp;

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted list in ascending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
