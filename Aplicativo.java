import java.util.Scanner;


public class Aplicativo {
    public static void main(String[] args) {
        float numerador=0;
        float denominador=0;
        float numerador1=0,denominador1=0;
        float resOp=0,resD=0;
        
        
        
        Operaciones obj1 = new Operaciones(numerador, denominador);
        Operaciones obj2 = new Operaciones(numerador1,denominador1);
         Operaciones obj3 = new Operaciones(resOp,resD);
        
        numerador=obj1.getNumerador();
        denominador=obj1.getDenominador();
        numerador1=obj2.getNumerador();
        denominador1=obj2.getDenominador();
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingese numerador :");
        numerador=entrada.nextFloat();
        System.out.println("Ingese denominador :");
        denominador=entrada.nextFloat();
        System.out.println("Ingese numerador :");
        numerador1=entrada.nextFloat();
        System.out.println("Ingese denominador :");
        denominador1=entrada.nextFloat(); 
        
        System.out.println("\n");
        
        resOp=obj1.operacionCalculoN(numerador,numerador1);
            
        System.out.println("el numerador es :"+resOp);
        
        resD=obj2.operacionCalculoD(denominador, denominador1);
              
        System.out.println("el denominador es :"+resD);
        
        System.out.println("\n");
        
        System.out.println(""+numerador+"*"+numerador1+"="+resOp+"\n"
                             +denominador+"*"+denominador1+"="+resD);
           
        
    }
}
