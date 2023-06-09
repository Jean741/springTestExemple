package tn.ondev.testJU.entities;

public class CurrencyUnit {
    private final String unit;

    private CurrencyUnit(String unit) {
        this.unit = unit;
    }

    public static CurrencyUnit of(String unit) {
        return new CurrencyUnit(unit);
    }

    public String getUnit() {
        return unit;
    }
}