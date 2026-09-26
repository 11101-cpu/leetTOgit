struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {

    struct ListNode* fast = head;
    struct ListNode* slow = head;
    struct ListNode* del;

    // Move fast n positions
    for (int i = 0; i < n; i++) {
        fast = fast->next;
    }

    // If fast is NULL, we need to delete the head
    if (fast == NULL) {
        del = head;
        head = head->next;
        free(del);
        return head;
    }

    // Move both pointers
    while (fast->next != NULL) {
        slow = slow->next;
        fast = fast->next;
    }

    // Delete slow->next
    del = slow->next;
    slow->next = slow->next->next;
    free(del);

    return head;
}