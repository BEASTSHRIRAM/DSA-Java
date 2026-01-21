package LinkedList;

public class InterviewQuestions {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeTwoLists(left, right);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dhead = new ListNode();
        ListNode tail = dhead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dhead.next;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode previous=null;
        ListNode current=head;
        while(current!=null){
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    //reverse ll || leetcode
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;
        while(hf!=null&&hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        //next of tail to null
        if(hf!=null){
            hf.next=null;
        }
    }
    //it is also rev
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head != null || k <= 1) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while (true) {
            ListNode check=current;
            for(int i=0;i<k;i++){
                if(check==null){
                    return head;
                }
                check=check.next;
            }
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;
            if(current==null){
                break;
            }
            prev=newEnd;
        }
        return head;
    }
    //reverse alternate k group
    public ListNode reverseAltKGroup(ListNode head, int k) {
        if (head != null || k <= 1) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current!=null) {
            ListNode check=current;
            for(int i=0;i<k;i++){
                if(check==null){
                    return head;
                }
                check=check.next;
            }
            ListNode last = prev;
            ListNode newEnd = current;

            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;
            //skip the k nodes
            for(int i=0;current!=null&&i<k;i++){
                prev=current;
                current=current.next;
            }
        }
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        //keep in mind rotations==k%l like if someone asks rotate it 12 times meanwhile the lenght  is 6 just return head
        if(k<=0||head==null ||head.next==null){
            return head;
        }
        //first find the lastnode
        ListNode last=head;
        int length=1;
        while(last.next!=null){
            last=last.next;
            length++;
        }
        last.next=head;
        int rotations=k%length;
        int skip=length-rotations;
        ListNode newLast=head;
        for(int i=0;i<skip-1;i++){
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;
        return head;

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
}
