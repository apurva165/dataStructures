package innerClasses;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private Boolean clutchIsIn = false;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGears(int number, double ratio) {
        this.gears.add(new Gear(number, ratio));
    }

    public void changeGear(int newGear) {
        System.out.println("new gear added " + newGear);
    }


    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }


        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
