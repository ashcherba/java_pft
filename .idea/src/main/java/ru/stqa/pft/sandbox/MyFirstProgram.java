package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main (String[] args){
       hello("world");

       Square s = new Square(5);
        System.out.println("square square where one side equals = " + s.l + " is: " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("rectangle square where one side equals = " + r.a + " and another one equals " + r.b + " is: " + r.area());
    }

    public static void hello (String smb){
        System.out.println("Hello " + smb);
    }

}
