package Chapter_10;

public class OrderCost {
    static double mealCost = 10.99;
    static double xlMealCost = 15.99;
    static double twoPeopleMealCost = 22.00;
    static double familyMealCost = 40.00;
    
    /**
     * returns the total cost for meals
     * @return
     */
    static double mealTotal(){
        System.out.println((Meal.totalMealsOrdered - XLmeal.xlMealsOrdered) + " Meals ordered");
        double total = mealCost * (Meal.totalMealsOrdered - XLmeal.xlMealsOrdered);
        return total;
    }
    /**
     * returns the total costfor XL Meals
     * @return
     */
    static double xlMealTotal(){
        System.out.println((XLmeal.xlMealsOrdered - TwoPeopleMeal.twoPeopleOrders) + " XL Meals ordered");
        double total = xlMealCost * (XLmeal.xlMealsOrdered - TwoPeopleMeal.twoPeopleOrders);
        return total;
    }
    /**
     * returns the total cost for the two people meals
     * @return
     */
    static double twoPeopleTotal(){
        System.out.println((TwoPeopleMeal.twoPeopleOrders - FamilyMeal.FamMealsOrdered) + " Two people meals ordered");
        double total = twoPeopleMealCost * (TwoPeopleMeal.twoPeopleOrders - FamilyMeal.FamMealsOrdered);
        return total;
    }
    /**
     * returns the total cost for the family meals
     * @return
     */
    static double familyTotal(){
        System.out.println((FamilyMeal.FamMealsOrdered) + " Family meals ordered");
        double total = familyMealCost * (FamilyMeal.FamMealsOrdered);
        return total;
    }
}
