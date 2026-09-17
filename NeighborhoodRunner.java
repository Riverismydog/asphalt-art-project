import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    

    /**
    * Creates the new subclasses/painters.
    * I have one for each section/different color of wave plus the beach.
    * Also I set the paint for each of them here.
    */
    
    BeachPainter beach = new BeachPainter();
    beach.setPaint (1000);
    
    ShallowPainter shallow = new ShallowPainter();
    shallow.setPaint (1000);
    
    StandingPainter standing = new StandingPainter();
    standing.setPaint (1000);
    
    DeepPainter deep = new DeepPainter();
    deep.setPaint (1000);
    
    SuperDeepPainter superdeep = new SuperDeepPainter();
    superdeep.setPaint (1000);

    
    /**
    * Calling all the methods for the different painters.
    */
    beach.paintBeach();
    shallow.paintShallows();
    standing.paintStanding();
    deep.paintDeep();
    superdeep.paintSuperDeep();
  }
}