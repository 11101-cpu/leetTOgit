struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode *temp1 = list1;
    struct ListNode *temp2 = list2;

    if (list1 == NULL) {
        return list2;
    }

    if (list2 == NULL) {
        return list1;
    }

    struct ListNode dummy;
    struct ListNode *temp = &dummy;

    while (temp1 != NULL && temp2 != NULL) {
        if (temp1->val <= temp2->val) {
            temp->next = temp1;
            temp1 = temp1->next;
        } else {
            temp->next = temp2;
            temp2 = temp2->next;
        }

        temp = temp->next;
    }

    if (temp1 != NULL) {
        temp->next = temp1;
    } else {
        temp->next = temp2;
    }

    return dummy.next;
}