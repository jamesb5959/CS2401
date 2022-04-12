public class RoboDog extends Dog {

    private int modelNumber;
   
    public RoboDog(int modelNumber) {
    super("RoboDog " + modelNumber, "Silver", true,4);
    this.modelNumber = modelNumber;
    }
   
    public void bark() {
    super.bark();
    System.out.println("robo-woof");
    }
   
    public void selfDestruct() {
    System.out.println("boom");
    }

    }