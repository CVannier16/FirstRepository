// Cordell Vannier
// October 24, 2016
// Homework #6:  Problem 3
// Creates a 5X5 checkerboard of fish whenever the user clicks on the canvas.

import objectdraw.*;
import java.awt.*;

public class CheckerBoardClient extends WindowController {

  private Fish_CK fish;
  double fishRow;
  double fishCount;
  double fishX;
  double fishY;

  public static void main(String[] args){
    new CheckerBoardClient().startController(800,800);
  }

// Everywhere a user presses on the canvas, a 5X5 checkerboard of fish will 
// appear.
  public void onMousePress (Location p) {
    fishRow =0;
    fishY = p.getY();
    while(fishRow<5) {
    fishCount =0;
    fishX = p.getX();
      while(fishCount<5) {
      Location pt = new Location (fishX, fishY);
      fish = new Fish_CK(pt, 30, 30, canvas);
      if ( (fishRow % 2) == (fishCount % 2) )
            fish.setColor(Color.BLACK);
      else
            fish.setColor(Color.RED);
      fishCount ++;
      fishX = fishX + 60;
      }
    fishRow ++;
    fishY = fishY + 60;
    }

  }

}

