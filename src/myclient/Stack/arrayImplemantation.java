package myclient.Stack;

public class arrayImplemantation {
    public static class Stack {
        private  int[] arr = new int[5];
        private int index = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[index] = x;
            index++;
        }
        int peek(){
            if(index == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return  arr[index -1];
        }
        int pop(){
            if(index == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[index-1];
            arr[index-1] = 0;
            index--;
            return top;
        }
        void display(){
            for(int i=0; i<index-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return index;
        }

        boolean isEmpty(){
            if(index == 0) return true;
            else return false;
        }

        boolean isFull(){
            if(index == arr.length) return true;
            else return false;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(21);
        st.push(12);
        st.display();


        st.peek();
        st.display();
    }
}
