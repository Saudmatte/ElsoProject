package Polimorfizmus;
//v�gleges ez az oszt�ly, ez�rt nem terjesztheti ki semmi
//immutable class
public final class Dog  extends Animal{
    //v�gleges ez a v�ltoz� ami azt jelenti hogy a l�trehoz�skor
    //kapott �rt�k�t t�bb� nem lehet megv�ltoztatni
    final private int size;
    
    public Dog(){
        size = 0;
    }
    
    public Dog(int size){
        this.size = size;
    }
    
    Dog dog = new Dog();
    
}
