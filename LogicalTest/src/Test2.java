public class Test2 {
    public static void main(String[] args) {
        String sentence = "Sayangku sangat";
        longest(sentence);
    }

    public static void longest(String kalimat) {
        String tampung = "";
        char spasi = ' ';

        // hitung jumlah kata untuk index
        int jumlahKata = 0;
        String coba = "";
        int loop = 0;
        while (loop < kalimat.length()) { // aku adalah = 10 length => 0<10
            while (loop < kalimat.length() && kalimat.charAt(loop) == spasi) // spasi setelah aku
                loop++; // i=1

            if (loop < kalimat.length() && kalimat.charAt(loop) != spasi) {
                coba = coba + kalimat.charAt(loop);
                jumlahKata++;
                while (loop < kalimat.length() && kalimat.charAt(loop) != spasi)
                    loop++;
            }
        }

        // deklarasi array string
        String[] text = new String[jumlahKata];
        // isi array
        int index = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            if (i == kalimat.length() - 1) {
                tampung = tampung + kalimat.charAt(i);
                text[index] = tampung;
            } else {
                if (kalimat.charAt(i) != spasi) {
                    tampung = tampung + kalimat.charAt(i); // Saya
                    // banding = banding + kalimat.charAt(i); // S
                } else if (kalimat.charAt(i) == spasi) {
                    text[index] = tampung;
                    index++;
                    tampung = "";
                }
            }

        }

        // cari index dengan length terbesar
        int longestIndex = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = i + 1; j < text.length; j++) {
                if (text[i].length() > text[j].length()) {
                    longestIndex = i;
                } else if (text[i].length() == text[j].length()) {
                    longestIndex = i;
                } else {
                    longestIndex = j;
                }
            }
        }

        System.out
                .println("the longest is : ( " + text[longestIndex] + " ) with " + text[longestIndex].length()
                        + " character");

    }
}
