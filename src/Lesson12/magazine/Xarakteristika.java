package Lesson12.magazine;

public class Xarakteristika {
    private double diametr;
    private double obiem;
    private String material;
    private String size;
    private String weight;

    public Xarakteristika() {

    }

    public Xarakteristika(double diametr, double obiem, String material, String size, String weight) {
        this.diametr = diametr;
        this.obiem = obiem;
        this.material = material;
        this.size = size;
        this.weight = weight;
    }

    public double getDiametr() {
        return this.diametr;
    }

    public double getObiem() {
        return this.obiem;
    }

    public String getMaterial() {
        return this.material;
    }

    public String  getSize() {
        return this.size;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public void setObiem(double obiem) {
        this.obiem = obiem;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(String  size) {
        this.size = size;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Xarakteristika{" +
                "diametr=" + diametr +
                ", obiem=" + obiem +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
