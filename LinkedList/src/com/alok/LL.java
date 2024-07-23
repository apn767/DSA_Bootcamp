package com.alok;

import java.util.List;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;
    public LL (){
        this.size = 0;
    }
    public void insertFirst(int val){
        ListNode listNode = new ListNode(val);
        listNode.next = head;
        head = listNode;
        if (tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insert(int val,int index){
       if (index == 0){
           insertFirst(val);
           return;
       }if (index == size){
           insertLast(val);
           return;
        }
       ListNode temp = head;
       for (int i =1;i<index;i++){
           temp = temp.next;
       }
       ListNode listNode =new ListNode(val,temp.next);
       temp.next = listNode;
       size++;
    }
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        ListNode listNode = new ListNode(val);
        tail.next = listNode;
        tail = listNode;
        size++;
    }
    public ListNode find(int value){
        ListNode listNode = head;
        while (listNode != null){
            if (listNode.value == value){
                return listNode;
            }
            listNode = listNode.next;
        }return listNode;
    }
    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        ListNode prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public void insertRec(int val, int index){
        head = inserRec(val,index,head);
    }
    private ListNode inserRec(int val, int index, ListNode listNode){
        if (index == 0){
            ListNode temp = new ListNode(val, listNode);
            size++;
            return temp;
        }
        listNode.next = inserRec(val,index-1, listNode.next);
        return listNode;
    }
    public int deleteLast(){
        if (size<= 1){
            return deleteFirst();
        }
        ListNode secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next= null;
        return val;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public ListNode get(int index){
        ListNode listNode = head;
        for (int i =0;i<index;i++){
            listNode = listNode.next;
        }return listNode;
    }
    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void duplicates(){
        ListNode listNode = head;
        while (listNode.next != null){
            if (listNode.value == listNode.next.value){
                listNode.next = listNode.next.next;
                size--;
            }else{
                listNode = listNode.next;
            }
        }
        tail = listNode;
        tail.next = null;
    }
    public static LL merge(LL first, LL second){
        ListNode f = first.head;
        ListNode s = second.head;
        LL ans = new LL();
        while (f != null && s != null){
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }return ans;
    }
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }return false;
    }
    public int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode temp = slow;
                int length = 0;
               do {
                   temp = temp.next;
                   length ++ ;
               }while (temp!= slow);
                return length;
            }
        }return 0;
    }
    public ListNode detectCycle(ListNode head){
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if (length == 0){
            return  null;
        }
        ListNode f = head;
        ListNode s = head;
        while (length >0){
            s = s.next;
            length--;
        }
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findsq(slow);
            fast = findsq(findsq(fast));

        }while (slow != fast);
        if (slow == 1){
            return true;
        }return false;
    }
    private int findsq(int number){
        int ans = 0;
        while (number >0){
            int rem = number %10;
            ans += rem * rem;
            number /= 10;
        }return ans;
    }
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }return s;
    }
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0){
            return;
        }
        if (col < row){
            ListNode first = get(col);
            ListNode second = get(col+1);
            if (first.value > second.value){
                if (first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first.next;
                } else if (second == tail) {
                    ListNode prev = get(col -1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;

                }else {
                    ListNode prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }bubbleSort(row,col +1);
        }else{
            bubbleSort(row-1,0);
        }
    }
//    private void reverse(ListNode node){
//        if (node == tail){
//            head = tail;
//            return;
//        }
//        reverse(node.next);
//        tail.next = node;
//        tail = node;
//        tail.next = null;
//    }
//    public void reverse(){
//        if (size < 2){
//            return;
//        }
//        ListNode prev = null;
//        ListNode present = head;
//        ListNode next = present.next;
//        while (present != null){
//            present.next = prev;
//            prev = present;
//            present = next;
//            if (next != null){
//                next = next.next;
//            }
//        }
//            head = prev;
//    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0;current != null && i< left -1;i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;
        for (int i = 0;current != null && i< right - left +1;i++){
        current.next = prev;
        prev = current;
        current = next;
        if (next != null){
            next = next.next;
        }
        }
        if (last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headsecond = reverse(mid);
        ListNode rereversehead = headsecond;
        while (head != null && headsecond != null){
            if (head.value != headsecond.value){
                break;
            }
            head = head.next;
            headsecond = headsecond.next;
        }

        reverse(rereversehead);
        return head == null || headsecond == null;
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverse(mid);
        ListNode hf = head;
        while (hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if (hf != null){
            hf.next = null;
        }

    }
    public ListNode reverseKGroup(ListNode head, int k) {

        if (k<=1 || head == null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        while(true){

            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;
            for (int i = 0;current != null && i< k;i++){
                current.next = prev;
                prev = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }
            if (last != null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = current;
            if (current == null){
                break;
            }
            prev = newEnd;
        }return head;
    }
    public ListNode rotateRight(ListNode head, int k) {

        if (k<= 0 || head == null || head.next == null){
            return head;
        }
        ListNode last = head;
        int length = 1;
        while (last.next != null){
            last = last.next;
            length ++ ;
        }
        last.next = head;
        int rotation = k % length;
        int skip = length - rotation;
        ListNode newLast = head;
        for (int i =0; i<skip -1;i++){
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }
    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
