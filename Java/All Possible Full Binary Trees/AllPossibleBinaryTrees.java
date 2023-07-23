class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> result = new ArrayList<>();

        if(n == 1){
            result.add(new TreeNode(0));
        } else if (n % 2 == 1){
            for(int i = 0; i < n; i++){
                for(TreeNode left : allPossibleFBT(i)){
                    for(TreeNode right: allPossibleFBT(n - i - 1)){
                        TreeNode node = new TreeNode(0);
                        node.left = left;
                        node.right = right;
                        result.add(node);
                    }
                }
            }
        }

        return result;
    }
}