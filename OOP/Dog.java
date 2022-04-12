public class Dog extends Animal{
    
    private int bitesNumber;
    
    /*
    public Dog(){
        name = "Solovino";
        age = 1;
        owner = "everyone";
        oneYearToHumanYears = 7;
        bitesNumber = 0;
    }
    */
    
    public Dog(){
        super("Solovino", 2, "everyone");
        this.setOneYear(7);
        bitesNumber = 0;
        
    }
    public Dog(String name, int age, String animalOwner, int bitesNumber){
        super(name, age, animalOwner);
        this.setOneYear(7);
        this.bitesNumber = bitesNumber;
    }
    
    public int getBitesNumber(){
        return bitesNumber;
    }
    
    public void setBitesNumber(int bitesNumber){
        this.bitesNumber = bitesNumber;
    }
    
    public void eats(){
        System.out.println("Dogs can eat all day");
    }
    
    public void moves(){
        System.out.println("A dog moves by walking");
    }
    
    //Do you need the "this"?
    //Why bitesNumber doesn't need "()"
    public String toString(){
        return "The name of this dog is "+this.getName()+", it has an age of "+this.getAge()+ " years, its owner is "+getOwner()+", one year for it equals to "+getOneYear()+" human years and it has bitten "+bitesNumber+" times";
    }
}