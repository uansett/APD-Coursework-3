package johansen.stian.apd.cw3;

import java.util.Observable;

class DogBot extends Observable {

    protected int hungry, tired;
    private String name;
    
    public DogBot(String name,int h, int t) {
        this.name = name;
        hungry = h;
        tired = t;
    }
    
    public String getName(){
        return name;
    }

    public boolean eat() {
        if (hungry > 6) {
            hungry -= 3;
            setChangedAndNotify("eat");
            return true;
        } else {
            return false;
        }
    }

    public void rest() {
        hungry++;
        tired -= 2;
        setChangedAndNotify("rest");
    }

    public void play() {
        hungry += 2;
        tired += 3;
        setChangedAndNotify("play");
    }

    public String noise() {
        if (hungry > 8 && tired < 11) {
            return "whine ";
        } else if (tired > 7 && tired > hungry) {
            return "snore ";
        } else {
            return "woof ";
        }
    }
    
    private void setChangedAndNotify(Object o){
        setChanged();
        notifyObservers(o);
    }
    
}