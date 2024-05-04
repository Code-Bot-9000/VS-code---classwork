package Chapter_10;

public class TwoPeopleMeal extends XLmeal{

    //variables are protected to give access to child calsses
    protected String dish2;
    protected String drink2;
    static int twoPeopleOrders;

    public TwoPeopleMeal(String dish, String drink, String dish2, String drink2, String dessert){
        //superconstructor gives us access to the previously created variables
        super(dish, drink, dessert);
        this.dish2 = dish2;
        this.drink2 = drink2;
        //keeps track of Two People Meals ordered to evaluate Meal cost
        twoPeopleOrders++;
    }

    /**
     * returns a string when the object gets called specific to this class
     */
    public String toString(){
        return "Dish 1: " +getDish()+ "\nDrink 1: " +getDrink()+ "\nDish 2: " +dish2+ "\nDrink 2: " +drink2+ "\nDessert: " + dessert;
    }
}