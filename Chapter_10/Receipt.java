package Chapter_10;

public class Receipt {
    public static void main(String[] args) {

        //These objects represent meal combos that were ordered from a restaurant
        //each object from separate classes have their own cost
        Meal meal1 = new Meal("Steak", "Champagne");
        Meal meal2 = new Meal("Soup", "Coke");
        Meal meal3 = new Meal("Hamburger", "Apple juice");
        XLmeal meal4 = new XLmeal("Ham Sandwich", "Orange juice", "Cake");
        XLmeal meal5 = new XLmeal("Chicken Strips", "Coke", "Cookie");
        TwoPeopleMeal meal6 = new TwoPeopleMeal("Chicken Sandwich", "Dr Pepper", "Burrito", "Pepsi", "Ice cream bucket");
        FamilyMeal meal7 = new FamilyMeal("Steak", "Coke", "Brisket", "Root Beer", "Salad", "Ginger Ale", "Pasta Alfredo",
         "Sweet Tea", "Red Velvet Cake", "Chocolate Brownies");
        

         //Prints out the order details of the stuff ordered
        Meal[] meals = {meal1, meal2, meal3};
        for(int count = 0;count < meals.length; count++){
            System.out.println("Meal "+ (count + 1) + "\n" + meals[count] + "\n");
        }
        System.out.println("Meal 4\n" + meal4+ "\n");
        System.out.println("Meal 5\n" + meal5+ "\n");
        System.out.println("Meal 6\n" + meal6+ "\n");
        System.out.println("Meal 7\n" + meal7+ "\n");

        //prints out the total number of meals ordered
        System.out.println("There are a total of " + Meal.totalMealsOrdered + " meals ordered.");

        //prints out the number of meals ordered specific to their category and the total cost
        double total = OrderCost.mealTotal()+OrderCost.xlMealTotal()+OrderCost.twoPeopleTotal()+OrderCost.familyTotal();
        System.out.println("\nThe total owed is $"+total);
    }
}