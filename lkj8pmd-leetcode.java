/* Lauren Jackson
   lkj8pmd
   Filename: lkj8pmd-leetcode.java
*/

import java.util.Stack;

class Solution2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else if(stack.empty())
                return false;
            else if(s.charAt(i) == ')') {
                if(stack.pop() != '(')
                    return false;
            }
            else if(s.charAt(i) == '}') {
                if(stack.pop() != '{')
                    return false;
            }
            else if(s.charAt(i) == ']') {
                if(stack.pop() != '[')
                    return false;
            }
        }
        return stack.empty();
    }
}