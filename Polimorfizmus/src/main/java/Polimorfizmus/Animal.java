package Polimorfizmus;

public abstract class Animal {
    
    protected void makeSound(){
        System.out.println("AAAAaaaaaaaaa");
    }
    
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
