
package johansen.stian.apd.cw3;

public class Kennel {
    public static void main(String[] args) {
        RacingDogBot fluffy = new RacingDogBot("Fluffy",6,3);
        DogBot princeHarry = new DogBot("Prince Harry",9,2);
        
        DogWatcher harold = new DogWatcher(fluffy, "Harold");
        DogWatcher haroldsSon = new DogWatcher(fluffy, "Harold`s Son");
        DogWatcher steven = new DogWatcher(princeHarry, "Steven");
        
        fluffy.race();
        
        fluffy.play();
        princeHarry.play();
        fluffy.deleteObserver(haroldsSon);
        System.out.println("--- Harolds Son no longer observing Fluffy");
        fluffy.play();
        princeHarry.play();
        fluffy.play();
        princeHarry.play();
        fluffy.play();
        fluffy.addObserver(haroldsSon);
        System.out.println( "--- Harolds Son joined the game, "
                            + "now watching over Fluffy");
        princeHarry.play();
        fluffy.eat();
        princeHarry.eat();
        fluffy.rest();
        princeHarry.rest();
        
        

    }
}
