package Stack;
import java.util.*;

public class Stack_01 {
        public int solution(String s) {
            int answer = 0;

            Stack<Character> stack = new Stack<>();

            stack.push(s.charAt(0));

            for(int i = 1; i < s.length(); i++){
                if(stack.empty()){
                    stack.push(s.charAt(i));
                }
                else if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }

            if(stack.empty()){
                answer = 1;
            }

            return answer;
        }

}
