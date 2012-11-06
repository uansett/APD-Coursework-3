
package johansen.stian.apd.cw3;

import java.util.Observable;
import java.util.Observer;

public class DogWatcher implements Observer{
private Observable dog;
private String name;

public DogWatcher(Observable dog, String name){
    this.dog = dog;
    dog.addObserver(this);
    this.name = name;
}

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof DogBot && arg instanceof String){
            System.out.println( name + " observes "
                                +"`"
                                +((DogBot)o).getName()
                                +"` "+arg);
        
        }
    }
    
   
    
}
