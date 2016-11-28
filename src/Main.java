import Fruit.AppleFruit;
import Fruit.CherryFruit;
import Fruit.Fruit;
import Fruit.OrangeFruit;
import FruitFactory.JuiceConcentrate;
import FruitFactory.JuiceFactory;
import FruitFactory.PackageType;



/**
 * Created by matt on 11/28/16.
 */
public class Main {
    public static void main(String[] args) {
        Fruit a = new OrangeFruit();
        Fruit b = new AppleFruit();
        Fruit c = new CherryFruit();
        Fruit[] order = new Fruit[]{a, b, c};
        System.out.println("From this list of fruit ");
        for (int i = 0; i < order.length; ++i){
            System.out.println(order[i].getType());
        }
        System.out.println("Creating this juice ");
        JuiceFactory myFactory = new JuiceFactory(order, PackageType.A);
        System.out.println(myFactory.createJuice().getJuice());
        System.out.println("Package type : " + myFactory.createJuice().getPack());
        System.out.println();

        JuiceConcentrate myConcentrate = new JuiceConcentrate();
        System.out.println("From this list of fruit ");
        Fruit[] order2 = new Fruit[]{b};
        for (int i = 0; i < order2.length; ++i){
            System.out.println(order2[i].getType());
        }
        System.out.println(myConcentrate.getJuice());
        System.out.println("Creating this juice ");

        JuiceFactory myFactory1 = new JuiceFactory(order2,PackageType.B,myConcentrate);
        System.out.println(myFactory1.createJuice().getJuice());
        System.out.println("Package type : " + myFactory1.createJuice().getPack());
    }
}
