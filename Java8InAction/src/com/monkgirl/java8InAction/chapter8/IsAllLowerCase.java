package com.monkgirl.java8InAction.chapter8;


public class IsAllLowerCase implements ValidationStrategy{

    @Override
    public boolean execute(String str){
	return str.matches("[a-z]+");
    }
}
