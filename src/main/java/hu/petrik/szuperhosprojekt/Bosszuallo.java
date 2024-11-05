package hu.petrik.szuperhosprojekt;

abstract class Bosszuallo implements Szuperhos {
    private Float szuperero;
    private Boolean vanEGyengesege;

    public Bosszuallo(Float szuperero, Boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract Boolean megmentiAVilagot();

    @Override
    public Boolean legyoziE(String Szuperhos) {
        if(vanEGyengesege && szuperero > mekkoraAzEreje())
        {
            return true;
        } else if (Szuperhos=="Batman") {
            
        } else {
            return false;
        }
    }
    @Override
    public Float mekkoraAzEreje() {
        return szuperero;
    }
}
