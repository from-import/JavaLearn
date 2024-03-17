package modifierDemo.zi;

import modifierDemo.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Fu f = new Fu();
        // f.privateMethod();
        // f.protectMethod();
        f.publicMethod();
        // f.simpleMethod();

        Zi z = new Zi();
        z.protectMethod();
        z.publicMethod();
    }
}
