public class Meal {
    public static Object adultMeal;
    private String mainDish;
    private String dessert;
    private String drink;

    Meal(String mainDish, String dessert, String drink){
        this.setDish(mainDish);
        this.setDessert(dessert);
        this.setDrink(drink);
    }

    private void setDish(String mainDish) {
        this.mainDish = mainDish;
    }

    private void setDessert(String dessert) {
        this.dessert = dessert;
    }

    private void setDrink(String drink) {
        this.drink = drink;
    }
    public String getDish(){
        return this.mainDish;
    }
    public String getDessert(){
        return this.dessert;
    }
    public String getDrink(){
        return this.drink;
    }
}
