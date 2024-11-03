package hu.petrik.szuperhosprojekt;

    public class Batman implements Szuperhos, Milliardos {
    private float lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public float mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public boolean legyoziE(Szuperhos hos) {
        return hos.mekkoraAzEreje() < lelemenyesseg;
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return String.format("Batman: leleményesség: %.0f", lelemenyesseg);
    }
}
