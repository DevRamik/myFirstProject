package Lesson12.magazine;

public class Photo {
    private String path;
    private String alert;

    public Photo() {

    }

    public Photo(String path, String alert) {
        this.path = path;
        this.alert = alert;
    }

    public String getPath() {
        return this.path;
    }

    public String getAlert() {
        return this.alert;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "path='" + path + '\'' +
                ", alert='" + alert + '\'' +
                '}';
    }
}
