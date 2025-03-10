package com.chaitrachidanand.ex01_RA_Basic;

public class APITesting003_NoDesignPattern {

    public APITesting003_NoDesignPattern Step1()
    {
        System.out.println("this is 1");
        return this;
    }
    public APITesting003_NoDesignPattern Step2()
    {
        System.out.println("this is 2");
        return this;
    }
    public APITesting003_NoDesignPattern Step3(int num)
    {
        System.out.println("this is 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting003_NoDesignPattern a=new APITesting003_NoDesignPattern();
        a.Step1().Step2().Step3(3);
    }
}
