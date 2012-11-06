package johansen.stian.apd.cw3;

class RacingDogBot extends DogBot {

    public RacingDogBot(String name, int hunger, int tiredness) {
        super(name, hunger, tiredness);
    }

    public boolean race() {
        if (tired < 5) {
            hungry += 2;
            tired += 5;
            setChangedAndNotify("race");
            return true;
        } else {
            return false;
        }
    }

    public void rest() {
        hungry++;
        tired -= 3;
        setChangedAndNotify("rest");
    }
}