public class VirtualPet {
  private String name;
  private int energy;
  private int weight;
  private int happiness;
  private int ageMonths;
  private int ageYears;
  private int clean;


  public VirtualPet(String name){
    this.name = name;
    this.energy = 5;
    this.weight = 5;
    this.happiness = 5;
    this.ageMonths = 0;
    this.ageYears = 0;
    this.clean = 5;
    
  }
  
  public boolean hasDied(){
    if(energy<=0||happiness<=0||weight>=40||clean<=0){
    return true;
    }
    return false;
  }
  public void clean(){
   if(clean>10){
     clean=10;
   }
   if(happiness>10){
     happiness=10;
   }
   happiness--;
   clean++;
   if(clean>10){
     clean=10;
   }
   
  }
//**********
  public void feed(Food myFood){
    if(happiness>10){
      happiness=10;
    }
    if(energy>10){
      energy=10;
    }
    if(clean>10){
      clean=10;
    }
    weight+= myFood.getAddWeight();
    if (energy < 10){
      energy+= myFood.getAddEnergy();
      weight+= myFood.getAddWeight();
      happiness+= myFood.getAddHappiness();
      clean--;
      
      if(happiness>10){
      happiness=10;
    }
    if(energy>10){
      energy=10;
    }
    if(clean>10){
      clean=10;
    }
    }
  }

//**********
//gets
  public String getName(){
    return name;
  }
  public int getEnergyLevel(){
    return energy;
  }
  public int getHappinessLevel(){
    return happiness;
  }
  public int getWeightLevel(){
    return weight;
  }
  public int getAgeYears(){
    return ageYears;
  }
  public int getAgeMonths(){
    return ageMonths;
  }
  public int getCleanLevel(){
    return clean;
  }
//
  public boolean play(Game myGame){
    if(happiness>10){
      happiness=10;
    }
    if(energy>10){
      energy=10;
    }
    if (happiness < 10){
      happiness+= myGame.getAddHappiness();
      if(happiness>10){
      happiness=10;
    }
    }
    if (weight > 5){
      weight-= myGame.getAddWeight();
    }
    if(myGame.hasWon()==true){
        return true;
    }
    else{
        return false;
    }
  }
  
  public void updateStatus(){
      if(happiness>0){
          happiness--;
      }
      if(energy>0){
          energy--;
      }
      ageMonths++;
      ageConverter();
  }
  
  private void ageConverter(){
      if(ageMonths>=12){
          ageYears++;
          ageMonths=0;
      }
  }

  public String toString(){
    return "\n" + name + "'s information: \nEnergy: " + energy 
    + "\nWeight: " + weight + "\nHappiness:" + happiness
    + "\nAge:" + ageYears + " years " + ageMonths + " months" + "\n";
  }
}
