package com.automationteststore.testCases.Demos.DemoPractice;

public class OverloadMainMethod {

    public static void main(String[] args) {
        OverloadMainMethod om = new OverloadMainMethod();
        om.main(100); //1
        om.main(100, 200);//2

    }

    public void main(int x) //1
    {
        System.out.println(x);
    }

    public void main(int x, int y)//2
    {
        System.out.println(x + y);
    }


}
