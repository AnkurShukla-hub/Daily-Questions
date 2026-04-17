import java.util.*;
class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        String str=new String();
        while(!st.isEmpty()){
            str=str+(st.pop());
        }
        return str;
    }
}