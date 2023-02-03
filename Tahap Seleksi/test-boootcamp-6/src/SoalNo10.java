public class SoalNo10 {
    // 10. Tulis value akhir dari variable result!
    String result = "";

    public static void main(String[] args) {
        SoalNo10 p = new SoalNo10();
        p.start();
    }

    void start(){
        String s1 = "slip";
        String s2 = fix(s1);
        result = s1 + " " + s2;
        System.out.println(result); // slip stream
    }

    String fix(String s1){
        s1= s1+"Stream";
        result = s1+ " ";
        return "stream";
    }
}
