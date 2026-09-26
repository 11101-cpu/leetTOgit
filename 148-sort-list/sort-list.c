/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* merge(struct ListNode* l1, struct ListNode* l2) {

    struct ListNode dummy;
    struct ListNode* temp = &dummy;

    dummy.next = NULL;

    while (l1 != NULL && l2 != NULL) {

        if (l1->val <= l2->val) {
            temp->next = l1;
            l1 = l1->next;
        }
        else {
            temp->next = l2;
            l2 = l2->next;
        }

        temp = temp->next;
    }

    if (l1 != NULL)
        temp->next = l1;
    else
        temp->next = l2;

    return dummy.next;
}


struct ListNode* sortList(struct ListNode* head) {

    // 0 or 1 node is already sorted
    if (head == NULL || head->next == NULL) {
        return head;
    }

    // Find middle
    struct ListNode* slow = head;
    struct ListNode* fast = head->next;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }

    // Split into two lists
    struct ListNode* second = slow->next;
    slow->next = NULL;

    // Sort both halves
    struct ListNode* left = sortList(head);
    struct ListNode* right = sortList(second);

    // Merge
    return merge(left, right);
}