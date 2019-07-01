public class Operaciones {
    private  float numerador;
    private float denominador;

    public Operaciones(float numerador, float denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public float getNumerador() {
        return numerador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }

    public float getDenominador() {
        return denominador;
    }

    public void setDenominador(float denominador) {
        this.denominador = denominador;
    }
    
    public float operacionCalculoN(float numerador,float numerador1){
        float resN=0;
        resN= numerador*numerador1;
        return resN;
    }
    public float operacionCalculoD(float denominador,float denominador1){
        float resD=0;
        resD= denominador*denominador1;
        return resD;
    }
}
