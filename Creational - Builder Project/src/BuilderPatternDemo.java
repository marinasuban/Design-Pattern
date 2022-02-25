public class BuilderPatternDemo {

    public static void main(String[] args) {
        Meal vegMeal = MealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal classicMeal = MealBuilder.prepareMeatMeal();
        System.out.println("Classic Meal");
        classicMeal.showItems();
        System.out.println("Total Cost: " + classicMeal.getCost());
    }
}
