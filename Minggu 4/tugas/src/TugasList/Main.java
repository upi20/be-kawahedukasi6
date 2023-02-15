package TugasList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //2. List
        //a. List Nama makanan minimal 10 data
        List<String> makananList = new ArrayList<>(List.of("Gorengan", "Batagor",
                "Cilok", "Baso",
                "Mie Ayam", "Kebab",
                "Dimsum", "Seblak",
                "Basreng", "Martabak"));
        System.out.println("List Makanan:");
        System.out.println(makananList);
        // output: [Gorengan, Batagor, Cilok, Baso, Mie Ayam, Kebab, Dimsum, Seblak, Basreng, Martabak]

        //b. List Tahun Piala Dunian minimal 3 data
        List<Integer> pialaDuniaList = new ArrayList<>();
        pialaDuniaList.add(2010);
        pialaDuniaList.add(2014);
        pialaDuniaList.add(2018);
        pialaDuniaList.add(2022);
        System.out.println("\nList Piala Dunia:");
        System.out.println(pialaDuniaList);
        // output: [2010, 2014, 2018, 2022]

        //c. Implement sort pada list nama provinsi minimal 10 data secara descending
        List<String> provinsiList = new ArrayList<>(List.of("ACEH", "SUMATERA UTARA", "SUMATERA BARAT", "RIAU",
                "JAMBI", "SUMATERA SELATAN", "BENGKULU", "LAMPUNG", "KEPULAUAN BANGKA BELITUNG", "KEPULAUAN RIAU",
                "DKI JAKARTA", "JAWA BARAT", "JAWA TENGAH", "DI YOGYAKARTA", "JAWA TIMUR", "BANTEN", "BALI",
                "NUSA TENGGARA BARAT", "NUSA TENGGARA TIMUR", "KALIMANTAN BARAT", "KALIMANTAN TENGAH",
                "KALIMANTAN SELATAN", "KALIMANTAN TIMUR", "KALIMANTAN UTARA", "SULAWESI UTARA",
                "SULAWESI TENGAH", "SULAWESI SELATAN", "SULAWESI TENGGARA", "GORONTALO",
                "SULAWESI BARAT", "MALUKU", "MALUKU UTARA", "PAPUA BARAT", "PAPUA"));
        System.out.println("\nList Data Provinsi:");
        System.out.println(provinsiList);
        // output: [ACEH, SUMATERA UTARA, SUMATERA BARAT, RIAU, JAMBI, SUMATERA SELATAN, BENGKULU, LAMPUNG, KEPULAUAN BANGKA BELITUNG, KEPULAUAN RIAU, DKI JAKARTA, JAWA BARAT, JAWA TENGAH, DI YOGYAKARTA, JAWA TIMUR, BANTEN, BALI, NUSA TENGGARA BARAT, NUSA TENGGARA TIMUR, KALIMANTAN BARAT, KALIMANTAN TENGAH, KALIMANTAN SELATAN, KALIMANTAN TIMUR, KALIMANTAN UTARA, SULAWESI UTARA, SULAWESI TENGAH, SULAWESI SELATAN, SULAWESI TENGGARA, GORONTALO, SULAWESI BARAT, MALUKU, MALUKU UTARA, PAPUA BARAT, PAPUA]

        System.out.println("\nList Data Provinsi Sort Descending:");
        provinsiList.sort(Comparator.reverseOrder());
        System.out.println(provinsiList);
        // output: [SUMATERA UTARA, SUMATERA SELATAN, SUMATERA BARAT, SULAWESI UTARA, SULAWESI TENGGARA, SULAWESI TENGAH, SULAWESI SELATAN, SULAWESI BARAT, RIAU, PAPUA BARAT, PAPUA, NUSA TENGGARA TIMUR, NUSA TENGGARA BARAT, MALUKU UTARA, MALUKU, LAMPUNG, KEPULAUAN RIAU, KEPULAUAN BANGKA BELITUNG, KALIMANTAN UTARA, KALIMANTAN TIMUR, KALIMANTAN TENGAH, KALIMANTAN SELATAN, KALIMANTAN BARAT, JAWA TIMUR, JAWA TENGAH, JAWA BARAT, JAMBI, GORONTALO, DKI JAKARTA, DI YOGYAKARTA, BENGKULU, BANTEN, BALI, ACEH]

        //d. Implement penghapusan data pada sebuah list
        System.out.println("\nList Data Provinsi Hapus data Indeks ke 0:");
        provinsiList.remove(0);
        System.out.println(provinsiList);
        // output: [SUMATERA SELATAN, SUMATERA BARAT, SULAWESI UTARA, SULAWESI TENGGARA, SULAWESI TENGAH, SULAWESI SELATAN, SULAWESI BARAT, RIAU, PAPUA BARAT, PAPUA, NUSA TENGGARA TIMUR, NUSA TENGGARA BARAT, MALUKU UTARA, MALUKU, LAMPUNG, KEPULAUAN RIAU, KEPULAUAN BANGKA BELITUNG, KALIMANTAN UTARA, KALIMANTAN TIMUR, KALIMANTAN TENGAH, KALIMANTAN SELATAN, KALIMANTAN BARAT, JAWA TIMUR, JAWA TENGAH, JAWA BARAT, JAMBI, GORONTALO, DKI JAKARTA, DI YOGYAKARTA, BENGKULU, BANTEN, BALI, ACEH]


    }
}
