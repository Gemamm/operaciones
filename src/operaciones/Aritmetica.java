/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author gemam
 */
public class Aritmetica {
    int a, b;
    
    public void suma() {
        System.out.println("Suma -> " + a + " + " + b + " = " + (a + b));
    }

    public Aritmetica(int a, int b) {
        //super();
        this.a = a;
        this.b = b;
    }
    
    public int suma2() {
        return a+b;
    }
    public int sumaArgs(int a, int b){
        this.a = a;
        this.b=b;
        return this.a +this.b;
    }

}
