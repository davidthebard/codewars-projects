// http://www.codewars.com/kata/street-fighter-2-character-selection/java

public class Solution{
  public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
    String[] fighterList = new String[moves.length];
    int currentX = 0;
    int currentY = 0;
    for(int i = 0; i < moves.length; i++) {
      if (moves[i] == "up") {
        if(currentY - 1 >= 0) {
          currentY--;
          fighterList[i] = fighters[currentY][(currentX)];
        } else { 
          fighterList[i] = fighters[currentY][(currentX)];
        }
      } else if(moves[i] == "down") {
          if(currentY + 1 < 2) {
            currentY++;
            fighterList[i] = fighters[currentY][(currentX)];
          } else {
            fighterList[i] = fighters[currentY][currentX];
          }
      } else if(moves[i] == "left") {
          if (currentX > 0) {
            currentX--;
            fighterList[i] = fighters[currentY][(currentX)]; 
          } else {
            currentX = 5;
            fighterList[i] = fighters[currentY][currentX];
          }
      } else if(moves[i] == "right") {
          if (currentX < 5) {
            currentX++;
            fighterList[i] = fighters[(currentY)][(currentX)];
          } else {
            currentX = 0;
            fighterList[i] = fighters[currentY][currentX];
          }
      }
    }
    return fighterList;
  }
}
