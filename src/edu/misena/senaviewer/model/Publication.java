package edu.misena.senaviewer.model;

public class Publication {

    //Atributos
    String title;
    String editionDate;
    String editorial;
    String authors;

    //Constructor
    public  Publication (String title, String editionDate, String editorial, String authors){
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = authors;

    }

    //Getters y Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //


    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }
    //


    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    //


    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
