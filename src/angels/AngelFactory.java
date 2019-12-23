package angels;

import angels.type.*;

import java.io.IOException;
import java.util.function.DoubleBinaryOperator;

public class AngelFactory {
    public Angel createAngel(String angelType) throws IOException {
        if (angelType.equals("DamageAngel")) {
           return new DamageAngel();
        }
        if (angelType.equals("DarkAngel")) {
            return new DarkAngel();
        }
        if (angelType.equals("Dracula")) {
            return new Dracula();
        }
        if (angelType.equals("GoodBoy")) {
            return new GoodBoy();
        }
        if (angelType.equals("LevelUpAngel")) {
            return new LevelUpAngel();
        }
        if (angelType.equals("LifeGiver")) {
            return new LifeGiver();
        }
        if (angelType.equals("SmallAngel")) {
            return new SmallAngel();
        }
        if (angelType.equals("Spawner")) {
            return new Spawner();
        }
        if (angelType.equals("TheDoomer")) {
            return new TheDoomer();
        }
        if (angelType.equals("XPAngel")) {
            return new XPAngel();
        }
        return null;
    }
}
