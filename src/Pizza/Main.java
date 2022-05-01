package Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza myPizza = factory.createMargarita();
        System.out.println(myPizza.toString());

    }
}
