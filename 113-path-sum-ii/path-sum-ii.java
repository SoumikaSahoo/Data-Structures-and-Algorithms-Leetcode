
class Solution {
     List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        haspath(root,0,targetSum,path);
        return ans;

    }
    public void haspath(TreeNode root,int sum,int targetSum,List<Integer>path){
        if(root==null)return;
        sum=sum+root.val;
        path.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==targetSum){
                ans.add(new ArrayList<>(path));
            }
            path.remove(path.size()-1);
            return;
        }
        haspath(root.left,sum,targetSum,path);
         haspath(root.right,sum,targetSum,path);
         path.remove(path.size()-1);
    }

}