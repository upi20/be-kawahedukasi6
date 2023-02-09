public class IOVariable {
    public static void main(String[] args) {
        // 1. Input, Output, Data Variabel & Variable
        // a. Buatlah program untuk input nama anda dan output kalimat "Selamat datang di bootcamp Kawah Edukasi, {namaAnda}"
        String namaSaya = "Isep Lutpi Nur";
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, "+namaSaya);
        // b. Buatlah masing masing dua variable untuk data type short, double, char, dan boolean
        short short1 = 10;
        short short2 = 2000;

        double double1 = 1.5;
        double double2 = 1.7;

        char char1 = '1';
        char char2 = 'B';

        boolean lulus = true;
        boolean kerja = false;

        // c. Buatlah 3 variable string dengan value masing-masing, "Saya senang" "belajar" "Java Language", lalu gabungkan dan print hasilnya.
        String kalimat1 = "Saya senang";
        String kalimat2 = "belajar";
        String kalimat3 = "Java Language";

        // d. Buatlah 3 contoh implentasi casting
        String satu = "1";
        int short1ToInt = (int) short1; // menggunakan variable soal point b diatas
        int short2ToInt = (int) short2; // menggunakan variable soal point b diatas
        Integer stringToInt = Integer.parseInt(satu); // menggunakan variable soal point b diatas

    }
}