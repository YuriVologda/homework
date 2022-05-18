package Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza myPizza = factory.createMargarita();
        Pizza myPizza2 = factory.cratePepperoni();
        Pizza myPizza3 = factory.crateAlcopchene();
        Pizza myPizza4 = factory.crateGavayskaya();
        Pizza myPizza5 = factory.crateDonBacon();


        System.out.println(myPizza5.toString());
        System.out.println(myPizza.toString());
        System.out.println(myPizza2.toString());
        System.out.println(myPizza3.toString());
        System.out.println(myPizza4.toString());
    }
}
