import java.util.LinkedHashSet;
import java.util.Set;

public class SoalNo8 {
    // Tuliskan value akhir dari variable s!
    //Contoh penulisan jawaban : [9,3,5,1]
    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        s.add("1");
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(s); // [1,1,3,2]
    }
}
