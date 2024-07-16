public class Main {
  public class CellularAutomata {
    public int strength;
    public int x;
    public int y;
    public int id;
    

    public CellularAutomata(int strength, int x, int y, int id){
      if (strength > 0){
        this.strength = strength;
      }
      else {
        this.strength = 0;
      }

      if (x > 0){
        this.x = x;
      }
      else {
        this.x = 0;
      }

      if (y > 0){
        this.y = y;
      }
      else {
        this.y = 0;
      }

      if (id > 0){
        this.id = id;
      }
      else {
        this.id = 0;
      }
    }
    
    public CellularAutomata(){
      this (0,0,0,0);
    }

    public void interactNeighbors (ArrayList<Cell> neighbors){
      
    }

    
  }
  
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

}