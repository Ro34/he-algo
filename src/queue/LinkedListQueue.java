package queue;

import linked_list.ListNode;

import java.util.EmptyStackException;

/* 基于链表实现的队列 */
public class LinkedListQueue {
    private ListNode head, tail;
    private int queueSize = 0;

    public LinkedListQueue(){
        head = null;
        tail = null;
    }

    /* 获取队列的长度 */
    public int getQueueSize(){
        return queueSize;
    }

    /* 判断队列是否为空 */
    public boolean isQueueEmpty(){
        return queueSize==0;
    }
    /* 入队 */
    public void push(int x){
        ListNode node = new ListNode(x);
        if (queueSize == 0){
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        queueSize++;
    }
    /* 出队 */
    public void pop(){
        if(queueSize == 0){
            throw new EmptyStackException();
        } else if (queueSize == 1) {
            head = null;
            tail = null;
            queueSize--;
        }else {
            head = head.next;
            queueSize--;
        }

    }
    /* 访问队首元素 */
    public int peek(){
        return head.val;
    }

    /* 将链表转化为 Array 并返回 */
    public int[] toArray() {
        ListNode node = head;
        int[] result = new int[queueSize];
        for (int i = 0; i < result.length; i++) {
            result[i] = node.val;
            node = node.next;
        }
        return result;
    }

}
