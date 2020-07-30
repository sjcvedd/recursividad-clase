/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.simple;
class nodo{
    int valor;
    nodo siguiente;
    nodo (int valor){
        this.valor=valor;
    }
}
        
class fact{
    nodo L,aux;
    
    
    int factorial(int a){
        if (a <= 0){
            return 1;
        }else{
            System.out.println("imprimiendo "+ a +" multiplicado por el factorial de " + (a-1));
            return (a * factorial(a-1) );
        }
    }
    void agregar(int a){
        if (L==null) {
            L=new nodo(a);
        }else{
            aux=L;
            while (aux.siguiente != null)
                aux=aux.siguiente;
            aux.siguiente= new nodo(a);
        }
    }
    void eliminar(int valor){
        aux = L;
        nodo aux2 = aux;
        while (aux.siguiente!=null || aux.valor==valor){
            aux2 = aux;
            aux=aux.siguiente;
        }
        if (aux.valor==valor){
            if (aux==L && L.siguiente==null){
                L=null;
            }else{
                aux2.siguiente = aux.siguiente;
            }
        }else{
            if (aux.siguiente == null){
                System.out.println("no pudo ser encontrado el estudiante buscado");
            }
        }
        
    }
    String eliminar_recursivo(nodo anterior, nodo actual){
        if (actual.valor == 10) {
            anterior.siguiente=actual.siguiente;
            return "Eliminado";
        }else{
            return this.eliminar_recursivo(actual, actual.siguiente);
        }
    }
    fact(){
        aux=L;
        for (int i=1;i<20;i++){
            this.agregar(i);
        }
    }
}
public class FactorialSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fact f = new fact();
        f.eliminar(10);
        System.out.println(f.eliminar_recursivo(null, f.L));;
        System.out.println(f.factorial(6));;
    }
    
}
