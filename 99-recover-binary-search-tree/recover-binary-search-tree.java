class Solution {

    List<TreeNode> ans = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null)return ;
        inorder(root.left);
        ans.add(root);
        inorder(root.right);

    }
 public void recoverTree(TreeNode root) {
inorder(root);
int galat=0;
 TreeNode g1first = null;
        TreeNode g1second = null;
        TreeNode g2first = null;
        TreeNode g2second = null;
for(int i=0;i<ans.size()-1;i++){
if(ans.get(i).val > ans.get(i+1).val){
    if(galat==0){
        g1first=ans.get(i);
        g1second=ans.get(i+1);
        galat++;
    }else{
        g2first=ans.get(i);
        g2second=ans.get(i+1);
        galat++;
    }
}
}
if(galat==1){
    int temp=g1first.val;
    g1first.val=g1second.val;
    g1second.val=temp;
}else{
    int temp=g1first.val;
    g1first.val=g2second.val;
    g2second.val=temp;

}
return;

     
    }
}