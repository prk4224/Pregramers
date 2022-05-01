package Stack;
import java.util.*;

public class Stack04 {

    public static void main(String[] args){
        String p = ")()(()";

        System.out.println(solution(p));
    }


    public static  String solution(String p) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < p.length(); i++){
            if(p.charAt(i) == '(' && (stack.isEmpty() || stack.peek() != ')')){
                stack.push(p.charAt(i));
                answer = answer + p.charAt(i);
            }

            else if((stack.isEmpty() || stack.peek() == ')') && p.charAt(i) == ')'){
                stack.push(p.charAt(i));
                answer = answer + '(';
            }

            else {
                if(stack.peek() == '('){
                    answer = answer + ')';
                    stack.pop();
                }
                else if(stack.peek() == ')'){
                    answer = answer + ')';
                    stack.pop();
                }
            }
        }
        return answer;
    }

}
