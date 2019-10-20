package sk.itsovy.kutka;

public class Fragment {
    private int numerator;
    private int denominator;

    public Fragment(int numerator, int denominator) {
        if (denominator == 0)
            denominator = 1;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fragment(Fragment other) {
        numerator = other.getNumerator();
        denominator = other.getDenominator();

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void changeToBasicShape() {
        int commonDivisor = getTheLargestCommonDivisor();
        numerator = numerator / commonDivisor;
        denominator = denominator / commonDivisor;
    }

    public void extendFragment(int value) {
        if (value != 0) {
            numerator = numerator * value;
            denominator = denominator * value;
        }
    }

    public double getRealValue() {
        return (double) numerator / denominator;
    }

    public MixedNumber getMixedNumber() {
        int value = numerator / denominator;
        Fragment f = new Fragment(numerator % denominator, denominator);
        return new MixedNumber(value, f);
    }

    public void reverse() {
        int temp = 0;
        temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public void opposite() {
        numerator = numerator * (-1);

    }

    public Fragment copy() {
        return new Fragment(numerator, denominator);

    }

    private int getTheLargestCommonDivisor() {
        int absNumerator = Math.abs(numerator);
        int absDenominator = Math.abs(denominator);
        int commonDivisor = absNumerator < absDenominator ? absNumerator : absDenominator;
	/*	if (numerator < denominator)
			commonDivisor = numerator;
		else
			commonDivisor = denominator;
	*/
        while ((absNumerator % commonDivisor != 0 || absDenominator % commonDivisor != 0)) {
            commonDivisor--;
        }
        return commonDivisor;

    }

    public boolean isFragmentBasicShape() {
        if (getTheLargestCommonDivisor() == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
