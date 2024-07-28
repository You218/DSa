package myclient.Stack;

import java.util.Stack;

public class insertBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);

        int index = 2;
        int ele = 7;
        Stack<Integer> temp  = new Stack<>();

        while (st.size() > index){
            temp.push(st.pop());
        }
        st.push(ele);

        while (temp.size() > 0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }

}
