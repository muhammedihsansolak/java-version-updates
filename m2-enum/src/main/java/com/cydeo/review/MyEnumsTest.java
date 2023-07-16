package com.cydeo.review;

enum MyEnums
{
    AAA, BBB, CCC;
     
    @Override
    public String toString()
    {
        return ordinal()+" : "+name();
    }
}
 
public class MyEnumsTest
{
    public static void main(String[] args)
    {           
        System.out.println(MyEnums.AAA);
         
        System.out.println(MyEnums.BBB);
         
        System.out.println(MyEnums.CCC);
    }
}