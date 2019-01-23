package Lesson16;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private int starCount;
    private String material;
    private int dateOfIssue;
    private int nomenal;

    public Coin() {

    }

    public Coin(int starCount, String material, int dateOfIssue, int nomenal) {
        this.starCount = starCount;
        this.material = material;
        this.dateOfIssue = dateOfIssue;
        this.nomenal = nomenal;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public int getNomenal() {
        return nomenal;
    }

    public void setNomenal(int nomenal) {
        this.nomenal = nomenal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "starCount=" + starCount +
                ", material='" + material + '\'' +
                ", dateOfIssue=" + dateOfIssue +
                ", nomenal=" + nomenal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return starCount == coin.starCount &&
                dateOfIssue == coin.dateOfIssue &&
                nomenal == coin.nomenal &&
                Objects.equals(material, coin.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starCount, material, dateOfIssue, nomenal);
    }

    @Override
    public int compareTo(Coin o) {
        int year1 = this.getDateOfIssue();
        int year2 = o.getDateOfIssue();

        if (year1 != year2) {
            return year1 - year2;
        }

        int nominal1 = this.getNomenal();
        int nominal2 = o.getNomenal();
        if (nominal1 != nominal2) {
            return nominal1 - nominal2;
        }

        int star1 = this.getStarCount();
        int star2 = o.getStarCount();
        if (star1 != star2) {
            return star1 - star2;
        }

        return this.getMaterial().compareTo(o.getMaterial());
    }
}
