package Chapter_10;

public class Meal {
    private String dish;
    private String drink;
    static int totalMealsOrdered;

    Meal(String dish, String drink){
        this.setDish(dish);
        this.setDrink(drink);
        //keeps track of how many orders total are ordered when an object is created
        totalMealsOrdered++;
    }

    /*getters and setters for the meal class */

    public void setDish(String dish) {
        this.dish = dish;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
    public String getDish(){
        return this.dish;
    }

    public String getDrink(){
        return this.drink;
    }

    /**
     * returns a string when the object gets called specific to this class
     */
    public String toString(){
        return "Dish: " +dish+ "\nDrink: " +drink;
    }
}
