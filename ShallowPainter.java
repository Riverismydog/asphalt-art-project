import org.code.neighborhood.*;
  public class ShallowPainter extends PainterPlus {

     /**
    * Paints the shallow waves on the beach
    * Puts the cresting waves(white) and the lighted shade of water
    */
    
     public void paintShallows() {
       turnRight();
       move();
       move();
       move();
       move();
       move();
       move();
       move();
       move();
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#ffffff");
       paint("#ffffff");
       turnRight();
       turnRight();
       move();
       turnRight();
       move();
       turnLeft();
       paintMove("#ffffff");
       turnRight();
       paintMove("#ffffff");
       paint("#ffffff");
       turnRight();
       move();
       paint("#ffffff");
       turnLeft();
       turnLeft();
       move();
       turnRight();
       move();
       paintMove("#ffffff");
       paintMove("#ffffff");
       paintMove("#ffffff");
       paintMove("#ffffff");
       turnRight();
       paintMove("#ffffff");
       turnLeft();
       paintMove("#ffffff");
       paintMove("#ffffff");
       paintMove("#ffffff");
       turnRight();
       paintMove("#ffffff");
       turnLeft();
       paintMove("#ffffff");
       paintMove("#ffffff");
       paintMove("#ffffff");
       turnRight();
       paintMove("#ffffff");
       turnLeft();
       paintMove("#ffffff");
       paintMove("#ffffff");
       paint("#ffffff");
       turnLeft();
       move();
       paintMove("#5d82b3");
       turnLeft();
       paintMove("#5d82b3");
       turnLeft();
       paintMove("#5d82b3");
       paint("#5d82b3");
       turnLeft();
       turnLeft();
       move();
       turnLeft();
       move();
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       turnRight();
       paintMove("#5d82b3");
       turnRight();
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       turnLeft();
       turnLeft();
       move();
       move();
       move();
       move();
       move();
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       turnRight();
       paintMove("#5d82b3");
       turnRight();
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paint("#5d82b3");
       turnRight();
       turnRight();
       move();
       move();
       move();
       move();
       move();
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       turnRight();
       paintMove("#5d82b3");
       turnRight();
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paintMove("#5d82b3");
       paint("#5d82b3");

       //* Brings the Painter back to the begining.
       
       turnRight();
       turnRight();
       while (canMove()) {
        move();
      }
       turnRight();
       while (canMove()) {
        move();
      }
       turnRight();

       

     }
    
  }