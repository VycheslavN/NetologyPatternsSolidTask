public abstract class Products {
    private String name;
    private int prices;
    private int count;

    public String getName() {
        return name;
    }

    public Products setName(String name) {
        this.name = name;
        return this;
    }

    public int getCount() {
        return count;
    }

    public Products setCount(int count) {
        this.count += count;
        return this;
    }

    public int getPrices() {
        return prices;
    }

    public Products setPrices(int prices) {
        this.prices = prices;
        return this;
    }

    @Override
    public String toString() {
        return name;
    }
}

