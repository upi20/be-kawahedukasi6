import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LatihanDateTime {
    public static void main(String[] args) {
        // Soal
        // 4. Date
        // a. Reformat contoh tanggal dibawah ini
        // Contoh Date : 12-11-2022 09:11:12
        //         - 12 November 2022
        //         -  20221112_091112
        // b. Buatlah program untuk menghitung tanggal kadaluarsa jika durasi layak makannya adalah 1 tahun 6 bulan 12 hari 3 jam 12 menit 20 detik

        // Jawaban
        // A. Reformat date dari "12-11-2022 09:11:12"
        String text = "12-11-2022 09:11:12";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //convert String to LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(text, formatter);

        // format
        Locale local = new Locale("in", "ID");
        DateTimeFormatter forat1 = DateTimeFormatter.ofPattern("dd MMMM YYY", local);
        DateTimeFormatter forat2 = DateTimeFormatter.ofPattern("YYYMMd_HHmmss");

        System.out.println(forat1.format(localDateTime)); // 12 November 2022
        System.out.println(forat2.format(localDateTime)); // 20221112_091112



        // b. Buatlah program untuk menghitung tanggal kadaluarsa
        // jika durasi layak makannya adalah 1 tahun 6 bulan 12 hari 3 jam 12 menit 20 detik
        LocalDateTime waktuProduksi = LocalDateTime.now();
        System.out.println(formatter.format(waktuProduksi)); // Contoh Waktu Poroduksi nya : 09-02-2023 21:22:58

        // waktu produksi di tambah 1 tahun 6 bulan 12 hari 3 jam 12 menit 20 detik
        LocalDateTime waktuKadaluarsa = waktuProduksi
                .plusYears(1)
                .plusMonths(6)
                .plusDays(12)
                .plusHours(3)
                .plusMinutes(12)
                .plusSeconds(20);

        System.out.println(formatter.format(waktuKadaluarsa)); // Maka Waku Kadaluarsa nya : 22-08-2024 00:35:18

    }
}
