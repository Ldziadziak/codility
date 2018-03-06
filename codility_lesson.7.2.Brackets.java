// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int size = S.length();
        
        if (size % 2 != 0) { // 
            return 0;
            
        }
        else {
            char[] chars = S.toCharArray(); //chop string to chars
            int a = 0, b = 0, c = 0;
            
            for (int i=0; i<size/2; i++){  //we need check only half chain
                switch (chars[i]){
                    case '(':
                        if (chars[size - i - 1] == ')') {
                            a++;
                        }
                        else return 0;
                        
                        break;
                    case ')':
                        if (chars[size - i - 1] == '(') {
                            a--;
                        }
                        else return 0;
                        break;
                    case '[':
                        if (chars[size - i - 1] == ']') {
                            b++;
                        }
                        else return 0;
                        break;
                    case ']':
                        if (chars[size - i - 1] == '[') {
                            b--;
                        }
                        else return 0;
                        break;
                    case '{':
                        if (chars[size - i - 1] == '}') {
                            c++;
                        }
                        else return 0;
                        break;
                    case '}':
                        if (chars[size - i - 1] == '{') {
                            c--;
                        }
                        else return 0;
                        break;
                    default:
                        return 0;
                }
            if (a < 0 || b < 0 || c < 0) return 0;    
            }
        }
    return 1;
    }
}