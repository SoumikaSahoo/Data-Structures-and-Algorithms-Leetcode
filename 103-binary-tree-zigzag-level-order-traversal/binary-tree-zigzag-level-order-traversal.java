
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      
        List<List<Integer>>ans =new ArrayList<>();
        if(root==null)return ans;

        Queue<TreeNode>q=new LinkedList<>();    
        q.add(root);
          boolean lefttoright=true;
        while(!q.isEmpty()){
            int size=q.size();

            List<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
          if(lefttoright){
            level.add(curr.val);
          }else{
            level.add(0,curr.val);
          }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            }
            ans.add(level);
            lefttoright=!lefttoright;

        }
        return ans;
        
        }
}
    