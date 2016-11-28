package Fruit;

/**
 * Created by matt on 11/28/16.
 */
public enum FruitType {
    ORANGE, CHERRY, APPLE;
    public String toString() {
        String s = "";
        switch (this) {
            case ORANGE: s = "ORANGE"; break;
            case APPLE: s = "APPLE"; break;
            case CHERRY: s = "CHERRY"; break;
        }
        return s;
    }
}
