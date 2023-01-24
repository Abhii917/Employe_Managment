package Arrays_DSA;

public class Mystack {
    int size;
    int top;
    int[] arr;

    public Mystack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("full");
        }
        top++;
        arr[top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("empty");

        }
        int res = arr[top];
        top--;
        return res;

    }

    int peek() {
        if (top == -1) {
            System.out.println("empty");
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Mystack ab = new Mystack(2);
        ab.push(12);

    }

}
