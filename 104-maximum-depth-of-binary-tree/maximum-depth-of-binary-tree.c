/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root) {
    if(root==NULL){
        return 0;
    }
    int lefth = maxDepth(root->left);
    int righth = maxDepth(root->right);
    
    return 1 + (lefth>righth?lefth:righth);
}