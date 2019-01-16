package Lesson12.magazine;

import java.util.Arrays;

public class Tovar {
    private String mainName;
    private String articul;
    private int price;

    private Xarakteristika xarakteristika;
    private String shortInfo;
    private Photo photoMain;
    private Photo[] dopPhoto = new Photo[10];
    private String mainInfo;
    private Tovar[] recomTovar = new Tovar[10];

    public Tovar() {

    }

    public Tovar(Xarakteristika xarakteristika, String shortInfo, Photo photoMain, Photo[] dopPhoto, String mainInfo, Tovar[] recomTovar) {
        this.xarakteristika = xarakteristika;
        this.shortInfo = shortInfo;
        this.photoMain = photoMain;
        this.dopPhoto = dopPhoto;
        this.mainInfo = mainInfo;
        this.recomTovar = recomTovar;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getArticul() {
        return articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Xarakteristika getXarakteristika() {
        return xarakteristika;
    }

    public void setXarakteristika(Xarakteristika xarakteristika) {
        this.xarakteristika = xarakteristika;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public void setShortInfo(String shortInfo) {
        this.shortInfo = shortInfo;
    }

    public Photo getPhotoMain() {
        return photoMain;
    }

    public void setPhotoMain(Photo photoMain) {
        this.photoMain = photoMain;
    }

    public Photo[] getDopPhoto() {
        return dopPhoto;
    }

    public void addPhotoToPhotos(Photo photoToAdd) {
        for (int i = 0; i < dopPhoto.length; i++) {
            if (dopPhoto[i] == null) {
                dopPhoto[i] = photoToAdd;
            }
            break;
        }
    }

    public String getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(String mainInfo) {
        this.mainInfo = mainInfo;
    }

    public Tovar[] getRecomTovar() {
        return recomTovar;
    }

    public void setRecomTovar(Tovar[] recomTovar) {
        this.recomTovar = recomTovar;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "mainName='" + mainName + '\'' + '\n' +
                ", articul='" + articul + '\'' + '\n' +
                ", price=" + price + '\n' +
                ", xarakteristika=" + xarakteristika + '\n' +
                ", shortInfo='" + shortInfo + '\'' + '\n' +
                ", photoMain=" + photoMain + '\n' +
                ", dopPhoto=" + Arrays.toString(dopPhoto) + '\n' +
                ", mainInfo='" + mainInfo + '\'' + '\n' +
                ", recomTovar=" + Arrays.toString(recomTovar) + '\n' +
                '}';
    }
}
