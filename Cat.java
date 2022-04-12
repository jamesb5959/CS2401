public class Cat {
    //Atrabutes
    private String breed; //data is encapsulated
    private String name;
    private int age;

    //constructor
    public Cat(){
    }
    public Cat(String str){
        name = str;
    }
    //getter & setter

    //meow
    public void meow(){
        System.out.print("meow");
    }

    //plays
    public void plays(){
        System.out.print("Depends on the cap");
    }
	public char[] getName() {
		return null;
	}

}
