public class Test3 {
    public static void main(String[] args) {
        String[] input = { "xc", "dz", "bbb", "dz" };
        String[] query = { "bbb", "ac", "dz" };

        int sama = 0;

        // declare new Array;
        int[] kesamaan = new int[query.length];

        // check kemungkinan elemen yang sama
        for (int i = 0; i < input.length; i++) {
            if (i == query.length) {
                continue;
            }
            for (int j = 0; j < input.length; j++) {
                if (query[i].equals(input[j])) {
                    sama += 1;
                }
                kesamaan[i] = sama;
            }
            sama = 0;
        }

        // System.out.println("variable sama :" + sama);
        // display
        System.out.print("[ ");
        for (int i = 0; i < kesamaan.length; i++) {
            System.out.print(kesamaan[i]);
            if (i != kesamaan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }
}
