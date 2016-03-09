package model;
// Generated Mar 8, 2016 11:00:54 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Pais generated by hbm2java
 */
@Entity
@Table(name="pais"
    ,schema="public"
)
public class Pais  implements java.io.Serializable {


     private int id;
     private String nombre;

    public Pais() {
    }

	
    public Pais(int id) {
        this.id = id;
    }
    public Pais(int id, String nombre) {
       this.id = id;
       this.nombre = nombre;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="nombre", length=64)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


