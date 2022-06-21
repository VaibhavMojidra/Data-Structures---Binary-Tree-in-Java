import vaibhavmojidra.dataitem.IntegerKeyStringValueDataItem;

public class TreeNode {
	private TreeNode leftTreeNode,rightTreeNode;
	private IntegerKeyStringValueDataItem data;
	
	public TreeNode(TreeNode leftTreeNode, TreeNode rightTreeNode, IntegerKeyStringValueDataItem data) {
		this.leftTreeNode = leftTreeNode;
		this.rightTreeNode = rightTreeNode;
		this.data = data;
	}
	
	public TreeNode() {
		leftTreeNode = rightTreeNode = null;
		data = null;
	}

	public TreeNode getLeftTreeNode() {
		return leftTreeNode;
	}

	public void setLeftTreeNode(TreeNode leftTreeNode) {
		this.leftTreeNode = leftTreeNode;
	}

	public TreeNode getRightTreeNode() {
		return rightTreeNode;
	}

	public void setRightTreeNode(TreeNode rightTreeNode) {
		this.rightTreeNode = rightTreeNode;
	}

	public IntegerKeyStringValueDataItem getData() {
		return data;
	}

	public void setData(IntegerKeyStringValueDataItem data) {
		this.data = data;
	}
	
}
