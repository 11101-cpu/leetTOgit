/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode* current = head;
    struct ListNode* runner;
    struct ListNode* del;
    while(current!=NULL){
    runner=current;
    while(runner->next != NULL){
       if(runner->next->val == current->val){
        del = runner->next;
        runner->next=runner->next->next;
        
        free(del);

       }  
       else{
        runner=runner->next;
       }    }
       current=current->next;
    }
    return head;
 }