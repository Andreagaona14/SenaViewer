package edu.misena.senaviewer.model;

public class Serie extends Film {

    //Atributos
    private int timeViewed;
    private int sessionQuantity;

    //Constructor
    public Serie(String title, String gender, String creator, int duration, int timeViewed, int sessionQuantity ){
        super( title, gender, creator, duration);
        this.timeViewed = timeViewed;
        this.sessionQuantity =sessionQuantity;
    }

    // Getter y Setter

    public int getTimeViewed(){
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed){
        this.timeViewed = timeViewed;
    }
    //

    public int getsessionQuantity(){
        return sessionQuantity;
    }

    public void setsessionQuantity(int sessionQuantity){
        this.sessionQuantity = sessionQuantity;
    }
}
