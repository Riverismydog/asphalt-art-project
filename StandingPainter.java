import org.code.neighborhood.*;
  public class StandingPainter extends PainterPlus {


    /**
    * Paints the head-level water on the beach
    * Puts the slightly darker water
    */

    public void paintStanding() {
      turnRight();
      move();
      move();
      move();
      move();
      move();
      paintMove("#185299");
      paintMove("#185299");
      turnLeft();
      paintMove("#185299");

      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      turnRight();
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      turnRight();
      paintMove("#185299");
      turnRight();
      move();
      turnLeft();
      paintMove("#185299");
      turnRight();
      paintMove("#185299");
      turnRight();
      paintMove("#185299");
      paint("#185299");
      turnRight();
      turnRight();
      move();
      move();
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paint("#185299");
      turnRight();
      move();
      move();
      turnRight();
      move();
      turnRight();
      turnRight();
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      paintMove("#185299");
      turnRight();
      paintMove("#185299");
      turnRight();
      paintMove("#185299");
      paint("#185299");

      //* Brings the Painter back to the begining.

      turnRight();
      turnRight();
      move();
      move();
      turnRight();
      while (canMove()) {
        move();
      }
      turnRight();



      
    }


  }