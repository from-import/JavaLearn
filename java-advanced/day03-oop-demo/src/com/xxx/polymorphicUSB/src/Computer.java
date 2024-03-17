public class Computer {
    public void installUSB(USB u){
        u.connect();
        if(u instanceof Mouse){
            ((Mouse) u).click();
        }
        if(u instanceof Keyboard){
            ((Keyboard)u).keyDown();
        }

        u.disconnect();
    }
}
