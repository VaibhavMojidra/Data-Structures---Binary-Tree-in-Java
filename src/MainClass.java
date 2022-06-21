import java.util.ArrayList;

import vaibhavmojidra.dataitem.IntegerKeyStringValueDataItem;
import vaibhavmojidra.dataset.GenerateKeyValuePairListDataSet;

public class MainClass {
	public static void main(String[] args) {
		//ArrayList<IntegerKeyStringValueDataItem> arrayList=new GenerateKeyValuePairListDataSet().generateIntegerKeyStringValueDataItemList(7, true);
		BinaryTree binaryTree=new BinaryTree();
		//System.out.println("\n\n");
		ArrayList<IntegerKeyStringValueDataItem> arrayList=new ArrayList<>();
		
		arrayList.add(new IntegerKeyStringValueDataItem(40,"nxfay"));
		arrayList.add(new IntegerKeyStringValueDataItem(36,"kyhnm"));
		arrayList.add(new IntegerKeyStringValueDataItem(49,"hlcbb"));
		arrayList.add(new IntegerKeyStringValueDataItem(35,"yqzyr"));
		arrayList.add(new IntegerKeyStringValueDataItem(38,"vrlob"));
		arrayList.add(new IntegerKeyStringValueDataItem(51,"fbplv"));
		arrayList.add(new IntegerKeyStringValueDataItem(39,"gklmf"));
		
		for(IntegerKeyStringValueDataItem dataItem:arrayList) {
			binaryTree.insert(dataItem);
		}
		
		binaryTree.preOrderTraverse(binaryTree.getRoot());
		binaryTree.delete(binaryTree.getRoot(), 36);
		System.out.println("Deleted");
		binaryTree.preOrderTraverse(binaryTree.getRoot());
		
	}
}
