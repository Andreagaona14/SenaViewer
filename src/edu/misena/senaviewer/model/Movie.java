package edu.misena.senaviewer.model;

public class Movie extends Film{

    //Atributos
    private int timeViewed;

    //Constructor
    public Movie( String title, String gender, String creator,  int duration, int timeViewed ){
        super( title, gender, creator, duration);
       this.timeViewed = timeViewed;
    }


    // Getter y Setter
    public int getTimeViewed(){
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed){
        this.timeViewed = timeViewed;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Movie{" +
                "Id=" + getId() +
                ", Título='" + getTitle() + '\'' +
                ", Género='" + getGender() + '\'' +
                ", Creador='" + getCreator() + '\'' +
                ", Duración=" + getDuration() + " minutos" +
                ", Año=" + getYear() +
                ", Visto=" + getViewed() + "Sí  o No"+
                ", Tiempo visto=" + getTimeViewed() + " minutos" +
                '}';
    }

}
