public class MealBuilder {
    public static Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegeBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal prepareMeatMeal(){
        Meal meal = new Meal();
        meal.addItem(new HamBurger());
        meal.addItem(new Sprite());
        return meal;
    }

}
