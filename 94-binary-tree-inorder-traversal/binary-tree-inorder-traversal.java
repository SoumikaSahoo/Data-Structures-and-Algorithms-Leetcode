
class Solution {
     List<Integer>ans=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
    

        fun(root);
        return ans;

    }
    void fun(TreeNode node ){
        if(node==null) return ;
        fun(node.left);
        ans.add(node.val);
        fun(node.right);
        
    }
}