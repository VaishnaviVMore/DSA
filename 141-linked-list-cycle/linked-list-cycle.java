/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer>Hm=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(Hm.containsKey(temp)){
                
                return true;
                
            }
            Hm.put(temp,1);
            temp=temp.next;
        }
        return false;
    }
}