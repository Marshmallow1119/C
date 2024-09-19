

public class Fraction{
    int numerador;
    int denominador;
;

    public Fraction(int numerador,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public int  FractionAdition(Fraction f1,Fraction f2){
        int numerador1=f1.getNumerador();
        int denominador1=f1.getDenominador();
        int numerador2= f2.getNumerador();
        int denominador2= f2.getNumerador();

        int result;
        result= numerador1*denominador2 + denominador1*numerador2;
        return result;
    }
    public int  FractionSubstraction(Fraction f1,Fraction f2){
        int numerador1=f1.getNumerador();
        int denominador1=f1.getDenominador();
        int numerador2= f2.getNumerador();
        int denominador2= f2.getNumerador();

        int result;
        result= numerador1*denominador2 - denominador1*numerador2;
        return result;
    }

    public Fraction FractionMultiplication(Fraction f1,Fraction f2){
        int numerador1=f1.getNumerador();
        int denominador1=f1.getDenominador();
        int numerador2= f2.getNumerador();
        int denominador2= f2.getNumerador();

        Fraction result = new Fraction((numerador1*numerador2),(denominador1*denominador2));
        return result;
    }

    public Fraction FractionDivision(Fraction f1,Fraction f2){
        int numerador1=f1.getNumerador();
        int denominador1=f1.getDenominador();
        int numerador2= f2.getNumerador();
        int denominador2= f2.getNumerador();


        Fraction result = new Fraction((numerador1*denominador1),(numerador2*denominador2));
        return result;

    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }


}

