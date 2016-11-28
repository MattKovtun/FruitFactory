package FruitFactory;

/**
 * Created by matt on 11/28/16.
 */
abstract public class Product {
    protected PackageType pack;

    public JuiceType getJuice() {
        return juice;
    }

    public void setJuice(JuiceType juice) {
        this.juice = juice;
    }

    protected JuiceType juice;

    public PackageType getPack() {
        return pack;
    }

    public void setPack(PackageType pack) {
        this.pack = pack;
    }
}
