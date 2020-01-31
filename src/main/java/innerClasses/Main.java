package innerClasses;

import java.lang.reflect.GenericArrayType;

public class Main {
    public static void main(String[] args) {
        Gearbox mLearn  = new Gearbox(6);
        mLearn.addGears(1,5.63);
        mLearn.addGears(2,7.0);

        mLearn.operateClutch(true);
        mLearn.changeGear(1);
        mLearn.operateClutch(false);

        Gearbox.Gear gear  = mLearn.new Gear(2,2.3);

//        Gearbox.Gear first = mLearn.new Gear (1 ,1.1);
//        first.driveSpeed(100);


    }
}
