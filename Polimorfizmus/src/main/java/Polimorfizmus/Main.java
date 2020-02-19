package Polimorfizmus;

import java.util.ArrayList;

public class Main {
//    
//    public static void main(String[] args) {
//        Cat macska = new Cat();
//        Cat macska2 = new Cat();
//        Cat macska3 = new Cat("Jakab",4);
//        //macska.meow();
//        System.out.println(macska.equals(macska2));
//        macska.makeSound();
//        
//        macska2.setName("Gizi");
//        
//        System.out.println(macska.getName());
//        System.out.println(macska2.getName());
//        System.out.println(macska3.getName() + " " + macska3.getWeight() + " kg");
//        
//        /*
//        int x = 22;    
//        byte b = x; ez nem fut le mert a byte kissebb adattípus
//        */
//        
//        /*
//        byte x = 22;    
//        int b = x; ez igen mert kisebbõl nagyobba töltöm
//        */
//        
//        /*
//        System.out.println(1+1 + " a " + 1+1);  -->  2 a 11
//        */
//        
//        
//        char first = 'a';
//        int second = 2;
//        String third = "" + first;
//        String fouth = "" + second;
//        String simple;
//        
//        double d = 3.5;   //ez nem mûködik így
//        
//        String a = "a";
//        
//        simple = String.valueOf(d);
//        
//        System.out.println(simple);
//        
//        Character c = 'c';
//        
//        test(second);
//        
//        int asd = 1;
//        int sdf = asd;    //lemásolja asd értékét
//        
//        
//        
//        
//   }
    
    public static void main(String[] args){
            ArrayList<Cat> cats = new ArrayList<Cat>();
            Cat sziamiau = new Cat("Sziamiau");
            cats.add(sziamiau);
            
            System.out.println(cats.get(0).getName());
        }
    
    public static void test (Integer c){
            System.out.println(c);
        }
}
