public class Game{
    private String gameName;
    private int addHappiness;
    private int addWeight;
    private int randomWin;
    
    public Game(String gameName, int addHappiness, int addWeight){
        this.gameName = gameName;
        this.addHappiness = addHappiness;
        this.addWeight = addWeight;
    }
    
    public String getName(){
        return gameName;
    }
    public int getAddHappiness(){
        return addHappiness;
    }
    
    public int getAddWeight(){
        return addWeight;
    }
    public boolean hasWon(){
        randomWin = (int)(Math.random()*10);
        if (randomWin >=5){
            return true;
        }
        else{
            return false;
        }
    }
}
