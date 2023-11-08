public class Guitar implements GuitarController {
    //public static enum colors {GREEN,RED,YELLOW,BLUE,ORANGE}
    public void PressFretButton(colors button) {
        System.out.println("Guitar fret pressed: " + button.name());
    }
    public void PressPick() {
        System.out.println("Guitar pick pressed!");
    }
    public void PressTremelo() {}
}