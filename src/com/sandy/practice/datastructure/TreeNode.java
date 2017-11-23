package com.sandy.practice.datastructure;

public class TreeNode {
	
	private TreeNode left;
	private Integer data;
	private TreeNode right;
	public TreeNode(int data) {
		this.left = null;
		this.data = data;
		this.right = null;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer t) {
		this.data = t;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
	
	
	
}
