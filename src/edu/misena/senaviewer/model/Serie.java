package edu.misena.senaviewer.model;

public class Serie extends Film {

    // Atributos
    public boolean viewed;
    private int timeViewed;
    private int sessionQuantity;

    // Constructor
    public Serie(String title, String gender, String creator, int duration,boolean viewed, int timeViewed, int sessionQuantity) {
        super(title, gender, creator, duration);
        this.viewed=viewed;
        this.timeViewed = timeViewed;
        this.sessionQuantity = sessionQuantity;
    }

    // Getters y Setters

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Serie{" +
                "Id=" + getId() +
                ", Título='" + getTitle() + '\'' +
                ", Género='" + getGender() + '\'' +
                ", Creador='" + getCreator() + '\'' +
                ", Duración=" + getDuration() + " minutos" +
                ", Visto=" + getViewed() + "Sí  o No"+
                ", Tiempo Visto=" + getTimeViewed() +
                ", Cantidad de sesiones=" + sessionQuantity +
                '}';
    }
}
