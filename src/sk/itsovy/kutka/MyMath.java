package sk.itsovy.kutka;

public class MyMath {

    public Fragment add(Fragment a, Fragment b) {
        Fragment result = null;
        int commonDenominator = a.getDenominator() * b.getDenominator();
        result = new Fragment(a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator(), commonDenominator);
        return result;
    }

    public Fragment add(Fragment a, int value) {
        Fragment temp = new Fragment(value, 1);
        return add(temp, a);
    }

    public MixedNumber add(MixedNumber a, MixedNumber b) {
        Fragment one = new Fragment(a.convertToFragment());
        Fragment two = new Fragment(b.convertToFragment());
        Fragment result = add(one, two);
        return result.getMixedNumber();
    }


    public static Fragment sub(Fragment a, Fragment b) {
        Fragment result = null;
        int commonDenominator = a.getDenominator() * b.getDenominator();
        result = new Fragment(a.getNumerator() * b.getDenominator() - a.getDenominator() * b.getNumerator(), commonDenominator);
        return result;
    }

    public MixedNumber sub(MixedNumber a, MixedNumber b) {
        Fragment one = new Fragment(a.convertToFragment());
        Fragment two = new Fragment(b.convertToFragment());
        Fragment result = sub(one, two);
        return result.getMixedNumber();

    }

    public Fragment mul(Fragment a, Fragment b) {
        Fragment result = null;
        result = new Fragment(a.getNumerator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
        return result;
    }

    //polymorfizmus
    public Fragment mul(Fragment a, int value) {
        Fragment result = null;
        result = new Fragment(a.getNumerator() * value, a.getDenominator());
        return result;
    }

    public MixedNumber mul(MixedNumber a, MixedNumber b) {
        Fragment one = new Fragment(a.convertToFragment());
        Fragment two = new Fragment(b.convertToFragment());
        Fragment result = mul(one, two);
        return result.getMixedNumber();

    }

    public Fragment div(Fragment a, Fragment b) {
        Fragment result = null;
        result = new Fragment(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());
        return result;
    }

    public MixedNumber div(MixedNumber a, MixedNumber b) {
        Fragment one = new Fragment(a.convertToFragment());
        Fragment two = new Fragment(b.convertToFragment());
        Fragment result = div(one, two);
        return result.getMixedNumber();

    }
}
