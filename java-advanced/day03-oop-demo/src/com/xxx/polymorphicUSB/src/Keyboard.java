public class Keyboard implements USB{

    private String name;

    public Keyboard() {
    }

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + " mouse connected");

    }

    @Override
    public void disconnect() {
        System.out.println(name + " mouse disconnected");

    }

    public void keyDown(){
        System.out.println(name + " keyDown!");
    }
}
