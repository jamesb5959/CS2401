public class Zoo{
    public static void main (String[] args){
        Animal myFirstAnimal = new Animal();
        
        Animal mySecondAnimal = new Animal("mike", 4, "Edgar");
        
        //What happens here? can we access it direcly by modying our code?
        //System.out.println(mySecondAnimal.name);
        
        System.out.println(mySecondAnimal.getName());
        mySecondAnimal.setName("Johnny");
        System.out.println(mySecondAnimal.getName());
        mySecondAnimal.eats();
        mySecondAnimal.moves();
        mySecondAnimal.info();
        
        System.out.println("----------Moving to my first dog----------");
        
        Dog myFirstDog = new Dog();
        System.out.println(myFirstDog.getName());
        myFirstDog.setName("Solo");
        System.out.println(myFirstDog.getName());
        System.out.println(myFirstDog.toString());
        
        Animal[] zoo = new Animal[5];
        zoo[0] = myFirstAnimal;
        zoo[1] = mySecondAnimal;
        //zoo[1] = (Dog) mySecondAnimal; downcasting --> class cast exception
        zoo[2] = myFirstDog;    //upcasting
        
        if(zoo[2] instanceof Dog) System.out.println("This is a dog!");
        if(zoo[2] instanceof Animal) System.out.println("A dog is an animal!");
        else System.out.println("A dog is not an animal!");
        
    }
    
}