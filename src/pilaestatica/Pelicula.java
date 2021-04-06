/*
 * Objeto Peicula
*/
package pilaestatica;

/*
 @author Jason
 */
public class Pelicula
{
    private int id;
    private String nombre;
    private String director;
    private int duracion;

    public Pelicula(int id, String nombre, String director, int duracion)
    {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }    

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public int getDuracion()
    {
        return duracion;
    }

    public void setDuracion(int duracion)
    {
        this.duracion = duracion;
    }
    
    
}
