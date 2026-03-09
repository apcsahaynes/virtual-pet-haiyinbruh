
public class Food{
    private String foodName;
    private int addEnergy;
    private int addWeight;
    private int addHappiness;
    
public Food(String foodName, int addEnergy, int addWeight, int addHappiness){
    this.foodName = foodName;
    this.addEnergy = addEnergy;
    this.addWeight = addWeight;
    this.addHappiness = addHappiness;
    
}
  
  public String getName(){
      return foodName;
  }
  
  public int getAddEnergy(){
      return addEnergy;
  }
  
  public int getAddWeight(){
      return addWeight;
  }
  
  public int getAddHappiness(){
      return addHappiness;
  }
}
