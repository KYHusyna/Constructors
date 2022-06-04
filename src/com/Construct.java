package com;

public class Construct extends Constructor2 {
    Construct() {
        System.out.println("first output\n------------------\n");
    }

    Construct(int x, int y) {
        super(x, y);
        System.out.println("second output\n------------------\n");
    }


    static int x = 3, y = 7;
    static int number = 6;
}

  class ConstructExample {
    int exConstrNumb = 2;
    private String exConstrStr;

    ConstructExample() {
    }

    ;

    ConstructExample(int exConstrNumb) {
        this.exConstrNumb = exConstrNumb;
    }

    void setExConstrNumb() {

        System.out.println(exConstrNumb);
    }

    protected ConstructExample(String exConstrStr) {
        this.exConstrStr = exConstrStr;
    }

    String exConstrStr() {
        return exConstrStr;
    }

}
