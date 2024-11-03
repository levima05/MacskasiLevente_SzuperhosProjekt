package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private final float szuperero;
    private final boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public float getSzuperero() {
        return szuperero;
    }

    @Override
    public float mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos hos) {
        if (hos instanceof Bosszuallo) {
            Bosszuallo bosszualloHos = (Bosszuallo) hos;
            if (bosszualloHos.vanEGyengesege && this.szuperero > bosszualloHos.szuperero) {
                return true;
            }
        }
        if (hos instanceof Batman) {
            return this.szuperero > 2 * hos.mekkoraAzEreje();
        }
        return false;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public String toString() {
        return String.format("Szupererő: %.2f; van gyengesége: %s", szuperero, vanEGyengesege ? "igen" : "nem");
    }
}
