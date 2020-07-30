/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.simple;

/**
 *
 * @author Silver
 */
class fact{
    int factorial(int a){
        if (a <= 0){
            return 1;
        }else{
            System.out.println("imprimiendo "+ a +" multiplicado por el factorial de " + (a-1));
            return (a * factorial(a-1) );
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
        System.out.println(f.factorial(6));;
    }
    
}
