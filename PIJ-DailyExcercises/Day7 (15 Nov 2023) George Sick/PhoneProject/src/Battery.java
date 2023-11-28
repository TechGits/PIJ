public class Battery {
    private int level = 100;

    public int getLevel() {
        return level;
    }

    public void decreaseLevel() {
        this.level--;
    }

    public void charge(int level) {
        this.level++;
    }
}