import java.util.Scanner;
public class FoodDemo {
    public static void main(String rags []){
    Scanner s = new Scanner(System.in);
    String s1 =s.nextLine();
    FoodFactory foodfactory = new FoodFactory();
    Food food1 = foodfactory.getFood(s1);
    food1.getType();
    
 
    }
}
