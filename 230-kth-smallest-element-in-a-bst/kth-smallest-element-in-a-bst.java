
class Solution {
     List<Integer>ans=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
      for(int i=0;i<k;i++){
        if(i==k-1){
            return ans.get(i);
        }
      }
      return -1;
}
public void inorder(TreeNode root){
    if(root==null)return ;
    inorder(root.left);
    ans.add(root.val);
    inorder(root.right);
}

    }
