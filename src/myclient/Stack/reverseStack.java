package myclient.Stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> temp = new Stack<>();
        while (rt.size() > 0){
            temp.push(rt.pop());
        }
        System.out.println(temp);
        while (temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
