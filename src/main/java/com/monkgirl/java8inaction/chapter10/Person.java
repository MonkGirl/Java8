package com.monkgirl.java8inaction.chapter10;

import java.util.Optional;

public class Person{
    private Optional<Car> car;

    public  Optional<Car> getCar(){
	return car;
    }
}
