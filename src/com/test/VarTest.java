package com.test;

public class VarTest { 
    int a = 10; 
    static int b = 20; 
  

   public static void main(String[] args) 
    { 
        VarTest t1 = new VarTest(); 
        t1.a = 100; 
        t1.b = 200; 
  
        VarTest t2 = new VarTest(); 
  
        System.out.println("t1.a =" + t1.a + " t1.b =" + t1.b); 
        System.out.println("t2.a =" + t2.a + " t2.b =" + t2.b); 
    } 
} 