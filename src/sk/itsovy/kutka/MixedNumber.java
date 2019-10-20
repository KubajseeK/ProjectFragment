package sk.itsovy.kutka;

public class MixedNumber {
    private int number;
    private Fragment fragment;

    public MixedNumber(int number, Fragment fragment) {
        this.number = number;
        this.fragment = fragment;
        fragment.changeToBasicShape();
    }

    public MixedNumber(int number, int numerator, int denominator) {
        this.number = number;
        this.fragment = new Fragment(numerator, denominator);
        fragment.changeToBasicShape();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public String toString() {
        return number + " " + fragment.toString();
    }

    public Fragment convertToFragment() {
        Fragment newFragment =
                new Fragment(number * fragment.getDenominator() + fragment.getNumerator(), fragment.getDenominator());
        return newFragment;
    }

    public double getRealValue() {
        return number + fragment.getRealValue();
    }

}
