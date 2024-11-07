package section9.model;

public class Chicken extends Animal {
    private boolean canLayEggs;

    public Chicken(){}

    public Chicken(String name, int age, boolean canLayEggs){
        super(name, age);
        this.canLayEggs = canLayEggs;
    }

    public boolean isCanLayEggs() {
        return canLayEggs;
    }

    public void setCanLayEggs(boolean canLayEggs) {
        this.canLayEggs = canLayEggs;
    }
}
