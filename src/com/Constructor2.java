package com;

public class Constructor2 {
    private int x,y;
    Constructor2(){
        x=5; y=5;
        System.out.println("starter data:\nx="+x+"\ny="+y );
    }
    Constructor2(int x){
        this.x=x+3;
        System.out.println("changed with this x="+this.x);
    }
    Constructor2(int x, int y){
        this(x); this.y=y;
        System.out.println("res:\nx="+this.x+"\ny="+this.y );
    }
}

