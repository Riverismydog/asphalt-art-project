import org.code.neighborhood.*;
  public class BeachPainter extends PainterPlus {

    /**
    * Paints the sandy beach
    * Puts the different tones; wet sand and drying sand
    */
    
    public void paintBeach() {
      turnRight();
      while(canMove()) {
        move();
      }
       turnLeft();
      while(canMove()) {
        paint("#f5e49c");
        move();
      }
      turnLeft();
      turnLeft();
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paint("#d9c98b");
      turnRight();
      move();
      turnLeft();
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      turnRight();
      paintMove("#d9c98b");
      turnLeft();
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      turnLeft();
      paintMove("#d9c98b");
      turnLeft();
      paintMove("#d9c98b");
      paintMove("#d9c98b");
      paintMove("#f5e49c");
      paintMove("#f5e49c");
      paintMove("#f5e49c");
      paintMove("#f5e49c");
      turnLeft();
      turnLeft();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      paintMove("#d9c98b");
      turnRight();
      paintMove("#d9c98b");
      turnRight();
      paintMove("#b8ab77");
      turnLeft();
      paintMove("#b8ab77");
      turnRight();
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      turnLeft();
      paintMove("#b8ab77");
      turnRight();
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      turnRight();
      paintMove("#b8ab77");
      turnRight();
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      paint("#b8ab77");
      turnLeft();
      turnLeft();
      move();
      move();
      move();
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      turnRight();
      paintMove("#b8ab77");
      turnLeft();
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      turnRight();
      move();
      turnLeft();
      paintMove("#b8ab77");
      paintMove("#b8ab77");
      paint("#b8ab77");

      // The sequence that sends the painter back to its starting point
      turnLeft();
      turnLeft();
      while(canMove()) {
        move();
      }
      turnRight();
      while(canMove()) {
        move();
      }
      turnRight();

    }
  }