import java.util.ArrayDeque;
import java.util.Deque;

public class SoalNo12 {
    //   12. Lengkapi program dibawah ini agar value dari result menjadi true!
    static  boolean areBracketBalanced(String expr){
        Deque<Character> stack = new ArrayDeque<Character>(); // 9 = 1

        // Travesing the Expression
        for (int i = 0; i < expr.length(); i++){ // 4 = 2
            char x = expr.charAt(i); // 2 = 3

            if (x == '(' || x == '[' || x == '{'){ // 6 = 4
                stack.push(x); // 7 = 5
            }

            if (stack.isEmpty()){
                return false;
            }

            char check;
            switch (x){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '['){ // 10 = 6
                        return false;
                    }
                    break;

                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '['){ // 8 = 7
                        return false;
                    }
                    break;

                case ']':
                    check = stack.pop();
                    if(check == '(' || check == '{'){ // 3 = 8
                        return false;
                    }
                    break;

            }
        }

        return stack.isEmpty(); // 1 = 9
    }

    // driver code
    public static void main(String[] args) {
        String expr = "([{}])";

        Boolean result = areBracketBalanced(expr); // 5 = 10
        System.out.println(result);
    }
}
