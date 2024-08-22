package edu.misena.senaviewer.model;

public class Book {

    //Atributos
       private int id;
       private String title;
       private String editionDate;
       private String editorial;
       private String authors;
       private int isbn;
       private Boolean readed;
       private int timeReaded;

       //Constructor
    public Book(String title, String editionDate, String editorial, int isbn){
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
    //

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    //

    public String getEditionDate(){
        return editionDate;
    }

    public void setEditionDate(String editionDate){
        this.editionDate = editionDate;
    }
    //

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    //

    public String getAuthors(){
        return authors;
    }

    public void setAuthors(String authors){
        this.authors = authors;
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
