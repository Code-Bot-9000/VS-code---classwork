
public class TwoPlayingCards{
    public static void main(String[] args){
        String suits[] = {"Hearts","Diamonds","Clubs","Spades"};
        int suitType1 = (int)(Math.random() * 4);
        int suitType2 = (int)(Math.random() * 4);
        int cardValue1 = (int)(Math.random() * 13) + 1;
        int cardValue2 = (int)(Math.random() * 13) + 1;
        
        Card card1 = new Card(suits[suitType1],cardValue1);
        Card card2 = new Card(suits[suitType2],cardValue2);

        System.out.println("Playing card 1: "+ card1.toString());
        System.out.println("Playing card 2: "+ card2.toString());
    }
}