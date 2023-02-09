import java.util.Scanner;

public class FlowStatementAndOperator {
    public static void main(String[] args) {
        //  2. Flow Statement dan Operator
        // Buatlah program untuk menentukan nama hari yang diinput dari terminal CLI merupakan hari libur atau hari kerja dengan tambahan hari libur nasional. (Sabtu libur)
        // Hari kerja = [senin, selasa, rabu, jumat]
        // Hari libur nasional = [kamis]
        // hari libur = [sabtu, minggu]
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Hari: ");

        String hari = scanner.nextLine();
        if (hari.equalsIgnoreCase("senin") || hari.equalsIgnoreCase("selasa") ||
                hari.equalsIgnoreCase("rabu") || hari.equalsIgnoreCase("jumat"))
        {
            System.out.println("Hari Kerja");
        }
        else if (hari.equalsIgnoreCase("kamis"))
        {
            System.out.println("Hari Libur Nasional");
        }
        else if(hari.equalsIgnoreCase("sabtu") || hari.equalsIgnoreCase("minggu"))
        {
            System.out.println("Hari Libur");
        }
        else
        {
            System.out.println("Hari tidak ditemukan");
        }
    }
}
