
bool isPalindrome(struct ListNode* head) {
    struct ListNode* temp = head;
    struct ListNode* copy = NULL;
    struct ListNode* tail = NULL;

    while (temp != NULL) {
        struct ListNode* newNode =
            (struct ListNode*)malloc(sizeof(struct ListNode));

        newNode->val = temp->val;
        newNode->next = NULL;

        if (copy == NULL) {
            copy = newNode;
            tail = newNode;
        } else {
            tail->next = newNode;
            tail = newNode;
        }

        temp = temp->next;
    }

    // Reverse the copied list
    struct ListNode* current = copy;
    struct ListNode* prev = NULL;
    struct ListNode* next = NULL;

    while (current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }

    // Compare original and reversed lists
    temp = head;
    struct ListNode* rev = prev;

    while (temp != NULL && rev != NULL) {
        if (temp->val != rev->val) {
            return false;
        }

        temp = temp->next;
        rev = rev->next;
    }

    return true;
}
