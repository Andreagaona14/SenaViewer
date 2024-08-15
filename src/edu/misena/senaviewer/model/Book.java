package edu.misena.senaviewer.model;

import java.util.Date;

public class Book {

    //Atributos
       private int id;
       private String title;
       private Date editionDate;
       private String editorial;
       private String authors;
       private String isbn;
       private Boolean readed;
       private int timeReaded;

       //Constructor
    public Book(String title, Date editionDate, String editorial, String isbn){
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    // Getter y Setter
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Date getEditionDate(){
        return editionDate;
    }

    public void setEditionDate(Date editionDate){
        this.editionDate = editionDate;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String getAuthors(){
        return authors;
    }

    public void setAuthors(String authors){
        this.authors = authors;
    }

    public String getisbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public Boolean getReaded(){
        return readed;
    }

    public void setReaded(Boolean read){
        this.readed = readed;
    }

    public int getTimeReaded(){
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded){
        this.timeReaded = timeReaded;
    }
}
