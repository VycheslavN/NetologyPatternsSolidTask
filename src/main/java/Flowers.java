public class Flowers extends Products { //Правило SRP - класс описывает только собственные свойства продукта
    private final String name = "Цветы";
    private final int prices = 200;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrices() {
        return prices;
    }
}
