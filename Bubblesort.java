class Bubblesort {
    public static void toprint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 7, 3, 9, 5 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapp the values
                    int temporary = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporary;
                }
            }
        }
        toprint(arr);
    }
}
