package stack_queue;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayStack {
    private ArrayList<Integer> stack;
    public ArrayStack(){
//        初始化数组
        stack = new ArrayList<>();
    }

    /* 获取栈的长度 */
    public int getStackSize(){
        return stack.size();
    }
    /* 判断栈是否为空 */
    public boolean isStackEmpty(){
        return this.getStackSize() == 0;
    }
    /* 入栈 */
    public void push(int x){

        stack.add(x);
    }
    /* 出栈 */
    public void pop(){
        int lastNodeNum = this.getStackSize()-1;
        if (isStackEmpty()) {
            throw new EmptyStackException();
        }
        stack.remove(lastNodeNum);
    }
    /* 访问栈顶元素 */
    public int peek(){
        int lastNodeNum = this.getStackSize()-1;
        return stack.get(lastNodeNum);
    }
    /* 将 List 转化为 Array 并返回 */
//    public int[] toArray() {
//        int[] result = new int[this.getStackSize()];
//        for (int i = 0; i < this.getStackSize(); i++) {
//            result[i] = stack.get(i);
//        }
//        return result;
//    }
    public Object[] toArray(){
        return stack.toArray();
    }

}
