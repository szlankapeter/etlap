package étel;

public class Etel {
    private String nev;
    private int ar;

    public Etel(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "Etel{" + "nev=" + nev + ", ar=" + ar + '}';
    }
    
    
    
}
