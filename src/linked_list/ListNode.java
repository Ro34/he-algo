package linked_list;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(Integer x){
        val = x;
    }
    /*重写ToString()*/

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
