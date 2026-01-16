package LinkedList;

public class CycleDetection {
    //Amazon and microsoft
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
//length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                //calculate the length
                ListNode temp=slow;
                int length=0;
                do {
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                    return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head){
        int length=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
               length=lengthCycle(slow);
               break;
            }
        }
        if (length==0){
            return null;
        }
        //find the start node
        ListNode f=head;
        ListNode s=head;
        while(length>0){
            s=s.next;
            length--;

        }
        //keep moving bothe forward they will meet at the cycle start
        while (f!=s){
            f=f.next;
            s=s.next;
        }
        return s;

    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do {
            slow = findsquare(slow);
            fast=findsquare(findsquare(fast));
        }
        while(slow!= fast);
        if(slow==1){
            return true;
        }else{
            return false;
        }
    }
    private int findsquare(int n){
        int ans=0;
        while (n>0){
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }

}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


