package stack;


import linked_list.ListNode;

import java.util.EmptyStackException;

public class LinkedListStack {
    //栈顶元素
    private ListNode stackPeek;
    private int stkSize = 0;

    //构造函数
    public LinkedListStack() {
        stackPeek = null;
    }
    /* 获取栈的长度 */
    public int getStkSize(){
        return stkSize;

    }
    /* 判断栈是否为空 */
    public boolean isEmpty(){
        return getStkSize() == 0;
    }
    /* 入栈 */
    public void push(int x){
        ListNode node = new ListNode(x);
        node.next = stackPeek;
        stackPeek = node;
        stkSize++;
    }
    /* 出栈 */
    public void pop(){

        stackPeek = stackPeek.next;
        stkSize--;
    }
    /* 访问栈顶元素 */
    public int peek(){
        if (stkSize==0){
            throw new EmptyStackException();
        }
        return stackPeek.val;
    }


    /*遍历并打印*/
    public void getStack(){
        ListNode head = stackPeek;
        for (int i = 0; i < stkSize; i++) {
            System.out.print(head.val);
            System.out.print(' ');
            head = head.next;
        }
    }
    /* 将 List 转化为 Array 并返回 */
    public int[] toArray(){
        ListNode head = stackPeek;
        int[] res = new int[stkSize];
        for (int i = 0; i < stkSize; i++) {
            res[i] = head.val;
            head = head.next;
        }


        return res;
    }


}
