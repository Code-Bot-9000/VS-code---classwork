public class Card{

    String suit;
    int value;

    public Card(String suit, int value){
        setSuit(suit);
        setValue(value);
    }
    /**
     * Sets the value integer
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }
    /**
     * Sets the suit String
     * @param suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    /**
     * returns the suit String
     * @return
     */
    public String getSuit() {
        return suit;
    }
    /**
     * returns the value integer
     * @return
     */
    public int getValue() {
        return value;
    }
    /**
     * returns a String when called
     */
    public String toString(){
        return cardValue() + " of " +suit+ "\nValue: " + value;
    }

    /*
     * returns a value depending on what card number was given
     * @return
     */
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