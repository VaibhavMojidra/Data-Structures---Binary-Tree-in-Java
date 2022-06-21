import vaibhavmojidra.dataitem.IntegerKeyStringValueDataItem;

public class BinaryTree {
	
	private TreeNode root;
	
	public void insert(IntegerKeyStringValueDataItem data) {
		root=insertUsingRecursion(root,data);
//		insertUsingLoop(data);
//		System.out.println("\n");
	}
	
	public void delete(TreeNode node,int key) {
		root=deleteByRecursion(node, key);
	}
	
	public TreeNode insertUsingRecursion(TreeNode node,IntegerKeyStringValueDataItem data) { //O(log n)
		if(node==null) {
			node=new TreeNode(null,null,data);
			System.out.println("Node Added: "+data.getKey()+"\n");
			return node;
		}
		
		System.out.println("Current Node:"+node.getData().getKey());
		
		if(data.getKey()<node.getData().getKey()) {
			System.out.println("Moved Left");
			node.setLeftTreeNode(insertUsingRecursion(node.getLeftTreeNode(), data));
		}else {
			System.out.println("Moved Right");
			node.setRightTreeNode(insertUsingRecursion(node.getRightTreeNode(), data));
		}
		
		return node;
	}
	
	public void preOrderTraverse(TreeNode currentNode) { //O(log n)
		if(currentNode==null) {
			return;
		}
		System.out.println("Current Node Key: "+currentNode.getData().getKey()+" Current Node Value:"+currentNode.getData().getValue()+"\n");
		preOrderTraverse(currentNode.getLeftTreeNode());
		preOrderTraverse(currentNode.getRightTreeNode());
	}
	
	public void postOrderTraverse(TreeNode currentNode) { //O(log n)
		if(currentNode==null) {
			return;
		}
		postOrderTraverse(currentNode.getLeftTreeNode());
		postOrderTraverse(currentNode.getRightTreeNode());
		System.out.println("Current Node Key: "+currentNode.getData().getKey()+" Current Node Value:"+currentNode.getData().getValue()+"\n");
	}
	
	public void inOrderTraverse(TreeNode currentNode) { //O(log n)
		if(currentNode==null) {
			return;
		}
		inOrderTraverse(currentNode.getLeftTreeNode());
		System.out.println("Current Node Key: "+currentNode.getData().getKey()+" Current Node Value:"+currentNode.getData().getValue()+"\n");
		inOrderTraverse(currentNode.getRightTreeNode());
	}
//	public void insertUsingLoop(IntegerKeyStringValueDataItem data) { // O(log n)
//		if(root==null) {
//			root=new TreeNode(null,null,data);
//			System.out.println("Node Added: "+data.getKey());
//			return;
//		}
//		
//		TreeNode currentNode=root;
//		
//		while(true) {
//			if(data.getKey()<currentNode.getData().getKey()) {
//				System.out.println("Moved Left");
//				if(currentNode.getLeftTreeNode()==null) {
//					currentNode.setLeftTreeNode(new TreeNode(null,null, data));
//					System.out.println("Node Added: "+data.getKey());
//					break;
//				}
//				System.out.println("Current Node: "+currentNode.getData().getKey());
//				currentNode=currentNode.getLeftTreeNode();
//			}
//			else {
//				System.out.println("Moved Right");
//				if(currentNode.getRightTreeNode()==null) {
//					currentNode.setRightTreeNode(new TreeNode(null,null, data));
//					System.out.println("Node Added: "+data.getKey());
//					break;
//				}
//				System.out.println("Current Node: "+currentNode.getData().getKey());
//				currentNode=currentNode.getRightTreeNode();
//			}
//		}
//	}
	
	
	public TreeNode deleteByRecursion(TreeNode node,int key) { //O(log n)
		if(node==null) {
			return null;
		}
		if(key<node.getData().getKey()) {
			node.setLeftTreeNode(deleteByRecursion(node.getLeftTreeNode(),key));
		}else if(key>node.getData().getKey()) {
			node.setRightTreeNode(deleteByRecursion(node.getRightTreeNode(),key));
		}
		else {
			
			//If No Child
			if(node.getLeftTreeNode()==null && node.getRightTreeNode()==null) {
				return null;
			}
			//If has right child
			else if(node.getLeftTreeNode()==null){
				return node.getRightTreeNode();
			}
			//If has left child
			else if(node.getRightTreeNode()==null) {
				return node.getLeftTreeNode();
			}
			//If have both child
			else {
				TreeNode successor= getSuccessor(node);
				node.setData(successor.getData());
				node.setRightTreeNode(deleteByRecursion(node.getRightTreeNode(),successor.getData().getKey()));
			}
		}
		return node;
	}
	
	public TreeNode getSuccessor(TreeNode node) {
		if(node==null) {
			return null;
		}
		TreeNode temp=node.getRightTreeNode();
		while(temp.getLeftTreeNode()!=null) {
			temp=temp.getLeftTreeNode();
		}
		return temp;
	}
	
	public TreeNode getRoot() {
		return root;
	}
}
