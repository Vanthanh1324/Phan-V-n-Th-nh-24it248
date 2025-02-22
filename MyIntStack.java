package OOP8baitap;
public class MyIntStack {
    private int[] contents;
    private int tos;

    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public boolean push(int element) {
        if (isFull()) {
        }
        contents[++tos] = element;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }

    private void expandCapacity() {
        int newSize = contents.length * 2;
        int[] newContents = new int[newSize];
        System.arraycopy(contents, 0, newContents, 0, contents.length);
        contents = newContents;
    }

    public int size() {
        return tos + 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= tos; i++) {
            sb.append(contents[i]);
            if (i < tos) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

class TestMyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack sau khi push: " + stack);
        
        stack.push(60);
        System.out.println("Stack sau khi mở rộng và push 60: " + stack);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack sau khi pop: " + stack);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Stack isEmpty? " + stack.isEmpty());
        System.out.println("Stack isFull? " + stack.isFull());
    }
}
