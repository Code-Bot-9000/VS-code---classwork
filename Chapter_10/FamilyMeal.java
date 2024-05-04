package Chapter_10;

public class FamilyMeal extends TwoPeopleMeal{
    
    //these variables extend the two people class to include food for more people
    private String dish3;
    private String dish4;
    private String drink3;
    private String drink4;
    private String dessert2;
    static int FamMealsOrdered;

    /**
     * Constructor for the family meal class
     * @param dish
     * @param drink
     * @param dish2
     * @param drink2
     * @param dish3
     * @param drink3
     * @param dish4
     * @param drink4
     * @param dessert
     * @param dessert2
     */
    public FamilyMeal(String dish, String drink, String dish2, String drink2,String dish3, String drink3, String dish4, String drink4, String dessert, String dessert2){
        //superconstructor gives us access to the previously created variables
        super(dish, drink, dessert, dish2, drink2);
        this.dish3 = dish3;
        this.dish4 = dish4;
        this.drink3 = drink3;
        this.drink4 = drink4;
        this. dessert2 = dessert2;
        //keeps track of Family Meals ordered to evaluate Meal cost
        FamMealsOrdered++;
    }

    /**
     * returns a string when the object gets called specific to this class
     */
    public String toString(){
        return "Dish1: " +getDish()+ "\nDrink 1: " +getDrink()+ "\nDish 2: " +dish2+ "\nDrink 2: " +drink2+ "Dish 3: " +dish3+ "\nDrink 3: " +drink3+ "\nDish 4: " +dish4+ "\nDrink 4: " +drink4+ "\nDessert 1: " + dessert+ "\nDessert 2: " + dessert2;
    }
}