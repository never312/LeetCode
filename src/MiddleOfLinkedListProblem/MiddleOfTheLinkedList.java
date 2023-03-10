package MiddleOfLinkedListProblem;

import Polindrome.ListNode;

public class MiddleOfTheLinkedList {

    public static ListNode middleNode(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

    }

}
