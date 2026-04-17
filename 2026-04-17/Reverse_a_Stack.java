import java.util.*;
class Reverse_a_Stack {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        pushAtBottom(st,top);
    }
    public static void pushAtBottom(Stack<Integer>st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,data);
        st.push(top);
        // return st;
    }
}
