package Polimorfizmus;

public class Cat extends Animal implements Pet {
    /** ny�vogni fog */
    @Override
    public void makeSound(){
        System.out.println("meow");
    }

    @Override
    public void cuddle() {
    }

    @Override
    public void sit() {
    }

    @Override
    public void layDown() {
    }
    
}
