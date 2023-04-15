package stack_queue;

import java.util.ArrayList;

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
        boolean flag = (this.getStackSize() == 0);
        return flag;
    }
    /* 入栈 */
    /* 出栈 */
    /* 访问栈顶元素 */
    /* 将 List 转化为 Array 并返回 */

}
