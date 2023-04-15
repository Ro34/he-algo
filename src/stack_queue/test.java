package stack_queue;

import linked_list.ListNode;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
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
}