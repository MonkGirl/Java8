package com.monkgirl.java8InAction.common;

public class MyLinkedList<T> implements MyList<T>{
    private final T head;

    private final MyList<T> tail;

    public MyLinkedList(T head, MyList<T> tail){
	this.head = head;
	this.tail = tail;
    }

    public T head(){
	return head;
    }

    public MyList<T> tail(){
	return tail;
    }

    public boolean isEmpty(){
	return false;
    }
}
