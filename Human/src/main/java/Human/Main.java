package Human;

public class Main {

    public static void main(String[] args) {
        Human first = new Human();
        Human second = new Human();

        first.setName("Jani");
        first.setAge(15);
            
        System.out.println(first.getName());
          
        first.writeMyName();
        
        System.out.println(second.getName());  
        
        System.out.println(first.getAge());
        
        System.out.println(second.getAge());  

        String firstName = first.getName();
        String secondName = second.getName();
       
        
        if (secondName == null){
            System.out.println("2: nincs nev");
        }else{
            System.out.println("2: Van név" + second.getName());;
        }
        
        if (firstName != null){
            System.out.println("1: Van nev: " + first.getName());
        }else{
            System.out.println("1: nincs nev");;
        }
        
        boolean empty2 = (second.getName() == null);
        
        System.out.println(empty2 == true ? "2ures" : "2Nem ures");
        
        boolean empty1 = (first.getName() == null);
        
        System.out.println(empty1 == true ? "1ures" : "1Nem ures");
        
//        if (second.getName() == null){
//            System.out.println("2: nincs nev");
//        }else{
//            System.out.println("2: Van név" + second.getName());;
//        }
        
    }
    
}
