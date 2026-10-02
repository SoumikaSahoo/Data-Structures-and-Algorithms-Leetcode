
class Solution {
    List <Integer>ans=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
    
        fun(root);
        return ans;
    }
    void fun(TreeNode node){
        if(node==null)return ;
        ans.add(node.val);
        fun(node.left);
        fun(node.right);
    }

}