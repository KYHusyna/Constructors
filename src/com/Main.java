package com;


public class Main {
    public static void main(String[] args) {

        Construct emptyConstruct = new Construct();

        String words = "numbers";
        ConstructExample firstCall = new ConstructExample();
        ConstructExample secondCall = new ConstructExample(emptyConstruct.number);
        ConstructExample thirdCall = new ConstructExample(words);

        System.out.println("constructor with super: \nbasic x=" + emptyConstruct.x + "\nbasic y=" + emptyConstruct.y);
        Construct withParam = new Construct(emptyConstruct.x, emptyConstruct.y);
        System.out.println("constructor with parameters \ncall empty constructor:");
        firstCall.setExConstrNumb();
        System.out.println("call parameter  :");
        secondCall.setExConstrNumb();
        System.out.println("call protect parameter:");
        System.out.println(thirdCall.exConstrStr());

    }
}