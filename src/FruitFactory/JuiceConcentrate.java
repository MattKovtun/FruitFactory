package FruitFactory;

/**
 * Created by matt on 11/28/16.
 */
public class JuiceConcentrate extends Product{
    public JuiceConcentrate(){
        setJuice(JuiceType.CONCENTRATE);
    }
    public JuiceConcentrate(PackageType pack){
        setJuice(JuiceType.CONCENTRATE);
        setPack(pack);
    }
}
