public static void selectionSort(int[] larik) {
        int size = larik.length;

        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int j = i + 1; j < size; j++) {
                if (larik[j] < larik[min]) {
                    min = j;
                }
            }

            int temp = larik[min];
            larik[min] = larik[i];
            larik[i] = temp;
        }
    }
}
