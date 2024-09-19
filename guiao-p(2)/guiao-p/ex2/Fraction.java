public class Fraction{
    private int numerador;
    private int denominador;


    public Fraction( int num, int den){
        numerador = num;
        denominador= den;
    }

    public Fraction(){

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

    public Fraction multiFraction(Fraction f){
        int num;
        int den;

        num= getNumerador() * f.getNumerador();
        den= (getDenominador() * f.getDenominador());

        Fraction frac = new Fraction(num,den);
        return frac;
    }

     public Fraction DivFraction(Fraction f){

        Fraction frac = new Fraction(getNumerador(),getDenominador());
        Fraction frac2 = new Fraction(f.getDenominador(),f.getNumerador());

        Fraction result = frac.multiFraction(frac2);
        return result;
    }

    public Fraction SomaFraction(Fraction f){
        int num;
        int den;
        int other;
        int valor;

        num= getNumerador() * f.getDenominador(); //a*d
        den= f.getNumerador() * getDenominador(); //c*b
        other = f.getDenominador() * getDenominador();

        valor= num + den;

        Fraction frac = new Fraction(valor,other);
        return frac;
    }

    public Fraction SubFraction(Fraction f){
        int num;
        int den;
        int other;
        int valor;

        num= getNumerador() * f.getDenominador(); //a*d
        den= f.getNumerador() * getDenominador(); //c*b
        other = f.getDenominador() * getDenominador();

        valor= num - den;

        Fraction frac = new Fraction(valor,other);
        return frac;
    }


    public String toString(){
        if(getDenominador() == 1){
            return "" +this.getNumerador();
        }
        return this.getNumerador() + "/" + this.getDenominador();
    }
    

    public int mdc(int num, int den){
        if(den == 0){
            return num;
        }else{
        int resto= num % den;
        return mdc(den,resto);
        }
    }

    public Fraction reduce(){
        int num= this.getNumerador();
        int DEN= this.getDenominador();
        int multiplo= mdc(num,DEN);

        num= num / multiplo;
        DEN= DEN / multiplo;

        
        Fraction frac = new Fraction(num,DEN);
        return frac;
    }

    

}