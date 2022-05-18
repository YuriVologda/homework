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

    public Pizza cratePepperoni() {
        pizza = new Pizza();
        pizza.setName("Пепперони");
        pizza.setYeastDough(true);
        pizza.setMozzarella(true);
        pizza.setPepperoniSausage(true);
        pizza.setTomatoSauce(true);
        pizza.setDriedBasil(true);
        return pizza;
    }

    public Pizza crateAlcopchene() {
        pizza = new Pizza();
        pizza.setName("Аль-Копчене");
        pizza.setYeastDough(true);
        pizza.setMozzarella(true);
        pizza.setTomatoSauce(true);
        pizza.setSmokedSausages(true);
        pizza.setHam(true);
        pizza.setMushrooms(true);
        pizza.setBacon(true);
        pizza.setDriedBasil(true);
        return pizza;
    }

    public Pizza crateGavayskaya() {
        pizza = new Pizza();
        pizza.setName("Гавайская");
        pizza.setYeastDough(true);
        pizza.setMozzarella(true);
        pizza.setHam(true);
        pizza.setTomatoSauce(true);
        pizza.setCannedPineapple(true);
        pizza.setDriedBasil(true);
        return pizza;


    }

    public Pizza crateDonBacon(){
        pizza = new Pizza();
        pizza.setName("Дон Бекон");
        pizza.setYeastDough(true);
        pizza.setMozzarella(true);
        pizza.setBacon(true);
        pizza.setTomatoSauce(true);
        pizza.setFreshTomatoes(true);
        pizza.setDriedBasil(true);
        return pizza;
    }

}
