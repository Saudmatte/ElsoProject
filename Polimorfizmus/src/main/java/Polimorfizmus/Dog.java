package Polimorfizmus;
//végleges ez az osztály, ezért nem terjesztheti ki semmi
//immutable class
public final class Dog  extends Animal{
    //végleges ez a változó ami azt jelenti hogy a létrehozáskor
    //kapott értékét többé nem lehet megváltoztatni
    final private int size;
    
    public Dog(){
        size = 0;
    }
    
    public Dog(int size){
        this.size = size;
    }
    
    Dog dog = new Dog();
    
}
