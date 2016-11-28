package FruitFactory;

/**
 * Created by matt on 11/28/16.
 */
public class AppleJuice extends Product {

    public AppleJuice(PackageType pack){
        setJuice(JuiceType.APPLEJUICE);
        setPack(pack);
    }
    public AppleJuice(PackageType pack, JuiceConcentrate c){
        setJuice(JuiceType.APPLEJUICEWITHCONCENTRATE);
        setPack(pack);
    }

}
