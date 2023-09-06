class Test4 {
    public static void penguranganDiagonal(int[][] arr) {
        // Write your code here
        int diagonal_kiri = 0;
        int diagonal_kanan = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    diagonal_kiri += arr[i][j];
                }
                if ((i + j) == (arr.length - 1)) {
                    diagonal_kanan += arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println(
                "diagonal pertama : " + arr[0][0] + " + " + arr[1][1] + " + " + arr[2][2] + " = " + diagonal_kiri);
        System.out.println(
                "diagonal kedua : " + arr[0][2] + " + " + arr[1][1] + " + " + arr[2][0] + " = " + diagonal_kanan);
        int result = 0;
        if (diagonal_kanan > diagonal_kiri) {
            result = diagonal_kanan - diagonal_kiri;
        } else if (diagonal_kanan < diagonal_kiri) {
            result = diagonal_kiri - diagonal_kanan;
        }

        System.out.println();
        System.out.println("maka hasilnya adalah " + diagonal_kiri + " - " + diagonal_kanan + " = " + result);

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 0 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] arr = new int[3][3];

        System.out.print("Matrix = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                if (i == arr.length - 1 && j == arr.length - 1) {
                    System.out.print(arr[i][j] + "]");
                } else if (j == arr.length - 1) {
                    System.out.print(arr[i][j] + "],");
                } else {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.print("]");

        System.out.println();
        penguranganDiagonal(arr);

    }
}
