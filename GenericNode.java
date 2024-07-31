package linkedlist;

/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data and pointers to the next 
 * node in the list.
 * <T> the type of the data stored in the node
 * 
 * @author rkelley/njohnson/meganCole
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode<T> {
	
	private T data;  //data that the object stores
	private GenericNode <T>nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return the data
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return the current node
	 */
	public GenericNode getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode - the next node to set
	 */
	public void setNextNode(GenericNode nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return next Node 
	 */
	public GenericNode<T >getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class

