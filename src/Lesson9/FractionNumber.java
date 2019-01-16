package Lesson9;

public class FractionNumber {
    private int chislitel;
    private int znamenatel;

    public FractionNumber() {

    }

    public FractionNumber(int chisl, int znam) {
        chislitel = chisl;
        znamenatel = znam;
    }

    public void setChislitel(int chisl) {
        chislitel = chisl;
    }

    public void setZnamenatel(int znam) {
        znamenatel = znam;
    }

    public int getChislitel() {
        return chislitel;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public FractionNumber add(FractionNumber drob2) {
        int resultZnam = this.getZnamenatel() * drob2.getZnamenatel();
        int resultChisl = (this.getChislitel() * drob2.getZnamenatel()) + (this.getZnamenatel() * drob2.getChislitel());

        FractionNumber result = new FractionNumber();
        result.setChislitel(resultChisl);
        result.setZnamenatel(resultZnam);
        return result;
    }
}

