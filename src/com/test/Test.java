package com.test;

public class Test {

    public void dummy() {

        new B().x = 5;

        new SB().x = 5; //access field by instance

        SB.sx = 5; //access static
    }

    private class B {
        private int x;

    }

    private static class SB {

        private SB() {}

        private static int sx;

        private int x;

    }

}