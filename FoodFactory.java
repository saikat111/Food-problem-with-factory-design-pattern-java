
public class FoodFactory {
    public Food  getFood(String foodType){
        if(foodType == null){
            return null;
        }
        if(foodType.equalsIgnoreCase("cake")){
            
            return new Cake();
        }
              if(foodType.equalsIgnoreCase("pizza")){
            
            return new Pizza();
        }
        return null;
        
    }

  
    
  
}
