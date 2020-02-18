package Polimorfizmus;

public class Cat extends Animal implements Pet {

    //ez egy konstruktor
    public Cat(){
        super(); //az Animal konstruktorát terjeszti ki
        this.setName("macskusz");
    }
    
    //ez is kontruktor
    public Cat(String name){
        this.setName(name);
    }
    
    //ez is kontruktor
    public Cat(String name, int weight){
        this.setName(name);
        this.setWeight(weight);
    }
    
    //ez is kontruktor, ugyan az mint az elõzõ csak felcserélve
    public Cat(int weight, String name){
        this.setName(name);
        this.setWeight(weight);
    }
    
    /** nyávogni fog */
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
