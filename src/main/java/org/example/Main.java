package org.example;


public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("It");
        myArrayList.add("should");
        myArrayList.add("work");
        myArrayList.add("fine");
        for(int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.getSize());
        myArrayList.remove(2);
        for(int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
        myArrayList.clear();
        for(int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println("------------------");

        MyLinkedList<String> myLinkedList = new MyLinkedList <>();
        myLinkedList.add("This");
        myLinkedList.add("is");
        myLinkedList.add("my");
        myLinkedList.add("LinkedList");
        for(int i = 0; i < myLinkedList.getSize(); i++){
            System.out.println(myLinkedList.get(i));
        }
        myLinkedList.remove(2);
        System.out.println(myLinkedList.getSize());
        for(int i = 0; i < myLinkedList.getSize(); i++){
            System.out.println(myLinkedList.get(i));
        }
        myLinkedList.clear();
        System.out.println("------------------");

        MyQueue<Integer> myQueue = new MyQueue <>();
        myQueue.add(31);
        myQueue.add(2);
        myQueue.add(8);
        myQueue.add(10);
        System.out.println("peek:" + myQueue.peek());
        System.out.println("poll:" + myQueue.poll());
        System.out.println("peek after poll:" + myQueue.peek());
        System.out.println("size:" + myQueue.getSize());
        System.out.println("------------------");

        MyStack<Integer> myStack = new MyStack <>();
        myStack.push(22);
        myStack.push(11);
        myStack.push(7);
        System.out.println("peek:" + myStack.peek());
        System.out.println("size:" + myStack.getSize());
        System.out.println("pop:" + myStack.pop());
        System.out.println("peek after pop:" + myStack.peek());
        myStack.push(2);
        myStack.push(5);
        myStack.push(9);
        myStack.push(10);
        System.out.println("peek:" + myStack.peek());
        System.out.println("size:" + myStack.getSize());
        myStack.remove(3);
        System.out.println("size:" + myStack.getSize());
        myStack.clear();
        System.out.println("peek:" + myStack.peek());
        System.out.println("------------------");

        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("Apple", "Fruit");
        myHashMap.put("Cucumber", "Vegetable");
        myHashMap.put("Watermelon", "Berrie");
        System.out.println(myHashMap.getSize());
        System.out.println(myHashMap.get("Apple"));
        System.out.println(myHashMap.get("Cucumber"));
        myHashMap.remove("Apple");
        System.out.println("size after remove: " + myHashMap.getSize());
        myHashMap.clear();
        System.out.println("size after clear: " + myHashMap.getSize());








    }
}