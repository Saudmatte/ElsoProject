package Polimorfizmus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


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
            
            
            if (!cats.isEmpty())
            System.out.println(cats.get(0).getName());
            
            Cat macska = (Cat) cats.get(0);
            
            
            Object o1 = new Object();
            Object o2 = new Object();
            Object o3 = o1;
            
            System.out.println(o1.hashCode() + " " + o2.hashCode() + " " + o3.hashCode());
            System.out.println(sziamiau.getClass());
            
            if (cats.get(0) instanceof Cat){
                Cat cat = (Cat) cats.get(0);
                cat.makeSound();
            }            
            
            System.out.println(sziamiau.toString());
        
            Dog dog = new Dog(5);
    
            File file = new File("E://file.txt");
            
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
        }
            
            
    }
    
    public static void test (Integer c){
            System.out.println(c);
        }
}
