public class SoalNo11 {
    // 11. Lengkapi program check anagram di bawah ini
    // agar value result1 adalah true dan value result2 adalah false
    public  static boolean isAnagram(String str1, String str2){
        char[] characters = str1.toCharArray(); // 1
        StringBuilder sb = new StringBuilder(str2);

        for (char ch: characters){
            int index = sb.indexOf(""+ch); // 2
            if (index != -1){
                sb.deleteCharAt(index); // 3
            }
        }

        return sb.length() == 0 ? true : false; // 4
    }

    public static void main(String[] args) {
        Boolean result1 = isAnagram("TABLE", "BLEAT");
        System.out.println(result1);
        Boolean result2 = isAnagram("SHOT", "TOSS");
        System.out.println(result2);
    }
}
