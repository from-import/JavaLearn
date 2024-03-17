package modifierDemo;

public class Fu {
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    void simpleMethod(){
        System.out.println("simpleMethod");
    }

    protected void protectMethod(){
        System.out.println("protectMethod");
    }

    public void publicMethod(){
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.protectMethod();
        f.publicMethod();
        f.simpleMethod();
    }
}
