package Human;

public class Human {
    private String name = "Gyula";
    
    public void writeMyName(){
        System.out.println("My name is " + this.name);
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String incoming){
        this.name = incoming;    
    }
    
}
