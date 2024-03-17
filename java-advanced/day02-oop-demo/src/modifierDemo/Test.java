package modifierDemo;

public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
        // f.privateMethod();
        f.protectMethod();
        f.publicMethod();
        f.simpleMethod();
    }
}
