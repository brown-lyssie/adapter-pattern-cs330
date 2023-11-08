public class DanceToGuitarAdapter implements DanceController {
    // any repeat in the colors already pressed results in the pick being pressed instead of the color that matches the direction
    private Guitar guitar;
    private boolean[] buttonPressed = {false,false,false,false,false};
    public DanceToGuitarAdapter(Guitar guitar) {
        this.guitar = guitar;
    }
    public void Step (direction dir) {
        if(dir.name() ==  "FORWARD"){
            System.out.println("Adapter pressed FORWARD");
            // already pressed?
            if (buttonPressed[0]) {
                guitar.PressPick();
                resetButtonPresses();
            }
            else {
                guitar.PressFretButton(Guitar.colors.GREEN);
                buttonPressed[0] = true;
            }
        }
        else if (dir.name() ==  "LEFT"){
            System.out.println("Adapter pressed LEFT");
            if (buttonPressed[1]) {
                guitar.PressPick();
                resetButtonPresses();
            }
            else {
                guitar.PressFretButton(Guitar.colors.RED);
                buttonPressed[1] = true;
            }
        }
        else if (dir.name() == "RIGHT"){
            System.out.println("Adapter pressed RIGHT");
            if (buttonPressed[2]) {
                guitar.PressPick();
                resetButtonPresses();
            }
            else {
                guitar.PressFretButton(Guitar.colors.YELLOW);
                buttonPressed[2] = true;
            }
        }
        else if (dir.name() == "BACK"){
            System.out.println("Adapter pressed BACK");
            if (buttonPressed[3]) {
                guitar.PressPick();
                resetButtonPresses();
            }
            else {
                guitar.PressFretButton(Guitar.colors.BLUE);
                buttonPressed[3] = true;
            }
        }
        else if (dir.name() ==  "MIDDLE"){
            System.out.println("Adapter pressed MIDDLE");
            if (buttonPressed[4]) {
                guitar.PressPick();
                resetButtonPresses();
            }
            else {
                guitar.PressFretButton(Guitar.colors.ORANGE);
                buttonPressed[4] = true;
            }
        }
           
    }
    private void resetButtonPresses() {
        for (int i = 0; i < 5; i++) {
            this.buttonPressed[i] = false;
        }
    }
}