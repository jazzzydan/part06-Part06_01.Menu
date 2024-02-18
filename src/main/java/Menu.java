
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {

        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
//        boolean alreadyOnTheMenu = false;
//        for (String iterate : this.meals) {
//            if (iterate.equals(meal)) {
//                alreadyOnTheMenu = true;
//            }
//        }
//        if (!alreadyOnTheMenu) {
//            this.meals.add(meal);
//        }

//        or

        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String iterate : this.meals) {
            System.out.println(iterate);
            }
    }

    public void clearMenu() {
        meals.clear();
    }

}
