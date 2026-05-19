class sort {
        public static void main(String[] args) {
                int[] a = {45, 12, 89, 23, 5, 67, 34, 90, 1, 10};
                int n = a.length;

                for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                                if (a[i] > a[j]) {
                                        int temp = a[i];
                                        a[i] = a[j];
                                        a[j] = temp;
                                }
                        }
                }

                System.out.println("Sorted list in ascending order:");
                for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                }
                System.out.println();
        }
}







