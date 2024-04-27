package Chapter_10;

public class Meal {
    //public static Object adultMeal;
    private String dish;
    private String dessert;
    private String drink;

    Meal(String dish, String dessert, String drink){
        this.setDish(dish);
        this.setDessert(dessert);
        this.setDrink(drink);
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
    public String getDish(){
        return this.dish;
    }
    public String getDessert(){
        return this.dessert;
    }
    public String getDrink(){
        return this.drink;
    }
    public String toString(){
        return "Dish " +dish+ " dessert " +dessert+ " drink " +drink;
    }
}
