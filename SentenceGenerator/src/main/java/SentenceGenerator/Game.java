package SentenceGenerator;

public class Game {
    
    public String generator(){
    
        String[] firstWord = {"Nagyon jó ","Megbízható ","Kiváló ","Tökéletes ","A leges legjobb "};
        String[] secondWord = {"megoldás ","lehetõség ","kivitelezés "};
        String[] thirdWord = {"neked!","mindenkinek!","az egész világnak!","még a macskádnak is!"}; 
    
        int random1 = (int) (Math.random() * firstWord.length);
        int random2 = (int) (Math.random() * secondWord.length);
        int random3 = (int) (Math.random() * thirdWord.length);
        
        String sentence = firstWord[random1] + secondWord[random2] +  thirdWord[random3];      
    
        return sentence;
    
    }
}
