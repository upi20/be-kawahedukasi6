public class SoalNo5 {
//    5. Tulis value akhir dari variable result di bawah ini!
    public static void main(String[] args) {
        String a = " Wild ";
        String b = " Irish ";
        String c = " Rose ";

        String result = a.trim().concat(b.substring(0,3)+c.toUpperCase());
        System.out.println(result); // Wild Ir ROSE ;
    }
}
