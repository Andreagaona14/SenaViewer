package edu.misena.senaviewer.model;


public class Magazine extends Publication {

    //Atributos
    private int id;

    //Constructor
    public Magazine(String title, String editionDate,String editorial, int id, String authors){
        super(title, editionDate, editorial, authors);
        this.id = id;
    }

    // Getter y Setter
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "Id=" + getId() +
                ", Título='" + getTitle() + '\'' +
                ", Fecha de edición='" + getEditionDate() + '\'' +
                ", Editorial='" + getEditorial() + '\'' +
                ", Autor=" + getAuthors()  +
                '}';
    }
}
