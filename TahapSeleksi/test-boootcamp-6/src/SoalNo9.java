import java.util.ArrayList;
import java.util.List;

public class SoalNo9 {
    //9. Lengkapi kode di bawah ini dengan method clear
    // agar value dari total bernilai 2!
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.clear(); // jawaban
        arrayList.add("b");
        arrayList.add("b");
        Integer total = arrayList.size();
        System.out.println(total);
    }
}
