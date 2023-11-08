class Main { 
  
    // Main driver method 
    public static void main(String[] args) { 
        Guitar g = new Guitar();
        Dance d = new Dance();
        DanceToGuitarAdapter danceToGuitarAdapter = new DanceToGuitarAdapter(g);
        GuitarToDanceAdapter guitarToDanceAdapter = new GuitarToDanceAdapter(d);
        System.out.println("TESTING GUITAR");
        g.PressFretButton(Guitar.colors.GREEN);
        g.PressFretButton(Guitar.colors.RED);
        g.PressFretButton(Guitar.colors.YELLOW);
        g.PressFretButton(Guitar.colors.BLUE);
        g.PressFretButton(Guitar.colors.ORANGE);
        System.out.println("TESTING DANCE");
        d.Step(Dance.direction.FORWARD);
        d.Step(Dance.direction.LEFT);
        d.Step(Dance.direction.RIGHT);
        d.Step(Dance.direction.BACK);
        d.Step(Dance.direction.MIDDLE);
        System.out.println("TESTING DANCE TO GUITAR ADAPTER");
        danceToGuitarAdapter.Step(DanceController.direction.FORWARD);
        danceToGuitarAdapter.Step(DanceController.direction.FORWARD);
        danceToGuitarAdapter.Step(DanceController.direction.LEFT);
        danceToGuitarAdapter.Step(DanceController.direction.RIGHT);
        danceToGuitarAdapter.Step(DanceController.direction.BACK);
        danceToGuitarAdapter.Step(DanceController.direction.MIDDLE);
        danceToGuitarAdapter.Step(DanceController.direction.FORWARD);
        danceToGuitarAdapter.Step(DanceController.direction.MIDDLE);
        System.out.println("TESTING GUITAR TO DANCE ADAPTER");
        guitarToDanceAdapter.PressPick();
        guitarToDanceAdapter.PressTremelo();
        guitarToDanceAdapter.PressFretButton(Guitar.colors.GREEN);
        guitarToDanceAdapter.PressFretButton(Guitar.colors.RED);
        guitarToDanceAdapter.PressFretButton(Guitar.colors.YELLOW);
        guitarToDanceAdapter.PressFretButton(Guitar.colors.BLUE);
        guitarToDanceAdapter.PressFretButton(Guitar.colors.ORANGE);
    } 
}