
package johansen.stian.apd.cw3;

public class Kennel {
    public static void main(String[] args) {
        DogBot fluffy = new DogBot("Fluffy",5,5);
        DogBot princeHarry = new DogBot("Prince Harry",9,2);
        
        DogWatcher harold = new DogWatcher(fluffy, "Harold");
        DogWatcher steven = new DogWatcher(princeHarry, "Steven");
        
        fluffy.play();
        princeHarry.play();
        fluffy.play();
        fluffy.eat();
        fluffy.rest();
        princeHarry.play();
        princeHarry.play();
        princeHarry.play();

    }
}
