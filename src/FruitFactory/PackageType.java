package FruitFactory;

/**
 * Created by matt on 11/28/16.
 */
public enum PackageType {
    A, B;
    public String toString() {
        String s = "";
        switch (this) {
            case A: s = "Type A"; break;
            case B: s = "Type B"; break;
        }
        return s;
    }
}
