public class Cat {
    private Behavior behavior;

    public Cat(Behavior behavior) {
        this.behavior = behavior;
    }

    public void play() {
        behavior.play();
    }

    public void changeBehavior(Behavior newBehavior) {
        this.behavior = newBehavior;
    }
}
