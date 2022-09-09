package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inevro = 140;
        float indollar = 50;
        float expectedevro = 2;
        float expecteddollar = 0.8333333F;
        float euro = Converter.rubleToEuro(inevro);
        float dollar = Converter.rubleToDollar(indollar);
        boolean passedevro = expectedevro == euro;
        boolean passeddollar = expecteddollar == dollar;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are 2. Test result : " + passedevro);
        System.out.println("50 rubles are " + dollar + " dollar.");
        System.out.println("50 rubles are 0.8333333. Test result : " + passeddollar);
    }
}
