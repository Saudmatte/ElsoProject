package Human;

public class Main {

    public static void main(String[] args) {
        Human first = new Human();
        Human second = new Human();

        first.setName("Jani");
            
        System.out.println(first.getName());
        System.out.println(second.getName());    
        first.writeMyName();
    }
    
}
