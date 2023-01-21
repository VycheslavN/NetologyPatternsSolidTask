public class Sausage extends Products { //Правило SRP - класс описывает только собственные свойства продукта
    private final String name = "Колбаса";
    private final int prices = 400;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrices() {
        return prices;
    }
}
