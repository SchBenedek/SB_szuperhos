package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos {
    private float lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public Boolean legyoziE(String Szuperhos) {
        return null;
    }

    @Override
    public Float mekkoraAzEreje() {
        return (lelemenyesseg * 2);
    }

    public Boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < this.lelemenyesseg;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return "Batman: leleményesség: " + lelemenyesseg;
    }
}
