package Chapter_10;

public class MealSize extends Meal{
    
    private String size;
    

    public MealSize(String dish, String dessert, String drink, String size){
        super(dish, dessert, drink);
        this.size = size;
    }
}