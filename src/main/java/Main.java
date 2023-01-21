import java.util.Scanner;

public class Main {
    //Правило Magic - вместо "магических чисел" используем константы
    public static final char RUB = (char)0x20BD;

    public static void main(String[] args) {
        //Правило LSP - наследники класса Products полностью играют роль предка
        Products[] products = {new Candies(), new Flowers(), new Coffee(), new Sausage(), new Wine()};
        //Правило DRY - не повторяй свой код, список продуктов выносим в отдельный метод
        printProducts(products);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара, пробел, количество или `end` ");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        printProducts(products);
        printBasket(products);
    }

    //Правило DRY - не повторяй свой код, подчеркивание чека выносим в отдельный метод
    private static void printCheck() {
        System.out.println("---------------------------------------------------");
    }

    private static void printProducts(Products[] products) {
        System.out.println("Список возможных товаров для покупки: ");
        printCheck();
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Products[] products) {
        int sumProducts = 0;
        System.out.println("Ваш чек-лист: ");
        printCheck();
        for (Products product : products) {
            if (product.getCount() != 0) {
                sumProducts += product.getCount() * product.getPrices();
                System.out.println(product + ":" + " [количество]= " + product.getCount() + " шт."
                        + " [цена]= " + product.getPrices() + " " + RUB
                        + " [сумма]= " + product.getCount() * product.getPrices() + " " + RUB);
            }
        }
        printCheck();
        System.out.println("Ваш итог: " + sumProducts + " " + RUB);
    }
}
