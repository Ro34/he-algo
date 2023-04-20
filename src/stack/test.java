package stack;



import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        arrayStackTest();
    }

    public static void linkedListTest(){
        System.out.println("test start");
        LinkedListStack stack1 = new LinkedListStack();
        int size1 = stack1.getStkSize();
        boolean empty1 = stack1.isEmpty();
        System.out.println(size1);
        System.out.println(empty1);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        stack1.getStack();
        size1 = stack1.getStkSize();
        empty1 = stack1.isEmpty();
        System.out.print("size:");
        System.out.println(size1);
        System.out.print("是否为空:");
        System.out.println(empty1);
        System.out.println(stack1.peek());
        stack1.pop();
        stack1.getStack();
        System.out.println(Arrays.toString(stack1.toArray()));
    }

    public static void arrayStackTest(){
        ArrayStack stack2 = new ArrayStack();
        int size2 = stack2.getStackSize();
        boolean empty2 = stack2.isStackEmpty();
        System.out.println(size2);
        System.out.println(empty2);
        stack2.push(10);
        stack2.push(30);
        System.out.println(stack2.peek());
        size2 = stack2.getStackSize();
        empty2 = stack2.isStackEmpty();
        System.out.println(size2);
        System.out.println(empty2);
        stack2.pop();
        size2 = stack2.getStackSize();
        empty2 = stack2.isStackEmpty();
        System.out.println(size2);
        System.out.println(empty2);
        Object[] stack2Array = new ArrayList[]{new ArrayList<Integer>()};
        stack2Array = stack2.toArray();


    }
}