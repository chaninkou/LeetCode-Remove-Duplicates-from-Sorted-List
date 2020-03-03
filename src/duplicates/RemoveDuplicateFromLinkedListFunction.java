package duplicates;

public class RemoveDuplicateFromLinkedListFunction {
    public ListNode deleteDuplicates(ListNode head) {
    	// Get reference to the head, never want to mess with origin head
        ListNode current = head;
        
        // In case there is no node at the original array
        if(current == null){
            return head;
        }
        
        // Move the pointer to next or next next
        while(current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return head;
    }
    
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode dummy = head;
        ListNode current = dummy;
        
        if(head == null){
            return head;
        }
        
        while(current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return dummy;
    }
}
