
class Solution {
    ArrayList<Integer> num = new ArrayList<>(); 
   
    void fun(TreeNode root ){
        if(root==null)return ;
        fun(root.left);
        num.add(root.val);
        fun(root.right);
        
    }
public boolean findTarget(TreeNode root, int k) {
    fun(root);
int i=0;
int j=num.size()-1;
while(i<j){
    int sum=num.get(i)+num.get(j);
    if(sum==k){
        return true;
    }else if(sum<k){
        i++;
    }else{
        j--;
    }
}
return false;
    }

}