package Model;

public class Model {
    private String title;
    private String miembro;

    private String course = "2º DAM";
    private String module = "Desarrollo de Interfaces";

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
