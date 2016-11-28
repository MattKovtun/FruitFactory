package Fruit;

/**
 * Created by matt on 11/28/16.
 */
public abstract class Fruit {
    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    protected FruitType type;

}
