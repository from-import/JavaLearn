public class Test {
    public static void main(String[] args) {
        Computer apple = new Computer();
        USB u1 = new Mouse("Logic");
        apple.installUSB(u1);
        System.out.println();

        USB u2 = new Keyboard("Laise");
        apple.installUSB(u2);

    }
}
