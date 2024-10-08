package com.monkgirl.java8inaction.common;

import java.util.Arrays;
import java.util.List;

/**
 * 菜单.
 *
 * @author MissYoung
 * @version 0.1
 * @since 2024-08-30 11:20:55
 */
public final class Menu {
    private Menu() {

    }

    /**
     * 菜单列表.
     */
    public static final List<Dish> MENU = Arrays.asList(
            new Dish(800, "pork", Dish.Type.MEAT, false),
            new Dish(900, "beef", Dish.Type.MEAT, false),
            new Dish(500, "chicken", Dish.Type.MEAT, false),
            new Dish(530, "french fries", Dish.Type.OTHER, true),
            new Dish(350, "rice", Dish.Type.OTHER, true),
            new Dish(120, "season fruit", Dish.Type.OTHER, true),
            new Dish(550, "pizza", Dish.Type.OTHER, true),
            new Dish(300, "prawns", Dish.Type.FISH, true),
            new Dish(450, "salmon", Dish.Type.FISH, true)
    );
}
