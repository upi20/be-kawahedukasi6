public class Looping {
    public static void main(String[] args) {
        // 3. Looping
        //Tulis program untuk mencetak angka dari 1 hingga 100. Tetapi untuk kelipatan tiga, cetak Kawah alih-alih angka,
        // dan kelipatan lima, cetak Edukasi. Untuk angka yang merupakan kelipatan dari tiga dan lima, cetak KawahEdukasi.
        // 1,2,Kawah,4,Edukasi,Kawah,7,8,Kawah,Edukasi,11,Kawah,13,14,KawahEdukasi,16....
        for (int i = 1; i <= 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("KawahEdukasi, ");
            }else if (i % 3 == 0){
                System.out.print("Kawah, ");
            }else if (i % 5 == 0){
                System.out.print("Edukasi, ");
            }else{
                System.out.print(i+", ");
            }
        }

        // Output:
        // 1, 2, Kawah, 4, Edukasi, Kawah, 7, 8, Kawah, Edukasi,
        // 11, Kawah, 13, 14, KawahEdukasi, 16, 17, Kawah, 19, Edukasi,
        // Kawah, 22, 23, Kawah, Edukasi, 26, Kawah, 28, 29, KawahEdukasi,
        // 31, 32, Kawah, 34, Edukasi, Kawah, 37, 38, Kawah, Edukasi,
        // 41, Kawah, 43, 44, KawahEdukasi, 46, 47, Kawah, 49, Edukasi,
        // Kawah, 52, 53, Kawah, Edukasi, 56, Kawah, 58, 59, KawahEdukasi,
        // 61, 62, Kawah, 64, Edukasi, Kawah, 67, 68, Kawah, Edukasi,
        // 71, Kawah, 73, 74, KawahEdukasi, 76, 77, Kawah, 79, Edukasi,
        // Kawah, 82, 83, Kawah, Edukasi, 86, Kawah, 88, 89, KawahEdukasi,
        // 91, 92, Kawah, 94, Edukasi, Kawah, 97, 98, Kawah, Edukasi,
    }
}
