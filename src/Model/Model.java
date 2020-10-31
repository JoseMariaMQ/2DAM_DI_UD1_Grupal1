package Model;

public class Model {
    private String title;
    private String miembro;

    public Model(String title, String miembro) {
        this.title = title;
        this.miembro = miembro;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMiembro() {
        return miembro;
    }

    public void setMiembro(String miembro) {
        this.miembro = miembro;
    }
}
