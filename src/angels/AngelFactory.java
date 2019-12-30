package angels;

import angels.type.DamageAngel;
import angels.type.DarkAngel;
import angels.type.Dracula;
import angels.type.GoodBoy;
import angels.type.LevelUpAngel;
import angels.type.LifeGiver;
import angels.type.SmallAngel;
import angels.type.Spawner;
import angels.type.TheDoomer;
import angels.type.XPAngel;

import java.io.IOException;

public final class AngelFactory {
    public Angel createAngel(final String angelType) throws IOException {
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
