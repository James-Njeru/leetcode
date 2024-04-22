//Maximum Depth of N-ary Tree
//Given a n-ary tree, find its maximum depth. The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

class Solution {
    int ans;
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        ans=dfs(root);
        return ans;
    }
    public int dfs(Node root){
        if(root==null){
            return 0;
        }
        int maxDepth=0;
        for(Node i : root.children){
            maxDepth=Math.max(maxDepth,dfs(i));
        }
        return 1 + maxDepth;
    }
}
