package edu.misena.senaviewer.model;

public class Book extends Publication {

    //Atributos
       private int id;
       private int isbn;
       private Boolean readed;
       private int timeReaded;

       //Constructor
    public Book(String title, String editionDate, String editorial, int isbn, int id, boolean readed, int timeReaded){
       super(title, editionDate, editorial);
       this.id = id;
       this.isbn = isbn;
       this.readed = readed;
       this.timeReaded = timeReaded;

    }

    // Getter y Setter
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //

    public int getisbn(){
        return isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    //

    public Boolean getReaded(){
        return readed;
    }

    public void setReaded(Boolean read){
        this.readed = readed;
    }
    //

    public int getTimeReaded(){
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded){
        this.timeReaded = timeReaded;
    }
}
