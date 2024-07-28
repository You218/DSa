package myclient.Stack;

import java.util.Stack;

public class recursiveStack {
    static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    static void recuStack(Stack<Integer> stack){
        if(stack.size() == 1) return;
;
        int top = stack.pop();
        recuStack(stack);
        pushAtBottom(stack, top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
         recuStack(st);
        System.out.println(st);

    }
}
