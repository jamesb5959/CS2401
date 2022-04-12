public class Animal{
    
    private String name;
    private int age;
    private String owner;
    private int oneYearToHumanYears;
    
    public Animal(){}
    
    public Animal(String name, int age, String animalOwner){
        this.name = name;
        this.age = age;
        owner = animalOwner;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;        
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;        
    }
    
    public String getOwner(){
        return owner;
    }
    
    public void setOwner(String owner){
        this.owner = owner;        
    }
    
    public int getOneYear(){
        return oneYearToHumanYears;
    }
    
    public void setOneYear(int oneYear){
        oneYearToHumanYears = oneYear;        
    }
    
    public void eats(){
        System.out.println("This animal needs to eat");
    }
    
    public void moves(){
        System.out.println("This animal moves...");
    }
    
    public void info(){
        System.out.println("The name of this animal is "+name);
        System.out.println("The age of this animal is "+age);
        System.out.println("The owner of this animal is "+owner);
        System.out.println("A human year equals to "+oneYearToHumanYears+" of this animal");
    }
}