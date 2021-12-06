package zad3;

public class SportskiKlub implements Comparable<SportskiKlub> {
    private String ime;
    private String sport;
    private int brojClenovi;

    public SportskiKlub(String ime, String sport, int brojClenovi) {
        this.ime = ime;
        this.sport = sport;
        this.brojClenovi = brojClenovi;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getSport() {
        return this.sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getBrojClenovi() {
        return this.brojClenovi;
    }

    public void setBrojClenovi(int brojClenovi) {
        this.brojClenovi = brojClenovi;
    }

    public int compareTo(SportskiKlub obj) {
        return this.ime.equals(obj.ime) ? 0 : this.ime.compareTo(obj.ime);
    }
}

