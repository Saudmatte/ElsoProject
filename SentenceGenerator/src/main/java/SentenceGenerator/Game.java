package SentenceGenerator;

public class Game {
    
    public String generator(){
    
        String[] firstWord = {"Nagyon j� ","Megb�zhat� ","Kiv�l� ","T�k�letes ","A leges legjobb "};
        String[] secondWord = {"megold�s ","lehet�s�g ","kivitelez�s "};
        String[] thirdWord = {"neked!","mindenkinek!","az eg�sz vil�gnak!","m�g a macsk�dnak is!"}; 
    
        int random1 = (int) (Math.random() * firstWord.length);
        int random2 = (int) (Math.random() * secondWord.length);
        int random3 = (int) (Math.random() * thirdWord.length);
        
        String sentence = firstWord[random1] + secondWord[random2] +  thirdWord[random3];      
    
        return sentence;
    
    }
}
