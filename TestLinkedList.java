package main;

import linkedlist.*;

public class TestLinkedList {

	public static void main(String[] args) {

		//Create a GenericLinkedList to hold Integers
		GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
		GenericNode<Integer> integerNode1 = new GenericNode<>();
		integerNode1.setData(9);
		integerList.addNode(integerNode1);
		GenericNode<Integer> integerNode2 = new GenericNode<>();
		integerNode2.setData(7);
		integerList.addNode(integerNode2);
		GenericNode<Integer> integerNode3 = new GenericNode<>();
		integerNode3.setData(8);
		integerList.addNode(integerNode3);
		
		System.out.print("Integer List: ");
		GenericNode<Integer> integerCurrent = integerList.getList();
		while(integerCurrent != null) {
			System.out.print(integerCurrent.getData() + " ");
			integerCurrent = integerCurrent.getNextNode();
		}
		
		System.out.println("\n_____");
		
		//Create a GenericLinkedList to hold Doubles
		GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
		GenericNode<Double> doubleNode1 = new GenericNode<>();
		doubleNode1.setData(1.3);
		doubleList.addNode(doubleNode1);
		GenericNode<Double> doubleNode2 = new GenericNode<>();
		doubleNode2.setData(2.4);
		doubleList.addNode(doubleNode2);
		GenericNode<Double> doubleNode3 = new GenericNode<>();
		doubleNode3.setData(3.5);
		doubleList.addNode(doubleNode3);
				
		System.out.print("Double List: ");
		GenericNode<Double> doubleCurrent = doubleList.getList();
		while(doubleCurrent != null) {
			System.out.print(doubleCurrent.getData() + " ");
			doubleCurrent = doubleCurrent.getNextNode();
		}
				
		System.out.println("\n_____");
				
		//Create a GenericLinkedList to hold String
		GenericLinkedList<String> stringList = new GenericLinkedList<>();
		GenericNode<String> stringNode1 = new GenericNode<>();
		stringNode1.setData("chickens");
		stringList.addNode(stringNode1);
		GenericNode<String> stringNode2 = new GenericNode<>();
		stringNode2.setData("cows");
		stringList.addNode(stringNode2);
		GenericNode<String> stringNode3 = new GenericNode<>();
		stringNode3.setData("horses");
		stringList.addNode(stringNode3);
				
		System.out.print("String List: ");
		GenericNode<String> stringCurrent = stringList.getList();
		while(stringCurrent != null) {
			System.out.print(stringCurrent.getData() + " ");
			stringCurrent = stringCurrent.getNextNode();
		}
				
		System.out.println("\n_____");
				
	
		
	} //end main

} //end class
