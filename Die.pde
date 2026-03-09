public class Die{
  int moveQuad;
 public Die(){
   moveQuad=80;
 }
 public void execute(VirtualPet myPet){
 if (myPet.hasDied()==true){
   fill(0);
 quad(115+moveQuad,100+moveQuad, 125+moveQuad,105+moveQuad, 105+moveQuad,135+moveQuad, 95+moveQuad,130+moveQuad);
 quad(115+moveQuad+40,100+moveQuad, 125+moveQuad+40,105+moveQuad, 105+moveQuad+40,135+moveQuad, 95+moveQuad+40,130+moveQuad);
 quad(175,185, 185,180, 205,210, 195,215);
 quad(175+40,185, 185+40,180, 205+40,210, 195+40,215);
 showMessage("Died!");
 }
 }
}
