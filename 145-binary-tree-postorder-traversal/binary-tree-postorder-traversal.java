
class Solution {
 List<Integer>ans=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
         fun(root);
        return ans;

    }
    void fun(TreeNode node ){
        if(node==null) return ;
        fun(node.left);
        fun(node.right);
         ans.add(node.val);
        
    }
}