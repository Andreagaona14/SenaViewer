package edu.misena.senaviewer.model;


public class Magazine {

    //Atributos
    private int id;
    private String title;
    private int editionDate;
    private String editorial;
    private String authors;

    //Constructor
    public Magazine(String title, int editionDate,String editorial){
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
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

    public int getEditionDate(){
        return editionDate;
    }

    public void setEditionDate(int editionDate){
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

}
