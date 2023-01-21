public class Wine extends Products { //Правило SRP - класс описывает только собственные свойства продукта
    private final String name = "Вино";
    private final int prices = 300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrices() {
        return prices;
    }
}
