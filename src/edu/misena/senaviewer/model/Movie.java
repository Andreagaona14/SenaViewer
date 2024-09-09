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

}
