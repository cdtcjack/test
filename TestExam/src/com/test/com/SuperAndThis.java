package com.test.com;

public class SuperAndThis {
	public static void main(String[] args)
    {
        A a=new B();
    }
}

class A{
    public A(){
        this(10);
        System.out.println(1);
    }
    public A(int a){
        System.out.println(2);
    }
    public  A(String str){
        System.out.println(3);
    }
}
class  B extends A{
    public B(){
        this(2);
        System.out.println(6);
    }
    public B(int a){
        super("");
        B b=new B("");
        System.out.println(5);
    }
    public B(String string){
        System.out.println(4);
    }
}
