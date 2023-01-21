public class Coffee extends Products { //Правило SRP - класс описывает только собственные свойства продукта
    private final String name = "Кофе";
    private final int prices = 500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrices() {
        return prices;
    }
}
