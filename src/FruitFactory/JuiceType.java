package FruitFactory;

/**
 * Created by matt on 11/28/16.
 */
public enum JuiceType {
    APPLEJUICE, ORANGEJUICE, CHERRYJUICE, MULTIFRUIT, APPLEJUICEWITHCONCENTRATE, CONCENTRATE;
    public String toString() {
        String s = "";
        switch (this) {
            case CONCENTRATE: s = "Concantrate";break;
            case APPLEJUICEWITHCONCENTRATE: s = "AppleJuiceWithConcentrate";break;
            case ORANGEJUICE: s = "OrangeJuice"; break;
            case APPLEJUICE: s = "AppleJuice"; break;
            case CHERRYJUICE: s = "CherryJuice"; break;
            case MULTIFRUIT: s = "MultiFruitJuice"; break;
        }
        return s;
    }
}
