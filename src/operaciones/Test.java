
package operaciones;


public class Test {

    
    public static void main(String[] args) {
        
           //Puedo instanciar por el constrictor poir defecto
        //Aritmetica op1 = new Aritmetica();
        //op1.a = 5; //lo asignamos directamente
        //op1.b = 6;
        //llamo a mi método
        //op1.suma();
        Aritmetica aritm =new Aritmetica (5,7);
        aritm.suma();
        var res = aritm.suma2();
        System.out.println("res = "+res);
        res=aritm.sumaArgs(8,9);
        System.out.println("res = "+res);
        
    }
    }
    

