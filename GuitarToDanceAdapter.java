public class GuitarToDanceAdapter implements GuitarController {
    // any repeat in the colors already pressed results in the pick being pressed instead of the color that matches the direction
    private Dance dance;
    public GuitarToDanceAdapter(Dance dance) {
        this.dance = dance;
    }
    public void PressFretButton(colors button) {
        System.out.println("Adapter pressed " + button.name());
        if (button.name() == "GREEN") {
            this.dance.Step(DanceController.direction.FORWARD);
        }
        else if (button.name() == "RED") {
            this.dance.Step(DanceController.direction.LEFT);
        }
        else if (button.name() == "YELLOW") {
            this.dance.Step(DanceController.direction.RIGHT);
        }
        else if (button.name() == "BLUE") {
            this.dance.Step(DanceController.direction.BACK);
        }
        else if (button.name() == "ORANGE") {
            this.dance.Step(DanceController.direction.MIDDLE);
        }
    }
    public void PressPick() {
        System.out.println("Adapter presses pick, but nothing happened.");
    }
    public void PressTremelo() {
        System.out.println("Adapter presses tremelo, but nothing happened.");
    }
}