
package johansen.stian.apd.cw3;

public class Kennel {
    public static void main(String[] args) {
        RacingDogBot fluffy = new RacingDogBot("Fluffy",6,3);
        DogBot princeHarry = new DogBot("Prince Harry",6,3);
        DogBot mrBean = new DogBot("Mr. Bean",6,3);
        
        DogWatcher harold = new DogWatcher(fluffy, "Harold");
        DogWatcher haroldsSon = new DogWatcher(mrBean, "Harold's Son");
        DogWatcher steven = new DogWatcher(princeHarry, "Steven");
        
        System.out.println( "--- Initial: Fluffy is watched over by "
                            + "Harold."
                            + "\nPrince Harry is being watched by Steven."
                            + "\nMr. Bean is being watched by Harold's Son.\n\n");
        mrBean.play();
        fluffy.play();
        princeHarry.play();
        
        fluffy.addObserver(haroldsSon);
        fluffy.deleteObserver(harold);
        System.out.println("\nNow, both Mr bean and Fluffy is watched over by "
                            + "Harold's Son.\n\n");
        
        mrBean.eat();
        fluffy.eat();
        princeHarry.eat();
        
        mrBean.deleteObserver(haroldsSon);
        fluffy.addObserver(harold);
        System.out.println( "\nNow, Harold's Son lost Mr Bean out of sight "
                            + "and is only watching fluffy together "
                            + "with Harold.\n\n");
        
        mrBean.rest();
        fluffy.rest();
        princeHarry.rest();
        
        fluffy.race();
    }
}
