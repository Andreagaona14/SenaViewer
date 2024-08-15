package edu.misena.senaviewer.model;

public class Serie {

    //Atributos
    private int id;
    private String title;
    private String gender;
    private String creator;
    private int duration ;
    private int year;
    private Boolean viewed;
    private int timeViewed;
    private int sessionQuantity;

    //Constructor
    public Serie(String title, String gender, int duration ){
        this.title = title;
        this.gender = gender;
        this.duration = duration;
    }

    // Getter y Setter
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    //

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    //

    public String getCreator(){
        return creator;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }
    //

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
    //

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public Boolean getViewed(){
        return viewed;
    }

    public void setViewed(Boolean viewed){
        this.viewed = viewed;
    }
    //

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
