package com.chaitrachidanand.ex01_RA_Basic;

public class APITesting002 {
    public void Step1()
    {
        System.out.println("This is step1");
    }
    public void Step2()
    {
        System.out.println("This is step2");
    }
    public void Step3(String name)
    {
        System.out.println("This is step3");
    }

    public static void main(String[] args) {
        APITesting002 ap=new APITesting002();
        ap.Step1();
        ap.Step2();
        ap.Step3("chaia");
    }
}
