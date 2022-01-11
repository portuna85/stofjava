package Oop;

import java.util.Objects;

public class TvFactory {
    private static TvFactory tvFactoryInstance;
    private String name;
    public int price;

    public static TvFactory getInstance() {
        if (tvFactoryInstance == null) {
            tvFactoryInstance = new TvFactory();
        }
        return tvFactoryInstance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TvFactory)) return false;
        TvFactory tvFactory = (TvFactory) o;
        return price == tvFactory.price && Objects.equals(name, tvFactory.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}