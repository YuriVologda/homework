package Pizza;

public class PizzaFactory {
    private Pizza pizza;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private Pizza pizza4;

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
        pizza1 = new Pizza();
        pizza1.setName("Пепперони");
        pizza1.setYeastDough(true);
        pizza1.setMozzarella(true);
        pizza1.setPepperoniSausage(true);
        pizza1.setTomatoSauce(true);
        pizza1.setDriedBasil(true);
        return pizza1;
    }

    public Pizza crateAlcopchene() {
        pizza2 = new Pizza();
        pizza2.setName("Аль-Копчене");
        pizza2.setYeastDough(true);
        pizza2.setMozzarella(true);
        pizza2.setTomatoSauce(true);
        pizza2.setSmokedSausages(true);
        pizza2.setHam(true);
        pizza2.setMushrooms(true);
        pizza2.setBacon(true);
        pizza2.setDriedBasil(true);
        return pizza2;
    }

    public Pizza crateGavayskaya() {
        pizza3 = new Pizza();
        pizza3.setName("Гавайская");
        pizza3.setYeastDough(true);
        pizza3.setMozzarella(true);
        pizza3.setHam(true);
        pizza3.setTomatoSauce(true);
        pizza3.setCannedPineapple(true);
        pizza3.setDriedBasil(true);
        return pizza3;


    }

    public Pizza crateDonBacon(){
        pizza4 = new Pizza();
        pizza4.setName("Дон Бекон");
        pizza4.setYeastDough(true);
        pizza4.setMozzarella(true);
        pizza4.setBacon(true);
        pizza4.setTomatoSauce(true);
        pizza4.setFreshTomatoes(true);
        pizza4.setDriedBasil(true);
        return pizza4;
    }

}
