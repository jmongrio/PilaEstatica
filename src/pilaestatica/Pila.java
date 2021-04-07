/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaestatica;

/**
 *
 * @author Xtremetech
 */
public class Pila {  
    private int contadorNodo = 0;
    private Nodo Cabeza;

    public int getContadorNodo() {
        return contadorNodo;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }

    public void Push(Nodo N) {
        contadorNodo++;
        if (Cabeza == null) {
            Cabeza = N;
        } else {
            N.setAbajo(Cabeza);
            Cabeza.setArriba(N);
            Cabeza = N;
        }
    }

    public void Pop() {
        if (contadorNodo > 0) {
            contadorNodo--;
            Cabeza = Cabeza.getAbajo();
        }
    }

    public String Peek() {
        return Cabeza.getDato();
    }
}
