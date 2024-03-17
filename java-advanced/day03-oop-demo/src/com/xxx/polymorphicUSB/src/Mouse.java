public class Mouse implements USB{

    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
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

    public void click(){
        System.out.println(name + " click!");
    }
}
