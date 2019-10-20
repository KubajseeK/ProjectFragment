package sk.itsovy.kutka;

/**
 * @author Jakub Kutka
 */

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double convert(double amount, String code) {
        switch (code) {
            case "GBP":
                amount *= 0.86;
                break;
            case "CHF":
                amount *= 1.60;
                break;
            case "HUF":
                amount *= 330.52;
                break;
            case "TRY":
                amount *= 6.47;
                break;
            case "HRK":
                amount *= 7.44;
                break;
            default:
                amount = -1;
        }
        return amount;
    }

    public static double loan(double value, double interest, int months) {
        if (value > 0 && interest > 0 && months > 0) {
            return (value * (interest / 100) + value) / months;
        } else {
            return -1;
        }
    }
}
