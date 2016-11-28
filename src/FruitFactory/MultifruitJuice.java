package FruitFactory;

/**
 * Created by matt on 11/28/16.
 */
public class MultifruitJuice extends Product {

    public MultifruitJuice(PackageType p ) {
        setJuice(JuiceType.MULTIFRUIT);
        setPack(p);
    }
}

