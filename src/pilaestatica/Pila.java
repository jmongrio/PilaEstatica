package pilaestatica;

import javax.swing.JOptionPane;

/**
 * @author Jason
 */
public class Pila {  
    private Nodo lastValueAdd;
    int size = 0;
    Pelicula[] listMovie;
    
    public Pila(int sizeStack)
    {
        listMovie = new Pelicula[sizeStack];
        lastValueAdd = null;
        size = 0;
    }
    
    /**
    Método para evaluar si la pila esta vacia.
    @return lastValueAdd == null, devuelve true si esta vacia
    */
    public boolean isEmpty()
    {
        return lastValueAdd == null;
    }
    
    /**
    Método para agregar un item a la pila.
    @param info información que se agregara a la pila.
    */
    public void insert(Pelicula info)
    {
        Nodo nuevoNodo = new Nodo(info);
        nuevoNodo.next = lastValueAdd;
        lastValueAdd = nuevoNodo;
        size++;
    }
    /**
    @return el elemento que se eliminara.
    */
    public Pelicula remove()
    {
        Pelicula aux = new Pelicula();
        
        aux = lastValueAdd.data;
        lastValueAdd = lastValueAdd.next;
        size--;
        return aux;
    }
    
    /**
    @return el último elemento ingresado.
    */
    public Pelicula showLastValueAdd()
    {
        return lastValueAdd.data;
    }
    
    /**
    @return el tamaño de la pila. 
    */
    public int sizeStack()
    {
        return size;
    }
    
    /**
    Método para vaciar la pila.
    */
    public void voidStack()
    {
        while(!isEmpty())
        {
            remove();
        }
    }
    
    /**
    Método que muestra los valores guardados en la pila.
    */
//    public void showValues()
//    {
//        Nodo recorrido = lastValueAdd;
//        
//        while(recorrido != null)
//        {
//            listMovie += recorrido.data + "\n";
//            recorrido = recorrido.next;
//        }
//        
//        JOptionPane.showMessageDialog(null, listMovie);
//        
//        listMovie = null;
//    }
}
