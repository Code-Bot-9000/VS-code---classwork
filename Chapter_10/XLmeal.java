package Chapter_10;

public class XLmeal extends Meal{

    //variables are protected to give access to child calsses
    protected String dessert;
    static int xlMealsOrdered;
    

    public XLmeal(String dish, String drink, String dessert){
        //superconstructor gives us access to the previously created variables
        super(dish, drink);
        this.dessert = dessert;
        xlMealsOrdered++;
    }

    /**
     * returns a string when the object gets called specific to this class
     */
    public String toString(){
        return "Dish: " +getDish()+ "\nDessert: " + dessert + "\nDrink: " +getDrink();
    }
}