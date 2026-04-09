/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null){
            return list2 ;
        }
        if(list2==null){
            return list1 ;
        }

        ListNode temp1 = list1 ;
        ListNode temp2 = list2 ;
        ListNode ans = null ;
        ListNode curr = null ;
        while(temp1!=null && temp2!=null){
            ListNode prev1 = temp1.next ;
            ListNode prev2 = temp2.next ;
            if(temp1.val<=temp2.val){
                if(curr==null){
                    curr=temp1 ;
                    ans=temp1;
                }
                else{
                    curr.next = temp1 ;
                    curr=temp1 ;
                }
                temp1=prev1;
            }
            else{
                if(curr==null){
                    curr=temp2 ;
                    ans = temp2 ;
                }
                else{
                    curr.next = temp2 ;
                    curr=temp2 ;
                }
                temp2=prev2 ;
            }
        }

        if(temp1==null && temp2!=null){
            while(temp2!=null){
                curr.next = temp2 ;
                curr= temp2 ;
                temp2=temp2.next ;
            }
        }

        if(temp2==null && temp1!=null){
            while(temp1!=null){
                curr.next = temp1 ;
                curr= temp1 ;
                temp1=temp1.next ;
            }
        }


        return ans ;
    }
}