package Arrays_DSA;

public class stack_using_array {
    int top;
    int[] arr;
    int capacity;

    public stack_using_array(int capacity) {
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    void push(int data) {
        if (top == capacity - 1) {
            System.out.println("stack is full");
        }
        top++;
        arr[top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("stack is empty");
        }
        int ans = arr[top];
        top--;
        return ans;
    }

    int peek() {
        if (top == -1) {
            System.out.println("stack is empty");
        }
        return arr[top];
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    int size() {

        return arr.length;

    }

    public static void main(String[] args) {
        stack_using_array abhi = new stack_using_array(4);
        abhi.push(34);
        abhi.push(55);
        abhi.push(11);
        abhi.push(54);
        abhi.pop();
        // abhi.push(5553);
        int l = abhi.size();
        // for (int i = 0; i < l; i++) {

        // System.out.print(abhi.pop() + " ");
        // }
        System.out.println(abhi.size());
    }

}
