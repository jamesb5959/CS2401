public class Dog {

    protected String name;
    private int age;
    private String furColor;
    private boolean likesToFetch;
    private int sticksFetched;
   
    public Dog(String name, String furColor, boolean
    likesToFetch, int age) {
    this.name = name;
    this.age = age;
    this.furColor = furColor;
    this.likesToFetch = likesToFetch;
    this.sticksFetched = 0;
    }
   
    public void bark() {
    System.out.println("woof");
    }
   
    public void fetch() {
    if (likesToFetch && sticksFetched < 10) {
    sticksFetched++;
    System.out.println("arf");
    }
    }
    public static void main(String[] args) {
        Dog myDog = new RoboDog(3);
myDog.fetch();
    }
}