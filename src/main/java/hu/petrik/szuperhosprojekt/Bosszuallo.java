package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public Float mekkoraAzEreje() {
        return this.szuperero;
    }

    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            Bosszuallo ellenfel = (Bosszuallo) szuperhos;
            if (ellenfel.vanEGyengesege && ellenfel.mekkoraAzEreje() < this.szuperero) {
                return true;
            }
            if (ellenfel.vanEGyengesege && this.szuperero >= 2 * ellenfel.mekkoraAzEreje()) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean megmentiAVilagot();

    public float getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        String gyengeseg = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        return MessageFormat.format("Szupererő: {0}; {1}", szuperero, gyengeseg);
    }
}
