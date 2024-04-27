package Chapter_10;

public class Menu {
    public static void main(String[] args) {
        Meal adultMeal = new Meal("Steak", "Cake", "Champagne");
        Meal alternativeMeal = new Meal("Soup","Jello","Coke");
        Meal kidsMeal = new Meal("Hamburger", "Icecream", "Juice");
        MealSize meal1 = new MealSize("Steak", "Cake", "Champagne","Large");
        
        System.out.println("Adult meal has "+adultMeal.getDish()+", "+adultMeal.getDessert()+", and "+adultMeal.getDrink());
        MealCost.adultCost();
        System.out.println("Alternative meal has "+alternativeMeal.getDish()+", "+alternativeMeal.getDessert()+", and "+alternativeMeal.getDrink());
        MealCost.alternativeMealCost();
        System.out.println("Kids meal has "+kidsMeal.getDish()+", "+kidsMeal.getDessert()+", and "+kidsMeal.getDrink());
        MealCost.kidsMealCost();

        System.out.println(meal1);
    }
}
