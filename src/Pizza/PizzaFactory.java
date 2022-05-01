package Pizza;

public class PizzaFactory {
    private Pizza pizza;

    public Pizza createMargarita() {
        pizza = new Pizza();
        pizza.setName("Маргарита");
        pizza.setYeastDough(true);
        pizza.setMozzarella(true);
        pizza.setFreshTomatoes(true);
        pizza.setTomatoSauce(true);
        pizza.setDriedBasil(true);
        return pizza;

    }
}
