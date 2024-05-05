public class Card{

    String suit;
    int value;

    
    public void setValue(int value) {
        this.value = value;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
    
    public String toString(){
        return cardValue() + " of " +suit+ "\nValue: " + value;
    }
    private String cardValue() {
        String cardName;
        switch(value){
            case 1: cardName = "Ace";
            break;
            case 2: cardName = "Two";
            break;
            case 3: cardName = "Two";
            break;
            case 4: cardName = "Two";
            break;
            case 5: cardName = "Two";
            break;
            case 6: cardName = "Two";
            break;
            case 7: cardName = "Two";
            break;
            case 8: cardName = "Two";
            break;
            case 9: cardName = "Two";
            break;
            case 10: cardName = "Two";
            break;
            case 11: cardName = "Two";
            break;
            case 12: cardName = "Two";
            break;
            default: cardName = "";
        }
        return cardName;
    }
}