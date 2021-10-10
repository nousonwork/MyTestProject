package com.test;

public class PolyMor 
{ 
    public static void main(String[] args) 
    { 
        Ax a = new Bx(); 
        Bx b = new Bx(); 
          
        System.out.println(a.c + " " + a.getValue()  
            + " " + b.getValue() + " " + b.getSuperValue()); 
    } 
} 
  
class Ax 
{ 
    protected char c = 'A'; 
    char getValue() 
    { 
        return c; 
    } 
} 
  
class Bx extends Ax 
{ 
    protected char c = 'B'; 
    char getValue() 
    { 
        return c; 
    } 
    char getSuperValue() 
    { 
        return super.c; 
    } 
} 