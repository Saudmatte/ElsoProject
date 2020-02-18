
package Polimorfizmus;

public class Main {

    public static void main(String[] args) {
        Cat macska = new Cat();
        Cat macska2 = new Cat();
        macska.meow();
        System.out.println(macska.equals(macska2));
        
    }
    
}
