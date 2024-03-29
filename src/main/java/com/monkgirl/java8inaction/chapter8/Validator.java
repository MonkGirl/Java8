package com.monkgirl.java8inaction.chapter8;

public class Validator{
    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy){
	this.strategy = strategy;
    }

    public boolean validate(String str){
	return strategy.execute(str);
    }
}
