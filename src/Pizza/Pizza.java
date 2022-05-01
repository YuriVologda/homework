package Pizza;

public class Pizza {
    private String name;
    private boolean cheese; // сыр
    private boolean yeastDough; //тесто дрожжевое
    private boolean mozzarella; // Сыр Моцарелла
    private boolean tomatoSauce; // Томатный соус
    private boolean smokedSausages; // Копченые колбаски
    private boolean ham; // Ветчина
    private boolean mushrooms; //шампиньоны
    private boolean bacon; // бекон
    private boolean driedBasil; // Сушеный басилик
    private boolean freshTomatoes; // Свежие помидоры
    private boolean pepperoniSausage; // Колбаса Пепперони
    private boolean cannedPineapple; // Ананас консервированный

    public boolean isCheese() {
        return cheese;
    }

    public boolean isYeastDough() {
        return yeastDough;
    }

    public boolean isMozzarella() {
        return mozzarella;
    }

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public boolean isSmokedSausages() {
        return smokedSausages;
    }

    public boolean isHam() {
        return ham;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isDriedBasil() {
        return driedBasil;
    }

    public boolean isFreshTomatoes() {
        return freshTomatoes;
    }

    public boolean isPepperoniSausage() {
        return pepperoniSausage;
    }

    public boolean isCannedPineapple() {
        return cannedPineapple;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setYeastDough(boolean yeastDough) {
        this.yeastDough = yeastDough;
    }

    public void setMozzarella(boolean mozzarella) {
        this.mozzarella = mozzarella;
    }

    public void setTomatoSauce(boolean tomatoSauce) {
        this.tomatoSauce = tomatoSauce;
    }

    public void setSmokedSausages(boolean smokedSausages) {
        this.smokedSausages = smokedSausages;
    }

    public void setHam(boolean ham) {
        this.ham = ham;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public void setDriedBasil(boolean driedBasil) {
        this.driedBasil = driedBasil;
    }

    public void setFreshTomatoes(boolean freshTomatoes) {
        this.freshTomatoes = freshTomatoes;
    }

    public void setPepperoniSausage(boolean pepperoniSausage) {
        this.pepperoniSausage = pepperoniSausage;
    }

    public void setCannedPineapple(boolean cannedPineapple) {
        this.cannedPineapple = cannedPineapple;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Вы заказали пиццу " + name + ". В этой пиццуньке есть:\n");
        if (isYeastDough()){
            str.append("вкуснейшее тесто\n");
        }
        if (isCheese()){
            str.append("сырочек\n");
        }
        return str.toString();
    }
}
