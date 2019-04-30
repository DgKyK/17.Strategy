public class TestClass {
    public static void main(String[] args) {
        Cat garfild = new Cat(new WildBehavior());
        garfild.play();
        garfild.changeBehavior(new HomeBehavior());
        garfild.play();
    }
}
