import org.code.neighborhood.*;
public class DeepPainter extends PainterPlus {

    /**
    * Paints the second deepest area
    * Puts the third darkest color down
    */

  
    public void paintDeep() {

      turnRight();
      move();
      move();
      move();
      paintMove("#2f3699");
      turnLeft();
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      turnRight();
      move();
      turnLeft();
      paintMove("#2f3699");
      paintMove("#2f3699");
      turnRight();
      paintMove("#2f3699");
      turnRight();
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      turnRight();
      paintMove("#2f3699");
      turnRight();
      paintMove("#2f3699");
      paintMove("#2f3699");
      turnRight();
      turnRight();
      paintMove("#2f3699");
      move();
      move();
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      turnRight();
      paintMove("#2f3699");
      move();
      turnLeft();
      move();
      move();
      turnLeft();
      turnLeft();
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");
      paintMove("#2f3699");

      //* Brings the Painter back.

      turnLeft();
      turnLeft();
      while (canMove()) {
        move();
      }
      turnRight();
      move();
      move();
      move();
      turnRight();
      
    }


  }