package queue;


import java.util.EmptyStackException;

/*由于数组删除首元素的时间复杂度为 O(n)，这会导致出队操作效率较低。然而，我们可以采用以下巧妙方法来避免这个问题。

我们可以使用一个变量 front 指向队首元素的索引，并维护一个变量 queSize 用于记录队列长度。定义 rear = front + queSize ，这个公式计算出的 rear 指向队尾元素之后的下一个位置。

基于此设计，数组中包含元素的有效区间为 [front, rear - 1]，进而：

对于入队操作，将输入元素赋值给 rear 索引处，并将 queSize 增加 1 ；
对于出队操作，只需将 front 增加 1 ，并将 queSize 减少 1 ；*/
public class ArrayQueue {
    private int[] nums;
    private int head;
    private int tail;
    private int queueSize;


    public ArrayQueue() {
        head = 0;
        queueSize = 0;
        tail = head + queueSize;
    }

    /* 获取队列的容量 */

    public int getNumsLength() {
        return nums.length;
    }

    /* 获取队列的长度 */
    public int getQueueSize() {
        return queueSize;
    }

    /* 判断队列是否为空 */
    public boolean isEmpty() {
        return queueSize == 0;
    }

    /* 入队 */
    public void push(int x) {
        if (queueSize == getNumsLength()) {
            System.out.println("Full");
        }
        nums[tail] = x;
        tail++;

    }

    /* 出队 */
    public void pop() {
        head = head ++;
        queueSize--;
    }
    /* 访问队首元素 */
    public int peek(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return nums[head];
    }
    /* 返回数组 */

}
