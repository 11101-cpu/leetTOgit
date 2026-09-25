/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    struct ListNode* slow =head;
    struct ListNode* fast = head;
    while(fast!=NULL && fast->next!=NULL){
       slow=slow->next;
        fast=fast->next->next;
        if(fast==slow){
           /* slow=head;
            while(fast!=slow){
                fast=fast->next;
                slow=slow->next;
            }*/
            return true;
        }
        
    }
    return false;
}