/*
 * Copyright (C) 2007-2012, GoodData(R) Corporation. All rights reserved.
 */

public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        System.out.println(Class.forName(args[0]).newInstance());
    }

}
