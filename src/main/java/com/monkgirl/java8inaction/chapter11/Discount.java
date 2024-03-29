
package com.monkgirl.java8inaction.chapter11;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

public class Discount{
    public enum Code{
	NONE(0), SILVER(5), GOLD(10), PLATINUM(15), DIAMOND(20);

	private final int percentage;

	Code(int percentage){
	    this.percentage = percentage;
	}
    }

    public static String applyDiscount(Quote quote){
	return quote.getShopName() + " price is " +
	    Discount.apply(quote.getPrice(), quote.getDiscountCode());
    }

    private static double apply(double price, Code code){
	delay();
	return format(price * (100 - code.percentage) / 100);
    }

    private static void delay(){
	try{
	    TimeUnit.SECONDS.sleep(5);
	}catch(Exception e){
	    
	}
    }

    public static double format(double d){
	BigDecimal bd = BigDecimal.valueOf(d);
	return bd.setScale(2, bd.ROUND_HALF_UP).doubleValue();
    }

}
