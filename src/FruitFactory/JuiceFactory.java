package FruitFactory;

import Fruit.AppleFruit;
import Fruit.Fruit;
import Fruit.OrangeFruit;
import Fruit.CherryFruit;

/**
 * Created by matt on 11/28/16.
 */
public class JuiceFactory {
    public Fruit[] fruits;
    public JuiceConcentrate conc = null;
    public PackageType pack;

    public JuiceFactory(Fruit[] f, PackageType p) {
        this.fruits = f;
        this.pack = p;

    }
    public JuiceFactory(Fruit[] f, PackageType p, JuiceConcentrate con) {
        this.fruits = f;
        this.pack = p;
        this.conc = con;

    }

    public Product createConcentrate() {
        return new JuiceConcentrate(pack);
    }

    public Product createJuice() {
        long o = 0;
        long ch = 0;
        long a = 0;

        for (int i = 0; i < fruits.length; ++i) {
            if (fruits[i].getType() == new AppleFruit().getType()) a++;
            if (fruits[i].getType() == new OrangeFruit().getType()) o++;
            if (fruits[i].getType() == new CherryFruit().getType()) ch++;
        }
        if (a > 0 && o > 0 && ch > 0) {
            return new MultifruitJuice(pack);
        } else if (a > 0 && o == 0 && ch == 0 && conc!= null) {
            return new AppleJuice(pack, conc);
        } else if (a > 0 && o == 0 && ch == 0) {
            return new AppleJuice(pack);
        }
        return null;
    }

    public Product createJuiceWithConcentrare(JuiceConcentrate conc) {
        this.conc = conc;
        return createJuice();
    }

}
