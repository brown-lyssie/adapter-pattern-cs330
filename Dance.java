public class Dance implements DanceController {
    public Dance() { }
    public void Step(direction dir) {
        System.out.println("Dance controller pressed " + dir.name());
    }
}