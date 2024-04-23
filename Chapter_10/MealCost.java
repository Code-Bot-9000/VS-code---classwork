package Chapter_10;

public class MealCost {
    static double adultMeal = 45.99;
    static double alternativeMeal = 32.49;
    static double kidsMeal = 19.99;
    
    static void adultCost(){
        System.out.println("The cost of the adult meal is $" + adultMeal+"\n");
    }
    static void alternativeMealCost(){
        System.out.println("The cost of the alternative meal is $" + alternativeMeal+"\n");
    }
    static void kidsMealCost(){
        System.out.println("The cost of the kids meal is $" + kidsMeal+"\n");
    }
}
