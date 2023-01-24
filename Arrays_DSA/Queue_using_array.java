package Arrays_DSA;

public class Queue_using_array {

    static class queue {
        static int arr[] = new int[5];
        static int size = arr.length;
        static int rear = -1;

        public static boolean empty() {
            return rear == -1;
        }

        // enque(add)
        public static void enq(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // dedueue(rempve)
        public static int dq() {
            if (empty()) {
                System.out.println("queue if empty");
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            return front;
        }

        // peek(elemrnt at front of queue)
        public static int peek() {
            if (empty()) {
                System.out.println("queue if empty");
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {

        queue ab = new queue();
        ab.enq(43);
        ab.enq(65);
        ab.enq(43);
        ab.enq(765);
        ab.enq(543);

        while (rear != -1) {

        }

    }

}
