package Polimorfizmus;

public class Main {

    public static void main(String[] args) {
        Cat macska = new Cat();
        Cat macska2 = new Cat();
        Cat macska3 = new Cat("Jakab",4);
        //macska.meow();
        System.out.println(macska.equals(macska2));
        macska.makeSound();
        
        macska2.setName("Gizi");
        
        System.out.println(macska.getName());
        System.out.println(macska2.getName());
        System.out.println(macska3.getName() + " " + macska3.getWeight() + " kg");
        
        /*
        int x = 22;    
        byte b = x; ez nem fut le mert a byte kissebb adattípus
        */
        
        /*
        byte x = 22;    
        int b = x; ez igen mert kisebbõl nagyobba töltöm
        */
        
        
        /*
        System.out.println(1+1 + " a " + 1+1);  -->  2 a 11
        */
        
        /*
        char first = 'a';
        int second = 2;
        String third = "" + first;
        String third = "" + second;
        */
    
        
        
   }
    
}
