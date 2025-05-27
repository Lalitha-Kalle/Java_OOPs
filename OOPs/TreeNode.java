public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Main {
    public TreeNode sortedArrayToBST(int[] nums) {
        return generateTree(nums, 0,nums.length-1);
    }
    public TreeNode generateTree(int[] nums, int low, int high) {
        if(low > high ) return null;
        int mid = low + ((high-low) /2);
        TreeNode node = new TreeNode(nums[mid]);
        node.left = generateTree(nums, low, mid - 1);
        node.right = generateTree(nums, mid + 1, high);
        return node;
    }
}