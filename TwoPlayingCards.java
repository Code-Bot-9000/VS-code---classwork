
public class TwoPlayingCards{
    public static void main(String[] args){
        String suits[] = {"Hearts","Diamonds","Clubs","Spades"};
        int random1 = (int)(Math.random() * 12) + 1;
        int random2 = (int)(Math.random() * 12) + 1;
        
        Card card1 = new Card(suits[random1]);
        Card card2 = new Card();

        System.out.println(random);
    }
}