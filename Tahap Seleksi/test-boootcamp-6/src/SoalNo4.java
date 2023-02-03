public class SoalNo4 {
    // 4. Lengkapi code di bawah ini dengan kondisi yang ditulis secara berurutan dimulai dengan umur diatas 17 tahun,
    // sedang bekerja, dan memiliki jenis kelamin perempuan.
    // Tulis tanpa menggunakan method (primitive way) dan tanpa menggunakan spasi antar kondisi!
    public static void main(String[] args) {
        int umur = 22;
        boolean isBekerja = true;
        // gender code: F / M
        String gender = "F";
        String result;
        if (umur>17&&isBekerja&&gender.equals("F")){
            result = "Perempuan cukup umur mapan";
        }else{
            result = "Bukan Perempuan perempuan cukup umur mapan";
        }
        System.out.println(result);
    }
}