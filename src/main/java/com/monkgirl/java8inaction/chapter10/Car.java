package com.monkgirl.java8inaction.chapter10;

import java.util.Optional;

public class Car{
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance(){
	return insurance;
    }
}
