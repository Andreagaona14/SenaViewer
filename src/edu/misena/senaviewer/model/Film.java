package edu.misena.senaviewer.model;

public class Film {

    //Atributos
    private int id;
    private String title;
    private String gender;
    private String creator;
    private int duration;
    private int year;
    private Boolean viewed;

    //Constructor
    public Film (String title, String gender, String creator, int duration){
        this.title = title;
        this.gender = gender;
        this.creator = creator;
        this.duration = duration;
        }
     //Getters y setters
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
        return  gender;
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

    public int getDuration(){
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
    //


    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }
}
