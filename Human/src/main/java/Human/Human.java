package Human;

public class Human {
    //az ember neve
    private String name;
    //az ember kora
    private int age;
    
    
    //ez a metódus kiírja az ember nevét
    public void writeMyName(){
        System.out.println("My name is " + this.name);
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;    
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
