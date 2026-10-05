class Solution {
    List<Integer>ans=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
inorder(root);
for(int i=0;i<ans.size()-1;i++){
    if(ans.get(i)>=ans.get(i+1)){
        return false;
    }
}
    return true;

        
    }
    public void inorder(TreeNode root){
        if(root==null)return ;
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
       
    }
    }
