package org.example.proxy;

public class Client {
     public static void main(String[] args)
     {
         Image image = new ProxyImage("test.exe");
         image.display();
         System.out.println();
         image.display();
     }
}
