
public class Candies extends Products { //Правило SRP - класс описывает только собственные свойства продукта
        private final String name = "Конфеты";
        private final int prices = 100;

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int getPrices() {
            return prices;
        }
}
